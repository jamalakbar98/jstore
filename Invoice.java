
/**
 * * <h1>Invoice.java</h1>
 * <p>
 * Class ini merupakan bagian invoice dari JStore Application
 * Class ini representasi dari sebuah invoice yang terdapat pada JStore Application
 * </p>
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
import java.util.*;
import java.util.Calendar;

abstract public class Invoice
{
    /**
     * ID dari objek invoice yang dibuat
     */
    
    private int id;
    /**
     * Item dari objek invoice
     */
    private ArrayList<Integer> item;
    
    /**
     * Tanggal dari objek invoice
     */
    private Calendar date;
    
    /**
     * Total harga dari objek invoice
     */
    private int totalPrice;
    //private InvoiceStatus status;
    //private InvoiceType type;
    private boolean isActive;
    private Customer customer;

    /**
     * Method Invoice merupakan Constructor dari Class Invoice
     * @param id            ID dari objek invoice
     * @param item          Item dari objek invoice
     * @param date          Tanggal dari objek invoice
     * @param totalPrice    Total Harga dari objek invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item=item;
        id=DatabaseInvoice.getLastInvoiceID()+1;
        //setTotalPrice(totalItem*item.getPrice());
    }
    
    /**
     * Accessor Method untuk mengambil nilai ID dari objek Invoice
     * @return Nilai ID dari objek Invoice
     */
    public int getId()
    {
        return id;
    }
    
    /**
    * Accessor Method untuk mengambil Item dari objek Invoice
    * @return Item dari objek Invoice
    */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    /**
    * Accessor Method untuk mengambil String Date dari objek Invoice
    * @return String Date dari objek Invoice
    */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
    * Accessor Method untuk mengambil nilai TotalPrice dari objek Invoice
    * @return Nilai TotalPrice dari objek Invoice
    */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    abstract public InvoiceStatus getInvoiceStatus();
    
    abstract public InvoiceType getInvoiceType();
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param id Nilai ID yang diinginkan
    */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
    * Mutator Method untuk mengubah Item dari objek Invoice
    * @param item Item yang diinginkan
    */
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }
    
    /**
    * Mutator Method untuk mengubah Date dari objek Invoice
    * @param date String Date yang diinginkan
    */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param totalPrice Nilai TotalPrice yang diinginkan
    */
    public void setTotalPrice (int totalPrice)
    {
        for(Integer invoice : item)
        {
            totalPrice=totalPrice+Database_Item.getItemFromID(invoice).getPrice();
        }
    }
    
    public abstract void setInvoiceStatus (InvoiceStatus status);
    
    public void setIsActive (boolean isActive)
    {
        this.isActive=isActive;
    }
    
    public abstract String toString();
}
