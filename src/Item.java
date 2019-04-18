/**
 * Kelas digunakan sebagai informasi item
 *
 * @author Muhamad Luthfi Mufadel
 * @version 10/4/2019
 */
public class Item
{
    //variabel yang dipakai
    private int id;
    private String name;
    //private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    
    //Konstruktor dari kelas Item
    public Item(String name, int price, ItemCategory category, ItemStatus status, Supplier supplier)
    {
        id=DatabaseItem.getLastItemID()+1;
        this.name=name;
        //this.stock=stock;
        this.price=price;
        this.category=category;
        this.status=status;
        this.supplier=supplier;
    }
    
    //Menampilkan nomor id
    /**
     * Method getId()
     * @return id
     */
    public int getId()
    {
        return id;
    }
    
    //Menampilkan nama Item
    /**
     * Method getName()
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    //Menampilkan stock Item
    /**
     * Method getStock()
     * @return stock
     */
    //public int getStock()
    //{
    //    return stock;
    //}
    
    //Menampilkan harga Item
    /**
     * Method getPrice()
     * @return price
     */
    public int getPrice()
    {
        return price;
    }
    
    //Menampilkan kategori Item
    /**
     * Method getCategory()
     * @return category
     */
    public ItemCategory getCategory()
    {
        return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    //Menampilkan supplier Item
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    //Mengganti nomor id
    /**
     * Method setId()
     * @param id
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    //Mengganti nama Item
    /**
     * Method setName()
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    //Mengganti stock Item
    /**
     * Method setStock()
     * @param stock
     */
    //public void setStock(int stock)
    //{
    //    this.stock=stock;
    //}
    
    //Mengganti harga Item
    /**
     * Method setPrice()
     * @param price
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    //Mengganti kategori Item
    /**
     * Method setCategory()
     * @param category
     */
    public void setCategory(ItemCategory category)
    {
        this.category=category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status=status;
    }
    
    //Mengganti supplier Item
    /**
     * Method setSupplier()
     * @param supplier
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    //Mencetak nama Item
    /**
     * Method printData()
     */
    public String toString()
    {
        return "==========ITEM======="+
        "\nID :" + id+
        "\nName :"  + name+
        //"\nStok :" + stock+
        "\nKategori :" + category+
        "\nStatus :" + status+
        "\nSupplier :" + this.supplier.getName();
    }
}
