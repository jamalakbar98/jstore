
/**
 * <h1>Supplier.java</h1>
 * <p>
 * Class ini merupakan bagian supplier dari JStore Application
 * Class ini representasi dari sebuah supplier yang terdapat pada JStore Application
 * </p>
 * 
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Supplier
{
    /**
     * ID dari objek Supplier
     */
    private int id;
    
    /**
     * Nama dari objek Supplier
     */
    private String name;
    
    /**
     * Alamat email dari objek Supplier
     */
    private String email;
    
    /**
     * Nomor telepon dari objek Supplier
     */
    private String phoneNumber;
    
    /**
     * Lokasi dari objek Supplier
     */
    private Location location;

    /**
     * Method Supplier merupakan Constructor dari Class Supplier
     * @param id            ID dari objek Supplier
     * @param name          Nama dari objek Supplier
     * @param email         Alamat email dari objek Supplier
     * @param phoneNumber   Nomor Telepon dari objek Supplier
     * @param location      Lokasi dari objek Supplier
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    
    /**
     * Accessor Method untuk mengambil nilai ID dari objek Supplier
     * @return Nilai ID dari objek Supplier
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Accessor Method untuk mengambil String nama dari objek Supplier
     * @return String nama dari objek Supplier
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor Method untuk mengambil String alamat email dari objek Supplier
     * @return String email dari objek Supplier
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Accessor Method untuk mengambil String nomor telepon dari objek Supplier
     * @return String PhoneNumber dari objek Supplier
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Accessor Method untuk mengambil lokasi dari objek Supplier
     * @return Location dari objek Supplier
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Supplier
    * @param id Nilai ID yang diinginkan
    */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Mutator Method untuk mengubah nama dari objek Supplier
     * @param name String name yang diinginkan
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
    * Mutator Method untuk mengubah Email dari objek Supplier
    * @param email String Email yang diinginkan
    */
    public void setEmail(String email){
        this.email=email;
    }
    
    /**
     * Mutator Method untuk mengubah nomor telepon dari objek supplier
     * @param phoneNumber String PhoneNumber yang diinginkan
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    /**
    * Mutator Method untuk mengubah Location dari objek Supplier
    * @param location Location yang diinginkan
    */
    public void setLocation(Location location)
    {
       this.location=location;
    }
    
    /**
    * Method untuk melakukan Print Data dari Object Supplier (name)
    */
    public String toString(){
        return "========SUPPLIER=========\nID: "+id+"nama: "+"\nnama: "+name+"\nemail: "+email+"\nnomor telepon: "+phoneNumber+"\nlokasi: "+location.getCity()+", "+location.getProvince();
    }
}
