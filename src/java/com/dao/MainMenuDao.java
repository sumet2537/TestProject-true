/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.MainMenuBean;
import com.bean.SubMenuBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kohun_000
 */
public class MainMenuDao {
    
      public MainMenuBean selectByMainMenuId(int mainMenuId) throws Exception {
        MainMenuBean mainMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_main_menu  where mainMenuId = ?";
        PreparedStatement p = null;
        List<SubMenuBean> subMenuList = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, mainMenuId);
            rs = p.executeQuery();

            while (rs.next()) {
                mainMenuBean = new MainMenuBean();
                mainMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                mainMenuBean.setMenuName(rs.getString("menuName"));
                mainMenuBean.setAction(rs.getString("action"));
                mainMenuBean.setGroupMenu(rs.getString("groupMenu"));
                mainMenuBean.setTodoMethod(rs.getString("todoMethod"));
                mainMenuBean.setOnclick(rs.getString("onclick"));
                mainMenuBean.setCssclass(rs.getString("cssclass"));
                mainMenuBean.setCreated(rs.getDate("created"));
                mainMenuBean.setCreateBy(rs.getString("createBy"));
                mainMenuBean.setUpdated(rs.getDate("updated"));
                mainMenuBean.setUpdateBy(rs.getString("updateBy"));
                mainMenuBean.setSeqNo(rs.getInt("seqNo"));
                mainMenuBean.setLevelMenu(rs.getString("levelMenu"));
                subMenuList = new ArrayList<SubMenuBean>();
                SubMenuDao subMenuDao = new SubMenuDao();
                subMenuList = subMenuDao.selectByMainMenuIdList(rs.getInt("mainMenuId"));
                
                mainMenuBean.setSubMenuList(subMenuList);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return mainMenuBean;

    }
      
      public ArrayList<MainMenuBean> selectAll() throws Exception {
        MainMenuBean mainMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_main_menu order by seqNo";
        PreparedStatement p = null;
        ArrayList<MainMenuBean> list = new ArrayList<MainMenuBean>();
        List<SubMenuBean> subMenuList = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();

            while (rs.next()) {
                mainMenuBean = new MainMenuBean();
                mainMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                mainMenuBean.setMenuName(rs.getString("menuName"));
                mainMenuBean.setAction(rs.getString("action"));
                mainMenuBean.setGroupMenu(rs.getString("groupMenu"));
                mainMenuBean.setTodoMethod(rs.getString("todoMethod"));
                mainMenuBean.setOnclick(rs.getString("onclick"));
                mainMenuBean.setCssclass(rs.getString("cssclass"));
                mainMenuBean.setCreated(rs.getDate("created"));
                mainMenuBean.setCreateBy(rs.getString("createBy"));
                mainMenuBean.setUpdated(rs.getDate("updated"));
                mainMenuBean.setUpdateBy(rs.getString("updateBy"));
                mainMenuBean.setSeqNo(rs.getInt("seqNo"));
                mainMenuBean.setLevelMenu(rs.getString("levelMenu"));
                
                subMenuList = new ArrayList<SubMenuBean>();
                SubMenuDao subMenuDao = new SubMenuDao();
                subMenuList = subMenuDao.selectByMainMenuIdList(rs.getInt("mainMenuId"));
                
                mainMenuBean.setSubMenuList(subMenuList);

                list.add(mainMenuBean);

            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }
    

    public ArrayList<MainMenuBean> selectListByLevelMenu(String levelMenu) throws Exception {
        MainMenuBean mainMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_main_menu  where levelMenu = ? order by seqNo";
        PreparedStatement p = null;
        ArrayList<MainMenuBean> list = new ArrayList<MainMenuBean>();
        List<SubMenuBean> subMenuList = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, levelMenu);
            rs = p.executeQuery();

            while (rs.next()) {
                mainMenuBean = new MainMenuBean();
                mainMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                mainMenuBean.setMenuName(rs.getString("menuName"));
                mainMenuBean.setAction(rs.getString("action"));
                mainMenuBean.setGroupMenu(rs.getString("groupMenu"));
                mainMenuBean.setTodoMethod(rs.getString("todoMethod"));
                mainMenuBean.setOnclick(rs.getString("onclick"));
                mainMenuBean.setCssclass(rs.getString("cssclass"));
                mainMenuBean.setCreated(rs.getDate("created"));
                mainMenuBean.setCreateBy(rs.getString("createBy"));
                mainMenuBean.setUpdated(rs.getDate("updated"));
                mainMenuBean.setUpdateBy(rs.getString("updateBy"));
                mainMenuBean.setSeqNo(rs.getInt("seqNo"));
                mainMenuBean.setLevelMenu(rs.getString("levelMenu"));
                
                subMenuList = new ArrayList<SubMenuBean>();
                SubMenuDao subMenuDao = new SubMenuDao();
                subMenuList = subMenuDao.selectByMainMenuIdList(rs.getInt("mainMenuId"));
                
                mainMenuBean.setSubMenuList(subMenuList);

                list.add(mainMenuBean);

            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }

    public void insert(MainMenuBean mainMenuBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_main_menu values(?,?,?,?,?,?,?,sysdate(),?,sysdate(),?,?,?)";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(i++, mainMenuBean.getMainMenuId());
            p.setString(i++, mainMenuBean.getMenuName());
            p.setString(i++, mainMenuBean.getAction());
            p.setString(i++, mainMenuBean.getGroupMenu());
            p.setString(i++, mainMenuBean.getTodoMethod());
            p.setString(i++, mainMenuBean.getOnclick());
            p.setString(i++, mainMenuBean.getCssclass());
            p.setString(i++, mainMenuBean.getCreateBy());
            p.setString(i++, mainMenuBean.getUpdateBy());
            p.setInt(i++, mainMenuBean.getSeqNo());
            p.setString(i++, mainMenuBean.getLevelMenu());
            p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    }

      
    public void deleteByMainMenuId(int mainMenuId) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con =  dbConnect.openNewConnection();
        String sql = "delete from tbl_main_menu where mainMenuId = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1,mainMenuId);

            p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();

            }

        }
    }


    public void update(MainMenuBean mainMenuBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con =  dbConnect.openNewConnection();
        String sql = "update tbl_main_menu  set menuName=?,action=?,groupMenu=?,todoMethod=?,onclick=?,cssclass=?,updated=sysdate(),updateBy=?,seqNo=?,levelMenu=? where mainMenuId=?";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(i++, mainMenuBean.getMenuName());
            p.setString(i++, mainMenuBean.getAction());
            p.setString(i++, mainMenuBean.getGroupMenu());
            p.setString(i++, mainMenuBean.getTodoMethod());
            p.setString(i++, mainMenuBean.getOnclick());
            p.setString(i++, mainMenuBean.getCssclass());
            p.setString(i++, mainMenuBean.getUpdateBy());
            p.setInt(i++, mainMenuBean.getSeqNo());
            p.setString(i++, mainMenuBean.getLevelMenu());
            p.setInt(i++, mainMenuBean.getMainMenuId());
            p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
