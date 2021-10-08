package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dg=input.nextLine().toLowerCase(Locale.ROOT);
        String burc;
        int day= Integer.parseInt(dg.split(" ")[0]);
        String month = dg.split(" ")[1];
        burc=((((month.equals("nisan"))&&((day<21)) || (month.equals("mart")&&day>20 ))))?"koc":
                ((((month.equals("nisan"))&&((day>21)) || (month.equals("mayıs")&&day<21 ))))?"boga":
                        ((((month.equals("mayıs"))&&((day>22)) || (month.equals("haziran")&&day<22 ))))?"ikizler":
                                ((((month.equals("haziran"))&&((day>23)) || (month.equals("temmuz")&&day<23 ))))?"yengec":
                                        ((((month.equals("temmuz"))&&((day>22)) || (month.equals("ağustos")&&day<23 ))))?"aslan":
                                                ((((month.equals("ağustos"))&&((day>22)) || (month.equals("eylül")&&day<23 ))))?"basak":
                                                        ((((month.equals("eylül"))&&((day>22)) || (month.equals("ekim")&&day<23 ))))?"terazi":
                                                                ((((month.equals("ekim"))&&((day>22)) || (month.equals("kasım")&&day<22 ))))?"akrep":
                                                                        ((((month.equals("kasım"))&&((day>21)) || (month.equals("aralık")&&day<22 ))))?"yay":
                                                                                ((((month.equals("aralık"))&&((day>21)) || (month.equals("ocak")&&day<22 ))))?"oglak":"gecersiz tarih";
        System.out.println(burc);
    }
}
