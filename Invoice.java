
/**
 * * <h1>Invoice.java</h1>
 * <p>
 * Class ini merupakan bagian invoice dari JStore Application
 * Class ini representasi dari sebuah invoice yang terdapat pada JStore Application
 * </p>
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Invoice
{
    /**
     * ID dari objek invoice yang dibuat
     */
    private int id;
    
    /**
     * Item dari objek invoice
     */
    private Item item;
    
    /**
     * Tanggal dari objek invoice
     */
    private String date;
    
    /**
     * Total harga dari objek invoice
     */
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;

    /**
     * Method Invoice merupakan Constructor dari Class Invoice
     * @param id            ID dari objek invoice
     * @param item          Item dari objek invoice
     * @param date          Tanggal dari objek invoice
     * @param totalPrice    Total Harga dari objek invoice
     */
    public Invoice(int id, Item item, String date, int totalPrice, InvoiceStatus status)
    {
       this.id=id;
       this.item=item;
       this.date=date;
       this.totalPrice=totalPrice;
       this.status=status;
    }
    
    /**
     * Accessor Method untuk mengambil nilai ID dari objek Invoice
     * @return Nilai ID dari objek Invoice
     */
    public int getId()
    {
        return id;
    }
    
    /**
    * Accessor Method untuk mengambil Item dari objek Invoice
    * @return Item dari objek Invoice
    */
    public Item getItem()
    {
        return item;
    }
    
    /**
    * Accessor Method untuk mengambil String Date dari objek Invoice
    * @return String Date dari objek Invoice
    */
    public String getDate()
    {
        return date;
    }
    
    /**
    * Accessor Method untuk mengambil nilai TotalPrice dari objek Invoice
    * @return Nilai TotalPrice dari objek Invoice
    */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    public int getTotalItem()
    {
        return totalItem;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return status;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param id Nilai ID yang diinginkan
    */
    public void setID(int id)
    {
        this.id=id;
    }
    
    /**
    * Mutator Method untuk mengubah Item dari objek Invoice
    * @param item Item yang diinginkan
    */
    public void setIdItem(Item item)
    {
        this.item=item;
    }
    
    /**
    * Mutator Method untuk mengubah Date dari objek Invoice
    * @param date String Date yang diinginkan
    */
    public void setDate(String date)
    {
        this.date=date;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param totalPrice Nilai TotalPrice yang diinginkan
    */
    public void setTotalPrice (int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    public void setTotalItem (int totalItem)
    {
        this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus (InvoiceStatus status)
    {
        this.status=status;
    }
    
    /**
    * Method untuk melakukan Print Data dari Object Invoice (totalPrice)
    */
    public void printData()
    {
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + id);
        System.out.println("Date :" + date);
        System.out.println("Item yang terdapat :" + item.getName());
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Status :" + status);
    }
}
