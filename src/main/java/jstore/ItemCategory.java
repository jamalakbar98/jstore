package jstore;
/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
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
 
    
