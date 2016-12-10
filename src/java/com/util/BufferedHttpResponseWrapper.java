/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * This class wraps a HttpServletResponse with a buffered output. You can use
 * this to forward or include a Servlet or JSP page and capture the output from
 * it.
 *
 * Use getOutput to get the output which was written to the response. Only
 * buffers the Writer. Not the OutputStream !!
 *
 * @author Joost den Boer
 */
public class BufferedHttpResponseWrapper extends HttpServletResponseWrapper {

    CharArrayWriter charWriter;
    PrintWriter writer = null;
    ByteArrayOutputStream baos = null;

    /**
     * Constructor for BufferedHttpResponseWrapper. Create a new buffered Writer
     *
     * @param response The response object to wrap
     */
    public BufferedHttpResponseWrapper(HttpServletResponse response) throws UnsupportedEncodingException {
        super(response);
        /*

         I do not see explicit population of the ByteArrayOutputStream here (I am relearning Streams again, so my logic may be off)

         */
        charWriter = new CharArrayWriter();
        baos = new ByteArrayOutputStream();
        writer = new PrintWriter(new OutputStreamWriter(baos, "UTF-8"));
    }

    /**
     * Return the buffered Writer
     *
     * @see javax.servlet.ServletResponse#getWriter()
     */
    public PrintWriter getWriter() throws IOException {
        return writer;
    }

    /**
     * Return the output written to the Writer. To get the output, the Writer
     * must be flushed and closed. The content is captured by the
     * ByteArrayOutputStream.
     *
     * @return
     */
    public String getOutput() throws UnsupportedEncodingException {
        writer.flush();
        writer.close();
        return baos.toString("UTF-8");
    }

    public String toString() {
        String s = null;

        if (writer != null) {
            s = charWriter.toString();
        }
        return s;
    }
}
