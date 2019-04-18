import java.util.*;

public class Transaction{

    public static void orderNewItem(ArrayList<Integer> item){
        /*ArrayList<Integer> itemID = new ArrayList<Integer>();
        Invoice invoice=new Buy_Paid(itemID);
        try{
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }
*/
    }

    public static void orderSecondItem(ArrayList<Integer> item){
   /*     ArrayList<Integer> itemID = new ArrayList<Integer>();
        //itemID.add(item.getId())
        Invoice invoice=new Buy_Paid(itemID);
        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (InvoiceAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }*/
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item){
     /*   ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
       // Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static void sellItemPaid(ArrayList<Integer> item, Customer customer){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
        //itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static void sellItemUnpaid(ArrayList<Integer> item, Customer customer){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
       // itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public static void sellItemInstallment(ArrayList<Integer> item, Customer customer, int installmentPeriod){
       /* ArrayList<Integer> itemID = new ArrayList<Integer>();
       // itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);*/
    }

    public boolean finishTransaction(Invoice invoice){
        ArrayList<Invoice> invDb = DatabaseInvoice.getInvoiceDatabase();
        for (int i = 0; i < invDb.size(); i++){
            if(invDb.get(i).getId() == invoice.getId()){
                invoice.setIsActive(false);
                invDb.set(i,invoice);
                System.out.println(invoice.toString());
                return true;
            }
        }
        return false;
    }

    public boolean cancelTransaction(Invoice invoice){
        ArrayList<Invoice> invDb = DatabaseInvoice.getInvoiceDatabase();
        for( Invoice inv : invDb ){
            if(inv.getId() == invoice.getId()){
                invDb.remove(inv);
                return true;
            }
        }
        return false;
    }
}