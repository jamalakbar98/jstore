package jstore;
import java.util.*;
import java.util.Calendar;
/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
 */
public class Sell_Unpaid extends Invoice
{
    private boolean isActive;
    private Calendar dueDate ;
    private Customer customer;
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.UNPAID;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        this.isActive=true;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Customer getCustomer()
    {
        return customer;
    }
    public Calendar getDueDate()
    {
        Calendar dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DATE, 1);
        return dueDate;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void setDueDate(Calendar dueDate){
        this.dueDate=dueDate;
    }
    // public void printData(){
    //     System.out.println("===================Invoice===================");
    //     System.out.println("ID: "+super.getId());
    //     System.out.println("Date: "+super.getDate());
    //     System.out.println("Item: "+super.getItem().getName());
    //     System.out.println("Invoice Status: "+getInvoiceStatus());
    //     System.out.println("Invoice Type: "+getInvoiceType());
    //     System.out.println("Total Item: "+super.getTotalItem());
    //     System.out.println("Total Price: "+super.getTotalPrice());
    // }
    public String toString(){
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
        String diprint = "===== Sell Unpaid =====";
        diprint += "\n" + "ID: " + this.getId();
        diprint += "\n" + "Buy Date: " + sdf.format(getDate().getTime());
        Item item = DatabaseItem.getItemFromID(getId());
        diprint += "\nPrice: "+item.getPrice();
        diprint += "\n" + "Supplier ID: " + item.getSupplier().getId();
        diprint += "\n" + "Supplier Name: " + item.getSupplier().getName();
        diprint += "\n" + "Price Total: " + getTotalPrice();
        diprint += "\n" + "Customer ID: " + this.getCustomer().getId();
        diprint += "\n" + "Customer Name: " + this.getCustomer().getName();
        diprint += "\n" + "Status: " + this.getInvoiceStatus();
        diprint += "\n" + "Due date: " + sdf.format(this.getDueDate().getTime());
        diprint += "\n" + "If payment is not received by dueDate, transaction will be cancelled";
        return diprint;
    }
}
