package jstore;
import java.util.ArrayList;

/**
 * Sub kelas Buy paid
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */
public class Buy_Paid extends Invoice
{
    private boolean isActive;
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.PAID;
    /**
     * Constructor for objects of class Buy_Paid
     */
  public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
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
        String diprint = "===== Buy Paid =====";
        diprint += "\n" + "ID: " + this.getId();
        diprint += "\n" + "Buy Date: " + sdf.format(getDate().getTime());
        diprint += "\n" + "Price Total: " + this.getTotalPrice();
        diprint += "\n" + "Status: " + this.getInvoiceStatus();
        diprint += "\n" + "Buy Success" + "\n";
        return diprint;
    }
}
