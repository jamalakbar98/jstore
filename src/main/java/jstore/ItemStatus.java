package jstore;
/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
 */

public enum ItemStatus{
  New("New"),
  Second("Second"),
  Refurbished("Refurbished"),
  Sold("Sold");

  private String toString;
    
    ItemStatus(String toString) {
        this.toString=toString;
    }
     public String toString()
    {
        // initialise instance variables
        return toString;
    }
}