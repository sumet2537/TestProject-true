
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
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="age_k" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="age_p" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amphur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amphur_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amphur_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizen_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizen_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="citizen_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount_kbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccount_pbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copy_bankaccountbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copy_rename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copy_renamebyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome_kv" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthome_pbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copydocumenthomebyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard_kv" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copyidcard_pbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copyidcardbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copylicenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copylicensesbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="copymarriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copymarriagebyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="createby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditloan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="district_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hometype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jobtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobtype_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobtype_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lncome_per_month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loan_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanreq_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="loanstatustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobile_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationality_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="netprofit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="netprofit_k" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="netprofit_p" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodloan" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodloan_k" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="periodloan_p" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="province_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="province_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip_kbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary_slip_pbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="salary_slipbyte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statustype_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statustype_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title_k" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title_p" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "address",
    "addressK",
    "addressP",
    "age",
    "ageK",
    "ageP",
    "amphur",
    "amphurK",
    "amphurP",
    "birthdate",
    "birthdateK",
    "birthdateP",
    "citizenId",
    "citizenK",
    "citizenP",
    "copyBankaccount",
    "copyBankaccountK",
    "copyBankaccountKbyte",
    "copyBankaccountP",
    "copyBankaccountPbyte",
    "copyBankaccountbyte",
    "copyRename",
    "copyRenamebyte",
    "copydocumenthome",
    "copydocumenthomeK",
    "copydocumenthomeKv",
    "copydocumenthomeP",
    "copydocumenthomePbyte",
    "copydocumenthomebyte",
    "copyidcard",
    "copyidcardK",
    "copyidcardKv",
    "copyidcardP",
    "copyidcardPbyte",
    "copyidcardbyte",
    "copylicenses",
    "copylicensesbyte",
    "copymarriage",
    "copymarriagebyte",
    "createby",
    "created",
    "creditloan",
    "district",
    "districtK",
    "districtP",
    "email",
    "emailK",
    "emailP",
    "firstName",
    "firstnameK",
    "firstnameP",
    "hometype",
    "id",
    "jobtype",
    "jobtypeK",
    "jobtypeP",
    "lastName",
    "lastnameK",
    "lastnameP",
    "lncomePerMonth",
    "loanId",
    "loanreqId",
    "loanstatustype",
    "mobile",
    "mobileK",
    "mobileP",
    "nationality",
    "nationalityK",
    "nationalityP",
    "netprofit",
    "netprofitK",
    "netprofitP",
    "periodloan",
    "periodloanK",
    "periodloanP",
    "province",
    "provinceK",
    "provinceP",
    "salarySlip",
    "salarySlipK",
    "salarySlipKbyte",
    "salarySlipP",
    "salarySlipPbyte",
    "salarySlipbyte",
    "status",
    "statustype",
    "statustypeK",
    "statustypeP",
    "titleK",
    "titleP",
    "titleType",
    "todo",
    "tradingprice",
    "updateby",
    "updated"
})
public class RequestLoanBean {

    protected String address;
    @XmlElement(name = "address_k")
    protected String addressK;
    @XmlElement(name = "address_p")
    protected String addressP;
    protected int age;
    @XmlElement(name = "age_k")
    protected int ageK;
    @XmlElement(name = "age_p")
    protected int ageP;
    protected String amphur;
    @XmlElement(name = "amphur_k")
    protected String amphurK;
    @XmlElement(name = "amphur_p")
    protected String amphurP;
    protected String birthdate;
    @XmlElement(name = "birthdate_k")
    protected String birthdateK;
    @XmlElement(name = "birthdate_p")
    protected String birthdateP;
    @XmlElement(name = "citizen_id")
    protected String citizenId;
    @XmlElement(name = "citizen_k")
    protected String citizenK;
    @XmlElement(name = "citizen_p")
    protected String citizenP;
    @XmlElement(name = "copy_bankaccount")
    protected String copyBankaccount;
    @XmlElement(name = "copy_bankaccount_k")
    protected String copyBankaccountK;
    @XmlElement(name = "copy_bankaccount_kbyte")
    protected byte[] copyBankaccountKbyte;
    @XmlElement(name = "copy_bankaccount_p")
    protected String copyBankaccountP;
    @XmlElement(name = "copy_bankaccount_pbyte")
    protected byte[] copyBankaccountPbyte;
    @XmlElement(name = "copy_bankaccountbyte")
    protected byte[] copyBankaccountbyte;
    @XmlElement(name = "copy_rename")
    protected String copyRename;
    @XmlElement(name = "copy_renamebyte")
    protected byte[] copyRenamebyte;
    protected String copydocumenthome;
    @XmlElement(name = "copydocumenthome_k")
    protected String copydocumenthomeK;
    @XmlElement(name = "copydocumenthome_kv")
    protected byte[] copydocumenthomeKv;
    @XmlElement(name = "copydocumenthome_p")
    protected String copydocumenthomeP;
    @XmlElement(name = "copydocumenthome_pbyte")
    protected byte[] copydocumenthomePbyte;
    protected byte[] copydocumenthomebyte;
    protected String copyidcard;
    @XmlElement(name = "copyidcard_k")
    protected String copyidcardK;
    @XmlElement(name = "copyidcard_kv")
    protected byte[] copyidcardKv;
    @XmlElement(name = "copyidcard_p")
    protected String copyidcardP;
    @XmlElement(name = "copyidcard_pbyte")
    protected byte[] copyidcardPbyte;
    protected byte[] copyidcardbyte;
    protected String copylicenses;
    protected byte[] copylicensesbyte;
    protected String copymarriage;
    protected byte[] copymarriagebyte;
    protected String createby;
    protected String created;
    protected Double creditloan;
    protected String district;
    @XmlElement(name = "district_k")
    protected String districtK;
    @XmlElement(name = "district_p")
    protected String districtP;
    protected String email;
    @XmlElement(name = "email_k")
    protected String emailK;
    @XmlElement(name = "email_p")
    protected String emailP;
    protected String firstName;
    @XmlElement(name = "firstname_k")
    protected String firstnameK;
    @XmlElement(name = "firstname_p")
    protected String firstnameP;
    protected String hometype;
    protected int id;
    protected String jobtype;
    @XmlElement(name = "jobtype_k")
    protected String jobtypeK;
    @XmlElement(name = "jobtype_p")
    protected String jobtypeP;
    protected String lastName;
    @XmlElement(name = "lastname_k")
    protected String lastnameK;
    @XmlElement(name = "lastname_p")
    protected String lastnameP;
    @XmlElement(name = "lncome_per_month")
    protected int lncomePerMonth;
    @XmlElement(name = "loan_id")
    protected int loanId;
    @XmlElement(name = "loanreq_id")
    protected int loanreqId;
    protected String loanstatustype;
    protected String mobile;
    @XmlElement(name = "mobile_k")
    protected String mobileK;
    @XmlElement(name = "mobile_p")
    protected String mobileP;
    protected String nationality;
    @XmlElement(name = "nationality_k")
    protected String nationalityK;
    @XmlElement(name = "nationality_p")
    protected String nationalityP;
    protected Double netprofit;
    @XmlElement(name = "netprofit_k")
    protected Double netprofitK;
    @XmlElement(name = "netprofit_p")
    protected Double netprofitP;
    protected Double periodloan;
    @XmlElement(name = "periodloan_k")
    protected Double periodloanK;
    @XmlElement(name = "periodloan_p")
    protected Double periodloanP;
    protected String province;
    @XmlElement(name = "province_k")
    protected String provinceK;
    @XmlElement(name = "province_p")
    protected String provinceP;
    @XmlElement(name = "salary_slip")
    protected String salarySlip;
    @XmlElement(name = "salary_slip_k")
    protected String salarySlipK;
    @XmlElement(name = "salary_slip_kbyte")
    protected byte[] salarySlipKbyte;
    @XmlElement(name = "salary_slip_p")
    protected String salarySlipP;
    @XmlElement(name = "salary_slip_pbyte")
    protected byte[] salarySlipPbyte;
    @XmlElement(name = "salary_slipbyte")
    protected byte[] salarySlipbyte;
    protected String status;
    protected String statustype;
    @XmlElement(name = "statustype_k")
    protected String statustypeK;
    @XmlElement(name = "statustype_p")
    protected String statustypeP;
    @XmlElement(name = "title_k")
    protected String titleK;
    @XmlElement(name = "title_p")
    protected String titleP;
    @XmlElement(name = "title_type")
    protected String titleType;
    protected String todo;
    protected Double tradingprice;
    protected String updateby;
    protected String updated;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressK() {
        return addressK;
    }

    /**
     * Sets the value of the addressK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressK(String value) {
        this.addressK = value;
    }

    /**
     * Gets the value of the addressP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressP() {
        return addressP;
    }

    /**
     * Sets the value of the addressP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressP(String value) {
        this.addressP = value;
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
     * Gets the value of the ageK property.
     * 
     */
    public int getAgeK() {
        return ageK;
    }

    /**
     * Sets the value of the ageK property.
     * 
     */
    public void setAgeK(int value) {
        this.ageK = value;
    }

    /**
     * Gets the value of the ageP property.
     * 
     */
    public int getAgeP() {
        return ageP;
    }

    /**
     * Sets the value of the ageP property.
     * 
     */
    public void setAgeP(int value) {
        this.ageP = value;
    }

    /**
     * Gets the value of the amphur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmphur() {
        return amphur;
    }

    /**
     * Sets the value of the amphur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmphur(String value) {
        this.amphur = value;
    }

    /**
     * Gets the value of the amphurK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmphurK() {
        return amphurK;
    }

    /**
     * Sets the value of the amphurK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmphurK(String value) {
        this.amphurK = value;
    }

    /**
     * Gets the value of the amphurP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmphurP() {
        return amphurP;
    }

    /**
     * Sets the value of the amphurP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmphurP(String value) {
        this.amphurP = value;
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
     * Gets the value of the birthdateK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdateK() {
        return birthdateK;
    }

    /**
     * Sets the value of the birthdateK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdateK(String value) {
        this.birthdateK = value;
    }

    /**
     * Gets the value of the birthdateP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdateP() {
        return birthdateP;
    }

    /**
     * Sets the value of the birthdateP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdateP(String value) {
        this.birthdateP = value;
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
     * Gets the value of the citizenK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenK() {
        return citizenK;
    }

    /**
     * Sets the value of the citizenK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenK(String value) {
        this.citizenK = value;
    }

    /**
     * Gets the value of the citizenP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenP() {
        return citizenP;
    }

    /**
     * Sets the value of the citizenP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenP(String value) {
        this.citizenP = value;
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
     * Gets the value of the copyBankaccountK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyBankaccountK() {
        return copyBankaccountK;
    }

    /**
     * Sets the value of the copyBankaccountK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyBankaccountK(String value) {
        this.copyBankaccountK = value;
    }

    /**
     * Gets the value of the copyBankaccountKbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyBankaccountKbyte() {
        return copyBankaccountKbyte;
    }

    /**
     * Sets the value of the copyBankaccountKbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyBankaccountKbyte(byte[] value) {
        this.copyBankaccountKbyte = value;
    }

    /**
     * Gets the value of the copyBankaccountP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyBankaccountP() {
        return copyBankaccountP;
    }

    /**
     * Sets the value of the copyBankaccountP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyBankaccountP(String value) {
        this.copyBankaccountP = value;
    }

    /**
     * Gets the value of the copyBankaccountPbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyBankaccountPbyte() {
        return copyBankaccountPbyte;
    }

    /**
     * Sets the value of the copyBankaccountPbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyBankaccountPbyte(byte[] value) {
        this.copyBankaccountPbyte = value;
    }

    /**
     * Gets the value of the copyBankaccountbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyBankaccountbyte() {
        return copyBankaccountbyte;
    }

    /**
     * Sets the value of the copyBankaccountbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyBankaccountbyte(byte[] value) {
        this.copyBankaccountbyte = value;
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
     * Gets the value of the copyRenamebyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyRenamebyte() {
        return copyRenamebyte;
    }

    /**
     * Sets the value of the copyRenamebyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyRenamebyte(byte[] value) {
        this.copyRenamebyte = value;
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
     * Gets the value of the copydocumenthomeK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopydocumenthomeK() {
        return copydocumenthomeK;
    }

    /**
     * Sets the value of the copydocumenthomeK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopydocumenthomeK(String value) {
        this.copydocumenthomeK = value;
    }

    /**
     * Gets the value of the copydocumenthomeKv property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopydocumenthomeKv() {
        return copydocumenthomeKv;
    }

    /**
     * Sets the value of the copydocumenthomeKv property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopydocumenthomeKv(byte[] value) {
        this.copydocumenthomeKv = value;
    }

    /**
     * Gets the value of the copydocumenthomeP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopydocumenthomeP() {
        return copydocumenthomeP;
    }

    /**
     * Sets the value of the copydocumenthomeP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopydocumenthomeP(String value) {
        this.copydocumenthomeP = value;
    }

    /**
     * Gets the value of the copydocumenthomePbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopydocumenthomePbyte() {
        return copydocumenthomePbyte;
    }

    /**
     * Sets the value of the copydocumenthomePbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopydocumenthomePbyte(byte[] value) {
        this.copydocumenthomePbyte = value;
    }

    /**
     * Gets the value of the copydocumenthomebyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopydocumenthomebyte() {
        return copydocumenthomebyte;
    }

    /**
     * Sets the value of the copydocumenthomebyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopydocumenthomebyte(byte[] value) {
        this.copydocumenthomebyte = value;
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
     * Gets the value of the copyidcardK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyidcardK() {
        return copyidcardK;
    }

    /**
     * Sets the value of the copyidcardK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyidcardK(String value) {
        this.copyidcardK = value;
    }

    /**
     * Gets the value of the copyidcardKv property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyidcardKv() {
        return copyidcardKv;
    }

    /**
     * Sets the value of the copyidcardKv property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyidcardKv(byte[] value) {
        this.copyidcardKv = value;
    }

    /**
     * Gets the value of the copyidcardP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyidcardP() {
        return copyidcardP;
    }

    /**
     * Sets the value of the copyidcardP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyidcardP(String value) {
        this.copyidcardP = value;
    }

    /**
     * Gets the value of the copyidcardPbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyidcardPbyte() {
        return copyidcardPbyte;
    }

    /**
     * Sets the value of the copyidcardPbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyidcardPbyte(byte[] value) {
        this.copyidcardPbyte = value;
    }

    /**
     * Gets the value of the copyidcardbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopyidcardbyte() {
        return copyidcardbyte;
    }

    /**
     * Sets the value of the copyidcardbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopyidcardbyte(byte[] value) {
        this.copyidcardbyte = value;
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
     * Gets the value of the copylicensesbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopylicensesbyte() {
        return copylicensesbyte;
    }

    /**
     * Sets the value of the copylicensesbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopylicensesbyte(byte[] value) {
        this.copylicensesbyte = value;
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
     * Gets the value of the copymarriagebyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCopymarriagebyte() {
        return copymarriagebyte;
    }

    /**
     * Sets the value of the copymarriagebyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCopymarriagebyte(byte[] value) {
        this.copymarriagebyte = value;
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
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the districtK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictK() {
        return districtK;
    }

    /**
     * Sets the value of the districtK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictK(String value) {
        this.districtK = value;
    }

    /**
     * Gets the value of the districtP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictP() {
        return districtP;
    }

    /**
     * Sets the value of the districtP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictP(String value) {
        this.districtP = value;
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
     * Gets the value of the emailK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailK() {
        return emailK;
    }

    /**
     * Sets the value of the emailK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailK(String value) {
        this.emailK = value;
    }

    /**
     * Gets the value of the emailP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailP() {
        return emailP;
    }

    /**
     * Sets the value of the emailP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailP(String value) {
        this.emailP = value;
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
     * Gets the value of the firstnameK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameK() {
        return firstnameK;
    }

    /**
     * Sets the value of the firstnameK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameK(String value) {
        this.firstnameK = value;
    }

    /**
     * Gets the value of the firstnameP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameP() {
        return firstnameP;
    }

    /**
     * Sets the value of the firstnameP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameP(String value) {
        this.firstnameP = value;
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
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the jobtypeK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobtypeK() {
        return jobtypeK;
    }

    /**
     * Sets the value of the jobtypeK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobtypeK(String value) {
        this.jobtypeK = value;
    }

    /**
     * Gets the value of the jobtypeP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobtypeP() {
        return jobtypeP;
    }

    /**
     * Sets the value of the jobtypeP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobtypeP(String value) {
        this.jobtypeP = value;
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
     * Gets the value of the lastnameK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameK() {
        return lastnameK;
    }

    /**
     * Sets the value of the lastnameK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameK(String value) {
        this.lastnameK = value;
    }

    /**
     * Gets the value of the lastnameP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameP() {
        return lastnameP;
    }

    /**
     * Sets the value of the lastnameP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameP(String value) {
        this.lastnameP = value;
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
     * Gets the value of the mobileK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileK() {
        return mobileK;
    }

    /**
     * Sets the value of the mobileK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileK(String value) {
        this.mobileK = value;
    }

    /**
     * Gets the value of the mobileP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileP() {
        return mobileP;
    }

    /**
     * Sets the value of the mobileP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileP(String value) {
        this.mobileP = value;
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
     * Gets the value of the nationalityK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityK() {
        return nationalityK;
    }

    /**
     * Sets the value of the nationalityK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityK(String value) {
        this.nationalityK = value;
    }

    /**
     * Gets the value of the nationalityP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityP() {
        return nationalityP;
    }

    /**
     * Sets the value of the nationalityP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityP(String value) {
        this.nationalityP = value;
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
     * Gets the value of the netprofitK property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetprofitK() {
        return netprofitK;
    }

    /**
     * Sets the value of the netprofitK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetprofitK(Double value) {
        this.netprofitK = value;
    }

    /**
     * Gets the value of the netprofitP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetprofitP() {
        return netprofitP;
    }

    /**
     * Sets the value of the netprofitP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetprofitP(Double value) {
        this.netprofitP = value;
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
     * Gets the value of the periodloanK property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodloanK() {
        return periodloanK;
    }

    /**
     * Sets the value of the periodloanK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodloanK(Double value) {
        this.periodloanK = value;
    }

    /**
     * Gets the value of the periodloanP property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPeriodloanP() {
        return periodloanP;
    }

    /**
     * Sets the value of the periodloanP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPeriodloanP(Double value) {
        this.periodloanP = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the provinceK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceK() {
        return provinceK;
    }

    /**
     * Sets the value of the provinceK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceK(String value) {
        this.provinceK = value;
    }

    /**
     * Gets the value of the provinceP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceP() {
        return provinceP;
    }

    /**
     * Sets the value of the provinceP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceP(String value) {
        this.provinceP = value;
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
     * Gets the value of the salarySlipK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarySlipK() {
        return salarySlipK;
    }

    /**
     * Sets the value of the salarySlipK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarySlipK(String value) {
        this.salarySlipK = value;
    }

    /**
     * Gets the value of the salarySlipKbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSalarySlipKbyte() {
        return salarySlipKbyte;
    }

    /**
     * Sets the value of the salarySlipKbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSalarySlipKbyte(byte[] value) {
        this.salarySlipKbyte = value;
    }

    /**
     * Gets the value of the salarySlipP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalarySlipP() {
        return salarySlipP;
    }

    /**
     * Sets the value of the salarySlipP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalarySlipP(String value) {
        this.salarySlipP = value;
    }

    /**
     * Gets the value of the salarySlipPbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSalarySlipPbyte() {
        return salarySlipPbyte;
    }

    /**
     * Sets the value of the salarySlipPbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSalarySlipPbyte(byte[] value) {
        this.salarySlipPbyte = value;
    }

    /**
     * Gets the value of the salarySlipbyte property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSalarySlipbyte() {
        return salarySlipbyte;
    }

    /**
     * Sets the value of the salarySlipbyte property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSalarySlipbyte(byte[] value) {
        this.salarySlipbyte = value;
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
     * Gets the value of the statustypeK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatustypeK() {
        return statustypeK;
    }

    /**
     * Sets the value of the statustypeK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatustypeK(String value) {
        this.statustypeK = value;
    }

    /**
     * Gets the value of the statustypeP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatustypeP() {
        return statustypeP;
    }

    /**
     * Sets the value of the statustypeP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatustypeP(String value) {
        this.statustypeP = value;
    }

    /**
     * Gets the value of the titleK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleK() {
        return titleK;
    }

    /**
     * Sets the value of the titleK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleK(String value) {
        this.titleK = value;
    }

    /**
     * Gets the value of the titleP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleP() {
        return titleP;
    }

    /**
     * Sets the value of the titleP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleP(String value) {
        this.titleP = value;
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
