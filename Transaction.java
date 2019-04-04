/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Item item)
    {
        Invoice invoice1 = new Buy_Paid(1, item, 3);
        
        if (invoice1 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
        System.out.println("=====Order New Item=====");
        //invoice1.printData();
        //item.printData();
    }
    
    public static void orderSecondItem(Item item)
    {
        //Invoice invoice2 = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        //if (invoice2 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        //else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
        System.out.println("=====Order Second Item=====");
        //invoice2.printData();
        //item.printData();
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        //Invoice invoice3 = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        //if (invoice3 instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        //else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
        System.out.println("=====Order Refurbished Item=====");
        //invoice3.printData();
        //item.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        //Invoice invoice4 = new Sell_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        System.out.println("===Sell Item Paid===");
        //invoice4.printData();
        //item.printData();
        
    }
    
    public static void sellItemUnpaid(Item item)
    {
        //Invoice invoice5 = new Sell_Unpaid(1, item, "21 Maret 2019", 3, item.getPrice());
        System.out.println("===Sell Item Unpaid===");
        //invoice5.printData();
        //item.printData();
        
    }
    
    public static void sellItemInstallment(Item item)
    {
        //Invoice invoice6 = new Sell_Installment(1, item, "21 Maret 2019", item.getPrice(), 3, 4);
        System.out.println("===Sell Installment===");
        //invoice6.printData();
        //item.printData();
        
    }
}