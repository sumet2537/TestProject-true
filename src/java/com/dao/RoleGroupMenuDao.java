/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.MainMenuBean;
import com.bean.RoleGroupMenuBean;
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
public class RoleGroupMenuDao {
      public RoleGroupMenuBean selectByRoleId(int roleId) throws Exception {
        RoleGroupMenuBean roleGroupMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_role_group_menu  where  roleId = ? order by seqNo";
        PreparedStatement p = null;
        List<MainMenuBean> listMainMenu = new ArrayList<MainMenuBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, roleId);
            rs = p.executeQuery();

            while (rs.next()) {
                roleGroupMenuBean = new RoleGroupMenuBean();
                roleGroupMenuBean.setRoleId(rs.getInt("roleId"));	
                
                MainMenuDao mainMenuDao = new MainMenuDao();
                MainMenuBean mainMenuBean = mainMenuDao.selectByMainMenuId(rs.getInt("mainMenuId"));
		listMainMenu.add(mainMenuBean);
            }  
            roleGroupMenuBean.setMainMenuList(listMainMenu);

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return roleGroupMenuBean;

    }
    

    public void insert(RoleGroupMenuBean roleGroupMenuBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_role_group_menu values(?,?,?)";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(i++, roleGroupMenuBean.getRoleId());
            p.setInt(i++, roleGroupMenuBean.getMainMenuId());
            p.setInt(i++, roleGroupMenuBean.getSeqNo());
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

      
    public void deleteByRoleId(int roleId) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con =  dbConnect.openNewConnection();
        String sql = "delete from tbl_role_group_menu where roleId = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1,roleId);

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
    
    public void deleteByRoleIdAndMainMenuId(int roleId,int mainMenuId) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con =  dbConnect.openNewConnection();
        String sql = "delete from tbl_role_group_menu where roleId = ? and mainMenuId = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1,roleId);
            p.setInt(2,mainMenuId);
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
