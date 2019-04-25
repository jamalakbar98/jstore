package jstore;
/**
 * Write a description of class Item here.
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (2.0)
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