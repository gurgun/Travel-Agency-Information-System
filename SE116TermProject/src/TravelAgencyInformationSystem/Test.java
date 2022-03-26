package TravelAgencyInformationSystem;


import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // A Scanner object is created using parameterized constructor

        ArrayList<Hotel> hotels = new ArrayList<>();   // An ArrayList of Hotel is created using default constructor
        ArrayList<Home> homes = new ArrayList<>();
        ArrayList<Advices> advices = new ArrayList<>();

        Admin AdminUser = new Admin();
        AdminUser.setAdmin("admin");
        AdminUser.setPassword("123");
        Login L = new Login();

        // initialized with constant argument values:
        Hotel hotel1 = new Hotel("Hotel 1", "October 1st-17th", 100, 60, "Bursa", "winter holiday", true, true, true, 5);
        Hotel hotel2 = new Hotel("Hotel 2", "December 1st-17th", 200, 90, "Kars", "winter holiday", false, false, true, 4);
        Hotel hotel3 = new Hotel("Hotel 3", "July 1st-17th", 500, 50, "İzmir", "summer holiday", true, true, true, 5);
        hotels.add(hotel1);    // the Hotel reference "hotel1" is added into ArrayList<> object "hotels"
        hotels.add(hotel2);
        hotels.add(hotel3);

        // initialized with constant argument values:
        Home home1 = new Home("House 1","May 2nd-10th",300,5,"İzmir","spring holiday",true,"kalorifer","villa",3,true );
        Home home2 = new Home("House 2","November 8th-20th",250,3,"Rize","winter holiday",false,"kalorifer","daire",2,true );
        Home home3 = new Home("House 3","June 2nd-July 2nd",370,43,"Antalya","summer holiday",false,"klima","dublex daire",2,true );
        homes.add(home1);     // the Home reference "house1" is added into ArrayList<> object "homes"
        homes.add(home2);
        homes.add(home3);

        int choice=10;
        int option=10;
        int AdminOrCustomer=10;

        while (true) {
            System.out.println("Welcome to Hotel Information System! ");
            System.out.println("Are you an Admin or a Customer? \n"
                    + "Admin = press 0\n"
                    + "Customer = press 1\n"
                    + "to finish the program, press -1");
            boolean loopCondition = true;
            do {
                try {    // using try catch method for the program to run even when the user doesn't type a number
                    AdminOrCustomer = Integer.parseInt(input.nextLine());
                    loopCondition = false;
                } catch (Exception e) {
                    System.err.println("Exception..."+ e.getMessage());
                    System.err.println("Please enter a number... Press 0, 1 or -1 ...");
                }
            } while(loopCondition);
            while (AdminOrCustomer != 0 && AdminOrCustomer != 1 && AdminOrCustomer != -1) {
                System.out.println("invalid number");
                System.out.println("if you are a customer, please press 1\n" +
                        "if you are an admin, please press 0 ");
                do {
                    try {    // using try catch method for the program to run even when the user doesn't type a number
                        AdminOrCustomer = Integer.parseInt(input.nextLine());
                        loopCondition = false;
                    } catch (Exception e) {
                        System.err.println("Please enter a number... Press 0, 1 or -1 ...");
                    }
                } while(loopCondition);

            }
            if (AdminOrCustomer == -1) {//finishing the program
                break;
            }
            else if (AdminOrCustomer == 0) {
                while (!L.Log(AdminUser)) {
                    System.out.println("incorrect username or password!");
                }
                System.out.println("You've successfully entered. ");
                while (true) {
                    displayAdminMenu();
                    boolean loop = true;
                    do {     // using try catch method for the program to run even when the user doesn't type a number
                        try {
                            option = Integer.parseInt(input.nextLine());
                            loop = false;
                        } catch (Exception e) {
                            System.err.println("Exception..."+ e.getMessage());
                            System.err.println("Please enter a number..Press 0, 1, 2, 3, 4, 5, 6 or 7");
                        }
                    } while (loop);

                    if (option == 0) {
                        return;
                    } else if (option == 1) {
                        //Filling the information for a Hotel object
                        System.out.println("Enter new hotel's name");
                        String newHotelName = input.nextLine();

                        System.out.println("Enter new available hotel date");
                        String newDate = input.nextLine();

                        System.out.println("Enter new hotel's price");
                        double newPrice = input.nextDouble();

                        System.out.println("Enter new room number");
                        int newHRoom = input.nextInt();

                        System.out.println("Enter new city name");
                        input.nextLine();
                        String newCityName = input.nextLine();

                        System.out.println("Enter new holiday type");
                        String newHolidayType = input.nextLine();

                        System.out.println("Enter true if there is a pool or enter false if not");
                        boolean newPool = input.nextBoolean();
                        System.out.println("Enter true if there is a spa or enter false if there is not");
                        boolean newSpa = input.nextBoolean();
                        System.out.println("Enter true if there is a Sports Center or enter false if not");
                        boolean newSport = input.nextBoolean();
                        System.out.println("Enter hotel's star number");
                        int newStar = input.nextInt();
                        input.nextLine();

                        Hotel newHotel = new Hotel(newHotelName, newDate, newPrice, newHRoom, newCityName, newHolidayType,newPool, newSpa, newSport, newStar);
                        hotels.add(newHotel); // Using add method, a new hotel is added into the list

                        newHotel.printInfo();

                    } else if (option == 2) {
                        Home newHome = new Home("null","null",0.0,0,"null","null",false,"null","null",0,false);

                        //Filling the information for a Home object
                        System.out.println("Enter new house's name");
                        String newHotelName = input.nextLine();

                        System.out.println("Enter new available house date");
                        String newDate = input.nextLine();

                        System.out.println("Enter new house's price");
                        double newPrice = input.nextDouble();

                        System.out.println("Enter the room number of the house");
                        int newHRoom = input.nextInt();

                        System.out.println("Enter new city name");
                        input.nextLine();
                        String newCityName = input.nextLine();

                        System.out.println("Enter new holiday type");
                        String newHolidayType = input.nextLine();

                        System.out.println("Enter true if there is a pool or enter false if not");
                        boolean newPool = input.nextBoolean();

                        System.out.println("which heating systems does the house has");
                        input.nextLine();
                        String newHeatingS = input.nextLine();

                        System.out.println("Enter the house type");
                        String newHouseT = input.nextLine();

                        System.out.println("Enter the number of bathrooms");
                        int newBath = input.nextInt();

                        System.out.println("Enter true if there is a kitchen or enter false if not");
                        boolean newKitchen = input.nextBoolean();
                        input.nextLine();

                        newHome.setName(newHotelName); //setting the name of the new hotel from the info that the admin entered
                        newHome.setDate(newDate);
                        newHome.setPrice(newPrice);
                        newHome.setRoom(newHRoom);
                        newHome.setCityName(newCityName);
                        newHome.setHolidayType(newHolidayType);
                        newHome.setPool(newPool);
                        newHome.setHeatingSystems(newHeatingS);
                        newHome.setHouseType(newHouseT);
                        newHome.setBathNo(newBath);
                        newHome.setKitchen(newKitchen);

                        homes.add(newHome);// Using add method, a new home is added into the list

                        newHome.printInfo();

                    } else if (option == 3) {
                        if (hotels.size() == 0) {// checking if there is any hotel in the list
                            System.out.println("There is no hotel to delete");
                        } else {
                            System.out.println("Please enter the hotel number ( either 1 to " + hotels.size() +
                                    " ) which you want to delete: ");
                            int hotelNum = input.nextInt();
                            while (hotelNum < 1 || hotelNum > hotels.size()) {//the program will ask again till the correct number is entered
                                System.out.println("Please enter a valid hotel number");
                                hotelNum = input.nextInt();
                            }
                            hotels.remove(hotelNum - 1);//deleting the hotel

                            System.out.print("Last Situation of the Hotels: ");
                            System.out.println();
                            for (int i = 0; i <= hotels.size() - 1; i++) {// printing the info of all the hotels in the list
                                hotels.get(i).printInfo();
                            }
                            input.nextLine();
                        }
                    } else if (option == 4) {
                        if (homes.size() == 0) {// checking if there is any house in the list
                            System.out.println("There is no house to delete");
                        } else {
                            System.out.println("Please enter the house number ( either 1 to " + homes.size() +
                                    " ) which you want to delete: ");
                            int homeNum = input.nextInt();
                            while (homeNum < 1 || homeNum > homes.size()) {
                                System.out.println("Please enter a valid house number");
                                homeNum = input.nextInt();
                            }
                            homes.remove(homeNum - 1);//deleting the house

                            System.out.print("Last Situation of the Houses: ");
                            System.out.println();
                            for (int i = 0; i <= homes.size() - 1; i++) {// printing the info of all the homes in the list
                                homes.get(i).printInfo();
                            }
                            input.nextLine();
                        }
                    } else if (option == 5) {//changing user name and password
                        System.out.println("Please enter a new user name:");
                        String newUser = input.nextLine();

                        System.out.println("Please enter a new password:");
                        String newPass = input.nextLine();

                        AdminUser.setAdmin(newUser);
                        AdminUser.setPassword(newPass);

                        System.out.println("New user name:" + newUser + "\tNew password:" + newPass);
                    } else if (option == 6) {//read the customers advices part
                        if (advices.size() == 0) {//checking if there is any advice in the list
                            System.out.println("There isn't any advice. ");
                        } else {
                            for (int i = 0; i <= (advices.size() - 1); i++) {// printing all advices in the list
                                System.out.println("Subject:\t\t" + (advices.get(i)).getSubject() +
                                        "\nExplaining:\t\t" + (advices.get(i)).getExplaining() + "\n");
                            }
                        }
                    } else if (option == 7) {
                        break;
                    } else {
                        System.out.println("Invalid number!");
                    }
                }//end of while loop which is for the admin part
            }// end of admin part
            else {
                while (true) {
                    displayCustomerMenu();
                    boolean loop = true;
                    do {//for exception
                        try { // using try catch method for the program to run even when the user doesn't type a number
                            choice = Integer.parseInt(input.nextLine());
                            loop = false;
                        } catch (Exception e) {
                            System.err.println("Exception..."+ e.getMessage());
                            System.err.println("Please enter a number..Press 1, 2, 3, 4, 5 or 6");
                        }
                    } while (loop);
                    if (choice == 1) {//printing every hotel in the list
                        for (int i = 0; i <= hotels.size() - 1; i++) {
                            hotels.get(i).printInfo();
                        }
                    } else if (choice == 2) {//printing every house in the list
                        for (int i = 0; i <= homes.size() - 1; i++) {
                            homes.get(i).printInfo();
                        }
                    } else if (choice == 3) {
                        System.out.println("Please enter the hotel number which you want to reserve : ");
                        double cost;
                        double money;
                        int hotelNum = input.nextInt();
                        while (hotelNum < 1 || hotelNum > hotels.size()) {//the program will ask again till the correct number is entered
                            System.out.println("Invalid hotel number.Please enter a valid hotel number.");
                            hotelNum = input.nextInt();
                        }
                        cost = (hotels.get(hotelNum - 1)).getPrice();
                        System.out.println("Enter amount of money which you pay: ");
                        money = input.nextDouble();
                        input.nextLine();
                        if (cost > money) {
                            System.out.println("You don't have enough money to reserve this hotel.");
                        } else {
                            System.out.println("Your change is " + (money - cost) + " euro ");
                        }
                    } else if (choice == 4) {
                        System.out.println("Please enter the home number which you want to reserve : ");
                        double cost;
                        double money;
                        int homeNum = input.nextInt();
                        while (homeNum < 1 || homeNum > homes.size()) {
                            System.out.println("Invalid home number.Please enter a valid home number.");
                            homeNum = input.nextInt();
                        }
                        cost = (homes.get(homeNum - 1)).getPrice();
                        System.out.println("Enter amount of money which you pay: ");
                        money = input.nextDouble();
                        input.nextLine();
                        if (cost > money) {
                            System.out.println("You don't have enough money to reserve this home.");
                        } else {
                            System.out.println("Your change is " + (money - cost) + " euro ");
                        }
                    }
                    else if(choice==5){//entering advice
                        Advices comment = new Advices();// non-parameterized constructor of class Advices is called

                        comment.setSubject(" ");
                        comment.setExplaining(" ");

                        System.out.println("Please enter the advice subject.");
                        String subject = input.nextLine();
                        System.out.println("Please enter your advices or complains.");
                        String explaining = input.nextLine();

                        comment.setSubject(subject);
                        comment.setExplaining(explaining);
                        advices.add(comment);
                    }
                    else if(choice==6){
                        break;     //breaking the loop for the costumer part to go back to the main menu
                    }
                    else if(choice==0){
                        System.exit(0); // the method exit() makes the program immediately quit
                    }
                    else{
                        System.out.println("Invalid Option");
                    }
                }//end of while loop which is for the costumer part
            }// end of costumer part
        }// end of while loop
    }
    public static void displayCustomerMenu () {// The method displayCustomerMenu is static because the static method main will call it
        System.out.println("Welcome Again");
        System.out.println("1. Information about hotel options.\n" +
                "2. Information about home options.\n"+
                "3. Calculate the change of the hotel reservation.\n" +
                "4. Calculate the change of the home reservation.\n"+
                "5. Would you like to give any advice?\n" +
                "6. Back to the main menu.\n" +
                "0. Finish the program ");
        System.out.println("--------------------------------");
        System.out.println("Choose an option (enter the option's number)");
    }
    public static void displayAdminMenu(){// The method displayAdminMenu is static because the static method main will call it
        System.out.println("0) Finish the program.\n" +
                "1) Enter a new hotel\n" +
                "2) Enter a new home\n" +
                "3) Delete a hotel\n" +
                "4) Delete a home\n" +
                "5) Change entry name or password\n" +
                "6) Read the customers advices\n" +
                "7) Back to the main menu");
        System.out.println("--------------------------------");
        System.out.println("Choose an option (enter the option's number)");
    }
}
