package jstore;
/**
 * Kelas Supplier
 *
 * @author (Goldy Tanjung Wijaya)
 * @version (7.0, 18 April 2019)
 */
public class Supplier
{
    //inisialisasi variable
    private int id=0;
    private String name,email,phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     * @param name for nama supplier
     * @param email for email supplier
     * @param phoneNumber for nomor phone supplier
     * @param location for link to class location
     */

    public Supplier(String name, String email, String phoneNumber, Location location)
    {
        //this.id=id;
        this.name=name;
        this.email=email;
        this.location=location;
        this.phoneNumber=phoneNumber;
        setId(DatabaseSupplier.getLastSupplierID()+1);
    }

     /**
   * This is accessor for get id
   * @return id
   */
    public int getId()
    {
        // initialise instance variables
        return id;
    }

     /**
   * This is accessor for get name
   * @return name
   */
    public  String getName()
    {
        // initialise instance variables
        return name;
    }

     /**
   * This is accessor for get email
   * @return email
   */
    public String getEmail()
    {
        // initialise instance variables
        return email;
    }

     /**
   * This is accessor for get phone number
   * @return phoneNumber
   */
    public String getPhoneNumber()
    {
        // initialise instance variables
        return phoneNumber;
    }

     /**
   * This is accessor for get location of supplier
   * @return location
   */
    public Location getLocation()
    {
        // initialise instance variables
        return location;
    }

     /**
   * This is mutator for set supplier's id
   * @param id
   * @return nothing
   */
     public void setId(int id)
    {
        this.id=id;

    }

     /**
   * This is mutator for set supplier's name
   * @param name
   * @return nothing
   */
    public void setName(String name)
    {
        this.name=name;
        
    }

    /**
   * This is mutator for set supplier's email
   * @param email
   * @return nothing
   */
    public void setEmail(String email)
    {
        this.email=email;
        
    }

    /**
   * This is mutator for set supplier's phone number
   * @param phoneNumber
   * @return nothing
   */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

/**
   * This is mutator for set supplier's location
   * @param location
   * @return nothing
   */
    public void setLocation(Location location)
    {
        this.location=location;
    }

    //this is for printing data
    // public void printData()
    // {
    //     System.out.println("===================Supplier===================");
    //     System.out.println("ID: "+id);
    //     System.out.println("Name: "+name);
    //     System.out.println("Email: "+email);
    //     System.out.println("Nomor Telefon: "+phoneNumber);
    //     System.out.println("Location: "+location);
    // }

    public String toString(){
      return "===================Supplier===================\nID: "+getId()    +
              "\nName: "+name+"\nEmail: "+email+"\nNomor Telefon: "+phoneNumber+
              "\nLocation: "+location.getCity();
    }

}
