/*
 * @Henry Huang
 * EasterVariation2.java
 * Feb 19,2019
 * This program is designed to determine the date of the Easter of given year.
 */
package eastervariation2;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
public class EasterVariation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Listing required variables in the calculations.
       int a,b,c,d;
       int q,f,g,h;
       int j,k,n,p;
       int year;
       int month;
       int day;
       
       //Ask user for year to find the date
       String yearStr = JOptionPane.showInputDialog("Easter " + 
               "Data Calculator\nPlease Enter A Year");
       
       // For outputting month is String format
       String monthStr;
       
       //Convert the string year to Integer to use in the calculation
       year = Integer.parseInt(yearStr);
       
       //Calculations
       a = year / 100;
       b = year % 100;
       
       c = 3 * (a + 25) / 4;
       d = 3 * (a + 25) % 4;
       
       q = 8 * (a + 11) / 25;
       
       f = (5 * a + b) % 19;
       
       g = (19 * f + c - q) / 30;
       
       h = (f +11 * g) / 319;
       
       j = ( 60 * 5 - 60 * d + b) / 4;
       k = (60 * (5 - d) + b) % 4;
       
       n = (2 * j - k - g + h) % 7;
       
       month = (g - h + n + 114) / 31;
       p = (g - h + n + 114) % 31;
       
       day = 1 + p;
       
       // Determine the month in String format
       if (month == 3)
       {
           monthStr = "March";
       }
       else
       {
           monthStr = "April";
       }
       
       //Display the results
       JOptionPane.showMessageDialog(null, "Easter will fall" + "on Sunday, " +
                monthStr + " " + day + " "  + year);
        
    }
    
}
