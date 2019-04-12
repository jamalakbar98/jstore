/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;
    
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public static int getLastCustomer()
    {
        return LAST_CUSTOMER_ID;
    }
    
       /**
     * method ini digunakan untuk menghapus costumer kedalam database
     *
     * @return boolean true
     */
    public static boolean addCustomer(Customer customer)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()!=customerDB.getName()&&customer.getEmail()!=customerDB.getEmail())
            {
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID=customer.getId();
            value=true;
            }
        }
        return value;
    }

    public static Customer getCustomer(int id)
    {
        Customer value=null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                value=customerDB;
            }
        }
        return value;
    }
    
     /**
     * Method yang digunakan untuk mereturn nilai costumer
     * 
     * @return objek costumer
     */
    
    public static boolean removeCustomer(int id)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
    
}