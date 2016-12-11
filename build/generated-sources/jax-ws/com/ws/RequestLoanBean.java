
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestLoanBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestLoanBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addresscurrent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressregistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addresssenddoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="banktype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizen_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_rename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copylicenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copymarriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditloan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hometype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lncome_per_month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loan_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanreq_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanstatustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netprofit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodloan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="todo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradingprice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="updateby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestLoanBean", propOrder = {
    "addresscurrent",
    "addressregistration",
    "addresssenddoc",
    "age",
    "banktype",
    "birthdate",
    "citizenId",
    "copyBankaccount",
    "copyRename",
    "copydocumenthome",
    "copyidcard",
    "copylicenses",
    "copymarriage",
    "createby",
    "created",
    "creditloan",
    "email",
    "firstName",
    "hometype",
    "jobtype",
    "lastName",
    "lncomePerMonth",
    "loanId",
    "loanreqId",
    "loanstatustype",
    "mobile",
    "nationality",
    "netprofit",
    "periodloan",
    "salarySlip",
    "status",
    "statustype",
    "titleType",
    "todo",
    "tradingprice",
    "updateby",
    "updated"
})
public class RequestLoanBean {

    protected String addresscurrent;
    protected String addressregistration;
    protected String addresssenddoc;
    protected int age;
    protected String banktype;
    protected String birthdate;
    @XmlElement(name = "citizen_id")
    protected String citizenId;
    @XmlElement(name = "copy_bankaccount")
    protected String copyBankaccount;
    @XmlElement(name = "copy_rename")
    protected String copyRename;
    protected String copydocumenthome;
    protected String copyidcard;
    protected String copylicenses;
    protected String copymarriage;
    protected String createby;
    protected String created;
    protected Double creditloan;
    protected String email;
    protected String firstName;
    protected String hometype;
    protected String jobtype;
    protected String lastName;
    @XmlElement(name = "lncome_per_month")
    protected int lncomePerMonth;
    @XmlElement(name = "loan_id")
    protected int loanId;
    @XmlElement(name = "loanreq_id")
    protected int loanreqId;
    protected String loanstatustype;
    protected String mobile;
    protected String nationality;
    protected Double netprofit;
    protected Double periodloan;
    @XmlElement(name = "salary_slip")
    protected String salarySlip;
    protected String status;
    protected String statustype;
    @XmlElement(name = "title_type")
    protected String titleType;
    protected String todo;
    protected Double tradingprice;
    protected String updateby;
    protected String updated;

    /**
     * Gets the value of the addresscurrent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresscurrent() {
        return addresscurrent;
    }

    /**
     * Sets the value of the addresscurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresscurrent(String value) {
        this.addresscurrent = value;
    }

    /**
     * Gets the value of the addressregistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressregistration() {
        return addressregistration;
    }

    /**
     * Sets the value of the addressregistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressregistration(String value) {
        this.addressregistration = value;
    }

    /**
     * Gets the value of the addresssenddoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresssenddoc() {
        return addresssenddoc;
    }

    /**
     * Sets the value of the addresssenddoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresssenddoc(String value) {
        this.addresssenddoc = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the banktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanktype() {
        return banktype;
    }

    /**
     * Sets the value of the banktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanktype(String value) {
        this.banktype = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the citizenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenId() {
        return citizenId;
    }

    /**
     * Sets the value of the citizenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenId(String value) {
        this.citizenId = value;
    }

    /**
     * Gets the value of the copyBankaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyBankaccount() {
        return copyBankaccount;
    }

    /**
     * Sets the value of the copyBankaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyBankaccount(String value) {
        this.copyBankaccount = value;
    }

    /**
     * Gets the value of the copyRename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyRename() {
        return copyRename;
    }

    /**
     * Sets the value of the copyRename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyRename(String value) {
        this.copyRename = value;
    }

    /**
     * Gets the value of the copydocumenthome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopydocumenthome() {
        return copydocumenthome;
    }

    /**
     * Sets the value of the copydocumenthome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopydocumenthome(String value) {
        this.copydocumenthome = value;
    }

    /**
     * Gets the value of the copyidcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyidcard() {
        return copyidcard;
    }

    /**
     * Sets the value of the copyidcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyidcard(String value) {
        this.copyidcard = value;
    }

    /**
     * Gets the value of the copylicenses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopylicenses() {
        return copylicenses;
    }

    /**
     * Sets the value of the copylicenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopylicenses(String value) {
        this.copylicenses = value;
    }

    /**
     * Gets the value of the copymarriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopymarriage() {
        return copymarriage;
    }

    /**
     * Sets the value of the copymarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopymarriage(String value) {
        this.copymarriage = value;
    }

    /**
     * Gets the value of the createby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * Sets the value of the createby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateby(String value) {
        this.createby = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the creditloan property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditloan() {
        return creditloan;
    }

    /**
     * Sets the value of the creditloan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditloan(Double value) {
        this.creditloan = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the hometype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHometype() {
        return hometype;
    }

    /**
     * Sets the value of the hometype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHometype(String value) {
        this.hometype = value;
    }

    /**
     * Gets the value of the jobtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobtype() {
        return jobtype;
    }

    /**
     * Sets the value of the jobtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobtype(String value) {
        this.jobtype = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lncomePerMonth property.
     * 
     */
    public int getLncomePerMonth() {
        return lncomePerMonth;
    }

    /**
     * Sets the value of the lncomePerMonth property.
     * 
     */
    public void setLncomePerMonth(int value) {
        this.lncomePerMonth = value;
    }

    /**
     * Gets the value of the loanId property.
     * 
     */
    public int getLoanId() {
        return loanId;
    }

    /**
     * Sets the value of the loanId property.
     * 
     */
    public void setLoanId(int value) {
        this.loanId = value;
    }

    /**
     * Gets the value of the loanreqId property.
     * 
     */
    public int getLoanreqId() {
        return loanreqId;
    }

    /**
     * Sets the value of the loanreqId property.
     * 
     */
    public void setLoanreqId(int value) {
        this.loanreqId = value;
    }

    /**
     * Gets the value of the loanstatustype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanstatustype() {
        return loanstatustype;
    }

    /**
     * Sets the value of the loanstatustype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanstatustype(String value) {
        this.loanstatustype = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the netprofit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetprofit() {
        return netprofit;
    }

    /**
     * Sets the value of the netprofit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetprofit(Double value) {
        this.netprofit = value;
    }

    /**
     * Gets the value of the periodloan property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodloan() {
        return periodloan;
    }

    /**
     * Sets the value of the periodloan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodloan(Double value) {
        this.periodloan = value;
    }

    /**
     * Gets the value of the salarySlip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarySlip() {
        return salarySlip;
    }

    /**
     * Sets the value of the salarySlip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarySlip(String value) {
        this.salarySlip = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statustype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatustype() {
        return statustype;
    }

    /**
     * Sets the value of the statustype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatustype(String value) {
        this.statustype = value;
    }

    /**
     * Gets the value of the titleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleType() {
        return titleType;
    }

    /**
     * Sets the value of the titleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleType(String value) {
        this.titleType = value;
    }

    /**
     * Gets the value of the todo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTodo() {
        return todo;
    }

    /**
     * Sets the value of the todo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTodo(String value) {
        this.todo = value;
    }

    /**
     * Gets the value of the tradingprice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTradingprice() {
        return tradingprice;
    }

    /**
     * Sets the value of the tradingprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTradingprice(Double value) {
        this.tradingprice = value;
    }

    /**
     * Gets the value of the updateby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateby() {
        return updateby;
    }

    /**
     * Sets the value of the updateby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateby(String value) {
        this.updateby = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

}
