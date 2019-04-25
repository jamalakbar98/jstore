package jstore;
import java.util.ArrayList;

/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
 */
public class Item
{
    //inisialisasi variable
    private int id=0, price;   //di UML kalo - artinya private
    private String name;   //kalo # artinya protected
    private Supplier supplier;
    private ItemCategory category;
    private ItemStatus status;

    /**
     * Constructor for objects of class Item
     * @param name for nama item
     * @param price for harga item
     * @param category for kategori item
     * @param supplier for link to class supplier
     */

    //kalo di UML + artinya public
    public Item(String name, int price, ItemCategory category, Supplier supplier, ItemStatus status)
    {
        // initialise instance variables
        this.name = name;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        this.status = status;
        setId(DatabaseItem.getLastItemID()+1);
    }

    /**
   * This is accessor for get id
   * @return id.
   */
    public int getId()
    {
        // initialise instance variables
        return id; 
    }

    /**
   * This is accessor for get nama item
   * @return name
   */
    public String getName()
    {
        // initialise instance variables
        return name;
    }


    /**
   * This is accessor for get price
   * @return price.
   */
    public int getPrice()
    {
        // initialise instance variables
        return price; 
    }

    /**
   * This is accessor for get category
   * @return category.
   */
    public ItemCategory getCategory(){
        return category;
    }

     /**
   * This is accessor for get status of item
   * @return status
   */
    public ItemStatus getStatus(){
        return status;
    }

    /**
   * This is accessor for get supplier
   * @return supplier.
   */
    public Supplier getSupplier(){
        return supplier;
    }

    /**
   * This is mutator for set id item
   * @param id
   * @return nothing
   */
    public void setId (int id)
    {
        this.id = id;
    }

    /**
   * This is mutator for set item's name
   * @param name
   * @return nothing
   */
    public void setName (String name)
    {
        this.name = name;
    }


    /**
   * This is mutator for set Price item
   * @param price
   * @return nothing
   */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
   * This is mutator for set category item
   * @param category
   * @return nothing
   */
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }

     /**
   * This is mutator for set status item
   * @param status
   * @return nothing
   */
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }

    /**
   * This is mutator for set supplier's data
   * @param supplier
   * @return nothing
   */
    public void setSupplier(Supplier supplier)
    {
        
        this.supplier = supplier;
    }


    //this is for printing name
    // public void printData()
    // {
    //     System.out.println("===================ITEM===================");
    //     System.out.println("ID: "+id);
    //     System.out.println("Name: "+name);
    //     System.out.println("Stock: "+stock);
    //     System.out.println("Category: "+category);
    //     System.out.println("Status: "+status);
    //     System.out.println("Supplier: "+supplier.getName());

    // }

    public String toString(){
        String diprint = "===================ITEM===================\nID: "+this.getId()+
              "\nName: "+name+"\nCategory: "+this.getCategory()+
              "\nStatus: "+status+"\nSupplier: "+supplier.getName();

              return diprint;
    }
}
