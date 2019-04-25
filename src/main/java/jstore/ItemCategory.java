package jstore;
/**
 * Write a description of class Item here.
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (2.0)
 */

public enum ItemCategory{
  Electronics("Electronics"),
  Furniture("Furniture"),
  Stationery("Stationery");

  private String toString;
    
    ItemCategory(String toString) {
        this.toString=toString;
    }
     public String toString()
    {
        // initialise instance variables
        return toString;
    }
}
 
    
