/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.IOException;

//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//
//public class UTF8Filter implements Filter {
//
//    FilterConfig filterConfig;
//
//    public UTF8Filter() {
//        super();
//    }
//
//    public void init(FilterConfig arg0)
//            throws ServletException {
//        filterConfig = arg0;
//
//    }
//
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//
//        if (chain != null) {
//            chain.doFilter(request, response);
//        }
//    }
//
//    public void destroy() {
//        filterConfig = null;
//    }
//
//}



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

 private String encoding = "utf-8";

 public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
   throws IOException, ServletException {
  request.setCharacterEncoding(encoding);
  // response.setContentType("text/html;charset=UTF-8");
  response.setCharacterEncoding(encoding);
  filterChain.doFilter(request, response);

 }

 public void init(FilterConfig filterConfig) throws ServletException {
  String encodingParam = filterConfig.getInitParameter("encoding");
  if (encodingParam != null) {
   encoding = encodingParam;
  }
 }

 public void destroy() {
  // nothing todo
 }

}