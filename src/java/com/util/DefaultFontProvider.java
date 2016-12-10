//
//package com.util;
//
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.FontFactoryImp;
//import com.itextpdf.text.pdf.BaseFont;
//
//public class DefaultFontProvider extends FontFactoryImp {
//    private String _default;
//    private Font font;
//    
//    public DefaultFontProvider(String def) {
//        _default = def;
//         try {
//        BaseFont bfComic = BaseFont.createFont(def, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//        this.font = new Font(bfComic);
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        }
//    }
////    
//    @Override
//    public Font getFont(String fontName, String encoding, boolean embedded, float size, int style, BaseColor color, boolean cached) {
//        if (fontName == null || size == 0) {
//            fontName = _default;
//            
//        }
//        if( encoding == null ) {
//            encoding = "TIS-620";
//        }
//        this.font.setSize(size);
//        this.font.setColor(color);
//        this.font.setStyle(style);
//        
//        //return super.getFont(fontName, encoding, embedded, size, style, color, cached);
//        return this.font;
//    }
//}
