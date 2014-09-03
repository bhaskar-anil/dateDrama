/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bhaskar.looser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 360758
 */
public class date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "07-05-2012";
        String s2 = "01-05-2012";
        
        SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date d1 = date.parse(s1);
            Date d2 = date.parse(s2);
            double days = (double)(d1.getTime() - d2.getTime())/(1000*60*60*24);
            System.out.println("getTime for d1: "+d1.getTime());
            System.out.println("getTime for d2: "+d2.getTime());
            System.out.println("No of days are: "+days);
        } catch (ParseException ex) {
            ex.printStackTrace();
            System.out.println("Invalid date format given.");
        }
        
        
    }
    
}
