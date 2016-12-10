/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.dao.MainMenuDao;
import com.form.DeveloperConfigForm;
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
public class DeveloperConfigAction extends DispatchAction {        
   
    
    public ActionForward gotoHome(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward("gotoHome");
    }
    
    public ActionForward gotoRoleManagement(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.findForward("gotoRoleManagement");
    }
    
    public ActionForward gotoMenuManagement(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        DeveloperConfigForm  developerConfigForm = (DeveloperConfigForm)form;
        MainMenuDao mainMenuDao = new MainMenuDao();
        developerConfigForm.setListMainMenu(mainMenuDao.selectAll());       
        
        return mapping.findForward("gotoMenuManagement");
    }

  
}
