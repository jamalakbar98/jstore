
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
public class DatabaseSupplier
{
    /**
     * List Array dari supplier yang dibuat.
     */
    private String listSupplier[];
    
    /**
     * Supplier dari Object DatabaseSupplier yang telah dibuat.
     */
    private Supplier supplier;

    /**
     * Method DatabaseSupplier merupakan Constructor dari Class DatabaseSupplier
     * Method ini bisa berisi nilai default dari variabel Class DatabaseSupplier
     */
    public DatabaseSupplier()
    {
        
    }

    /**
     * Method ini merupakan method yang menambahkan supplier baru kedalam DataseSupplier
     * @param supplier Supplier yang ingin dimasukan ke Database
     * @return nilai boolean apakah berhasil atau tidak pada saat memasukan supplier
     */
    public boolean addSupplier(Supplier supplier)
    {
        return true;
    }
    
    /**
     * Method ini merupakan method yang menghapus Supplier dari Database
     * @param supplier Supplier yang ingin dihapus dari database
     * @return nilai boolean apakah berhasil atau tidak pada saat menghapus supplier
     */
    public boolean removeSupplier(Supplier supplier)
    {
        return true;
    }
    
    /**
     * Accessor Method untuk mengambil Supplier dari object DatabaseSupplier
     * @return Supplier dari object DatabaseSupplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Accessor Method untuk mengambil List Array Supplier dari object DatabaseSupplier
     * @return List Array Supplier dari object DatabaseSupplier
     */
    public String[] getListSupplier()
    {
    	return listSupplier;
    }
}
