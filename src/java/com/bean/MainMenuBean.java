/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author kohun_000
 */
public class MainMenuBean {
    
    private Integer mainMenuId;
    private String menuName;
    private String action;
    private String groupMenu;
    private String todoMethod;
    private String onclick;
    private String cssclass;
    private Date created;
    private String createBy;
    private Date updated;
    private String updateBy;
    private Integer seqNo;
    private String levelMenu;
    
    private List<SubMenuBean> subMenuList;

    public Integer getMainMenuId() {
        return mainMenuId;
    }

    public void setMainMenuId(Integer mainMenuId) {
        this.mainMenuId = mainMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGroupMenu() {
        return groupMenu;
    }

    public void setGroupMenu(String groupMenu) {
        this.groupMenu = groupMenu;
    }

    public String getTodoMethod() {
        return todoMethod;
    }

    public void setTodoMethod(String todoMethod) {
        this.todoMethod = todoMethod;
    }

    public String getOnclick() {
        return onclick;
    }

    public void setOnclick(String onclick) {
        this.onclick = onclick;
    }

    public String getCssclass() {
        return cssclass;
    }

    public void setCssclass(String cssclass) {
        this.cssclass = cssclass;
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

    public List<SubMenuBean> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<SubMenuBean> subMenuList) {
        this.subMenuList = subMenuList;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getLevelMenu() {
        return levelMenu;
    }

    public void setLevelMenu(String levelMenu) {
        this.levelMenu = levelMenu;
    }

    
       
}
