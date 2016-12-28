/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import com.bean.RoleBean;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author brass
 */
public class registerForm extends org.apache.struts.action.ActionForm {
    
   private Integer user_id;
    private String citizen_id;
    private String username;
    private String password;
    private String title_type;
    private String firstName;
    private String lastName;
    private String birthdate;
    private int age;
    private String statustype;
    private String mobile;
    private String email;
    
      private String nationality;
    private String jobtype;
    private String province;
    private String amphur;
    private String district;
    private String address;
    
//    private String addressregistration;
//    private String addresscurrent;
//    private String addresssenddoc;
    private Integer roleId;
    private Date created;
    private String createBy;
    private Date updated;
    private String updateBy;
    private String status;
    private RoleBean roleBean; 
    private String todo;

    //    province
    private int PROVINCE_ID;
    private String PROVINCE_CODE;
    private String PROVINCE_NAME;
    private int GEO_ID;
    
//    amphur
    private int AMPHUR_ID;
    private String AMPHUR_CODE;
    private String AMPHUR_NAME;
    
//    distrinct
    private int DISTRICT_ID;
    private String DISTRICT_CODE;
    private String DISTRICT_NAME;
    
//    geography
    private String GEO_NAME;

    public int getPROVINCE_ID() {
        return PROVINCE_ID;
    }

    public void setPROVINCE_ID(int PROVINCE_ID) {
        this.PROVINCE_ID = PROVINCE_ID;
    }

    public String getPROVINCE_CODE() {
        return PROVINCE_CODE;
    }

    public void setPROVINCE_CODE(String PROVINCE_CODE) {
        this.PROVINCE_CODE = PROVINCE_CODE;
    }

    public String getPROVINCE_NAME() {
        return PROVINCE_NAME;
    }

    public void setPROVINCE_NAME(String PROVINCE_NAME) {
        this.PROVINCE_NAME = PROVINCE_NAME;
    }

    public int getGEO_ID() {
        return GEO_ID;
    }

    public void setGEO_ID(int GEO_ID) {
        this.GEO_ID = GEO_ID;
    }

    public int getAMPHUR_ID() {
        return AMPHUR_ID;
    }

    public void setAMPHUR_ID(int AMPHUR_ID) {
        this.AMPHUR_ID = AMPHUR_ID;
    }

    public String getAMPHUR_CODE() {
        return AMPHUR_CODE;
    }

    public void setAMPHUR_CODE(String AMPHUR_CODE) {
        this.AMPHUR_CODE = AMPHUR_CODE;
    }

    public String getAMPHUR_NAME() {
        return AMPHUR_NAME;
    }

    public void setAMPHUR_NAME(String AMPHUR_NAME) {
        this.AMPHUR_NAME = AMPHUR_NAME;
    }

    public int getDISTRICT_ID() {
        return DISTRICT_ID;
    }

    public void setDISTRICT_ID(int DISTRICT_ID) {
        this.DISTRICT_ID = DISTRICT_ID;
    }

    public String getDISTRICT_CODE() {
        return DISTRICT_CODE;
    }

    public void setDISTRICT_CODE(String DISTRICT_CODE) {
        this.DISTRICT_CODE = DISTRICT_CODE;
    }

    public String getDISTRICT_NAME() {
        return DISTRICT_NAME;
    }

    public void setDISTRICT_NAME(String DISTRICT_NAME) {
        this.DISTRICT_NAME = DISTRICT_NAME;
    }

    public String getGEO_NAME() {
        return GEO_NAME;
    }

    public void setGEO_NAME(String GEO_NAME) {
        this.GEO_NAME = GEO_NAME;
    }
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
    

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle_type() {
        return title_type;
    }

    public void setTitle_type(String title_type) {
        this.title_type = title_type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getStatustype() {
        return statustype;
    }

    public void setStatustype(String statustype) {
        this.statustype = statustype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RoleBean getRoleBean() {
        return roleBean;
    }

    public void setRoleBean(RoleBean roleBean) {
        this.roleBean = roleBean;
    }
    
    
    
}
