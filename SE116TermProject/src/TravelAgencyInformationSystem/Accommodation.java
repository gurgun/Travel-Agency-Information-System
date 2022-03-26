package TravelAgencyInformationSystem;


// abstract superclass Accommodation
public abstract class Accommodation implements Printable{
    private String name;    // data members
    private String date;
    private double price;
    private int room;
    private String cityName;
    private String holidayType;
    private boolean pool;

    public Accommodation(){
        // non-parameterized constructor
        this.name= "Null";
        this.date="Null";
        this.price = 0.0;
        this.room = 0;
        this.cityName = "Null";
        this.holidayType = "Null";
        this.pool = false;
    }
    public Accommodation(String name, String date, double price, int room, String cityName, String holidayType, boolean pool) {
        // parameterized constructor
        this.name = name;
        this.date = date;
        this.price = price;
        this.room = room;
        this.cityName = cityName;
        this.holidayType = holidayType;
        this.pool = pool;
    }

    //set get methods:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }
    public abstract void printAccommodation();  // abstract method
    public void printInfo() {
        System.out.println();
        printAccommodation();
        System.out.println("NAME: " + getName());
        System.out.println("DATE:  " + getDate());
        System.out.println("PRICE: " + getPrice());
        System.out.println("ROOMS: " + getRoom());
        System.out.println("CITY NAME: " + getCityName());
        System.out.println("HOLIDAY TYPE: " + getHolidayType());
        System.out.println("POOL: " + isPool());
    }
}

