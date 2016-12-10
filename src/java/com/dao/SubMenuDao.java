/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.SubMenuBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kohun_000
 */
public class SubMenuDao {

    public SubMenuBean selectBySubMenuId(int subMenuId) throws Exception {
        SubMenuBean subMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_sub_menu where subMenuId = ? ";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, subMenuId);
            rs = p.executeQuery();

            while (rs.next()) {
                subMenuBean = new SubMenuBean();
                subMenuBean.setSubMenuId(rs.getInt("subMenuId"));
                subMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                subMenuBean.setMenuName(rs.getString("menuName"));
                subMenuBean.setAction(rs.getString("action"));
                subMenuBean.setTodoMethod(rs.getString("todoMethod"));
                subMenuBean.setOnclick(rs.getString("onclick"));
                subMenuBean.setCssclass(rs.getString("cssclass"));
                subMenuBean.setCreated(rs.getDate("created"));
                subMenuBean.setCreateBy(rs.getString("createBy"));
                subMenuBean.setUpdated(rs.getDate("updated"));
                subMenuBean.setUpdateBy(rs.getString("updateBy"));
                subMenuBean.setSeqNo(rs.getInt("seqNo"));
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return subMenuBean;

    }
    
    public ArrayList<SubMenuBean> selectByMainMenuIdList(int mainMenuId) throws Exception {
        SubMenuBean subMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_sub_menu where mainMenuId = ? order by seqNo ";
        PreparedStatement p = null;
        ArrayList<SubMenuBean> list = new ArrayList<SubMenuBean>();

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, mainMenuId);
            rs = p.executeQuery();

            while (rs.next()) {
                subMenuBean = new SubMenuBean();
                subMenuBean.setSubMenuId(rs.getInt("subMenuId"));
                subMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                subMenuBean.setMenuName(rs.getString("menuName"));
                subMenuBean.setAction(rs.getString("action"));
                subMenuBean.setTodoMethod(rs.getString("todoMethod"));
                subMenuBean.setOnclick(rs.getString("onclick"));
                subMenuBean.setCssclass(rs.getString("cssclass"));
                subMenuBean.setCreated(rs.getDate("created"));
                subMenuBean.setCreateBy(rs.getString("createBy"));
                subMenuBean.setUpdated(rs.getDate("updated"));
                subMenuBean.setUpdateBy(rs.getString("updateBy"));
                subMenuBean.setSeqNo(rs.getInt("seqNo"));
                list.add(subMenuBean);
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

    public ArrayList<SubMenuBean> selectAll() throws Exception {
        SubMenuBean subMenuBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from tbl_sub_menu order by seqNo";
        PreparedStatement p = null;
        ArrayList<SubMenuBean> list = new ArrayList<SubMenuBean>();

        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();

            while (rs.next()) {
                subMenuBean = new SubMenuBean();
                subMenuBean.setSubMenuId(rs.getInt("subMenuId"));
                subMenuBean.setMainMenuId(rs.getInt("mainMenuId"));
                subMenuBean.setMenuName(rs.getString("menuName"));
                subMenuBean.setAction(rs.getString("action"));
                subMenuBean.setTodoMethod(rs.getString("todoMethod"));
                subMenuBean.setOnclick(rs.getString("onclick"));
                subMenuBean.setCssclass(rs.getString("cssclass"));
                subMenuBean.setCreated(rs.getDate("created"));
                subMenuBean.setCreateBy(rs.getString("createBy"));
                subMenuBean.setUpdated(rs.getDate("updated"));
                subMenuBean.setUpdateBy(rs.getString("updateBy"));
                subMenuBean.setSeqNo(rs.getInt("seqNo"));

                list.add(subMenuBean);

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

    public void insert(SubMenuBean subMenuBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_sub_menu values(?,?,?,?,?,?,?,sysdate(),?,sysdate(),?,?)";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(i++, subMenuBean.getSubMenuId());
            p.setInt(i++, subMenuBean.getMainMenuId());
            p.setString(i++, subMenuBean.getMenuName());
            p.setString(i++, subMenuBean.getAction());
            p.setString(i++, subMenuBean.getTodoMethod());
            p.setString(i++, subMenuBean.getOnclick());
            p.setString(i++, subMenuBean.getCssclass());
            p.setString(i++, subMenuBean.getCreateBy());
            p.setString(i++, subMenuBean.getUpdateBy());
            p.setInt(i++, subMenuBean.getSeqNo());
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

    public void deleteBySubMenuId(int subMenuId) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con =  dbConnect.openNewConnection();
        String sql = "delete from tbl_sub_menu where subMenuId = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1,subMenuId);

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
        String sql = "delete from tbl_sub_menu where mainMenuId = ?";
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


    public void update(SubMenuBean subMenuBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con =  dbConnect.openNewConnection();
        String sql = "update tbl_sub_menu  set menuName=?,action=?,todoMethod=?,onclick=?,cssclass=?,updated=sysdate(),updateBy=?,seqNo=? where subMenuId=?";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(i++, subMenuBean.getMenuName());
            p.setString(i++, subMenuBean.getAction());
            p.setString(i++, subMenuBean.getTodoMethod());
            p.setString(i++, subMenuBean.getOnclick());
            p.setString(i++, subMenuBean.getCssclass());
            p.setString(i++, subMenuBean.getUpdateBy());
            p.setInt(i++, subMenuBean.getSeqNo());
            p.setInt(i++, subMenuBean.getSubMenuId());
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
