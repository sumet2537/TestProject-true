/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.util.List;

/**
 *
 * @author kohun_000
 */
public class RoleGroupMenuBean {
    
    private Integer roleId;
    private Integer mainMenuId;
    private Integer seqNo;
    private List<MainMenuBean> mainMenuList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMainMenuId() {
        return mainMenuId;
    }

    public void setMainMenuId(Integer mainMenuId) {
        this.mainMenuId = mainMenuId;
    }

    public List<MainMenuBean> getMainMenuList() {
        return mainMenuList;
    }

    public void setMainMenuList(List<MainMenuBean> mainMenuList) {
        this.mainMenuList = mainMenuList;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
    
}
