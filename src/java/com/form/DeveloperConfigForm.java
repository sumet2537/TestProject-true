/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import com.bean.MainMenuBean;
import java.util.List;


public class DeveloperConfigForm extends BaseForm {
  
    public DeveloperConfigForm() {
        super();
    }
    
    private List<MainMenuBean> listMainMenu;

    public List<MainMenuBean> getListMainMenu() {
        return listMainMenu;
    }

    public void setListMainMenu(List<MainMenuBean> listMainMenu) {
        this.listMainMenu = listMainMenu;
    }        
    
}
