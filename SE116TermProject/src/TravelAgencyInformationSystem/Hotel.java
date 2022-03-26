package TravelAgencyInformationSystem;


public class Hotel extends Accommodation implements Printable{
    // the keyword "extends" is used for "INHERITANCE" ("IS-A relationship")
    // Remember that a subclass inherits all the members from its superclass.

    private boolean spa;         // extra data members
    private boolean sportsCenter;
    private int starNum;

    public Hotel(){
        super();
        this.spa = false;
        this.sportsCenter = false;
        this.starNum = 0;
    }
    public Hotel(String name, String date, double price, int room, String cityName, String holidayType, boolean pool, boolean spa, boolean sportsCenter, int starNum) {   // parameterized constructor
        super(name, date, price, room, cityName, holidayType, pool);    //call the parameterized constructor of the superclass
        this.spa = spa;
        this.sportsCenter = sportsCenter;
        this.starNum = starNum;
    }

    //extra set get methods:
    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isSportsCenter() {
        return sportsCenter;
    }

    public void setSportsCenter(boolean sportsCenter) {
        this.sportsCenter = sportsCenter;
    }

    public int getStarNum() {
        return starNum;
    }

    public void setStarNum(int starNum) {
        this.starNum = starNum;
    }
    @Override
    public void printAccommodation(){ // The method is not abstract in this subclass thus the method is complete here.
        System.out.println("----------HOTEL INFO------------");
    }
    @Override
    public void printInfo() {  // the method printInfo is overridden here
        super.printInfo();     // call the method printInfo of the superclass
        System.out.println("IS THERE A SPA: " + isSpa());
        System.out.println("IS THERE A SPORTS CENTER:  " + isSportsCenter());
        System.out.println("THE STAR NUMBER THAT THE HOTEL HAS: " + getStarNum());
        System.out.println();
    }
}

