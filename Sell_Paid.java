
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    static final private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive = false;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = Database_Item.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nSell Success";
        return string;
    }
}
