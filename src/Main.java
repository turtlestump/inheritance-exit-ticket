/* Johnathan, Daniel */

// Class imports
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Create contact lists for each phone.
        ArrayList<String> livingRoomContacts = new ArrayList<>(Arrays.asList("Harry", "Isabel", "Jacob"));
        ArrayList<String> bedroomContacts = new ArrayList<>(Arrays.asList("Kate", "Liam", "Muriel"));
        ArrayList<String> cellPhoneContacts = new ArrayList<>(Arrays.asList("Neil", "Ophelia", "Polly"));

        // Create cell phone application lists
        ArrayList<String> cellPhoneApps = new ArrayList<>(Arrays.asList("Camera", "Messages", "Phone", "Settings", "Spotify"));

        // Create five phone objects and an ArrayList to hold them.
        Phone dummyPhone = new Phone();
        HomePhone livingRoomPhone = new HomePhone("(555) 123-4567", "Ring, Ring!", livingRoomContacts, "Conway Corp", "Panasonic",
                                                  "Traditional", true, true);
        HomePhone bedroomPhone = new HomePhone("(555) 890-1234", "Beep. Beep.", bedroomContacts, "Conway Corp", "Motorola",
                                               "VoIP", false, true);
        Smartphone cellPhone = new Smartphone("(555) 567-8901", "(Windchimes)", cellPhoneContacts, "AT&T", "Apple",
                                              98, 6.5, true, false, cellPhoneApps);
        Smartphone sidePhone = new Smartphone();

        ArrayList<Phone> phones = new ArrayList<>(Arrays.asList(dummyPhone, livingRoomPhone, bedroomPhone, cellPhone, sidePhone));

        // Print each phone's attributes.
        for (Phone p : phones) {

            System.out.println(p.toString() + "\n\n");

        }

    }

}
