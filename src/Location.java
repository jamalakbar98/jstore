
/**
 * Kelas digunakan sebagai informasi lokasi
 *
 * @author Muhamad Luthfi Mufadel
 * @version 10/4/2019
 */
public class Location
{
    //variabel yang dipakai
    private String province;
    private String description;
    private String city;

    //Konstruktor dari kelas Supplier
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    //Menampilkan nama provinsi
    /**
     * Method getProvince()
     * @return province
     */
    public String getProvince()
    {
        return province;
    }
    
    //Menampilkan nama kota
    /**
     * Method getCity()
     * @return city
     */
    public String getCity()
    {
        return city;
    }
    
    //Menampilkan deskripsi lokasi
    /**
     * Method getDescription()
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    
    //Mengganti nama provinsi
    /**
     * Method setProvince()
     * @param province
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    //Mengganti nama kota
    /**
     * Method setCity()
     * @param city
     */
    public void setCity(String city)
    {
        this.city=city;
    }
    
    //Mengganti deskripsi lokasi
    /**
     * Method setDescription()
     * @param description
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    //Mencetak nama provinsi
    /**
     * Method printData()
     */
    public String toString()
    {
        return "========LOCATION========"+
        "\nprovinsi:"+province+
        "\nkota:"+city+
        "\ndeskripsi:"+description;
    }
}
