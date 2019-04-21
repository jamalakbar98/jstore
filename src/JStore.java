import javax.xml.crypto.Data;
import java.util.*;

public class JStore {
    public JStore() {

    }

    public static void main(String[] args) {
        Location location1 = new Location("Palembang", "Sumatera Selatan", "Palembang");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Achmad Fathur Rizki", "achmadfathurrizki@gmail.com", "0800000002", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Muhammad Farid Alharsi", "kiayfarid@gmail.com", "0800000001", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(DatabaseSupplier.getSupplier(1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Jamaludin Akbar", "jamalunta@rocketmail.com", "Jamal.Unta", "ciscoenpa55", 1998, 01, 01));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(new Customer("Cahyadi Bayu", "bayaya@rocketmail.com", "Bayuyu", "ciscoconpa55", 1998, 02, 02));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(DatabaseCustomer.getCustomer(1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Router 1941", ItemStatus.New, 4500000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Switch", ItemStatus.New, 70000000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(DatabaseItem.getItemFromID(1));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        item.add(1);
        item.add(1);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(item, 10, DatabaseCustomer.getCustomer(2)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(DatabaseInvoice.getInvoice(1));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseSupplier.removeSupplier(100);
        } catch (SupplierNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.removeCustomer(25);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.removeItem(77);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.removeInvoice(69);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(1));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }


        ArrayList<Supplier> tempSupplier = DatabaseSupplier.getSupplierDatabase();
        for (Supplier temp : tempSupplier) {
            System.out.println(temp);
        }

        ArrayList<Customer> tempCustomer = DatabaseCustomer.getCustomerDatabase();

        for (Customer temp : tempCustomer) {
            System.out.println(temp);
        }

        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();
        for (Item temp : tempItem) {
            System.out.println(temp);
        }
    }
}


    //public static void main(String[] args)
    //{

        //Location lokasi = new Location("Jakarta Timur","DKI Jakarta","Condet");
        //Supplier supplier1 = new Supplier("Dhio", "Dhio@gmail.com", "08124545121", lokasi);
        //DatabaseSupplier.addSupplier(supplier1);
        //Supplier supplier2 = new Supplier("Aldin", "Aldin@gmail.com", "08751216", lokasi);
        //DatabaseSupplier.addSupplier(supplier2);
        //Supplier supplier3 = new Supplier("Bayu", "Bayu@gmail.com", "5465121589", lokasi);
        //DatabaseSupplier.addSupplier(supplier3);
        //for(Supplier supplier : DatabaseSupplier.getSupplierDatabase())
        //{
        //   System.out.println(supplier);
        //}
        //DatabaseCustomer.addCustomer(new Customer("custom1","Custom1@gmail.com","custom1","pass1",1998,5,26));
        //DatabaseCustomer.addCustomer(new Customer("custom2","Custom2@gmail.com","custom2","pass2",1998,5,26));
        //DatabaseCustomer.addCustomer(new Customer("custom3","Custom3@gmail.com","custom3","pass3",1998,5,26));
        //for(Customer customer : DatabaseCustomer.getCustomerDatabase())
        //{
        //    System.out.println(customer);
        //}
        //DatabaseItem.addItem(new Item("barang1", 1, 100, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        //DatabaseItem.addItem(new Item("barang2", 2, 200, ItemCategory.Furniture, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
        //DatabaseItem.addItem(new Item("barang3", 3, 300, ItemCategory.Stationery, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
        //DatabaseItem.addItem(new Item("barang1", 1, 150, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        //for(Item item : DatabaseItem.getItemDatabase())
        //{
         //   System.out.println(item);
        //}
        //ArrayList<Integer> items = new ArrayList<>();
        //items.add(1);
        //items.add(2);
        //ArrayList<Integer> items1 = new ArrayList<>();
        //items1.add(2);
        //ArrayList<Integer> items2 = new ArrayList<>();
        //items2.add(3);
        //items2.add(2);
        
        //DatabaseInvoice.addInvoice(new Sell_Paid(items, DatabaseCustomer.getCustomer(1)));
        //DatabaseInvoice.addInvoice(new Sell_Unpaid(items, DatabaseCustomer.getCustomer(2)));
        //DatabaseInvoice.addInvoice(new Sell_Installment(items, 12, DatabaseCustomer.getCustomer(3)));
        
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));
        //Transaction.finishTransaction(DatabaseInvoice.getInvoice(3));
        //for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        //{
         //   System.out.println(invoice);
        //}
        //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));
        /*Item barang = new Item(1, "ROG Strix RTX2080 Ti", 100, 15000000, ItemCategory.Electronics, ItemStatus.New, penyuplai);
        DatabaseItem.addItem(barang);
        Transaction.orderNewItem(barang);
        Transaction.sellItemPaid(barang);
        Transaction.sellItemUnpaid(barang);
        Transaction.sellItemInstallment(barang);*/
    }
}
