//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.05.03 at 04:24:05 PM BST
//

package net.sf.mpxj.phoenix.schema.phoenix4;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.ResourceType;

@SuppressWarnings("all") public class Adapter7 extends XmlAdapter<String, ResourceType>
{

   public ResourceType unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseResourceType(value));
   }

   public String marshal(ResourceType value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printResourceType(value));
   }

}