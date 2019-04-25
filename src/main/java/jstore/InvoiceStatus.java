package jstore;
/**
 * Write a description of class Item here.
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (2.0)
 */

public enum InvoiceStatus{
  PAID("PAID"), 
  UNPAID("UNPAID"), 
  INSTALLMENT("INSTALLMENT");

    private String toString;
    
    InvoiceStatus(String toString) {
        this.toString=toString;
    }
     public String toString()
    {
        // initialise instance variables
        return toString;
    }
}

