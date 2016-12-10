/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.MainMenuBean;
import com.bean.RoleBean;
import com.bean.SubMenuBean;
import com.bean.UserBean;
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
public class UserDao {

    public UserBean selectBycitizenid(String citizen_id) throws Exception {
        UserBean userBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_user  where  citizen_id = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
//            p.setInt(1, user_id);
            p.setString(1, citizen_id);
            rs = p.executeQuery();

            while (rs.next()) {
                userBean = new UserBean();
                userBean.setUser_id(rs.getInt("user_id"));
                userBean.setCitizen_id(rs.getString("citizen_id"));
                userBean.setUsername(rs.getString("username"));
                userBean.setPassword(rs.getString("password"));
                userBean.setTitle_type(rs.getString("title_type"));
                userBean.setFirstName(rs.getString("firstName"));
                userBean.setLastName(rs.getString("lastName"));
                userBean.setBirthdate(rs.getString("birthdate"));
                userBean.setAge(rs.getInt("age"));
                userBean.setStatustype(rs.getString("statustype"));
                userBean.setMobile(rs.getString("mobile"));
                userBean.setEmail(rs.getString("email"));
                userBean.setAddressregistration(rs.getString("addressregistration"));
                userBean.setAddresscurrent(rs.getString("addresscurrent"));
                userBean.setAddresssenddoc(rs.getString("addresssenddoc"));
                userBean.setRoleId(rs.getInt("roleId"));
                userBean.setCreated(rs.getDate("created"));
                userBean.setCreateBy(rs.getString("createBy"));
                userBean.setUpdated(rs.getDate("updated"));
                userBean.setUpdateBy(rs.getString("updateBy"));
                userBean.setStatus(rs.getString("status"));

                RoleDao roleDao = new RoleDao();
                RoleBean roleBean = roleDao.selectByRoleId(rs.getInt("roleId"));
                userBean.setRoleBean(roleBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return userBean;

    }

    public UserBean selectByUserId(int user_id) throws Exception {
        UserBean userBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_user  where  user_id = ?";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, user_id);
            rs = p.executeQuery();

            while (rs.next()) {
                userBean = new UserBean();
                userBean.setUser_id(rs.getInt("user_id"));
                userBean.setCitizen_id(rs.getString("citizen_id"));
                userBean.setUsername(rs.getString("username"));
                userBean.setPassword(rs.getString("password"));
                userBean.setTitle_type(rs.getString("title_type"));
                userBean.setFirstName(rs.getString("firstName"));
                userBean.setLastName(rs.getString("lastName"));
                userBean.setBirthdate(rs.getString("birthdate"));
                userBean.setAge(rs.getInt("age"));
                userBean.setStatustype(rs.getString("statustype"));
                userBean.setMobile(rs.getString("mobile"));
                userBean.setEmail(rs.getString("email"));
                userBean.setAddressregistration(rs.getString("addressregistration"));
                userBean.setAddresscurrent(rs.getString("addresscurrent"));
                userBean.setAddresssenddoc(rs.getString("addresssenddoc"));
                userBean.setRoleId(rs.getInt("roleId"));
                userBean.setCreated(rs.getDate("created"));
                userBean.setCreateBy(rs.getString("createBy"));
                userBean.setUpdated(rs.getDate("updated"));
                userBean.setUpdateBy(rs.getString("updateBy"));
                userBean.setStatus(rs.getString("status"));

                RoleDao roleDao = new RoleDao();
                RoleBean roleBean = roleDao.selectByRoleId(rs.getInt("roleId"));
                userBean.setRoleBean(roleBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return userBean;

    }

    public UserBean selectByUsernameAndPassword(String username, String password) throws Exception {
        UserBean userBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "select * from  tbl_user  where  username = ? and password = ? and status = '1'";
        PreparedStatement p = null;

        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, username);
            p.setString(2, password);
            rs = p.executeQuery();

            while (rs.next()) {
                userBean = new UserBean();
                userBean.setUser_id(rs.getInt("user_id"));
                userBean.setCitizen_id(rs.getString("citizen_id"));
                userBean.setUsername(rs.getString("username"));
                userBean.setPassword(rs.getString("password"));
                userBean.setTitle_type(rs.getString("title_type"));
                userBean.setFirstName(rs.getString("firstName"));
                userBean.setLastName(rs.getString("lastName"));
                userBean.setBirthdate(rs.getString("birthdate"));
                userBean.setAge(rs.getInt("age"));
                userBean.setStatustype(rs.getString("statustype"));
                userBean.setMobile(rs.getString("mobile"));
                userBean.setEmail(rs.getString("email"));
                userBean.setAddressregistration(rs.getString("addressregistration"));
                userBean.setAddresscurrent(rs.getString("addresscurrent"));
                userBean.setAddresssenddoc(rs.getString("addresssenddoc"));
                userBean.setRoleId(rs.getInt("roleId"));
                userBean.setCreated(rs.getDate("created"));
                userBean.setCreateBy(rs.getString("createBy"));
                userBean.setUpdated(rs.getDate("updated"));
                userBean.setUpdateBy(rs.getString("updateBy"));
                userBean.setStatus(rs.getString("status"));

                RoleDao roleDao = new RoleDao();
                RoleBean roleBean = roleDao.selectByRoleId(rs.getInt("roleId"));
                userBean.setRoleBean(roleBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return userBean;

    }

    public ArrayList<UserBean> selectAll() throws Exception {
        UserBean userBean = null;
        ResultSet rs = null;
        DBConnect dbConnect = new DBConnect();
        Connection con = (Connection) dbConnect.openNewConnection();
        String sql = "select * from tbl_user where roleId=  '2'";
        PreparedStatement p = null;
        ArrayList<UserBean> userList = new ArrayList<UserBean>();

        try {
            p = (PreparedStatement) con.prepareStatement(sql);

            rs = p.executeQuery();

            while (rs.next()) {
                userBean = new UserBean();
                userBean = new UserBean();
                userBean.setUser_id(rs.getInt("user_id"));
                userBean.setCitizen_id(rs.getString("citizen_id"));
                userBean.setUsername(rs.getString("username"));
                userBean.setPassword(rs.getString("password"));
                userBean.setTitle_type(rs.getString("title_type"));
                userBean.setFirstName(rs.getString("firstName"));
                userBean.setLastName(rs.getString("lastName"));
                userBean.setLastName(rs.getString("lastName"));
                userBean.setBirthdate(rs.getString("birthdate"));
                userBean.setAge(rs.getInt("age"));
                userBean.setStatustype(rs.getString("statustype"));
                userBean.setMobile(rs.getString("mobile"));
                userBean.setEmail(rs.getString("email"));
                userBean.setAddressregistration(rs.getString("addressregistration"));
                userBean.setAddresscurrent(rs.getString("addresscurrent"));
                userBean.setAddresssenddoc(rs.getString("addresssenddoc"));
                userBean.setRoleId(rs.getInt("roleId"));
                userBean.setCreated(rs.getDate("created"));
                userBean.setCreateBy(rs.getString("createBy"));
                userBean.setUpdated(rs.getDate("updated"));
                userBean.setUpdateBy(rs.getString("updateBy"));
                userBean.setStatus(rs.getString("status"));

                RoleDao roleDao = new RoleDao();
                RoleBean roleBean = roleDao.selectByRoleId(rs.getInt("roleId"));
                userBean.setRoleBean(roleBean);

                userList.add(userBean);
            }

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return userList;

    }

    //เพิ่มข้อมูล 
    public void insert(UserBean userBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "insert into tbl_user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate(),?,sysdate(),?,?)";
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setLong(1, 0);
            p.setString(2, userBean.getCitizen_id());
            p.setString(3, userBean.getUsername());
            p.setString(4, userBean.getPassword());
            p.setString(5, userBean.getTitle_type());
            p.setString(6, userBean.getFirstName());
            p.setString(7, userBean.getLastName());
            p.setString(8, userBean.getBirthdate());
            p.setInt(9, userBean.getAge());
            p.setString(10, userBean.getStatustype());
            p.setString(11, userBean.getMobile());
            p.setString(12, userBean.getEmail());
            p.setString(13, userBean.getAddressregistration());
            p.setString(14, userBean.getAddresscurrent());
            p.setString(15, userBean.getAddresssenddoc());
            p.setInt(16, userBean.getRoleId());
            p.setString(17, userBean.getFirstName());
            p.setString(18, userBean.getFirstName());
            p.setString(19, userBean.getStatus());
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

    public void deleteByUsernameAndPassword(String username, String password) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "delete from tbl_user where username = ? and password = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(1, username);
            p.setString(2, password);

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

    public void deleteByUserId(int user_id) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = null;
        con = dbConnect.openNewConnection();
        String sql = "delete from tbl_user where user_id = ?";
        PreparedStatement p = null;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setInt(1, user_id);

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

    public int update(UserBean userBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection c = (Connection) dbConnect.openNewConnection();
        StringBuilder sql = new StringBuilder(50);
       sql.append("update tbl_user set ");
        sql.append("title_type=?, firstName=?, lastName=?, birthdate=?, age=?, statustype=?, mobile=?, email=?, addressregistration=?, addresscurrent=?, addresssenddoc=?,roleId=?,updated=sysdate(),updateBy=?,status=?");
        sql.append("where user_id=?");
        PreparedStatement p = null;
        int chk = 0;
        try {
            p = (PreparedStatement) c.prepareCall(sql.toString());
//         p.setString(++i, userBean.getCitizen_id());
//            p.setString(i++, userBean.getPassword());
            p.setString(1, userBean.getTitle_type());
            p.setString(2, userBean.getFirstName());
            p.setString(3, userBean.getLastName());
            p.setString(4, userBean.getBirthdate());
            p.setInt(5, userBean.getAge());
            p.setString(6, userBean.getStatustype());
            p.setString(7, userBean.getMobile());
            p.setString(8, userBean.getEmail());
            p.setString(9, userBean.getAddressregistration());
            p.setString(10, userBean.getAddresscurrent());
            p.setString(11, userBean.getAddresssenddoc());
            p.setInt(12, userBean.getRoleId());
            p.setString(13, userBean.getUpdateBy());
            p.setString(14, userBean.getStatus());
            p.setInt(15, userBean.getUser_id());
            chk = p.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                p.close();
                dbConnect.closeConnection(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(chk);
        }
        return chk;
    }

//    public static void main(String[] args) throws Exception {
//        UserDao dao = new UserDao();
//        UserBean bean = new UserBean();
//        int chk = 0;
//        bean.setUser_id(49);
//        bean.setTitle_type("นาย");
//        bean.setFirstName("bas");
//        bean.setLastName("kaen");
//        bean.setBirthdate("232");
//        bean.setStatustype("โสด");
//        bean.setMobile("08123");
//        bean.setEmail("sumet@hotmail.com");
//        bean.setAddressregistration("khonkaen");
//        bean.setAddresscurrent(" khonkaen");
//        bean.setAddresssenddoc("khonkaen");
//        bean.setRoleId(2);
//
//        try {
//            chk = dao.update(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(chk);
//
//    }

      public int updateByUserId(UserBean userbean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_user  set citizen_id=?, title_type=?, firstName=?, lastName=?, birthdate=?, age=?, statustype=?, mobile=?, email=?, addressregistration=?, addresscurrent=?, addresssenddoc=?, roleId=?, updated=sysdate(), updateBy=?,status=?  where user_id=? ";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql.toString());
            p.setString(1, userbean.getCitizen_id());
//            p.setString(i++, userBean.getPassword());
            p.setString(2, userbean.getTitle_type());
            p.setString(3, userbean.getFirstName());
            p.setString(4, userbean.getLastName());
            p.setString(5, userbean.getBirthdate());
            p.setInt(6, userbean.getAge());
            p.setString(7, userbean.getStatustype());
            p.setString(8, userbean.getMobile());
            p.setString(9, userbean.getEmail());
            p.setString(10, userbean.getAddressregistration());
            p.setString(11, userbean.getAddresscurrent());
            p.setString(12, userbean.getAddresssenddoc());
            p.setInt(13, userbean.getRoleId());
            p.setString(14, userbean.getFirstName());
            p.setString(15, userbean.getStatus());
            p.setInt(16, userbean.getUser_id());
            i = p.executeUpdate();

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
    
    public void updateBycitizenid(UserBean userbean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_user  set title_type=?, firstName=?, lastName=?, birthdate=?,age=?, statustype=?, mobile=?, email=?, addressregistration=?, addresscurrent=?, addresssenddoc=?, roleId=?, updated=sysdate(), updateBy=?,status=?  where citizen_id=? ";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql.toString());
//          p.setString(1, userbean.getCitizen_id());
//            p.setString(i++, userBean.getPassword());
            p.setString(1, userbean.getTitle_type());
            p.setString(2, userbean.getFirstName());
            p.setString(3, userbean.getLastName());
            p.setString(4, userbean.getBirthdate());
            p.setInt(5, userbean.getAge());
            p.setString(6, userbean.getStatustype());
            p.setString(7, userbean.getMobile());
            p.setString(8, userbean.getEmail());
            p.setString(9, userbean.getAddressregistration());
            p.setString(10, userbean.getAddresscurrent());
            p.setString(11, userbean.getAddresssenddoc());
            p.setInt(12, userbean.getRoleId());
            p.setString(13, userbean.getFirstName());
            p.setString(14, userbean.getStatus());
            p.setString(15, userbean.getCitizen_id());
            i = p.executeUpdate();

        } finally {
            try {
                p.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        return i;
    }
    
//      public static void main(String[] args) throws Exception {
//        UserDao dao = new UserDao();
//        UserBean bean = new UserBean();
//        int i = 0;
//        bean.setUser_id(49);
//        bean.setCitizen_id("234234234");
//        bean.setTitle_type("นาย");
//        bean.setFirstName("หหหหหหหหหห");
//        bean.setLastName("kaen");
//        bean.setBirthdate("232");
//        bean.setStatustype("โสด");
//        bean.setMobile("08123");
//        bean.setEmail("sumet@hotmail.com");
//        bean.setAddressregistration("kaenkaew");
//        bean.setAddresscurrent(" khonkaen");
//        bean.setAddresssenddoc("10-03-2537");
//        bean.setRoleId(2);
//        bean.setUpdateBy("bas");
//        bean.setStatus("1");
//        try {
//           i = dao.updateByUserId(bean);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(i);
//    
//    }

    public void updateByUsername(UserBean userBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_user  set citizen_id=?, password=?, title_type=?, firstName=?,lastName=?, birthdate=?, age=?,statustype=?, mobile=?, email=?, addressregistration=?, addresscurrent=?, addresssenddoc=?, roleId=?,updated=sysdate(),updateBy=?,status=? where username=?";

        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(i++, userBean.getCitizen_id());
            p.setString(i++, userBean.getPassword());
            p.setString(i++, userBean.getTitle_type());
            p.setString(i++, userBean.getFirstName());
            p.setString(i++, userBean.getLastName());
            p.setString(i++, userBean.getBirthdate());
            p.setInt(i++, userBean.getAge());
            p.setString(i++, userBean.getStatustype());
            p.setString(i++, userBean.getMobile());
            p.setString(i++, userBean.getEmail());
            p.setString(i++, userBean.getAddressregistration());
            p.setString(i++, userBean.getAddresscurrent());
            p.setString(i++, userBean.getAddresssenddoc());
            p.setInt(i++, userBean.getRoleId());
            p.setString(i++, userBean.getUpdateBy());
            p.setString(i++, userBean.getStatus());
            p.setString(i++, userBean.getUsername());
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

    public void updatePwdByID(UserBean userBean) throws Exception {
        DBConnect dbConnect = new DBConnect();
        Connection con = dbConnect.openNewConnection();
        String sql = "update tbl_user  set  password=?, updated=sysdate(),updateBy=? where user_id=?";

//        System.out.println("getPassword   : "+ userBean.getPassword());
//        System.out.println("getUsername   : "+ userBean.getUsername());
//        System.out.println("getUserId   : "+ userBean.getUserId());
//        
        PreparedStatement p = null;
        int i = 0;
        try {
            p = (PreparedStatement) con.prepareStatement(sql);
            p.setString(++i, userBean.getPassword());
            p.setString(++i, userBean.getUsername());
            p.setInt(++i, userBean.getUser_id());
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

    public void deleteByUserId(UserBean userbean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserBean selectByUserId(String userLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//    public static void main(String[] args) {
//        UserDao userDao = new UserDao();
//        UserBean userBean = new UserBean();
//        try {
//
//            userBean = userDao.selectByUserId(1);
//
//            System.out.println("-------User Detail------------------------------------------------");
//            System.out.println("user_id :> " + userBean.getUser_id());
//            System.out.println("citizen_id:> " + userBean.getCitizen_id());
//            System.out.println("username :> " + userBean.getUsername());
//            System.out.println("password :> " + userBean.getPassword());
//            System.out.println("title_type :> " + userBean.getTitle_type());
//            System.out.println("firstName :> " + userBean.getFirstName());
//            System.out.println("lastName :> " + userBean.getLastName());
//            System.out.println("birthdate :> " + userBean.getBirthdate());
//            System.out.println("statustype :> " + userBean.getStatustype());
//            System.out.println("mobile :> " + userBean.getMobile());
//            System.out.println("email :> " + userBean.getEmail());
//            System.out.println("roleId :> " + userBean.getRoleId());
//            System.out.println("created :> " + userBean.getCreated());
//            System.out.println("createBy :> " + userBean.getCreateBy());
//            System.out.println("updated :> " + userBean.getUpdated());
//            System.out.println("updateBy :> " + userBean.getUpdateBy());
//            System.out.println("status :> " + userBean.getStatus());
//
//            if (userBean.getRoleBean() != null) {
//
//                System.out.println("-------Role Detail------------------------------------------------");
//                System.out.println("roleName :> " + userBean.getRoleBean().getRoleName());
//                System.out.println("detail :> " + userBean.getRoleBean().getDetail());
//                System.out.println("created :> " + userBean.getRoleBean().getCreated());
//                System.out.println("createBy :> " + userBean.getRoleBean().getCreateBy());
//                System.out.println("updated :> " + userBean.getRoleBean().getUpdated());
//                System.out.println("updateBy :> " + userBean.getRoleBean().getUpdateBy());
//
//                if (userBean.getRoleBean().getRoleGroupMenuBean() != null) {
//
//                    List<MainMenuBean> mainMenuList = userBean.getRoleBean().getRoleGroupMenuBean().getMainMenuList();
//
//                    if (mainMenuList != null && mainMenuList.size() > 0) {
//
//                        for (MainMenuBean mainMenuBean : mainMenuList) {
//                            System.out.println("-------Main Menu Detail------------------------------------------------");
//                            System.out.println("menuName :> " + mainMenuBean.getMenuName());
//                            System.out.println("action :> " + mainMenuBean.getAction());
//                            System.out.println("groupMenu :> " + mainMenuBean.getGroupMenu());
//                            System.out.println("todoMethod :> " + mainMenuBean.getTodoMethod());
//                            System.out.println("onclick :> " + mainMenuBean.getOnclick());
//                            System.out.println("cssclass :> " + mainMenuBean.getCssclass());
//                            System.out.println("created :> " + mainMenuBean.getCreated());
//                            System.out.println("createBy :> " + mainMenuBean.getCreateBy());
//                            System.out.println("updated :> " + mainMenuBean.getUpdated());
//                            System.out.println("updateBy :> " + mainMenuBean.getUpdateBy());
//
//                            if ("2".equals(mainMenuBean.getGroupMenu())) {
//                                List<SubMenuBean> subMenuList = mainMenuBean.getSubMenuList();
//                                if (subMenuList != null && subMenuList.size() > 0) {
//
//                                    for (SubMenuBean subMenuBean : subMenuList) {
//                                        System.out.println("-------Sub Menu Detail------------------------------------------------");
//                                        System.out.println("menuName :> " + subMenuBean.getMenuName());
//                                        System.out.println("action :> " + subMenuBean.getAction());
//                                        System.out.println("todoMethod :> " + subMenuBean.getTodoMethod());
//                                        System.out.println("onclick :> " + subMenuBean.getOnclick());
//                                        System.out.println("cssclass :> " + subMenuBean.getCssclass());
//                                        System.out.println("created :> " + subMenuBean.getCreated());
//                                        System.out.println("createBy :> " + subMenuBean.getCreateBy());
//                                        System.out.println("updated :> " + subMenuBean.getUpdated());
//                                        System.out.println("updateBy :> " + subMenuBean.getUpdateBy());
//                                    }
//
//                                }
//
//                            }
//                        }
//
//                    }
//
//                }
//
//            }
//
//            System.out.println("=======================================================================================");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }
//
//}
