/*     */ package com.util;
/*     */ 
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class Unicode
/*     */ {
/*  15 */   static String prefix = "&#x0E";
static String prefix2 = "&#x0E";
/*  16 */   //static String prefix2 = "&#x0E";
/*  17 */   static char[] ciis = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
/*     */ 
/*     */   public static String encoding(String s)
/*     */   {
/*  25 */     StringBuilder buf = new StringBuilder();
/*  26 */     for (int i = 0; i < s.length(); i++) {
/*  27 */       char c = s.charAt(i);
/*  28 */       buf.append(encode(c));
/*     */     }
/*  30 */     return buf.toString();
/*     */   }
/*     */ 
/*     */   public static String encode(String s) {
/*  34 */     StringBuilder buf = new StringBuilder();
/*  35 */     for (int i = 0; i < s.length(); i++) {
/*  36 */       char c = s.charAt(i);
/*  37 */       buf.append(encoding(c));
/*     */     }
/*  39 */     return buf.toString();
/*     */   }
/*     */ 
/*     */   public static String encoding(char c)
/*     */   {
/*  44 */     if ((c < 'ก') || (c > '๛')) {
/*  45 */       return "&#x0E" + Integer.toHexString(c) + ";";
/*     */     }
/*  47 */     int i = 3585; int j = 0; for (int k = 1; i < 3676; i++) {
/*  48 */       if (c == (char)i) {
/*  49 */         return prefix2 + ciis[j] + ciis[k] + ";";
/*     */       }
/*  51 */       if (k == ciis.length - 1) {
/*  52 */         k = 0;
/*  53 */         j++;
/*     */       } else {
/*  55 */         k++;
/*     */       }
/*     */ 
/*  58 */       if (j == ciis.length - 1) {
/*  59 */         j = 0;
/*     */       }
/*     */     }
/*  62 */     return c + "";
/*     */   }
/*     */ 
/*     */   public static String encode(char c) {
/*  66 */     if ((c < 'ก') || (c > '๛')) {
/*  67 */       return c + "";
/*     */     }
/*  69 */     int i = 3585; int j = 0; for (int k = 1; i < 3676; i++) {
/*  70 */       if (c == (char)i) {
/*  71 */         return prefix + ciis[j] + ciis[k] + ";";
/*     */       }
/*  73 */       if (k == ciis.length - 1) {
/*  74 */         k = 0;
/*  75 */         j++;
/*     */       } else {
/*  77 */         k++;
/*     */       }
/*     */ 
/*  80 */       if (j == ciis.length - 1) {
/*  81 */         j = 0;
/*     */       }
/*     */     }
/*  84 */     return c + "";
/*     */   }
/*     */ 
/*     */   public static void table() {
/*  88 */     int i = 3585; int j = 0; for (int k = 1; i < 3676; i++) {
/*  89 */       System.out.println(prefix2 + ciis[j] + ciis[k] + "|" + (char)i);
/*  90 */       if (k == ciis.length - 1) {
/*  91 */         k = 0;
/*  92 */         j++;
/*     */       } else {
/*  94 */         k++;
/*     */       }
/*     */ 
/*  97 */       if (j == ciis.length - 1)
/*  98 */         j = 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String decoder(String s)
/*     */   {
/* 104 */     StringBuilder sb = new StringBuilder();
/* 105 */     for (int i = 0; i < s.length(); i++) {
/* 106 */       char c = s.charAt(i);
/* 107 */       switch (c) {
/*     */       case '+':
/* 109 */         sb.append(' ');
/* 110 */         break;
/*     */       case '&':
/*     */         try {
/* 113 */           if (s.charAt(i + 1) == '#') {
/* 114 */             //System.out.println("[" + s.substring(i + 2, i + 6) + "]");
/* 115 */             sb.append((char)Integer.parseInt(s.substring(i + 5, i + 6), 16));
/* 116 */             i += 5;
/*     */           } else {
/* 118 */             sb.append((char)Integer.parseInt(s.substring(i + 1, i + 3), 16));
/* 119 */             i += 2;
/*     */           }
/*     */         } catch (NumberFormatException e) {
/* 122 */           e.printStackTrace();
/*     */         }
/*     */ 
/*     */       default:
/* 127 */         sb.append(c);
/*     */       }
/*     */     }
/*     */ 
/* 131 */     String result = sb.toString();
/*     */     try
/*     */     {
/* 134 */       byte[] inputBytes = result.getBytes("UTF-8");
/* 135 */       result = new String(inputBytes);
/*     */     } catch (UnsupportedEncodingException e) {
/* 137 */       e.printStackTrace();
/*     */     }
/* 139 */     return result;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) throws Exception {
/* 143 */     //System.out.println(encoding("<HtMl>สวัสดีชาวโลก ติดตั้งจุงเบย &nbsp; </html>"));
                System.out.println(decoder("&x0E2b;&x0E21;&x0E32;&x0E22;&x0E40;&x0E2b;&x0E15;&x0E38;"));
/*     */   }
/*     */ 

public static String convertHexToString(String hex){
 
	  StringBuilder sb = new StringBuilder();
	  StringBuilder temp = new StringBuilder();
 
	  //49204c6f7665204a617661 split into two characters 49, 20, 4c...
	  for( int i=0; i<hex.length()-1; i+=2 ){
 
	      //grab the hex in pairs
	      String output = hex.substring(i, (i + 2));
	      //convert hex to decimal
	      int decimal = Integer.parseInt(output, 16);
	      //convert the decimal to character
	      sb.append((char)decimal);
 
	      temp.append(decimal);
	  }
	  //System.out.println("Decimal : " + temp.toString());
 
	  return sb.toString();
  }
}

/* Location:           D:\tmp\linkInterTravel\WEB-INF\classes\
 * Qualified Name:     neo.workforce.util.Unicode
 * JD-Core Version:    0.6.2
 */