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

import jakarta.xml.bind.JAXBException;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import plesk.xml.api.input.RequestPacketType;

/**
 *
 * @author Eddy Vermoen <@ben-eddy74>
 */
public class PleskAPITest {

    @BeforeAll
    static void init(){
        
    }
    
    @Test
    void getCustomers() throws JAXBException, XPathExpressionException, ParserConfigurationException, SAXException, IOException{
    
        RequestPacketType request = new Customer.GetRequestBuilder().getGenInfo(true).getStat(true).build();
        String result = PleskAPI.marshal(request);
        //System.out.println(result);
        
        DocumentBuilder docbuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
        Document doc = docbuilder.parse(new InputSource(new StringReader(result)));
        
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/packet/customer/get";
        NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
        //System.out.println(nodeList.item(0).getFirstChild().getNodeName());
        
        assertEquals("filter", nodeList.item(0).getFirstChild().getNodeName());
        assertEquals("dataset", nodeList.item(0).getLastChild().getNodeName());
    }
    
}
