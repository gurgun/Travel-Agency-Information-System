package TravelAgencyInformationSystem;

import java.util.Scanner;
public class Login {
    public boolean Log(Admin X){
        Scanner in = new Scanner((System.in));

        System.out.println("Enter User Name ");
        String newAdmin= in.nextLine();

        System.out.println("Enter Password ");
        String newPassword= in.nextLine();

        return X.getAdminName().equals(newAdmin) && X.getPassword().equals(newPassword);
    }
}
