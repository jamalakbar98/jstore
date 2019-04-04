/**
 * <h1>Location.java</h1>
 * <p>
 * Class ini merupakan bagian location dari JStore Application
 * Class ini representasi dari sebuah lokasi yang terdapat pada JStore Application
 * </p>
 *
 * @author (Jamaludin Akbar)
 * @version (1.0)
 * @since (2019/03/04)
 */
public class Location
{
    /**
     * Provinsi dari objek Location
     */
    private String province;
    
    /**
     * Deskripsi dari objek Location
     */
    private String description;
    
    /**
     * Kota dari objek Location
     */
    private String city;

    /**
     * Method Location merupakan Constructor dari class Location
     * @param province      Provinsi dari objek location
     * @param description   Deskripsi dari objek location
     * @param city          Kota dari objek location
     */
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    /**
    * Accessor Method untuk mengambil String Province dari objek Location
    * @return String Province dari objek Location
    */
    public String getProvince()
    {
        return province;
    }
    
    /**
    * Accessor Method untuk mengambil String City dari objek Location
    * @return String City dari objek Location
    */
    public String getCity()
    {
        return city;
    }
    
    /**
    * Accessor Method untuk mengambil String Description dari objek Location
    * @return String Description dari objek Location Object
    */
    public String getDescription()
    {
        return description;
    }
    
    /**
    * Mutator Method untuk mengubah provinsi dari objek Location
    * @param province String Province yang diinginkan
    */
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    /**
    * Mutator Method untuk mengubah City dari objek Location
    * @param City String City yang diinginkan
    */
    public void setCity(String city)
    {
        this.city=city;
    }

    /**
    * Mutator Method untuk mengubah Description dari objek Location
    * @param description String Description yang diinginkan
    */
    public void setDescription(String Description)
    {
        this.description=description;
    }
    
    /**
    * Method untuk melakukan Print Data dari Object Location (province)
    */
    public String toString(){
        return "========LOCATION========\nprovinsi:"+province+"\nkota:"+city+"\ndeskripsi:"+description;
    }
}
