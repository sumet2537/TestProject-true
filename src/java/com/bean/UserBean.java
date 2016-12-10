/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.util.Date;

/**
 *
 * @author kohun_000
 */
public class UserBean {
    
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
    private String addressregistration;
    private String addresscurrent;
    private String addresssenddoc;
    private Integer roleId;
    private Date created;
    private String createBy;
    private Date updated;
    private String updateBy;
    private String status;
    private RoleBean roleBean; 
    private String todo;

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

    public String getAddressregistration() {
        return addressregistration;
    }

    public void setAddressregistration(String addressregistration) {
        this.addressregistration = addressregistration;
    }

    public String getAddresscurrent() {
        return addresscurrent;
    }

    public void setAddresscurrent(String addresscurrent) {
        this.addresscurrent = addresscurrent;
    }

    public String getAddresssenddoc() {
        return addresssenddoc;
    }

    public void setAddresssenddoc(String addresssenddoc) {
        this.addresssenddoc = addresssenddoc;
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