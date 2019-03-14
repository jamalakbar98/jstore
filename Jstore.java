
/**
 * Write a description of class Jstore here.
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Jstore
{
    public static void main(String[] args){
        //
        Location location1 = new Location("Depok", "Jawa Barat", "Kota Belimbing");
        Supplier supplier1 = new Supplier(1, "Samsung", "samsung@gmail.com", "012345", location1);
        location1.printData();
        supplier1.printData();
        Transaction.orderNewItem(supplier1);
        Transaction.orderSecondItem(supplier1);
        Transaction.orderRefurbishedItem(supplier1);
        Transaction.sellItemPaid(Database_Item.itemDB);
        Transaction.sellItemUnpaid(Database_Item.itemDB);
        Transaction.sellItemInstallment(Database_Item.itemDB);
    }
    
    public void JStore(){
        //
    }
}
