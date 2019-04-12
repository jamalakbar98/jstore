
/**
 * <h1>Item.java</h1>
 * <p>
 * Class ini merupakan bagian item dari JStore Application
 * Class ini representasi dari sebuah item yang terdapat pada JStore Application
 * </p>
 * 
 * @author (Jamaludin AKbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Item
{
    /**
     * ID dari Item yang dibuat
     */
    private int id;
    
    /**
     * Nama dari Item yang dibuat
     */
    private String name;
    
    /**
     * Jumlah stok Item yang dibuat
     */
    private int stock;
    
    /**
     * Harga Item yang dibuat
     */
    private int price;
   
    /**
     * Supplier dari Item yang dibuat
     */
    private Supplier supplier;
    private ItemStatus status;
    private ItemCategory category;
    

    /**
     * Method Item merupakan Constructor dari Item Class
     * @param id        ID dari objek barang yang dibuat
     * @param name      Nama barang yang dibuat
     * @param stock     Stock barang yang dibuat
     * @param price     Harga barang yang dibuat
     * @param category  Kategori barang yang dibuat
     * @param supplier  Supplier barang yang dibuat
     */
    public Item(String name, int stock, ItemStatus status, int price, Supplier supplier, ItemCategory category)
    {
        id=Database_Item.getLastItemID()+1;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.supplier=supplier;
        this.category=category;
        this.status=status;
    }
    
    /**
     * Accessor Method untuk mengambil nilai ID dari objek Item
     * @return Nilai ID dari objek Item
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Accessor Method untuk mengambil String nama dari objek Item
     * @return String nama dari objek Item
     */
    public String getName()
    {
        return name;
    }
    
    /**
    * Accessor Method untuk mengambil nilai Stock dari objek Item
    * @return Nilai Stock dari objek Item
    */
    public int getStock()
    {
        return stock;
    }
    
    /**
    * Accessor Method untuk mengambil nilai harga dari objek Item
    * @return Nilai harga dari objek Item
    */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Accessor Method untuk mengambil String kategori dari objek Item
     * @return String kategori dari objek Item
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    /**
     * Accessor Method untuk mengambil Supplier dari objek Item
     * @return Supplier dari objek Item
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Item
    * @param id Nilai ID yang diinginkan
    */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
    * Mutator Method untuk mengubah Name dari objek Item
    * @param name String Name yang diinginkan
    */
    public void setName(String name)
    {
       this.name=name;
    }
    
    /**
    * Mutator Method untuk mengubah Stock dari objek Item
    * @param stock Nilai Stock yang diinginkan
    */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    
    /**
    * Mutator Method untuk mengubah Price dari objek Item
    * @param price Nilai Price yang diinginkan
    */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /**
    * Mutator Method untuk mengubah Category dari objek Item
    * @param category String Category yang diinginkan
    */
    public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
    
    /**
    * Mutator Method untuk mengubah Supplier dari objek Item
    * @param supplier Supplier yang diinginkan
    */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    /**
    * Method untuk melakukan Print Data dari Object Item (name)
    */
    public String toString()
    {
        return "======ITEM=======\nId: "+id+"\nName: "+name+"\nStock: "+stock+"\nCategory: "+category+"\nStatus: "+status+"\nSupplier: "+supplier.getName();
    }
}