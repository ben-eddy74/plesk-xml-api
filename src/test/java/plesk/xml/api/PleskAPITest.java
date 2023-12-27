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

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import plesk.xml.api.input.ClientDatasetType;
import plesk.xml.api.input.ClientSelectionFilterType;
import plesk.xml.api.input.ClientTypeRequest;
import plesk.xml.api.input.DomainTemplateFilterType;
import plesk.xml.api.input.DomainTemplateGetInputType;
import plesk.xml.api.input.DomainTemplateInputType;
import plesk.xml.api.input.ObjectFactory;
import plesk.xml.api.input.Packet;
import plesk.xml.api.output.ResponsePacketType;

/**
 *
 * @author Eddy Vermoen <@ben-eddy74>
 */
public class PleskAPITest {

    private ObjectFactory inputFactory = new ObjectFactory();
    
    @BeforeAll
    public static void setUpClass() {
        try {
            PleskAPI.setHost("www1.live-inter.net");
            PleskAPI.setCredentials("admin", "CSR0v3SWTgmO!@");
        } catch (URISyntaxException | MalformedURLException ex) {
            Logger.getLogger(PleskAPITest.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    /**
     * Test of sendRequest method, of class PleskAPI.
     */
    @Test
    public void testSendRequest() throws Exception {
        
        ClientSelectionFilterType filter = new ClientSelectionFilterType();
        ClientDatasetType ds = new ClientDatasetType();
        ds.setGenInfo(true);
        
        ClientTypeRequest.Get getrequest = new ClientTypeRequest.Get();
        getrequest.setFilter(filter);
        getrequest.setDataset(ds);
        
        ClientTypeRequest clients = new ClientTypeRequest();
        clients.getOperations().add(getrequest);
     
        DomainTemplateFilterType serviceplanfilter = new DomainTemplateFilterType();
        
        DomainTemplateGetInputType getserviceplanrequest = inputFactory.createDomainTemplateGetInputType();
        getserviceplanrequest.setFilter(serviceplanfilter);
        
        DomainTemplateInputType serviceplanoperator = inputFactory.createDomainTemplateInputType();
        serviceplanoperator.getOperations().add(inputFactory.createDomainTemplateInputTypeGet(getserviceplanrequest));
        
        Packet packet = new Packet();
        packet.getOperators().add(clients);
        packet.getOperators().add(serviceplanoperator);
        
        ResponsePacketType response = PleskAPI.sendRequest(packet);
        assertTrue(true);
    }

}
