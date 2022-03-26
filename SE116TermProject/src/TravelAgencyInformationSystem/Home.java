package TravelAgencyInformationSystem;


public class Home extends Accommodation implements Printable{
    // the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
    // Remember that a subclass inherits all the members from its superclass.

    private String heatingSystems;    // extra data members
    private String houseType;
    private int bathNo;
    private boolean kitchen;

    public Home(){
        super();
        this.heatingSystems = "Null";
        this.houseType = "Null";
        this.bathNo = 0;
        this.kitchen = false;
    }
    public Home(String name, String date, double price, int room, String cityName, String holidayType, boolean pool, String heatingSystems, String houseType, int bathNo, boolean kitchen) {  // parameterized constructor
        super(name, date, price, room, cityName, holidayType, pool);    //call the parameterized constructor of the superclass
        this.heatingSystems = heatingSystems;
        this.houseType = houseType;
        this.bathNo = bathNo;
        this.kitchen = kitchen;
    }

    // extra set get methods:
    public String getHeatingSystems() {
        return heatingSystems;
    }

    public void setHeatingSystems(String heatingSystems) {
        this.heatingSystems = heatingSystems;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getBathNo() {
        return bathNo;
    }

    public void setBathNo(int bathNo) {
        this.bathNo = bathNo;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }
    @Override
    public void printAccommodation(){// The method is not abstract in this subclass thus the method is complete here.
        System.out.println("----------HOME INFO------------");
    }
    @Override
    public void printInfo() {   // the method printInfo is overridden here
        super.printInfo();      // call the method printInfo of the superclass
        System.out.println("HEATING SYSTEMS: " + getHeatingSystems());
        System.out.println("HOUSE TYPE:  " + getHouseType());
        System.out.println("NUMBER OF BATHROOMS: " + getBathNo());
        System.out.println("IS THERE A KITCHEN: " + isKitchen());
        System.out.println();
    }
}
