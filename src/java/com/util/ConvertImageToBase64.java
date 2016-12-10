/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.IOException;


import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import sun.misc.BASE64Encoder;
public class ConvertImageToBase64 {
    
   public  String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
   
   public static void main (String args[]) throws IOException {
        /* Test image to string and string to image start */
//       File file = new File("C:\\Users\\Administrator\\Documents\\pathImage\\icon_edit.gif");
//        BufferedImage img = ImageIO.read(file);
//        
//        String imgstr;
        //imgstr = encodeToString(img, "png");
      //  System.out.println(imgstr);
       
       String sentence = "Define, Measure, Analyze, Design and Verify";

        String replaced = sentence.replace("and", "");
        System.out.println(replaced);
    }
}
