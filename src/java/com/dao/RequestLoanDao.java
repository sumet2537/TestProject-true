/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.RequestLoanBean;
import com.mysql.jdbc.PreparedStatement;
import com.util.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author brass
 */
public class RequestLoanDao {

    public int insert(RequestLoanBean requestLoatBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_requestloan values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate(),?,sysdate())";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, 0);
            p.setString(2, requestLoatBean.getCitizen_id());
            p.setString(3, requestLoatBean.getTitle_type());
            p.setString(4, requestLoatBean.getFirstName());
            p.setString(5, requestLoatBean.getLastName());
            p.setString(6, requestLoatBean.getBirthdate());
            p.setInt(7, requestLoatBean.getAge());
            p.setString(8, requestLoatBean.getNationality());
            p.setString(9, requestLoatBean.getStatustype());
            p.setString(10, requestLoatBean.getMobile());
            p.setString(11, requestLoatBean.getEmail());
            p.setString(12, requestLoatBean.getAddressregistration());
            p.setString(13, requestLoatBean.getAddresscurrent());
            p.setString(14, requestLoatBean.getAddresssenddoc());
            p.setString(15, requestLoatBean.getJobtype());
            p.setString(16, requestLoatBean.getHometype());
            p.setDouble(17, requestLoatBean.getTradingprice());
            p.setDouble(18, requestLoatBean.getCreditloan());
            p.setInt(19, requestLoatBean.getLncome_per_month());
            p.setDouble(20, requestLoatBean.getPeriodloan());
            p.setDouble(21, requestLoatBean.getNetprofit());
            p.setString(22, requestLoatBean.getCopyidcard());
            p.setString(23, requestLoatBean.getCopylicenses());
            p.setString(24, requestLoatBean.getCopydocumenthome());
            p.setString(25, requestLoatBean.getCopymarriage());
            p.setString(26, requestLoatBean.getCopy_rename());
            p.setString(27, requestLoatBean.getSalary_slip());
            p.setString(28, requestLoatBean.getCopy_bankaccount());
            p.setString(29, requestLoatBean.getBanktype());
            p.setString(30, requestLoatBean.getLoanstatustype());
            p.setString(31, requestLoatBean.getFirstName());
            p.setString(32, requestLoatBean.getFirstName());
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
    public int insertbank(RequestLoanBean requestLoatBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_requestloan values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate(),?,sysdate())";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, 0);
            p.setInt(2, requestLoatBean.getLoanreq_id());
            p.setString(3, requestLoatBean.getCitizen_id());
            p.setString(4, requestLoatBean.getTitle_type());
            p.setString(5, requestLoatBean.getFirstName());
            p.setString(6, requestLoatBean.getLastName());
            p.setString(7, requestLoatBean.getBirthdate());
            p.setInt(8, requestLoatBean.getAge());
            p.setString(9, requestLoatBean.getNationality());
            p.setString(10, requestLoatBean.getStatustype());
            p.setString(11, requestLoatBean.getMobile());
            p.setString(12, requestLoatBean.getEmail());
            p.setString(13, requestLoatBean.getAddressregistration());
            p.setString(14, requestLoatBean.getAddresscurrent());
            p.setString(15, requestLoatBean.getAddresssenddoc());
            p.setString(16, requestLoatBean.getJobtype());
            p.setString(17, requestLoatBean.getHometype());
            p.setDouble(18, requestLoatBean.getTradingprice());
            p.setDouble(19, requestLoatBean.getCreditloan());
            p.setInt(20, requestLoatBean.getLncome_per_month());
            p.setDouble(21, requestLoatBean.getPeriodloan());
            p.setDouble(22, requestLoatBean.getNetprofit());
            p.setString(23, requestLoatBean.getCopyidcard());
            p.setString(24, requestLoatBean.getCopylicenses());
            p.setString(25, requestLoatBean.getCopydocumenthome());
            p.setString(26, requestLoatBean.getCopymarriage());
            p.setString(27, requestLoatBean.getCopy_rename());
            p.setString(28, requestLoatBean.getSalary_slip());
            p.setString(29, requestLoatBean.getCopy_bankaccount());
            p.setString(30, requestLoatBean.getLoanstatustype());
            p.setString(31, requestLoatBean.getFirstName());
            p.setString(32, requestLoatBean.getFirstName());
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
//    =====================================================
//    =====================================================

    public RequestLoanBean selectById(int loanreq_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanreq_id = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, loanreq_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
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

//
//    public static void main(String[] args) throws Exception {
//// //       ==================== ========================
//        RequestLoanDao dao = new RequestLoanDao();
//        RequestLoanBean bean = new RequestLoanBean();
//        bean = dao.selectById(1);
//        System.out.println(bean.getLoanreq_id());
//        System.out.println(bean.getCitizen_id());
//        
//        System.out.println(bean.getFirstname());
//        System.out.println(bean.getLastname());
//        System.out.println(bean.getBanktype());
//        System.out.println(bean.getAge());
//        System.out.println(bean.getEmail());
//
//    }
    public RequestLoanBean selectloanstatustype(String loanstatustype) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, loanstatustype);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
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
//    public static void main(String[] args) throws Exception {
//// //       ==================== ========================
//        RequestLoanDao dao = new RequestLoanDao();
//        RequestLoanBean bean = new RequestLoanBean();
//        bean = dao.selectloanstatustype("รออนุมัติ");
//        System.out.println(bean.getLoanreq_id());
//        System.out.println(bean.getCitizen_id());
//        
//        System.out.println(bean.getFirstName());
//        System.out.println(bean.getLastName());
//        System.out.println(bean.getBanktype());
//        System.out.println(bean.getAge());
//        System.out.println(bean.getEmail());
//        System.out.println(bean.getLoanstatustype());

//    }
//       =====================================================
    public RequestLoanBean selectBycitizenid(String citizen_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_user  where citizen_id = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, citizen_id);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
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

    //       =====================================================
    public ArrayList<RequestLoanBean> selectAll() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan ";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeAp() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = 'อนุมัติ'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeApuser() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_approveloan  where loanstatustype = 'อนุมัติ'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeNoAp() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = 'ไม่อนุมัติ'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeNofile() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = 'เอกสารไม่ผ่าน'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeRapp() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = 'รออนุมัติ'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public ArrayList<RequestLoanBean> selectloanstatustypeRcheck() throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        ResultSet rs = null;
        RequestLoanBean bean = null;
        String sql = "select * from tbl_requestloan  where loanstatustype = 'รอตรวจสอบ'";
        PreparedStatement p = null;
        ArrayList<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            rs = p.executeQuery();
            while (rs.next()) {
                bean = new RequestLoanBean();
                bean.setLoanreq_id(rs.getInt("loanreq_id"));
                bean.setCitizen_id(rs.getString("citizen_id"));
                bean.setTitle_type(rs.getString("title_type"));
                bean.setFirstName(rs.getString("firstName"));
                bean.setLastName(rs.getString("lastName"));
                bean.setBirthdate(rs.getString("birthdate"));
                bean.setAge(rs.getInt("age"));
                bean.setNationality(rs.getString("nationality"));
                bean.setStatustype(rs.getString("statustype"));
                bean.setMobile(rs.getString("mobile"));
                bean.setEmail(rs.getString("email"));
                bean.setAddressregistration(rs.getString("addressregistration"));
                bean.setAddresscurrent(rs.getString("addresscurrent"));
                bean.setAddresssenddoc(rs.getString("addresssenddoc"));
                bean.setJobtype(rs.getString("jobtype"));
                bean.setHometype(rs.getString("hometype"));
                bean.setTradingprice(rs.getDouble("tradingprice"));
                bean.setCreditloan(rs.getDouble("creditloan"));
                bean.setLncome_per_month(rs.getInt("lncome_per_month"));
                bean.setPeriodloan(rs.getDouble("periodloan"));
                bean.setNetprofit(rs.getDouble("netprofit"));
                bean.setCopyidcard(rs.getString("copyidcard"));
                bean.setCopylicenses(rs.getString("copylicenses"));
                bean.setCopydocumenthome(rs.getString("copydocumenthome"));
                bean.setCopymarriage(rs.getString("copymarriage"));
                bean.setCopy_rename(rs.getString("copy_rename"));
                bean.setSalary_slip(rs.getString("salary_slip"));
                bean.setCopy_bankaccount(rs.getString("copy_bankaccount"));
                bean.setBanktype(rs.getString("banktype"));
                bean.setLoanstatustype(rs.getString("loanstatustype"));
                bean.setCreateby(rs.getString("createby"));
                bean.setUpdateby(rs.getString("updateby"));
                bean.setCreated(rs.getString("created"));
                bean.setUpdated(rs.getString("updated"));
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

    public int updateById(RequestLoanBean requestLoatBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_requestloan set title_type=?, firstName=?, lastName=?, birthdate=?, age=?, nationality=?, statustype=?, mobile=?, email=?, addressregistration=?, addresscurrent=?, addresssenddoc=?, jobtype=?, hometype=?, tradingprice=?, creditloan=?, lncome_per_month=?, periodloan=?, netprofit=?, copyidcard=?, copylicenses=?, copydocumenthome=?, copymarriage=?, copy_rename=?, salary_slip=?, copy_bankaccount=?, banktype=?, loanstatustype=?, updateby=?, updated=sysdate() where loanreq_id=? ";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql.toString());

//            p.setString(1, requestLoatBean.getCitizen_id());
            p.setString(1, requestLoatBean.getTitle_type());
            p.setString(2, requestLoatBean.getFirstName());
            p.setString(3, requestLoatBean.getLastName());
            p.setString(4, requestLoatBean.getBirthdate());
            p.setInt(5, requestLoatBean.getAge());
            p.setString(6, requestLoatBean.getNationality());
            p.setString(7, requestLoatBean.getStatustype());
            p.setString(8, requestLoatBean.getMobile());
            p.setString(9, requestLoatBean.getEmail());
            p.setString(10, requestLoatBean.getAddressregistration());
            p.setString(11, requestLoatBean.getAddresscurrent());
            p.setString(12, requestLoatBean.getAddresssenddoc());
            p.setString(13, requestLoatBean.getJobtype());
            p.setString(14, requestLoatBean.getHometype());
            p.setDouble(15, requestLoatBean.getTradingprice());
            p.setDouble(16, requestLoatBean.getCreditloan());
            p.setInt(17, requestLoatBean.getLncome_per_month());
            p.setDouble(18, requestLoatBean.getPeriodloan());
            p.setDouble(19, requestLoatBean.getNetprofit());
            p.setString(20, requestLoatBean.getCopyidcard());
            p.setString(21, requestLoatBean.getCopylicenses());
            p.setString(22, requestLoatBean.getCopydocumenthome());
            p.setString(23, requestLoatBean.getCopymarriage());
            p.setString(24, requestLoatBean.getCopy_rename());
            p.setString(25, requestLoatBean.getSalary_slip());
            p.setString(26, requestLoatBean.getCopy_bankaccount());
            p.setString(27, requestLoatBean.getBanktype());
            p.setString(28, requestLoatBean.getLoanstatustype());
            p.setString(29, requestLoatBean.getFirstName());
            p.setInt(30, requestLoatBean.getLoanreq_id());
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
            System.out.println(i);
        }
        return i;
    }

    public int updateBystatus(RequestLoanBean requestLoatBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_requestloan set loanstatustype=?, updateby=?, updated=sysdate() where loanreq_id=?";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, requestLoatBean.getLoanstatustype());
            p.setString(2, requestLoatBean.getUpdateby());
            p.setInt(3, requestLoatBean.getLoanreq_id());
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
            System.out.println(i);
        }
        return i;
    }

//    public static void main(String[] args) throws Exception {
//        RequestLoanDao dao = new RequestLoanDao();
//        RequestLoanBean bean = new RequestLoanBean();
//        int i = 0;
//        bean.setLoanreq_id(2);
////        bean.setCitizen_id("ดกก3453");
//        bean.setTitle_type("นาย");
//        bean.setFirstName("สุเมธ");
//        bean.setLastName("แก่นแก้ว");
//        bean.setBirthdate("10");
//        bean.setAge(50);
//        bean.setNationality("ไทย");
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
//        bean.setCopyidcard("34.jpg");
//        bean.setCopylicenses("34.jpg");
//        bean.setCopydocumenthome("ก");
//        bean.setCopymarriage("fd");
//        bean.setCopy_rename("df");
//        bean.setSalary_slip("3sd");
//        bean.setCopy_bankaccount("sd");
//        bean.setBanktype("sdfs sdfsdf sdfsdf");
//        bean.setLoanstatustype("รออนุมัติ");
////        bean.setFirstName("aa");
//
//        try {
//            i = dao.updateById(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(i);
//
//    }
//    public void deleteByloanreqId(int loanreq_id)throws Exception{
//       DBConnect dbConnect = new DBConnect();
//        Connection con = null;
//        con = dbConnect.openNewConnection();
//        String sql = "delete from tbl_requestloan where loanreq_id";
//        PreparedStatement p = null;
//        try {
//            p= (PreparedStatement) con.prepareStatement(sql);
//            p.setInt(1, loanreq_id);
//            
//            p.executeUpdate();
//        }finally{
//            try {
//                p.close();
//                con.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }       
//        }    
//    }
    public int deleteloanreqId(int loanreq_id) throws Exception {
        DBConnect bConnect = new DBConnect();
        RequestLoanBean bean = new RequestLoanBean();
        Connection con = (Connection) bConnect.openNewConnection();
        String sql = "delete from tbl_requestloan where loanreq_id=?";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareCall(sql.toString());
            p.setInt(1, loanreq_id);
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

//    public static void main(String[]arge)throws Exception{
//    RequestLoanDao dao = new RequestLoanDao();
//    RequestLoanBean bean= new RequestLoanBean();
//    int i=0;
//            try {
//                int loanreq_id=3;
//                i = dao.deleteloanreqId(loanreq_id);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//    }
    public int deleteloanstatus(String loanstatustype) throws Exception {
        DBConnect bConnect = new DBConnect();
        RequestLoanBean bean = new RequestLoanBean();
        Connection con = (Connection) bConnect.openNewConnection();
        String sql = "delete from tbl_requestloan where loanstatustype=?";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareCall(sql.toString());
            p.setString(1, loanstatustype);
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
}
