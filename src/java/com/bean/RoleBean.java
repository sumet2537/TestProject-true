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
public class RoleBean {
    
    private Integer roleId;
    private String roleName;
    private String detail;
    private Date created;
    private String createBy;
    private Date updated;
    private String updateBy;
    
    private RoleGroupMenuBean roleGroupMenuBean;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public RoleGroupMenuBean getRoleGroupMenuBean() {
        return roleGroupMenuBean;
    }

    public void setRoleGroupMenuBean(RoleGroupMenuBean roleGroupMenuBean) {
        this.roleGroupMenuBean = roleGroupMenuBean;
    }
       
}
