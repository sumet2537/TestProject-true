/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.LovBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author kohun_000
 */
public class LovDao {
    public ArrayList<LovBean> selectDropdown(String dropdownName) throws Exception {
        LovBean lovBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_lov  where type = 'DROPDOWN' and name = ? order by seqNo";
        PreparedStatement p = null;
        ArrayList<LovBean> list = new ArrayList<LovBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, dropdownName);
            rs = p.executeQuery();

            while (rs.next()) {
                lovBean = new LovBean();
                lovBean.setLovId(rs.getInt("lovId"));
                lovBean.setType(rs.getString("type"));
                lovBean.setName(rs.getString("name"));
                lovBean.setDisplay(rs.getString("display"));
                lovBean.setValue1(rs.getString("value1"));
                lovBean.setValue2(rs.getString("value2"));
                lovBean.setValue3(rs.getString("value3"));
                lovBean.setValue4(rs.getString("value4"));
                lovBean.setValue5(rs.getString("value5"));
                lovBean.setValue6(rs.getString("value6"));
                lovBean.setValue7(rs.getString("value7"));
                lovBean.setValue8(rs.getString("value8"));
                lovBean.setValue9(rs.getString("value9"));
                lovBean.setValue10(rs.getString("value10"));
                lovBean.setCreated(rs.getDate("created"));
                lovBean.setCreateBy(rs.getString("createBy"));
                lovBean.setUpdated(rs.getDate("updated"));
                lovBean.setUpdateBy(rs.getString("updateBy"));
                lovBean.setStatus(rs.getString("status"));
                lovBean.setSeqNo(rs.getInt("seqNo"));
                list.add(lovBean);

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
    
    public ArrayList<LovBean> selectLovByLovType(String lovType) throws Exception {
        LovBean lovBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_lov  where type = ?  order by seqNo";
        PreparedStatement p = null;
        ArrayList<LovBean> list = new ArrayList<LovBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, lovType);
            rs = p.executeQuery();

            while (rs.next()) {
                lovBean = new LovBean();
                lovBean.setLovId(rs.getInt("lovId"));
                lovBean.setType(rs.getString("type"));
                lovBean.setName(rs.getString("name"));
                lovBean.setDisplay(rs.getString("display"));
                lovBean.setValue1(rs.getString("value1"));
                lovBean.setValue2(rs.getString("value2"));
                lovBean.setValue3(rs.getString("value3"));
                lovBean.setValue4(rs.getString("value4"));
                lovBean.setValue5(rs.getString("value5"));
                lovBean.setValue6(rs.getString("value6"));
                lovBean.setValue7(rs.getString("value7"));
                lovBean.setValue8(rs.getString("value8"));
                lovBean.setValue9(rs.getString("value9"));
                lovBean.setValue10(rs.getString("value10"));
                lovBean.setCreated(rs.getDate("created"));
                lovBean.setCreateBy(rs.getString("createBy"));
                lovBean.setUpdated(rs.getDate("updated"));
                lovBean.setUpdateBy(rs.getString("updateBy"));
                lovBean.setStatus(rs.getString("status"));
                lovBean.setSeqNo(rs.getInt("seqNo"));
                list.add(lovBean);

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
    
    public ArrayList<LovBean> selectLovByLovTypeAndLovName(String lovType,String lovName) throws Exception {
        LovBean lovBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_lov  where type = ?  and  name = ?  order by seqNo";
        PreparedStatement p = null;
        ArrayList<LovBean> list = new ArrayList<LovBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, lovType);
            p.setString(2, lovName);
            rs = p.executeQuery();

            while (rs.next()) {
                lovBean = new LovBean();
                lovBean.setLovId(rs.getInt("lovId"));
                lovBean.setType(rs.getString("type"));
                lovBean.setName(rs.getString("name"));
                lovBean.setDisplay(rs.getString("display"));
                lovBean.setValue1(rs.getString("value1"));
                lovBean.setValue2(rs.getString("value2"));
                lovBean.setValue3(rs.getString("value3"));
                lovBean.setValue4(rs.getString("value4"));
                lovBean.setValue5(rs.getString("value5"));
                lovBean.setValue6(rs.getString("value6"));
                lovBean.setValue7(rs.getString("value7"));
                lovBean.setValue8(rs.getString("value8"));
                lovBean.setValue9(rs.getString("value9"));
                lovBean.setValue10(rs.getString("value10"));
                lovBean.setCreated(rs.getDate("created"));
                lovBean.setCreateBy(rs.getString("createBy"));
                lovBean.setUpdated(rs.getDate("updated"));
                lovBean.setUpdateBy(rs.getString("updateBy"));
                lovBean.setStatus(rs.getString("status"));
                lovBean.setSeqNo(rs.getInt("seqNo"));
                list.add(lovBean);

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
    
    
}
