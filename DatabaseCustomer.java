/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private String listCostumer[];
    public static Customer listCustomer;
    
    
    public DatabaseCustomer()
    {
        return;
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public static boolean addCustomer(Customer customer)
    {
        listCustomer = customer;
        return true;
    }
       /**
     * method ini digunakan untuk menghapus costumer kedalam database
     *
     * @return boolean true
     */
   
    //untuk menambahkan item ke class Item
    
    //untuk menghapus item dari class Item

    public void removeCustomer(Customer customer){
     return;
    }
     /**
     * Method yang digunakan untuk mereturn nilai customer
     * 
     * @return objek customer
     */
    
    public static Customer getCostumer(){
     return listCustomer;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database customer
     * 
     * @return list costumer
     */
    
    
    
}