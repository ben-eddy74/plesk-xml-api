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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import plesk.xml.api.input.ClientDatasetType;
import plesk.xml.api.input.ClientSelectionFilterType;
import plesk.xml.api.input.ClientTypeRequest;
import plesk.xml.api.input.Packet;
import plesk.xml.api.input.RequestPacketType;
import plesk.xml.api.output.ClientData;
import plesk.xml.api.output.ClientResponseType;
import plesk.xml.api.output.ResponsePacketType;

/**
 *
 * @author Eddy Vermoen <@ben-eddy74>
 */
public class Customer {

    public static List<ClientData> Get(Packet requestpacket) throws URISyntaxException, JAXBException, IOException, InterruptedException{
        ResponsePacketType responsepacket = PleskAPI.sendRequest(requestpacket);

        List<ClientResponseType.Get.Result> clients = 
                ((ClientResponseType.Get)
                ((ClientResponseType)
                    responsepacket.getResults().get(0))
                    .getAddOrGetOrDel().get(0))
                    .getResult();

        List<ClientData> clientdata = new ArrayList<>();

        for (int i = 0; i < clients.size(); i++) {
            ClientResponseType.Get.Result result = clients.get(i);
            clientdata.add(result.getData());
        }

        return clientdata;
    }

    public static class GetRequestBuilder {

        ClientTypeRequest.Get getrequest = new ClientTypeRequest.Get();
        ClientDatasetType ds = new ClientDatasetType();
        ClientSelectionFilterType filter = new ClientSelectionFilterType();

        public GetRequestBuilder setFilter(ClientSelectionFilterType filter){
            this.filter = filter;
            return this;
        }

        public GetRequestBuilder getGenInfo(boolean enable) {
            if(enable){
                ds.setGenInfo(true);
            }else{
                ds.setGenInfo(null);
            }
            return this;
        }

        public GetRequestBuilder getStat(boolean enable){
            if(enable){
                ds.setStat(true);
            }else{
                ds.setStat(null);
            }
            return this;
        }

        public RequestPacketType build(){
            
            getrequest.setFilter(filter);
            getrequest.setDataset(ds);

            ClientTypeRequest clienttyperequest = new ClientTypeRequest();
            clienttyperequest.getAddOrGetOrDel().add(getrequest);
            
            Packet requestpacket = new Packet();
            requestpacket.getOperators().add(clienttyperequest);

            return requestpacket;
        }
    }
}
