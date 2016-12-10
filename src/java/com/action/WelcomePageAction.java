/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.MainMenuBean;
import com.dao.MainMenuDao;
import com.util.StringUtil;
import java.util.List;
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
public class WelcomePageAction extends DispatchAction {

    private final static String SUCCESS = "success";

    public ActionForward welcome(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        MainMenuDao mainMenuDao = new MainMenuDao();
        List<MainMenuBean> mainMenuList = mainMenuDao.selectListByLevelMenu(StringUtil.LEVEL_MENU_FIRST_PAGE);
        request.getSession().setAttribute("mainMenuList", mainMenuList);
        
        return mapping.findForward(SUCCESS);
    }
   
}
