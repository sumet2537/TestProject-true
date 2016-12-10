/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.commons.lang.StringEscapeUtils;

/**
 *
 * @author kohun_000
 */
public class ConvertJspToStringHtml {

    public static String generateHtml(String url, HttpServletRequest request, HttpServletResponse response) {
        String html = null;
        try {
            BufferedHttpResponseWrapper wrapper = new BufferedHttpResponseWrapper(response);
            ServletContext context = request.getSession().getServletContext();
            String urlEncode = response.encodeRedirectURL(url);
            RequestDispatcher dispatcher = context.getRequestDispatcher(urlEncode);
            dispatcher.include(request, wrapper);
//            html = ASCII2Unicode(StringEscapeUtils.unescapeHtml(wrapper.getOutput()));

            html = html.replaceAll("\\r\\n|\\r|\\n", "");
            html = html.replaceAll("&nbsp;", "");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return html;
    }

    private static String ASCII2Unicode(String ascii) {
        StringBuffer unicode = new StringBuffer(ascii);
        int code;
        for (int i = 0; i < ascii.length(); i++) {
            code = (int) ascii.charAt(i);
            if ((0xA1 <= code) && (code <= 0xFB)) {
                unicode.setCharAt(i, (char) (code + 0xD60));
            }
        }
        return unicode.toString();
    }
}
