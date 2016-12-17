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
            p.setString(2, approveLoanBean.getBank_id());
            p.setInt(3, approveLoanBean.getLoanreq_id());
            p.setString(4, approveLoanBean.getCitizen_id());
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
    public ArrayList<ApproveLoanBean> selectById(int loanreq_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select *,bankname from tbl_approveloan INNER JOIN tbl_bank ON tbl_approveloan.bank_id = tbl_bank.bank_id where loanreq_id  =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
        ArrayList<ApproveLoanBean> list = new ArrayList<ApproveLoanBean>();
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, loanreq_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("approvedamount"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setTimerepayment(rs.getString("timerepayment"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setBankName("bankname");
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
      public static void main(String[] args) throws Exception {
////// //       ==================== ========================
        ApproveLoanDao dao = new ApproveLoanDao();
        ArrayList<ApproveLoanBean> bean = new ArrayList<ApproveLoanBean>();
        bean = dao.selectById(136);
        //        select like---------------------------------------------------------

        System.out.println("--------------ข้อมูล user--------------");
        for (ApproveLoanBean tranferBean1 : bean) {
            System.out.println("รหัสบัตรประชาชน Cashier : " + tranferBean1.getLoanreq_id());
            System.out.println("รหัสบัตรประชาชน User : " + tranferBean1.getCitizen_id());
            System.out.println("---------------------------------");
        }

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
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
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
        String sql = "select * from tbl_approveloan where loanreq_id=? ";
        com.mysql.jdbc.PreparedStatement p = null;
        ArrayList<ApproveLoanBean> approvelist = new ArrayList<ApproveLoanBean>();
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
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
       public ArrayList<ApproveLoanBean> selectByIdcitizen(String  citizen_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan where citizen_id =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
        ArrayList<ApproveLoanBean> list = new ArrayList<ApproveLoanBean>();
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setString(1, citizen_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("approvedamount"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setTimerepayment(rs.getString("timerepayment"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
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
        public int deleteloanreqId(int approve_id) throws Exception {
        DBConnect bConnect = new DBConnect();
        ApproveLoanBean bean = new ApproveLoanBean();
        Connection con = (Connection) bConnect.openNewConnection();
        String sql = "delete from tbl_approveloan where approve_id=?";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareCall(sql.toString());
            p.setInt(1, approve_id);
            i = p.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                p.close();
                bConnect.closeConnection(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
         public ApproveLoanBean selectBy_Id(int loanreq_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan where loanreq_id =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
//        ArrayList<ApproveLoanBean> list = new ArrayList<ApproveLoanBean>();
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, loanreq_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("approvedamount"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setTimerepayment(rs.getString("timerepayment"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
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
    }
         public ApproveLoanBean selectByIdcitizen_id(String  citizen_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan where citizen_id =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
//        ArrayList<ApproveLoanBean> list = new ArrayList<ApproveLoanBean>();
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setString(1, citizen_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("approvedamount"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setTimerepayment(rs.getString("timerepayment"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
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
}
          public ApproveLoanBean selectApprove_id(int approve_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        ApproveLoanBean bean = null;
        String sql = "select * from tbl_approveloan where approve_id =?"; //
        com.mysql.jdbc.PreparedStatement p = null;
//        ArrayList<ApproveLoanBean> list = new ArrayList<ApproveLoanBean>();
        
        try {
            p = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, approve_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new ApproveLoanBean();
                bean.setApprove_id(rs.getInt("approve_id"));
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setBank_id(rs.getString("bank_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setJudgment(rs.getString("judgment"));
                bean.setLoanstatusbank(rs.getString("loanstatusbank"));
                bean.setApprovedamount(rs.getDouble("approvedamount"));
                bean.setInstalllments(rs.getDouble("installlments"));
                bean.setTimerepayment(rs.getString("timerepayment"));
                bean.setPosition(rs.getString("position"));
                bean.setCreatedby(rs.getString("createdby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
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
