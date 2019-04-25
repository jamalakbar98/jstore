package jstore;
import java.util.ArrayList;

/**
 * Sub kelas Sell Paid
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */
public class Sell_Paid extends Invoice
{
    private Customer customer;
    private boolean isActive;
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.PAID;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        this.isActive=false;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    // public void printData(){
    //      System.out.println("===================Invoice===================");
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
        String cetak = sdf.format(getDate().getTime());
        String diprint = "===== Sell Paid =====";
        diprint += "\n" + "ID: " + this.getId();
        diprint += "\n" + "Buy Date: " +cetak;
        Item item = DatabaseItem.getItemFromID(getId());
        diprint += "\nPrice: "+item.getPrice();
        diprint += "\n" + "Supplier ID: " + item.getSupplier().getId();
        diprint += "\n" + "Supplier Name: " + item.getSupplier().getName();
        diprint += "\n" + "Price Total: " + this.getTotalPrice();
        diprint += "\n" + "Customer ID: " + this.getCustomer().getId();
        diprint += "\n" + "Customer Name: " + this.getCustomer().getName();
        diprint += "\n" + "Status: " + this.getInvoiceStatus();
        diprint += "\n" + "Sell Success" + "\n";
        return diprint;
    }
}
