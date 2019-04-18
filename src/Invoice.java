/**
 * Kelas digunakan sebagai informasi Invoice barang
 *
 * @author Muhamad Luthfi Mufadel
 * @version 10/4/2019
 */

import java.util.Calendar;
import java.util.ArrayList;

abstract public class Invoice
{
    //variabel yang dipakai
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    //Konstruktor dari kelas Invoice
    public Invoice(ArrayList<Integer> item)
    {
        this.item=item;
        id=DatabaseInvoice.getLastInvoiceID()+1;
    }

    //Menampilkan nomor id invoice
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama Item
    /**
     * Method getItem()
     * @return item
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    //Menampilkan tanggal
    /**
     * Method getDate()
     * @return date
     */
    public Calendar getDate()
    {
        return date;
    }
    
    //Menampilkan total harga
    /**
     * Method getTotalPrice()
     * @return totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    abstract public InvoiceStatus getInvoiceStatus();
    
    abstract public InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    //Mengubah id Item
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    //Mengubah nama Item
    /**
     * Method setItem()
     * @param item
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }
    
    //Mengubah tanggal
    /**
     * Method setDate()
     * @param date
     */
    public void setDate(Calendar date)
    {
        this.date=date;
    }
    
    //Mengubah total harga
    /**
     * Method setTotalPrice()
     * @param totalPrice
     */
    public void setTotalPrice(int totalPrice)
    {
        for(Integer invoice : item)
        {
            totalPrice=totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }
    
    public abstract void setInvoiceStatus(InvoiceStatus status);
    
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;
    }
    
    public abstract String toString();
}
