/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.RequestLoanBean;
import com.bean.UserBean;
import com.dao.RequestLoanDao;
import com.dao.UserDao;
import com.form.AuthenAuthorizeForm;
import com.util.MessageUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author kohun_000
 */
public class AuthenAuthorizeAction extends DispatchAction {

    public ActionForward login(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String rt = "";
        AuthenAuthorizeForm authenAuthorizeForm = (AuthenAuthorizeForm) form;
        RequestLoanBean loanbean = new RequestLoanBean();
        RequestLoanDao dao = new RequestLoanDao();
        UserDao userDao = new UserDao();
        UserBean userBean = new UserBean();
        userBean = userDao.selectByUsernameAndPassword(authenAuthorizeForm.getUsername(), authenAuthorizeForm.getPassword());
        if (userBean != null) {
            String citizen_id = userBean.getCitizen_id();
            loanbean = dao.selectBycitizenid(citizen_id);
            request.getSession().setAttribute("userLogin", userBean);
            request.getSession().setAttribute("requestLoan", loanbean);
            rt = "gotoWelcome";
        } else {
            request.setAttribute("msgLoginFail", MessageUtil.messageError("เข้าสู่ระบบไม่ได้", "ตรวจสอบ ชื่อเข้าสู่ระบบและรหัสผ่านอีกครั้ง."));
            rt = "gotoPageLogin";
        }

        return mapping.findForward(rt);
    }

     public ActionForward logout(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
         request.getSession().removeAttribute("userLogin");
         request.getSession().removeAttribute("requestLoan");
         

        return mapping.findForward("gotoWelcome");
    }
     
     

}
