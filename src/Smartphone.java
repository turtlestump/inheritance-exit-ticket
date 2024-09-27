// Class imports
import java.util.ArrayList;
import java.util.Arrays;

public class Smartphone extends Phone {

    // Attributes
    private int battery;
    private double screenSize;
    private boolean service;
    private boolean flip;
    private ArrayList<String> applications;

    // Constructors
    public Smartphone() {

        super();
        battery = 100;
        screenSize = 4;
        service = true;
        flip = false;
        applications = new ArrayList<>(Arrays.asList("Camera", "Phone", "Settings"));

    }
    public Smartphone(String phoneNumber, String ringtone, ArrayList<String> contactNames, String provider, String Brand,
                      int battery, double screenSize, boolean service, boolean flip, ArrayList<String> applications) {

        super(phoneNumber, ringtone, contactNames, provider, Brand);
        this.battery = battery;
        this.screenSize = screenSize;
        this.service = service;
        this.flip = flip;
        this.applications = applications;

    }

    // Accessors
    public int getBattery() {

        return battery;

    }
    public double getScreenSize() {

        return screenSize;

    }
    public boolean hasService() {

        return service;

    }
    public boolean isFlip() {

        return flip;

    }
    public ArrayList<String> getApplications() {

        return applications;

    }

    // Mutators
    public void setBattery(int battery) {

        this.battery = battery;

    }
    public void setScreenSize(int screenSize) {

        this.screenSize = screenSize;

    }
    public void setService(boolean hasService) {

        this.service = hasService;

    }
    public void setFlip(boolean flip) {

        this.flip = flip;

    }
    public void setApplications(ArrayList<String> applications) {

        this.applications = applications;

    }

    // toString implementation
    public String toString() {

        return super.toString() +
               "Battery: " + battery + "%\n" +
               "Screen Size: " + screenSize + "\"\n" +
               "Service: " + ((service) ? "Yes" : "No") + "\n" +
               "Form: " + ((flip) ? "Flip-Phone" : "Flat Phone") + "\n" +
               "Applications: " + String.join(", ", applications);

    }

}
