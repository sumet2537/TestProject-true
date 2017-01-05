/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.ProvinceBean;
import com.bean.UserBean;
import com.dao.ProvinceDao;
import com.dao.UserDao;
import com.form.registerForm;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author brass
 */
public class registerAction extends DispatchAction {
    
 //    ================================gotoinsert====================================
public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    registerForm regisform = (registerForm)form;
    UserBean userbean = new UserBean();
   String msg = "";
    
    userbean.setUsername(regisform.getUsername());
    userbean.setPassword(regisform.getPassword());
    userbean.setCitizen_id(regisform.getCitizen_id());
    userbean.setTitle_type(regisform.getTitle_type());
    userbean.setFirstName(regisform.getFirstName());
    userbean.setLastName(regisform.getLastName());
    userbean.setBirthdate(regisform.getBirthdate());
    userbean.setAge(regisform.getAge());
    userbean.setStatustype(regisform.getStatustype());
    userbean.setMobile(regisform.getMobile());
    userbean.setEmail(regisform.getEmail());
    
    userbean.setNationality(regisform.getNationality());
    userbean.setJobtype(regisform.getJobtype());
     userbean.setProvince(regisform.getProvince());
    userbean.setAmphur(regisform.getAmphur());
     userbean.setDistrict(regisform.getDistrict());
    userbean.setAddress(regisform.getAddress());
    userbean.setRoleId(regisform.getRoleId());
    userbean.setCreated(regisform.getCreated());
    userbean.setCreateBy(regisform.getCreateBy());
    userbean.setUpdated(regisform.getUpdated());
    userbean.setUpdateBy(regisform.getUpdateBy());
    userbean.setStatus(regisform.getStatus());
    UserDao userdao = new UserDao();
    try {
        userdao.insert(userbean);
        System.out.println("สำเร็จ");
        msg = "ok";
    } catch (Exception ex) {
        System.out.println("ลงทะเบียนไม่สำเร็จ");
        ex.printStackTrace();
        msg = "no";
    }
    request.removeAttribute("registerStatus");
    request.setAttribute("registerStatus", msg);
//     return mapping.findForward("gotoPageLogin");
        return mapping.findForward("gotoPageRegister");
        
    }
 //    ================================gotoupdate====================================
//public ActionForward update(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//    registerForm regisform = (registerForm)form;
//    UserBean userbean = new UserBean();
//    userbean = (UserBean) request.getSession().getAttribute("userLogin");
//    String msg = "";
//    
//     userbean.setUsername(regisform.getUsername());
//    userbean.setPassword(regisform.getPassword());
//    userbean.setCitizen_id(regisform.getCitizen_id());
//    userbean.setTitle_type(regisform.getTitle_type());
//    userbean.setFirstName(regisform.getFirstName());
//    userbean.setLastName(regisform.getLastName());
//    userbean.setBirthdate(regisform.getBirthdate());
//    userbean.setAge(regisform.getAge());
//    userbean.setStatustype(regisform.getStatustype());
//    userbean.setMobile(regisform.getMobile());
//    userbean.setEmail(regisform.getEmail());
//    userbean.setAddressregistration(regisform.getAddressregistration());
//    userbean.setAddresscurrent(regisform.getAddresscurrent());
//    userbean.setAddresssenddoc(regisform.getAddresssenddoc());
//    userbean.setRoleId(regisform.getRoleId());
//    userbean.setUpdated(regisform.getUpdated());
//    userbean.setUpdateBy(regisform.getUpdateBy());
//    userbean.setStatus(regisform.getStatus());
//    
//    UserDao userdao = new UserDao();
//    try{
//    userdao.updateByUserId(userbean);
//    msg = "ok";
//    }catch(Exception e){
//    msg ="no";
//    }
//    
//    List<UserBean> regisList = new ArrayList<UserBean>();
//    
//    regisList = userdao.selectAll();
//    request.getSession().setAttribute("regisList", regisList);
//    
//        return mapping.findForward("gotoPagetetle");
//}



public ActionForward user_update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    registerForm regisform = (registerForm)form;
    UserBean userbean = new UserBean();
    userbean = (UserBean) request.getSession().getAttribute("userLogin");
    String msg = "";
    
     userbean.setUsername(regisform.getUsername());
    userbean.setPassword(regisform.getPassword());
    userbean.setCitizen_id(regisform.getCitizen_id());
    userbean.setTitle_type(regisform.getTitle_type());
    userbean.setFirstName(regisform.getFirstName());
    userbean.setLastName(regisform.getLastName());
    userbean.setBirthdate(regisform.getBirthdate());
    userbean.setAge(regisform.getAge());
    userbean.setStatustype(regisform.getStatustype());
    userbean.setMobile(regisform.getMobile());
    userbean.setEmail(regisform.getEmail());
     userbean.setNationality(regisform.getNationality());
    userbean.setJobtype(regisform.getJobtype());
     userbean.setProvince(regisform.getProvince());
    userbean.setAmphur(regisform.getAmphur());
     userbean.setDistrict(regisform.getDistrict());
    userbean.setAddress(regisform.getAddress());
//    userbean.setRoleId(regisform.getRoleId());
    userbean.setUpdated(regisform.getUpdated());
    userbean.setUpdateBy(regisform.getUpdateBy());
    userbean.setStatus(regisform.getStatus());
    
    UserDao userdao = new UserDao();
    try{
    userdao.updateByUserId(userbean);
        System.out.println("ok");
    msg = "ok";
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("no");
    msg ="no";
    }
        userbean = (UserBean) request.getSession().getAttribute("userLogin");
        int userid = userbean.getUser_id();
        UserDao dao = new UserDao();
        userbean = dao.selectByUserId(userid);
        request.getSession().setAttribute("detleuser", userbean);
         request.removeAttribute("detleusermsg");
        request.setAttribute("detleusermsg", msg);
        return mapping.findForward("gotouserEdit");
//       gotoPagedatleuserlogin
}
public ActionForward gotoPagedatleuserlogin(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    registerForm regisform = (registerForm)form;
    UserBean userbean = new UserBean();
    String msg = "";

        userbean = (UserBean) request.getSession().getAttribute("userLogin");
        int userid = userbean.getUser_id();
        UserDao dao = new UserDao();
        userbean = dao.selectByUserId(userid);
        request.getSession().setAttribute("detleuser", userbean);
         request.removeAttribute("detleusermsg");
        request.setAttribute("detleusermsg", msg);
        return mapping.findForward("gotoPagedatleuserlogin");
}
         //    ================================gotoupdate====================================
public ActionForward admin_update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    registerForm regisform = (registerForm)form;
    UserBean userbean = new UserBean();
     String msg = "";
     
    userbean.setCitizen_id(regisform.getCitizen_id());
    userbean.setTitle_type(regisform.getTitle_type());
    userbean.setFirstName(regisform.getFirstName());
    userbean.setLastName(regisform.getLastName());
    userbean.setBirthdate(regisform.getBirthdate());
    userbean.setAge(regisform.getAge());
    userbean.setStatustype(regisform.getStatustype());
    userbean.setMobile(regisform.getMobile());
    userbean.setEmail(regisform.getEmail());
     userbean.setNationality(regisform.getNationality());
    userbean.setJobtype(regisform.getJobtype());
     userbean.setProvince(regisform.getProvince());
    userbean.setAmphur(regisform.getAmphur());
     userbean.setDistrict(regisform.getDistrict());
    userbean.setAddress(regisform.getAddress());
//    userbean.setRoleId(regisform.getRoleId());
    userbean.setUpdated(regisform.getUpdated());
    userbean.setUpdateBy(regisform.getUpdateBy());
    userbean.setStatus(regisform.getStatus());
    
    UserDao userdao = new UserDao();
     try{
    userdao.updateBycitizenid(userbean);
    msg = "ok";
    }catch(Exception e){
    msg ="no";
    }
     
    List<UserBean> regisList = new ArrayList<UserBean>();
    
    regisList = userdao.selectAll();
    request.getSession().removeAttribute("regisList");
    request.getSession().setAttribute("regisList", regisList);
//request.setAttribute("userdao", userdao);
    request.removeAttribute("msg");
    request.setAttribute("msg", msg);
        return mapping.findForward("gotoadminEdit");
}
 //    ================================gotoaelectAll ====================================
  public ActionForward selectAll(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        List<UserBean> regisList = new ArrayList<UserBean>();
        UserDao dao = new UserDao();

        regisList = dao.selectAll();
        request.getSession().setAttribute("regisList", regisList);

        return mapping.findForward("selectalluser");
    }
   //    ================================gotoPageAdminManagermentProfile====================================
  
       public ActionForward gotoPageAdminManagermentProfile(ActionMapping mapping, ActionForm form,
             HttpServletRequest request, HttpServletResponse response)
             throws Exception{
//         
          List<UserBean> regisList = new ArrayList<UserBean>();
        UserDao dao = new UserDao();

        regisList = dao.selectAll();
        request.getSession().setAttribute("regisList", regisList);

     return mapping.findForward("gotoPageAdminManagermentProfile");
     }
    //    ================================gotoedit====================================
 
      //    ================================yes====================================  
    public ActionForward gotouserEdit(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        registerForm regisform = (registerForm) form;
        UserDao dao = new UserDao();
        UserBean userBean = new UserBean();
        userBean = (UserBean) request.getSession().getAttribute("userLogin");
        int userid = userBean.getUser_id();
        userBean = dao.selectByUserId(userid);
        
        request.getSession().setAttribute("profiledate", userBean);
        return mapping.findForward("gotouserEdit");
    }
     //    ================================yes====================================
      public ActionForward gotoadminEdit(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        registerForm regisform = (registerForm) form;
        UserDao dao = new UserDao();
        UserBean userBean = new UserBean();
        userBean = dao.selectByUserId(regisform.getUser_id());
        request.getSession().setAttribute("profiledate", userBean);
        
        return mapping.findForward("gotoadminEdit");
    }
      
    //    ================================ยังไม่ได้================no====================
//         public ActionForward gotoEdit(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        registerForm regisform = (registerForm) form;
//        UserDao dao = new UserDao();
//        UserBean userBean = new UserBean();
//        userBean = dao.selectByUserId(regisform.getUser_id());
//        request.getSession().setAttribute("profiledate", userBean);
//        return mapping.findForward("gotoadminEdit");
//    }
      //    ================================gotoDetle====yes================================
        public ActionForward Detle(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        registerForm regisform = (registerForm) form;
        UserDao dao = new UserDao();
       UserBean bean = dao.selectByUserId(regisform.getUser_id());
        
        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle");
    }
     //    ================================gotosearch====================================
      public ActionForward search(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        registerForm regisform = (registerForm) form;
        ArrayList<UserBean> regisList;
        UserDao dao = new UserDao();
        String citizen_id = regisform.getCitizen_id();
//        String lname = regisform.getLname();
       
//        regisList= dao.selectBycitizenid(citizen_id);  // ไปเรียนใช้ method  
//        regisList = dao.selectAll(); 
//        request.getSession().setAttribute("regisList", regisList);
        
        return mapping.findForward("selectalluser");
    }
//      gotodelete
      public ActionForward delete(ActionMapping mapping, ActionForm form,
              HttpServletRequest request, HttpServletResponse response)
              throws Exception{
          registerForm registerform = (registerForm)form;
          UserDao userdao = new UserDao();
          
          userdao.deleteByUserId(registerform.getUser_id());
          
          List<UserBean> regisList =  new  ArrayList<UserBean>();
          regisList = userdao.selectAll();
          request.getSession().setAttribute("regisList" , regisList);
      return mapping.findForward("gotoPageAdminManagermentProfile");
      }
      
         public ActionForward privince(ActionMapping mapping, ActionForm form,
              HttpServletRequest request, HttpServletResponse response)
              throws Exception{
             ProvinceDao dao = new ProvinceDao();
             ArrayList<ProvinceBean> bean = new ArrayList<ProvinceBean>();
            bean = dao.selectAllprovince();
           
      return null;
      }
           public ActionForward amphur(ActionMapping mapping, ActionForm form,
              HttpServletRequest request, HttpServletResponse response)
              throws Exception{
              registerForm regisform = (registerForm) form;
               ProvinceDao dao = new ProvinceDao();
               ArrayList<ProvinceBean> bean = new ArrayList<ProvinceBean>();
          
               bean = dao.selectamphurByprivinceID(regisform.getPROVINCE_ID());
              
      return null;
      }
             public ActionForward district(ActionMapping mapping, ActionForm form,
              HttpServletRequest request, HttpServletResponse response)
              throws Exception{
                  registerForm regisform = (registerForm) form;
               ProvinceDao dao = new ProvinceDao();
               ArrayList<ProvinceBean> bean = new ArrayList<ProvinceBean>();
          
               bean = dao.selectdistrictByamphurID(regisform.getAMPHUR_ID());
      return null;
      }
}
