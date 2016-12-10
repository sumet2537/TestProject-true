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
import com.form.PageForm;
import com.form.RequestLoanForm;
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
 * @author kohun_000
 */
public class PageAction extends DispatchAction {

    public ActionForward gotoPageBootstrapExample(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return mapping.findForward("gotoPageBootstrapExample");

    }

    public ActionForward gotoPageRegister(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return mapping.findForward("gotoPageRegister");

    }

    public ActionForward gotoPageHome(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("gotoPageHome");
    }

      public ActionForward gotoPageDetleRequest(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("gotoPageDetleRequest");
    }
      
    public ActionForward gotoPageLogin(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("gotoPageLogin");
    }

    public ActionForward gotoProfile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PageForm pageForm = (PageForm) form;
        UserBean userBean = pageForm.getUserSession();

        if (userBean != null) {
            System.out.println("user login : " + userBean.getUsername());
        }
        return mapping.findForward("gotoPageProfile");
    }

    public ActionForward gotoPageProfile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        PageForm pageForm = (PageForm) form;
        UserBean userBean = new UserBean();
        userBean = (UserBean) request.getSession().getAttribute("userLogin");
        int userid = userBean.getUser_id();
        UserDao dao = new UserDao();
        userBean = dao.selectByUserId(userid);

        request.getSession().setAttribute("profiledate", userBean);
        return mapping.findForward("gotoPageProfile");
    }

    public ActionForward gotoPageBootstrapForm(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.findForward("gotoPageBootstrapForm");
    }

    //    ================================gotoPageAdminManagermentProfile====================================
    public ActionForward gotoPageAdminManagermentProfile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<UserBean> regisList = new ArrayList<UserBean>();
        UserDao dao = new UserDao();

        regisList = dao.selectAll();
        request.getSession().setAttribute("regisList", regisList);

        return mapping.findForward("gotoPageAdminManagermentProfile");

    }

    public ActionForward gotoPageLoanRequest(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserBean userBean = new UserBean();
        userBean = (UserBean) request.getSession().getAttribute("userLogin");
        String citizen_id = userBean.getCitizen_id();
        UserDao dao = new UserDao();
        userBean = dao.selectBycitizenid(citizen_id);
        request.getSession().setAttribute("requestBean", userBean);
        return mapping.findForward("gotoPageLoanRequest");
    }

    public ActionForward gotoPageManagermentLoan(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        RequestLoanDao dao = new RequestLoanDao();

        loanList = dao.selectloanstatustypeRcheck();
        request.getSession().setAttribute("loanList", loanList);

        return mapping.findForward("gotoPageManagermentLoan");
    }

    public ActionForward gotoPageManagermentR(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        RequestLoanDao dao = new RequestLoanDao();

        loanList = dao.selectloanstatustypeRapp();
        request.getSession().setAttribute("loanList", loanList);

        return mapping.findForward("gotoPageManagermentR");
    }

    public ActionForward gotoPageManagermentAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        RequestLoanDao dao = new RequestLoanDao();

        loanList = dao.selectloanstatustypeAp();
        request.getSession().setAttribute("loanList", loanList);

        return mapping.findForward("gotoPageManagermentAp");
    }

    public ActionForward gotoPageManagermentNo(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        RequestLoanDao dao = new RequestLoanDao();

        loanList = dao.selectloanstatustypeNoAp();
        request.getSession().setAttribute("loanList", loanList);

        return mapping.findForward("gotoPageManagermentNo");
    }

    public ActionForward gotoPageManagermentNofile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//         
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        RequestLoanDao dao = new RequestLoanDao();

        loanList = dao.selectloanstatustypeNofile();
        request.getSession().setAttribute("loanList", loanList);

        return mapping.findForward("gotoPageManagermentNofile");
    }
}
