/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Trung Duc
 */
public class FileUploadUtil {
    
    public static String uploadSingleFile(File file,String fileName,String fileType,String path){
        String pathFile = "";
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        String dt = dateFormat.format(date);               
        File destFile = new File("C:/FilePackageUpload/" + dt + fileName);
        
        try {
            FileUtils.copyFile(file, destFile);
            pathFile = path + dt + fileName;
        } catch (IOException ex) {
            System.err.println("Could not copy file " + fileName);
             System.err.println(ex.getMessage());
        }                
        
    return pathFile;
    }
      public String fileinputStream(FormFile getfile) throws FileNotFoundException, IOException{
          System.out.println("file" + getfile.getFileName());
        String filename = "";
         FileOutputStream outputStream = null;
         FormFile fileN = null;
        
        fileN = getfile;
        String part = "/Users/brass/Documents/patefile/" + fileN.getFileName();
        outputStream = new FileOutputStream(new File(part));
        outputStream.write(fileN.getFileData());
        
        filename = getfile.getFileName();
        return filename;
}
    
}
