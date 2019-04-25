package jstore;
import java.util.*;
import java.util.Calendar;
/**
 * Kelas Invoice
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */

public abstract class Invoice
{
   //inisialisasi variable
    private int id, totalItem, totalPrice;
    private ArrayList<Integer> item;
    private InvoiceStatus status;
    private InvoiceType type;
    private Calendar date = Calendar.getInstance();
    private boolean isActive;
    private Customer customer;

   /**
     * Constructor for objects of class Invoice

     */
   public Invoice()
   {
      ArrayList<Integer> item = new ArrayList<Integer>();
   }

   public Invoice(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.item=item;
        this.id=id;
        int total = 0;
//        for (Integer i: item) {
//            total += DatabaseItem.getItemFromID(i).getPrice();
//        }
        //setTotalPrice(total);
        setId(DatabaseInvoice.getLastInvoiceID()+1);
    }

    /**
   * This is accessor for get id
   * @return id
   */
    public int getId()
    {
        // initialise instance variables
        return id; 
    }

     /**
   * This is accessor for get date
   * @return date
   */
     public Calendar getDate()
    {
        // initialise instance variables
      // date=Calendar.getInstance();
      // System.out.printf("%1$td %1$tB %1$tY\n",date);
      return date;
    }

     /**
   * This is accessor for get item
   * @return item
   */
    public ArrayList<Integer> getItem()
    {
        // initialise instance variables
        return item;
    }

     /**
   * This is accessor for get totalPrice
   * @return totalPrice
   */
    public int getTotalPrice()
    {
        // initialise instance variables
        return totalPrice; 
    }
     /**
   * This is accessor for get totalItem
   * @return totalItem
   */
    public int getTotalItem()
    {
        // initialise instance variables
        return totalItem; 
    }
     /**
   * This is accessor for get invoice status
   * @return status
   */
    public abstract InvoiceStatus getInvoiceStatus();

    public abstract InvoiceType getInvoiceType();

  /**
   * This is accessor for get item
   * @return item
   */
    public boolean getIsActive()
    {
        // initialise instance variables
        return isActive; 
    }
     public Customer getCustomer()
    {
        // initialise instance variables
        return customer; 
    }

     /**
   * This is mutator for set id
   * @param id
   */
    public void setId(int id)
    {
        // initialise instance variables
             this.id=id;
    }

    /**
   * This is mutator for set item
   * @param item
   */
    public void setItem(ArrayList<Integer> item)
    {
        // initialise instance variables
        this.item=item;

    }

    /**
   * This is mutator for set date
   * @param date
   */
     public void setDate(Calendar date)
    {
        // initialise instance variables
        this.date=date;
    }

    /**
   * This is mutator for set totalPrice
   * @param totalPrice
   */
    public void setTotalPrice(int totalPrice)
    {
        for(Integer invoice:item)
        {
           this.totalPrice=this.totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }

    /**
   * This is mutator for set totalPrice
   * @param totalItem
   */
    public void setTotalItem(int totalItem)
    {
        // initialise instance variables
        this.totalItem=totalItem;
    }


    /**
   * This is mutator for set Invoice status
   * @param status
   */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        // initialise instance variables
        this.status=status;
    }

    /**
   * This is mutator for set whether invoice is from active user
   * @param isActive boolean
   */
    public void setIsActive(Boolean isActive)
    {
        // initialise instance variables
        this.isActive=isActive;
    }


    //this is for printing, but the printing job done in subclass
    public abstract String toString();
   
}
