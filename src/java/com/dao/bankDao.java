/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.bankBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author brass
 */
public class bankDao {
    
 
    public bankBean selectById(String bank_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        bankBean bean = null;
        String sql = "select * from tbl_bank where bank_id =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setString(1, bank_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new bankBean();
                bean.setId(rs.getInt("id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setBankname(rs.getString("bankname"));
                bean.setEmailbank(rs.getString("emailbank"));
//                list.add(bean);
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
//    }
//      public static void main(String[] args) throws Exception {
//////// //       ==================== ========================
//        bankDao dao = new bankDao();
////        ArrayList<bankBean> bean = new ArrayList<bankBean>();
//        bean = dao.selectBy_Id("");
//        //        select like---------------------------------------------------------
//
//        System.out.println("--------------ข้อมูล user--------------");
//        for (bankBean tranferBean1 : bean) {
//            System.out.println("รหัสบัตรประชาชน Cashier : " + tranferBean1.getId());
//            System.out.println("รหัสบัตรประชาชน User : " + tranferBean1.getBank_id());
//            System.out.println("---------------------------------");
//        }

    }
    
    
      public bankBean selectByidbank(int id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        bankBean bean = null;
        String sql = "select * from tbl_bank  where id = ?";
        com.mysql.jdbc.PreparedStatement p = null;

        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new bankBean();
                bean.setId(rs.getInt("id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setBankname(rs.getString("bankname"));
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
       public ArrayList<bankBean> selectAll() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        bankBean bean = null;
        String sql = "select * from tbl_bank  ";
        com.mysql.jdbc.PreparedStatement p = null;
        ArrayList<bankBean> list = new ArrayList<bankBean>();
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new bankBean();
                bean.setId(rs.getInt("id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setBankname(rs.getString("bankname"));
               list.add(bean);
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
