package jstore;
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy("Buy"),
    Sell("Sell");

    private String tipe;
    
    InvoiceType(String tipe) {
        this.tipe=tipe;
    }
     public String toString()
    {
        // initialise instance variables
        return tipe;
    }

}
