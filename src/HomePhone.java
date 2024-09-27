// Class imports
import java.util.ArrayList;

public class HomePhone extends Phone {

    // Attributes
    private String lineType;
    private boolean buttons;
    private boolean cord;

    // Constructors
    public HomePhone() {

        super();
        lineType = "Traditional";
        buttons = false;
        cord = true;

    }
    public HomePhone(String phoneNumber, String ringtone, ArrayList<String> contactNames, String provider, String Brand,
                     String lineType, boolean buttons, boolean cord) {

        super(phoneNumber, ringtone, contactNames, provider, Brand);
        this.lineType = lineType;
        this.buttons = buttons;
        this.cord = cord;

    }

    // Accessors
    public String getLineType() {

        return lineType;

    }
    public boolean hasButtons() {

        return buttons;

    }
    public boolean isCorded() {

        return cord;

    }

    // Mutators
    public void setLineType(String lineType) {

        this.lineType = lineType;

    }
    public void setButtons(boolean buttons) {

        this.buttons = buttons;

    }
    public void setCord(boolean cord) {

        this.cord = cord;

    }

    // toString implementation
    public String toString() {

        return super.toString() +
               "Line Type: " + lineType + "\n" +
               "Dialing Method: " + ((buttons) ? "Buttons" : "Dial") + "\n" +
               "Cord: " + ((cord) ? "Yes" : "No");

    }

}