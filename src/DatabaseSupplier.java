import java.util.ArrayList;
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    /**
     * getListSupplier getter method
     * a method to return list of supplier from the class
     * @return as array of string of listSupplier
     */
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier)
    {
        try {
            for (Supplier i : SUPPLIER_DATABASE
            ) {
                if ((i.getName().equals(supplier.getName())) && ((i.getEmail().equals(supplier.getEmail()))
                        || (i.getPhoneNumber().equals(supplier.getPhoneNumber())))) {
                    throw new SupplierAlreadyExistsException(i);

                }
            }
        }
        catch (SupplierAlreadyExistsException E){
            System.out.println(E.getExMessage());
            return false;
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }

    public static Supplier getSupplier(int id)
    {
        for (Supplier i: SUPPLIER_DATABASE
        ) {
            if (i.getId()==id)
            {
                return i;
            }
        }
        return null;
    }

    public static boolean removeSupplier(int id)
    {
        try {
            for (Supplier i : SUPPLIER_DATABASE
            ) {
                if (i.getId() == id) {
                    DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(i));
                    SUPPLIER_DATABASE.remove(i);
                    return true;
                }
            }
            throw new SupplierNotFoundException(id);
        }
        catch (SupplierNotFoundException E){
            System.out.println(E.getExMessage());
            return false;
        }

    }
}