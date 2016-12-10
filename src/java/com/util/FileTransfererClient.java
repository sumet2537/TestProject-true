/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author brass
 */
public class FileTransfererClient {
    
//        public String uploadFilePDF(java.lang.String filename, byte[] pdf) {
//        com.ws.Uploadfile_Service service = new com.ws.Uploadfile_Service();
//        com.ws.Uploadfile port = service.getUploadfilePort();
//        return port.uploadFilePDF(filename, pdf);
//    }
 
       public static void main(String[] args) {
        String fileName = "test.jpg";
        FileTransfererClient transfererClient = new FileTransfererClient();
        String filePath = "D:/Test/" + fileName;
        File file = new File(filePath);
           try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] imageBytes = new byte[(int) file.length()];
            inputStream.read(imageBytes);
             
//            transfererClient.uploadFilePDF(file.getName(), imageBytes);
 
            inputStream.close();
            System.out.println("File uploaded: " + filePath);
        } catch (IOException ex) {
            System.err.println(ex);
        } 
    }
}
