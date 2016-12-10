/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

/**
 *
 * @author kohun_000
 */
public class MessageUtil {

    public static String messageError(String head, String detail) {
        StringBuilder msg = new StringBuilder();
        msg.append("<div class=\"alert alert-danger alert-dismissible\" role=\"alert\">");
        msg.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");
        msg.append("<strong>").append(head).append("!</strong>");
        msg.append("&nbsp;").append(detail);
        msg.append("</div>");
        return msg.toString();
    }

    public static String messageWarning(String head, String detail) {
        StringBuilder msg = new StringBuilder();
        msg.append("<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">");
        msg.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");
        msg.append("<strong>").append(head).append("!</strong>");
        msg.append("&nbsp;").append(detail);
        msg.append("</div>");
        return msg.toString();
    }
    
    
    public static String messageInfo(String head, String detail) {
        StringBuilder msg = new StringBuilder();
        msg.append("<div class=\"alert alert-info alert-dismissible\" role=\"alert\">");
        msg.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");
        msg.append("<strong>").append(head).append("!</strong>");
        msg.append("&nbsp;").append(detail);
        msg.append("</div>");
        return msg.toString();
    }
    
    public static String messageSuccess(String head, String detail) {
        StringBuilder msg = new StringBuilder();
        msg.append("<div class=\"alert alert-success alert-dismissible\" role=\"alert\">");
        msg.append("<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>");
        msg.append("<strong>").append(head).append("!</strong>");
        msg.append("&nbsp;").append(detail);
        msg.append("</div>");
        return msg.toString();
    }
    
}
