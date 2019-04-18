/**
 * Kelas digunakan sebagai informasi database dari item
 *
 * @author Muhamad Luthfi Mufadel
 * @version 10/4/2019
 */

import java.util.ArrayList;
public class DatabaseItem
{
    //variabel yang dipakai
    private static ArrayList<Item> ITEM_DATABASE=new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;

    //Menambah item

    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    //Mengapus item

    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    //Menampilkan item
    /**
     * Method getItem()
     * @return item
     */
    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        for (Item itemDB1 : ITEM_DATABASE ) {
            if(((itemDB1.getName().equals(item.getName())) && (itemDB1.getStatus() == item.getStatus()) &&
                    (itemDB1.getSupplier() == item.getSupplier()) && (itemDB1.getSupplier() == item.getSupplier())))
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }
    
    //Menampilkan list item
    /**
     * Method getItemDatabase()
     * @return listItem
     */
    public static Item getItemFromID(int id)
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                return itemDB;
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }
    
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> item = new ArrayList<Item>();
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                item.add(itemDB);
            }
        }
        if (item!=null)
            {
                return item;
            }
        return null;
    }

    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId() == id)
            {
                ITEM_DATABASE.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
}
