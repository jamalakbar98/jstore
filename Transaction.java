/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Transaction
{

    /**
     * Constructor for objects of class Transaction
     */
    
    
    public static void orderNewItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*if(beliBaru instanceof Sell_Paid)
        {
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bukan Sell_Paid");
        }
        item.printData();
        beliBaru.printData();*/
        
    }
    
    public static void orderSecondItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice beliSecond = new Buy_Paid(1, item, "29/3/2019", item.getStock(), item.getPrice());
        item.printData();
        beliSecond.printData();*/
    }
    
    public static void orderRefurbishItem(Item item)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice beliRefurbish = new Buy_Paid(1, item, "29/3/2019", item.getStock(), item.getPrice());
        item.printData();
        beliRefurbish.printData();*/
    }
    
    public static void sellItemPaid(Item item,Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice jualLunas = new Sell_Paid(1, item, "29/3/2019", 1, item.getPrice());
        item.printData();
        jualLunas.printData();*/
    }
    
    public static void sellItemUnpaid(Item item,Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice jualBelumLunas = new Sell_Unpaid(1, item, "29/3/2019", 1, item.getPrice(), "29/3/2020");
        item.printData();
        jualBelumLunas.printData();*/
    }
    
    public static void sellItemInstallment(Item item,Customer customer,int installmentPeriod)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
        /*Invoice jualCicil = new Sell_Installment(1, item, "29/3/2019", 1, item.getPrice(),12);
        item.printData();
        jualCicil.printData();*/
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                invoice.setIsActive(false);
                System.out.print(invoice.getIsActive());
                value=true;
            }
        }
        return value;
    }
    
    public boolean cancelTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
               if (invoiceDB.getId()==invoice.getId()){
                   DatabaseInvoice.removeInvoice(invoice.getId());
                   value=true;
               }
           }
        return value;
    }
}
