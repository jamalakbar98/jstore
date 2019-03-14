/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus statusItem1 = ItemStatus.New;
        Item item1 = new Item(1, "Laptop", 10, statusItem1, 15000000, supplier, category);

        Database_Item.addItem(item1);
        
        InvoiceStatus statusInvoice1 = InvoiceStatus.Paid;
        Invoice pesan1 = new Invoice(1, item1, "14 Maret 2019", item1.getPrice(), statusInvoice1);
        
        item1.setStatus(statusItem1);
        pesan1.setInvoiceStatus(statusInvoice1);
        
        item1.printData();
        pesan1.printData();
    }
    
    public static void orderSecondItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Furniture;
        ItemStatus statusItem2 = ItemStatus.Second;
        Item item2 = new Item(2, "Meja", 10, statusItem2, 5000000, supplier, category);

        Database_Item.addItem(item2);
        
        InvoiceStatus statusInvoice2 = InvoiceStatus.Paid;
        Invoice pesan2 = new Invoice(2, item2, "14 Maret 2019", item2.getPrice(), statusInvoice2);
        
        item2.setStatus(statusItem2);
        pesan2.setInvoiceStatus(statusInvoice2);
        
        item2.printData();
        pesan2.printData();
    }
    
    public static void orderRefurbishedItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus statusItem3 = ItemStatus.Refurbished;
        Item item3 = new Item(3, "Laptop", 10, statusItem3, 10000000, supplier, category);

        Database_Item.addItem(item3);
        
        InvoiceStatus statusInvoice3 = InvoiceStatus.Paid;
        Invoice pesan3 = new Invoice(3, item3, "14 Maret 2019", item3.getPrice(), statusInvoice3);
        
        item3.setStatus(statusItem3);
        pesan3.setInvoiceStatus(statusInvoice3);
        
        item3.printData();
        pesan3.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        InvoiceStatus statusInvoice4 = InvoiceStatus.Paid;
        ItemStatus statusItem4 = ItemStatus.Sold;

        Invoice pesan4 = new Invoice(4, item, "14 Maret 2019", item.getPrice(), statusInvoice4);

        pesan4.setInvoiceStatus(statusInvoice4);
        item.setStatus(statusItem4);

        pesan4.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        InvoiceStatus statusInvoice5 = InvoiceStatus.Unpaid;
        ItemStatus statusItem5 = ItemStatus.Sold;

        Invoice pesan5 = new Invoice(5, item, "14 Maret 2019", item.getPrice(), statusInvoice5);

        pesan5.setInvoiceStatus(statusInvoice5);
        item.setStatus(statusItem5);

        pesan5.printData();
    }
    
    public static void sellItemInstallment(Item item)
    {
        InvoiceStatus statusInvoice6 = InvoiceStatus.Installment;
        ItemStatus statusItem6 = ItemStatus.Sold;

        Invoice pesan6 = new Invoice(6, item, "14 Maret 2019", item.getPrice(), statusInvoice6);

        pesan6.setInvoiceStatus(statusInvoice6);
        item.setStatus(statusItem6);

        pesan6.printData();
    }
}