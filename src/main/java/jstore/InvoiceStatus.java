package jstore;
/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
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

