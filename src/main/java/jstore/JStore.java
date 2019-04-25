package jstore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.xml.crypto.Data;
import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Kelas Jstore untuk menjalankan program
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */
@SpringBootApplication
public class JStore
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
        // initialise instance variables
       
    }
    public static void main(String[] args) {
        SpringApplication.run(JStore.class, args);




        /*Location lokasi = new Location("Jakarta","Kelapa Gading","Jakarta Utara");

        try {
            DatabaseSupplier.addSupplier(new Supplier("burhan","burhan@gmail.com","989877876",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("gattuso","gatusbolk@gmail.com","989009076",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("suso","susoh@gmail.com","098989886",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("suso","susoh@gmail.com","098989886",lokasi));

        }
        catch (SupplierAlreadyExistsException e) {
            System.out.println("========Supplier Already Exists ============");
            System.out.println(e.getExMessage());
        }

        System.out.println();

        try {
            DatabaseCustomer.addCustomer(new Customer("Goldy","goldy@gmail.com","goldyTW","hahaha",1997,05,12));
            DatabaseCustomer.addCustomer(new Customer("Tanjung","Ee_td@ui.ac.id","tanjoeng","hihihi",1997,05,13));
            DatabaseCustomer.addCustomer(new Customer("Wijaya","goldy.modul6@netlab.com","wiijaayaa","huhuhu",1997,05,4));
            DatabaseCustomer.addCustomer(new Customer("Wijaya","goldy.modul6@netlab.com","wiijaayaa","huhuhu",1997,05,4));

        } catch (CustomerAlreadyExistsException e) {
            System.out.println("========Customer Already Exists ============");
            System.out.println(e.getExMessage());
        }

        System.out.println();

        try {
            DatabaseItem.addItem(new Item("Handphone",100000,ItemCategory.Electronics,DatabaseSupplier.getSupplier(1),ItemStatus.New));
            DatabaseItem.addItem(new Item("Laptop",200000,ItemCategory.Electronics,DatabaseSupplier.getSupplier(2),ItemStatus.New));
            DatabaseItem.addItem(new Item("Sofa",300000,ItemCategory.Furniture,DatabaseSupplier.getSupplier(3),ItemStatus.New));
            DatabaseItem.addItem(new Item("Sofa",300000,ItemCategory.Furniture,DatabaseSupplier.getSupplier(3),ItemStatus.New));

        }catch (ItemAlreadyExistsException e) {
            System.out.println("========Item Already Exists ============");
            System.out.println(e.getExMessage());
        }

        System.out.println();

        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(x,DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Paid(x,DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Installment(x,10,DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println("========Invoice Already Exists ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseInvoice.removeInvoice(9);
        } catch (InvoiceNotFoundException e) {
            System.out.println("======== Invoice Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseCustomer.removeCustomer(5);
        } catch (CustomerNotFoundException e) {
            System.out.println("======== Customer Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseSupplier.removeSupplier(5);
        } catch (SupplierNotFoundException e) {
            System.out.println("======== Supplier Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.removeItem(9);
        } catch (ItemNotFoundException e) {
            System.out.println("======== Item Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseInvoice.getActiveOrderCustomer(DatabaseCustomer.getCustomer(3));
        } catch (CustomerDoesntHaveActiveInvoiceException e) {
            System.out.println("======== Don't Have Active ============");
            System.out.println(e.getExMessage());
        }
//         Transaction tranzakzi = new Transaction();
//        tranzakzi.finishTransaction(DatabaseInvoice.getInvoice(2));

        ArrayList<Item> tempBrg = DatabaseItem.getItemDatabase();
        for(Item temp: tempBrg){
            System.out.println(temp.toString());
        }

        ArrayList<Supplier> supplier_temp = DatabaseSupplier.getSupplierDatabase();
        for(Supplier temp: supplier_temp){
            System.out.println(temp.toString());
        }

        ArrayList<Customer> sementaraCustomer = DatabaseCustomer.getCustomerDatabase();
        for(Customer sementara: sementaraCustomer){
            System.out.println(sementara.toString());
        }

        ArrayList<Invoice> tempinv = DatabaseInvoice.getInvoiceDatabase();
        System.out.println(tempinv);
//        for(Invoice inv: tempinv){
//            System.out.println(inv);
//        }

        System.out.println();
        System.out.println();

        //DatabaseInvoice.addInvoice(new Sell_Unpaid(x,DatabaseCustomer.getCustomer(1)));

//        tranzakzi.cancelTransaction(DatabaseInvoice.getInvoice(2));
//        ArrayList<Invoice> tempinv1 = DatabaseInvoice.getInvoiceDatabase();
//        for(Invoice inv1: tempinv1){
//            System.out.println(inv1);
//        }

         //================modul 5 ======================
         // System.out.println("----------nomor 4----------");
         // gg.setEmail("e.t.d@");
         // kk.setEmail("Ee_td@ui.ac.id");
         // jj.setEmail("goldy.modul5@netlab.com");
         // System.out.println("----------nomor 5----------");
         // gg.setPassword("Netlab2019");
         // kk.setPassword("Netlab");
         // jj.setPassword("netlab2019");

         // System.out.printf("Birth Date: %1$td %1$tB %1$tY\n",gg.getBirthDate());
         // SimpleDateFormat fromat = new SimpleDateFormat("dd MMMM yyyy");
         // System.out.println("Birth date: "+ fromat.format(gg.getBirthDate().getTime()));
//
//         //DatabaseItem.addItem(barang);
//         // DatabaseItem.addItem(barang2);
//
//         Buy_Paid bp = new Buy_Paid(1,barang,23);
//         Sell_Unpaid su = new Sell_Unpaid(4,barang,50,gg);
//         Sell_Paid sp = new Sell_Paid(8,barang2,50,wp);
//         Sell_Installment si = new Sell_Installment(5, barang1, 20,30, gg);
         // System.out.println(lokasi.toString()+"\n");
         // System.out.println(su);
         // System.out.println(si.toString());
         // System.out.println(bp.toString());
         // System.out.println(sp.toString());

         //================modul sebelum 5 ======================
            
        //sama aja
         // tranzakzi.orderNewItem(barang);

        // System.out.println("======================Order New Item======================");
        // tranzakzi.orderNewItem(suplai);

        // System.out.println("======================Order Second Item======================");
        // tranzakzi.orderSecondItem(suplai);

        // System.out.println("======================Order Refurbished Item======================");
        // tranzakzi.orderRefurbishedItem(suplai);
        
        // System.out.println("======================Sell Item Paid======================");
        // tranzakzi.sellItemPaid(DatabaseItem.getItem());

        // System.out.println("======================Sell Item Unpaid======================");
        // tranzakzi.sellItemUnpaid(DatabaseItem.getItem());

        // System.out.println("======================Sell Item Installment======================");
        // tranzakzi.sellItemInstallment(DatabaseItem.getItem());
         
         // InvoiceType i1 = InvoiceType.Buy;
         // InvoiceType i2 = InvoiceType.Sell;
         // System.out.println(i1.toString());
         // System.out.println(i2.toString());*/
    }

}
  
