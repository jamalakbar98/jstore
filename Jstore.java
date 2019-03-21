
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
        ItemStatus status = ItemStatus.New;
        ItemCategory kategori = ItemCategory.Electronics;
        Location lokasi = new Location("Depok", "Jawa Barat", "Samping tukang sepatu");
        Supplier baru = new Supplier(1, "Jamal", "jamaludin@gmail.com", "081122334455", lokasi);
        lokasi.printData();
        baru.printData();
        Item barang = new Item(1,"Komputer",1,status,1500000,baru, kategori);
        Database_Item.addItem(barang);
        Transaction.orderNewItem(Database_Item.getItem());
        Transaction.orderSecondItem(Database_Item.getItem());
        Transaction.orderRefurbishedItem(Database_Item.getItem());
        Transaction.sellItemPaid(Database_Item.getItem());
        Transaction.sellItemUnpaid(Database_Item.getItem());
        Transaction.sellItemInstallment(Database_Item.getItem());

    }
    
    public void JStore(){
        //
    }
}
