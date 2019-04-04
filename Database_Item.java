
/**
 * <h1>Item.java</h1>
 * <p>
 * Class ini merupakan bagian Database Item dari JStore Application
 * Class ini representasi dari sebuah Database Item yang terdapat pada JStore Application
 * </p>
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Database_Item
{
    /**
     * List array dari Item yang dibuat
     */
    private Item[] listItem;
    
    /**
     * Item dari object DatabaseItem yang telah dibuat
     */
    public static Item itemDB;
    
    /**
     * Method DatabaseItem merupakan Constructor dari DatabaseItem Class
     * Method ini dapat berisi nilai default dari variabel dalam DatabaseItem Class
     */
    public Database_Item()
    {
        
    }
    
    /**
     * Method ini merupakan method untuk menambahkan Item baru ke Database
     * @param item Item yang ingin dimasukan ke Database
     * @return nilai boolean apakah berhasil atau tidak pada saat memasukan Item
     */
    public static boolean addItem(Item item)
    {
        itemDB=item;
        return true;
    }
    
    /**
     * Method ini merupakan method yang menghapus Item dari Database
     * @param item Item yang ingin dihapus dari database
     * @return nilai boolean apakah berhasil atau tidak pada saat menghapus Item
     */
    public boolean removeItem(Item item)
    {
        return true;
    }
    
    /**
     * Accessor Method untuk mengambil Item dari object DatabaseItem
     * @return Item dari object DatabaseItem
     */
    public static Item getItem()
    {
        return itemDB;
    }
    
    /**
     * Accessor Method untuk mengambil List Array Item dari object DatabaseItem
     * @return List Array Item dari object DatabaseItem
     */
    public Item[] getItemDatabase()
    {
        return listItem;
    }
}
