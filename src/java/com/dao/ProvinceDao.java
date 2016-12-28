/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.ProvinceBean;
import com.util.DBConnect;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 *
 * @author brass
 */
public class ProvinceDao {

    public ProvinceBean selectById(String citizen_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ProvinceBean bean = null;
        String sql = "select * from province = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, citizen_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ProvinceBean();
                bean.setPROVINCE_ID(rs.getInt("PROVINCE_ID"));
                bean.setPROVINCE_CODE(rs.getString("PROVINCE_CODE"));
                bean.setPROVINCE_NAME(rs.getString("PROVINCE_NAME"));
                bean.setGEO_ID(rs.getInt("GEO_ID"));
   
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return bean;
    }


    //       =====================================================
    public ArrayList<ProvinceBean> selectAllprovince() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ProvinceBean bean = null;
        String sql = "select * from province ";
        PreparedStatement p = null;
        ArrayList<ProvinceBean> loanList = new ArrayList<ProvinceBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ProvinceBean();
                bean.setPROVINCE_ID(rs.getInt("PROVINCE_ID"));
                bean.setPROVINCE_CODE(rs.getString("PROVINCE_CODE"));
                bean.setPROVINCE_NAME(rs.getString("PROVINCE_NAME"));
                bean.setGEO_ID(rs.getInt("GEO_ID"));
                loanList.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return loanList;
    }
      //       =====================================================
    public ArrayList<ProvinceBean> selectAllamphur() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ProvinceBean bean = null;
        String sql = "select * from amphur ";
        PreparedStatement p = null;
        ArrayList<ProvinceBean> loanList = new ArrayList<ProvinceBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ProvinceBean();
                bean.setAMPHUR_ID(rs.getInt("AMPHUR_ID"));
                bean.setAMPHUR_CODE(rs.getString("AMPHUR_CODE"));
                bean.setAMPHUR_NAME(rs.getString("AMPHUR_NAME"));
                bean.setGEO_ID(rs.getInt("GEO_ID"));
                bean.setPROVINCE_ID(rs.getInt("PROVINCE_ID"));
                loanList.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return loanList;
    }
    
         //       =====================================================
    public ArrayList<ProvinceBean> selectAlldistrict() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ProvinceBean bean = null;
        String sql = "select * from district ";
        PreparedStatement p = null;
        ArrayList<ProvinceBean> loanList = new ArrayList<ProvinceBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ProvinceBean();
                bean.setDISTRICT_ID(rs.getInt("DISTRICT_ID"));
                bean.setDISTRICT_CODE(rs.getString("DISTRICT_CODE"));
                bean.setDISTRICT_NAME(rs.getString("DISTRICT_NAME"));
                bean.setAMPHUR_ID(rs.getInt("AMPHUR_ID"));
                bean.setPROVINCE_ID(rs.getInt("PROVINCE_ID"));
                bean.setGEO_ID(rs.getInt("GEO_ID"));
                loanList.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return loanList;
    }
    
}
