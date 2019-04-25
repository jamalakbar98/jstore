package jstore;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Write a description of class Invoice here.
 *
 * @author (name)
 * @version (version)
 */
public class Customer
{
    private String name, email, username, password;
    private int id;
    private Calendar birthDate;
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Customer
     * @param name string
     * @param email string
     * @param username string
     * @param password string
     * @param birthDate Calendar
     */
    public Customer(String name, String email, String username, String password, Calendar birthDate)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.birthDate=birthDate;
    }

    /**
     * Constructor for objects of class Customer
     * @param name string
     * @param email string
     * @param username string
     * @param password string
     * @param year int
     * @param month int
     * @param dayOfMonth int
     */
    public Customer(String name, String email, String username, String password, int year, int month, int dayOfMonth)
    {
        // initialise instance variables
        this.name=name;
        this.email=email;
        this.username=username;
        this.password=password;
        this.birthDate= new GregorianCalendar(year,month-1,dayOfMonth);
        setId(DatabaseCustomer.getLastCustomerID()+1);
    }

     /**
     * accessor for get name
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * accessor for get email
     * @return email
     */
    public String getEmail(){
        return email;
    }

    /**
     * accessor for get username
     * @return username
     */
     public String getUsername(){
        return username;
     }

    /**
     * accessor for get password
     * @return password
     */
     public String getPassword(){
        return password;
    }

    /**
     * accessor for get id
     * @return id
     */
     public int getId(){
        return id;
    }

    /**
     * accessor for get birthdate
     * @return birthdate
     */
     public Calendar getBirthDate(){
        return birthDate;
    }

    /**
     * mutator for set customer name
     * @param name string
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * mutator for set customer email
     * @param email string
     */
    public void setEmail(String email){
        Pattern pet = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +  
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +  "A-Z]{2,7}$");
        Matcher metch = pet.matcher(email);

        if (metch.find()){
            System.out.println("email benar");
            this.email=email;
        }
        else{
            System.out.println("email null");
            this.email=null;
        }
    }

    /**
     * mutator for set username
     * @param username string
     */
    public void setUsername(String username){
        this.username=username;
    }

    /**
     * mutator for set customer's password
     * @param password string
     */
    public void setPassword(String password){
        Pattern pet = Pattern.compile( "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$");
        Matcher metch = pet.matcher(password);

        if (metch.find()){
            System.out.println("password benar");
            this.password=password;
        }
        else{
            System.out.println("password null");
            this.password=null;
        }
            
    }

    /**
     * mutator for set customer id
     * @param id int
     */
    public void setId(int id){
        this.id=id;
    }

    /**
     * mutator for set customer birthdate
     * @param birthDate calendar
     */
    public void setBirthDate(Calendar birthDate){
        this.birthDate=birthDate;
    }

    /**
     * mutator for set customer birtdate - another way
     * @param year int
     * @param month int
     * @param dayOfMonth int
     */
    public void setBirthDate(int year, int month, int dayOfMonth){
        this.birthDate= new GregorianCalendar(year,month,dayOfMonth);
    }

    /**
     * toString method
     * @return  string
     */
    public String toString(){
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd MMM yyyy");
        String diprint;
        diprint="\n=========Customer========" +
                                "\nid: "+id+
                "\nNama: "+name+"\nEmail: "+email+
                                "\nusername: "+username+"\npassword: "+password+
                                "\nbirthDate: "+ sdf.format(getBirthDate().getTime());
        return diprint;
    }
}
