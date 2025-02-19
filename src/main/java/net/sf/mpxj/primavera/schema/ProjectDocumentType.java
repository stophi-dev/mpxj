//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.06.16 at 11:05:58 AM BST
//

package net.sf.mpxj.primavera.schema;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * &lt;p&gt;Java class for ProjectDocumentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProjectDocumentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ActivityId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ActivityName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DocumentCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DocumentTitle" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="120"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IsWorkProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ParentWBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="WBSCode" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="WBSName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="100"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectDocumentType", propOrder =
{
   "activityId",
   "activityName",
   "activityObjectId",
   "createDate",
   "createUser",
   "documentCategoryName",
   "documentObjectId",
   "documentStatusName",
   "documentTitle",
   "isBaseline",
   "isTemplate",
   "isWorkProduct",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "parentWBSObjectId",
   "projectId",
   "projectObjectId",
   "wbsCode",
   "wbsName",
   "wbsObjectId"
}) public class ProjectDocumentType
{

   @XmlElement(name = "ActivityId") @XmlJavaTypeAdapter(Adapter1.class) protected String activityId;
   @XmlElement(name = "ActivityName") @XmlJavaTypeAdapter(Adapter1.class) protected String activityName;
   @XmlElement(name = "ActivityObjectId", nillable = true) protected Integer activityObjectId;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime createDate;
   @XmlElement(name = "CreateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String createUser;
   @XmlElement(name = "DocumentCategoryName") @XmlJavaTypeAdapter(Adapter1.class) protected String documentCategoryName;
   @XmlElement(name = "DocumentObjectId") protected Integer documentObjectId;
   @XmlElement(name = "DocumentStatusName") @XmlJavaTypeAdapter(Adapter1.class) protected String documentStatusName;
   @XmlElement(name = "DocumentTitle") @XmlJavaTypeAdapter(Adapter1.class) protected String documentTitle;
   @XmlElement(name = "IsBaseline", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isBaseline;
   @XmlElement(name = "IsTemplate", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isTemplate;
   @XmlElement(name = "IsWorkProduct", type = String.class) @XmlJavaTypeAdapter(Adapter2.class) @XmlSchemaType(name = "boolean") protected Boolean isWorkProduct;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter4.class) @XmlSchemaType(name = "dateTime") protected LocalDateTime lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") @XmlJavaTypeAdapter(Adapter1.class) protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ParentWBSObjectId", nillable = true) protected Integer parentWBSObjectId;
   @XmlElement(name = "ProjectId") @XmlJavaTypeAdapter(Adapter1.class) protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "WBSCode") @XmlJavaTypeAdapter(Adapter1.class) protected String wbsCode;
   @XmlElement(name = "WBSName") @XmlJavaTypeAdapter(Adapter1.class) protected String wbsName;
   @XmlElement(name = "WBSObjectId", nillable = true) protected Integer wbsObjectId;

   /**
    * Gets the value of the activityId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityId()
   {
      return activityId;
   }

   /**
    * Sets the value of the activityId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityId(String value)
   {
      this.activityId = value;
   }

   /**
    * Gets the value of the activityName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getActivityName()
   {
      return activityName;
   }

   /**
    * Sets the value of the activityName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setActivityName(String value)
   {
      this.activityName = value;
   }

   /**
    * Gets the value of the activityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(LocalDateTime value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the documentCategoryName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentCategoryName()
   {
      return documentCategoryName;
   }

   /**
    * Sets the value of the documentCategoryName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentCategoryName(String value)
   {
      this.documentCategoryName = value;
   }

   /**
    * Gets the value of the documentObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getDocumentObjectId()
   {
      return documentObjectId;
   }

   /**
    * Sets the value of the documentObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setDocumentObjectId(Integer value)
   {
      this.documentObjectId = value;
   }

   /**
    * Gets the value of the documentStatusName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentStatusName()
   {
      return documentStatusName;
   }

   /**
    * Sets the value of the documentStatusName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentStatusName(String value)
   {
      this.documentStatusName = value;
   }

   /**
    * Gets the value of the documentTitle property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDocumentTitle()
   {
      return documentTitle;
   }

   /**
    * Sets the value of the documentTitle property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDocumentTitle(String value)
   {
      this.documentTitle = value;
   }

   /**
    * Gets the value of the isBaseline property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
   }

   /**
    * Gets the value of the isTemplate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsTemplate()
   {
      return isTemplate;
   }

   /**
    * Sets the value of the isTemplate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsTemplate(Boolean value)
   {
      this.isTemplate = value;
   }

   /**
    * Gets the value of the isWorkProduct property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Boolean isIsWorkProduct()
   {
      return isWorkProduct;
   }

   /**
    * Sets the value of the isWorkProduct property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIsWorkProduct(Boolean value)
   {
      this.isWorkProduct = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public LocalDateTime getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(LocalDateTime value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the parentWBSObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getParentWBSObjectId()
   {
      return parentWBSObjectId;
   }

   /**
    * Sets the value of the parentWBSObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setParentWBSObjectId(Integer value)
   {
      this.parentWBSObjectId = value;
   }

   /**
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the wbsCode property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getWBSCode()
   {
      return wbsCode;
   }

   /**
    * Sets the value of the wbsCode property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setWBSCode(String value)
   {
      this.wbsCode = value;
   }

   /**
    * Gets the value of the wbsName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getWBSName()
   {
      return wbsName;
   }

   /**
    * Sets the value of the wbsName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setWBSName(String value)
   {
      this.wbsName = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setWBSObjectId(Integer value)
   {
      this.wbsObjectId = value;
   }

}
