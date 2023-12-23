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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import plesk.xml.api.input.DomainAliasFilterType;
import plesk.xml.api.input.DomainAliasInputType;
import plesk.xml.api.input.ObjectFactory;
import plesk.xml.api.input.Packet;

/**
 *
 * @author Eddy Vermoen <@ben-eddy74>
 */
public class DomainAliasTest extends Plesk {
    
    ObjectFactory inputFactory = new ObjectFactory();
    
    @Test
    void getDomainAlias() {
        
        DomainAliasFilterType filter = inputFactory.createDomainAliasFilterType();
        filter.getName().add("example.com");
        
        DomainAliasInputType.Get getdomainaliasrequest = inputFactory.createDomainAliasInputTypeGet();
        getdomainaliasrequest.setFilter(filter);
        
        DomainAliasInputType domainaliasoperator = inputFactory.createDomainAliasInputType();
        domainaliasoperator.getOperations().add(getdomainaliasrequest);
        
        Packet requestpacket = inputFactory.createPacket();
        requestpacket.getOperators().add(domainaliasoperator);
        
        try {
            String expression = "/packet/site-alias/get";
            NodeList nodeList = getResult(requestpacket, expression);
            assertEquals("filter", nodeList.item(0).getFirstChild().getNodeName());
            assertEquals("example.com", nodeList.item(0).getFirstChild().getFirstChild().getTextContent());

        } catch (SAXException | IOException | JAXBException | XPathExpressionException | ParserConfigurationException ex) {
            Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
