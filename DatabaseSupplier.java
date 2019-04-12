
/**
 * <h1>Item.java</h1>
 * <p>
 * Class ini berisi Database Supplier dari JStore Application
 * Class ini representasi dari sebuah Database Supplier yang terdapat pada JStore Application
 * </p>
 * 
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
import java.util.*;
public class DatabaseSupplier{
    
    /**
    * List Array dari Supplier yang dibuat
    */
   
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;
   
    
    /**
    * Method DatabaseSupplier merupakan Constructor dari DatabaseSupplier Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseSupplier Class
    */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    /**
    * Method ini merupakan method yang menambahkan Supplier baru
    * Kedalam Database Supplier
    * @param supplier Supplier yang ingin dimasukan kedalam database
    * @return nilai boolean apakah pemasukan supplier berhasil atau gagal
    */
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()!=supplierDB.getName()&&supplier.getEmail()!=supplierDB.getEmail()&&supplier.getPhoneNumber()!=supplierDB.getPhoneNumber())
            {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID=supplier.getId();
            value=true;
            }
        }
        return value;
    }
    
    public Supplier getSupplier(int id)
    {
        Supplier value=null;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                value=supplierDB;
            }
        }
        return value;
    }
    
    public boolean removeSupplier(int id)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                Database_Item.getItemDatabase().removeAll(Database_Item.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }   
}