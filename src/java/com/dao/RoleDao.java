/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.RoleBean;
import com.bean.RoleGroupMenuBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kohun_000
 */
public class RoleDao {
    public RoleBean selectByRoleId(int roleId) throws Exception {
	RoleBean roleBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_role  where  roleId = ?";
        PreparedStatement p = null;


        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, roleId);
            rs = p.executeQuery();

            while (rs.next()) {
            	roleBean  = new RoleBean();
            	roleBean.setRoleId(rs.getInt("roleId"));
            	roleBean.setRoleName(rs.getString("roleName"));
            	roleBean.setDetail(rs.getString("detail"));
                roleBean.setCreated(rs.getDate("created"));
                roleBean.setCreateBy(rs.getString("createBy"));
                roleBean.setUpdated(rs.getDate("updated"));
                roleBean.setUpdateBy(rs.getString("updateBy"));
            	
            	RoleGroupMenuDao roleGroupMenuDao = new RoleGroupMenuDao();
            	
            	RoleGroupMenuBean roleGroupMenuBean = roleGroupMenuDao.selectByRoleId(rs.getInt("roleId"));
            	roleBean.setRoleGroupMenuBean(roleGroupMenuBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return roleBean ;

    }
	public ArrayList<RoleBean> selectAll() throws Exception {
	 	RoleBean roleBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = (Connection) dbConnect.openNewConnection();
        String sql = "select * from tbl_role";
        PreparedStatement p = null;
        ArrayList<RoleBean>roleList = new ArrayList<RoleBean>();

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
           
            rs = p.executeQuery();

            while (rs.next()) {
            	roleBean  = new RoleBean();
            	roleBean.setRoleId(rs.getInt("roleId"));
            	roleBean.setRoleName(rs.getString("roleName"));
            	roleBean.setDetail(rs.getString("detail"));
                roleBean.setCreated(rs.getDate("created"));
                roleBean.setCreateBy(rs.getString("createBy"));
                roleBean.setUpdated(rs.getDate("updated"));
                roleBean.setUpdateBy(rs.getString("updateBy"));
            	
            	RoleGroupMenuDao roleGroupMenuDao = new RoleGroupMenuDao();
            	
            	RoleGroupMenuBean roleGroupMenuBean = roleGroupMenuDao.selectByRoleId(rs.getInt("roleId"));
            	roleBean.setRoleGroupMenuBean(roleGroupMenuBean);
            	
            	roleList.add(roleBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return roleList ;

    }
        
    
    public void insert(RoleBean roleBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_role values(?,?,?,sysdate(),?,sysdate(),?)";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(i++, roleBean.getRoleId());
            p.setString(i++, roleBean.getRoleName());
            p.setString(i++, roleBean.getDetail());
            p.setString(i++, roleBean.getCreateBy());
            p.setString(i++, roleBean.getUpdateBy());
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
        String sql = "delete from tbl_role where roleId = ?";
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
    
    
    public void update(RoleBean roleBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con =  dbConnect.openNewConnection();
        String sql = "update tbl_role  set roleName=?,detail=?,updated=sysdate(),updateBy=? where roleId=?";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(i++, roleBean.getRoleId());
            p.setString(i++, roleBean.getRoleName());
            p.setString(i++, roleBean.getDetail());
            p.setString(i++, roleBean.getUpdateBy());
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
