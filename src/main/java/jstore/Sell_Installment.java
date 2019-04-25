package jstore;
import java.util.*;
/**
 * Sub kelas Sell Installment
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */
public class Sell_Installment extends Invoice
{
    private int installmentPeriod, installmentPrice;
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.INSTALLMENT;
    private Customer customer; 
    private boolean isActive;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        this.isActive=true;
        this.installmentPrice= (int) (super.getTotalPrice()*1.02)/installmentPeriod;
    }

     public void setInstallmentPrice(int totalPrice){
        installmentPrice= (int) ((totalPrice*1.02)/installmentPeriod);
    }
    public void setTotalPrice(){
        setTotalPrice(installmentPrice*installmentPeriod);
    }
     public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer=customer;
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
        String diprint = "===== Sell Installment =====";
        diprint += "\n" + "ID: " + this.getId();
        diprint += "\n" + "Buy Date: " +cetak;
//        for (Integer i: getItem()) {
//            Item item = DatabaseItem.getItemFromID(i.intValue());
//            diprint += "\nPrice: "+item.getPrice();
//            diprint += "\n" + "Supplier ID: " + item.getSupplier().getId();
//            diprint += "\n" + "Supplier Name: " + item.getSupplier().getName();
//        }
        Item item = DatabaseItem.getItemFromID(getId());
            diprint += "\nPrice: "+item.getPrice();
            diprint += "\n" + "Supplier ID: " + item.getSupplier().getId();
            diprint += "\n" + "Supplier Name: " + item.getSupplier().getName();
        diprint += "\n" + "Price Total: " + super.getTotalPrice();
        diprint += "\n" + "Customer ID: " + this.getCustomer().getId();
        diprint += "\n" + "Customer Name: " + this.getCustomer().getName();
        diprint += "\n" + "Installment Price: "+this.getInstallmentPrice();
        diprint += "\n" + "Status: " + this.getInvoiceStatus();
        diprint += "\n" + "Sell Success" + "\n";
        return diprint;
    }
}
