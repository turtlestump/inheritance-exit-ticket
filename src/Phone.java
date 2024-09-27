// Class imports
import java.util.ArrayList;
import java.util.Arrays;

public class Phone {

    // Attributes
    private String phoneNumber;
    private String ringtone;
    private ArrayList<String> contactNames;
    private String provider;
    private String brand;

    // Constructors
    Phone () {

        phoneNumber = "(555) 555-5555";
        ringtone = "Ring, Ring!";
        contactNames = new ArrayList<>(Arrays.asList("Daniel", "Johnathan", "Jon"));
        provider = "Local Provider";
        brand = "Local Brand";

    }
    Phone (String phoneNumber, String ringtone, ArrayList<String> contacts, String provider, String brand) {

        this.phoneNumber = phoneNumber;
        this.ringtone = ringtone;
        this.contactNames = contacts;
        this.provider = provider;
        this.brand = brand;

    }

    // Accessors
    public String getPhoneNumber() {

        return phoneNumber;

    }
    public String getRingtone() {

        return ringtone;

    }
    public ArrayList<String> getContactNames() {

        return contactNames;

    }
    public String getProvider() {

        return provider;

    }
    public String getBrand() {

        return brand;

    }

    // Mutators
    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }
    public void setRingtone(String ringtone) {

        this.ringtone = ringtone;

    }
    public void setContactNames(ArrayList<String> contactNames) {

        this.contactNames = contactNames;

    }
    public void setProvider(String provider) {

        this.provider = provider;

    }
    public void setBrand(String brand) {

        this.brand = brand;

    }

    // toString implementation
    public String toString() {

        return "Brand: " + brand + "\n" +
               "Number: " + phoneNumber + "\n" +
               "Service Provider: " + provider + "\n" +
               "Ringtone: " + ringtone + "\n" +
               "Contact List: " + String.join(", ", contactNames);

    }

}
