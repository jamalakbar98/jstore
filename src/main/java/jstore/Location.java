package jstore;
/**
 * Write a description of class Location here.
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (2.0 28 Februari 2019)
 */
public class Location
{
     //inisialisasi variable
    private String province, description, city;

    /**
     * Constructor for objects of class Location
     * @param province for provinsi
     * @param description for deskripsi
     * @param city for kota
     */
    public Location(String province, String description, String city)
    {
        this.province=province;
        this.description=description;
        this.city=city;
    }

    

    /**
   * This is accessor for get Province name
   * @return province.
   */
    public String getProvince()
    {
        return province;
    }

    /**
   * This is accessor for get description
   * @return description.
   */
    public String getDescription()
    {
        return description;
    }

    /**
   * This is accessor for get city name
   * @return city.
   */
    public String getCity()
    {
        return city;
    }

     /**
   * This is mutator for set Province name
   * @param province
   * @return nothing
   */
    public void setProvince(String province)
    {
        this.province=province;
    }

    /**
   * This is mutator for set description
   * @param description
   * @return nothing
   */
    public void setDescription(String description)
    {   
        this.description=description;
    }

    /**
   * This is mutator for set city name
   * @param city
   * @return nothing
   */
    public void setCity(String city)
    {
        this.city=city;
    }

    //this is for printing province data
    // public void printData()
    // {
    //     System.out.println("===================LOCATION===================");
    //     System.out.println("Province: "+province);
    //     System.out.println("City: "+city);
    //     System.out.println("Description: "+description);
    // }
    public String toString(){
      return "================LOCATION==========\nProvince: "+province+"\nCity: "+city+"\nDescription: "+description;
    }

}
