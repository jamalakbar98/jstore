
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
import java.util.*;
public class Database_Item
{
    /**
     * List array dari Item yang dibuat
     */
    private static ArrayList<Item> ITEM_DATABASE=new ArrayList<Item>();;
    
    /**
     * Item dari object DatabaseItem yang telah dibuat
     */
    private static int LAST_ITEM_ID;
    
    /**
     * Method DatabaseItem merupakan Constructor dari DatabaseItem Class
     * Method ini dapat berisi nilai default dari variabel dalam DatabaseItem Class
     */
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    /**
     * Method ini merupakan method untuk menambahkan Item baru ke Database
     * @param item Item yang ingin dimasukan ke Database
     * @return nilai boolean apakah berhasil atau tidak pada saat memasukan Item
     */
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    /**
     * Method ini merupakan method yang menghapus Item dari Database
     * @param item Item yang ingin dihapus dari database
     * @return nilai boolean apakah berhasil atau tidak pada saat menghapus Item
     */
    public static boolean addItem(Item item)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()!=itemDB.getName()&&item.getStatus()!=itemDB.getStatus()&&item.getSupplier()!=itemDB.getSupplier())
            {
            ITEM_DATABASE.add(item);
            //tambahan
            LAST_ITEM_ID=item.getId();
            value=true;
            }
        }
        return value;
    }
    
    /**
     * Accessor Method untuk mengambil Item dari object DatabaseItem
     * @return Item dari object DatabaseItem
     */
    public static Item getItemFromID(int id)
    {
        Item value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                value=itemDB;
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static boolean removeItem(int id)
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
}
