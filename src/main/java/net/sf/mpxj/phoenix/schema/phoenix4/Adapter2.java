//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.05.03 at 04:24:05 PM BST
//

package net.sf.mpxj.phoenix.schema.phoenix4;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all") public class Adapter2 extends XmlAdapter<String, Integer>
{

   public Integer unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseInteger(value));
   }

   public String marshal(Integer value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printInteger(value));
   }

}