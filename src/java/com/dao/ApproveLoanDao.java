/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.ApproveLoanBean;
import com.bean.RequestLoanBean;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author brass
 */
public class ApproveLoanDao {
    
  public int insert(ApproveLoanBean approveLoanBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_approveloan values(?,?,?,?,?,?,?,?,?,sysdate(),?,sysdate())";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, 0);
            p.setInt(2, approveLoanBean.getLoanreq_id());
            p.setInt(3, approveLoanBean.getLoanbankreq_id());
            p.setString(4, approveLoanBean.getFirstName());
            p.setString(5, approveLoanBean.getJudgment());
            p.setDouble(6, approveLoanBean.getApprovedamount());
            p.setDouble(7, approveLoanBean.getInstalllments());
            p.setString( 8, approveLoanBean.getTimerepayment());
            p.setString(9, approveLoanBean.getFirstName());
            p.setString(10, approveLoanBean.getFirstName());
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
//        RequestLoanDao dao = new RequestLoanDao();
//        RequestLoanBean bean = new RequestLoanBean();
//        int i = 0;
////        bean.setLoanreq_id(1);
//        bean.setCitizen_id("2342");
//        bean.setTitle_type("นาย");
//        bean.setFirstName("สุเมธ");
//        bean.setLastName("kaenkaew");
//        bean.setBirthdate("10");
//        bean.setAge(22);
//        bean.setNationality("thai");
//        bean.setStatustype("cod");
//        bean.setMobile("0833412924");
//        bean.setEmail("sumet");
//        bean.setAddressregistration("rmu");
//        bean.setAddresscurrent("aaa");
//        bean.setAddresssenddoc("aaa");
//        bean.setJobtype("ss");
//        bean.setHometype("aaa");
//        bean.setTradingprice(23.23);
//        bean.setCreditloan(324.32);
//        bean.setLncome_per_month(1);
//        bean.setPeriodloan(53.65);
//        bean.setNetprofit(32.32);
//        bean.setCopyidcard("334.jpg");
//        bean.setCopylicenses("334.jpg");
//        bean.setCopydocumenthome("534.jpg");
//        bean.setCopymarriage("3434.jpg");
//        bean.setCopy_rename("34534.jpg");
//        bean.setSalary_slip("34534.jpg");
//        bean.setCopy_bankaccount("34534.jpg");
//        bean.setBanktype("sdfs sdfsdf sdfsdf");
//        bean.setLoanstatustype("รอตรวจสอบ");
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
                bean.setApprovedamount(rs.getDouble("birthdate"));
                        bean.setInstalllments(rs.getDouble("installlments"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));

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
}
