/*
 * Copyright (C) 2023 Eddy Vermoen <@ben-eddy74>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package plesk.xml.api;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import plesk.xml.api.input.RequestPacketType;
import plesk.xml.api.output.ResponsePacketType;
/**
 *
 * @author Eddy Vermoen <@ben-eddy74>
 */
public class PleskAPI {

    private URL url;
    private String login;
    private String password;
    private String secretKey;

    private static PleskAPI instance = new PleskAPI();

    public static void setHost(String hostname) throws URISyntaxException, MalformedURLException {
        instance.url = new URL("https://" + hostname + ":8443/enterprise/control/agent.php");
    }

    public static void setCredentials(String username, String password) {
        instance.login = username;
        instance.password = password;
        instance.secretKey = null;
    }

    public static void setCredentials(String secretkey) {
        instance.secretKey = secretkey;
        instance.login = "";
        instance.password = "";
    }

    public static ResponsePacketType sendRequest(RequestPacketType request)
            throws URISyntaxException, JAXBException, IOException, InterruptedException {

        String requestbody = marshal(request);

        HttpClient client = HttpClient.newHttpClient();
        Builder apirequest = HttpRequest.newBuilder()
                .uri(instance.url.toURI())
                .header("Content-Type", "text/xml")
                .header("HTTP_PRETTY_PRINT", "TRUE")
                .POST(BodyPublishers.ofString(requestbody));

        if (null != instance.secretKey) {
            apirequest.header("KEY", instance.secretKey);
        } else {
            apirequest.header("HTTP_AUTH_LOGIN", instance.login);
            apirequest.header("HTTP_AUTH_PASSWD", instance.password);
        }

        HttpResponse<String> response = client.send(apirequest.build(), BodyHandlers.ofString());

        JAXBContext context = JAXBContext.newInstance(ResponsePacketType.class);
        Unmarshaller um = context.createUnmarshaller();

        System.out.println(response.body());
        return (ResponsePacketType) um.unmarshal(new StringReader(response.body()));
    }

    public static String marshal(RequestPacketType req) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RequestPacketType.class);
        Marshaller m = context.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(req, sw);
        return sw.toString();
    }

    public static String marshal(ResponsePacketType repsonse) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ResponsePacketType.class);
        Marshaller m = context.createMarshaller();
        StringWriter sw = new StringWriter();
        m.marshal(repsonse, sw);
        return sw.toString();
    }
}
