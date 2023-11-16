package User_handling;
import Payment.*;
import ThirdParties.*;
import Bill.*;
import java.util.Scanner;

abstract class SigningInTemplate {

    User user;
    User_handling.InstaPayUsersManager manager;

    User getUser() {
        return user;
    }

    void setManager(InstaPayUsersManager manager) {
        this.manager = manager;
    }

    Boolean SignIn() {
        if (validateUser()) {
            loadProfile();
            return true;
        } else
            return false;
    }

    Boolean validateUser() {
        Scanner sc = new Scanner(System.in);
        String username, password;
        System.out.println("Please enter your username: ");
        username = sc.nextLine();
        System.out.println("Please enter your password: ");
        password = sc.nextLine();
        if (manager.checkCredentialsValidity(username, password)) {
            user = manager.getUser(username);
            return true;
        } else {
            System.out.println("Invalid Credentials.");
            return false;
        }
    }

    abstract void loadProfile();

}
