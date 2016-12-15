/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.ApproveLoanBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author brass
 */
public class ApproveLoanDao {

    public int insert(ApproveLoanBean approveLoanBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_approveloan values(?,?,?,?,?,?,?,?,?,?,?,sysdate(),?,sysdate())";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, approveLoanBean.getApprove_id());
            p.setInt(2, approveLoanBean.getLoanbankreq_id());
            p.setInt(3, approveLoanBean.getLoanreq_id());
            p.setString(4, approveLoanBean.getFirstName());
            p.setString(5, approveLoanBean.getJudgment());
            p.setString(6, approveLoanBean.getLoanstatusbank());
            p.setDouble(7, approveLoanBean.getApprovedamount());
            p.setDouble(8, approveLoanBean.getInstalllments());
            p.setString(9, approveLoanBean.getTimerepayment());
            p.setString(10, approveLoanBean.getPosition());
            p.setString(11, approveLoanBean.getFirstName());
            p.setString(12, approveLoanBean.getFirstName());
            i = p.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
    //       ==================insertn==========================
//    public static void main(String[] args) throws Exception {
// //       ==================== insertn========================

//    public static void main(String[] args) throws Exception {
//        ApproveLoanDao dao = new ApproveLoanDao();
//        ApproveLoanBean bean = new ApproveLoanBean();
//        int i = 0;
//        bean.setLoanreq_id(1);
//        bean.setFirstName("สุเมธ");
//        try {
//            i = dao.insert(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(i);
//    }
    public ApproveLoanBean selectById(int loanreq_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan  where loanreq_id = ?";
        com.mysql.jdbc.PreparedStatement p = null;

        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, loanreq_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("loanreq_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setLoanbankreq_id(rs.getInt("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setJudgment(rs.getString("jubgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("birthdate"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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
      public ApproveLoanBean selectByidbank(int laonbankreq_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan  where laonbarkreq_id = ?";
        com.mysql.jdbc.PreparedStatement p = null;

        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, laonbankreq_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("loanreq_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setLoanbankreq_id(rs.getInt("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setJudgment(rs.getString("jubgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("birthdate"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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
       public ArrayList<ApproveLoanBean> selectAll() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan";
        com.mysql.jdbc.PreparedStatement p = null;
        ArrayList<ApproveLoanBean> approvelist = new ArrayList<ApproveLoanBean>();
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("loanreq_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setLoanbankreq_id(rs.getInt("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setJudgment(rs.getString("jubgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("birthdate"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
                approvelist.add(bean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return approvelist;
    }
}
