//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.06.16 at 11:06:06 AM BST
//

package net.sf.mpxj.conceptdraw.schema;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4 extends XmlAdapter<String, LocalDate>
{

   @Override public LocalDate unmarshal(String value)
   {
      return (net.sf.mpxj.conceptdraw.DatatypeConverter.parseDate(value));
   }

   @Override public String marshal(LocalDate value)
   {
      return (net.sf.mpxj.conceptdraw.DatatypeConverter.printDate(value));
   }

}
