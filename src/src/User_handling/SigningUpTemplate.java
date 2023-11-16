package User_handling;
import Payment.*;
import ThirdParties.*;
import Bill.*;
import java.util.Scanner;

abstract class SigningUpTemplate {
    protected User user;
    protected OTPverification verification;
    protected User_handling.InstaPayUsersManager manager;

    User getUser() {
        return user;
    }

    void setManager(InstaPayUsersManager manager) {
        this.manager = manager;
    }

    public Boolean SignUp() {
        verification = new MobileNumberVerification();
        if (!verifyPhoneNumber())
        {
            System.out.println("Failed to sign up");
            return false;
        } else {
            if (createAccount()) {
                createUser();
                manager.addUser(user);
                return true;
            } else {
                System.out.println("Failed to sign up");
                return false;
            }
        }
    }

    abstract Boolean createAccount();

    public Boolean verifyPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        String phoneNumber;
        System.out.println("Enter your phone number: ");
        phoneNumber = sc.nextLine();
        if (!manager.checkPhoneNumberValidity(phoneNumber)) {
            if (!verification.verify(phoneNumber)) {
                System.out.println("Wrong OTP.");
                return false;
            } else {
                System.out.println("Correct OTP.");
                return true;
            }
        } else {
            System.out.println("An account with this phone number already exists.");
            return false;
        }
    }

    public void createUser() {
        Scanner sc = new Scanner(System.in);
        String name, username, password;
        System.out.println("enter your full name: ");
        name = sc.nextLine();
        System.out.println("enter a username: ");
        username = sc.nextLine();
        while (!validateUsername(username)) {
            System.out.println("Username is taken.");
            System.out.println("enter a username: ");
            username = sc.nextLine();
        }
        System.out.println("choose a password: ");
        password = sc.nextLine();
        while (!validatePassword(password)) {
            System.out.println("Please enter a valid password: ");
            password = sc.nextLine();
        }
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);

    }

    public Boolean validateUsername(String username) {
        if (manager.checkUsernameValidity(username))
            return false;
        else
            return true;
    }

    public Boolean validatePassword(String password) {
        boolean hasUppercase = false, hasLowercase = false, hasNumber = false, hasSpecialChar = false, hasValidLength = false;

        if (password.length() >= 8 && password.length() <= 20) {
            hasValidLength = true;
        }

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            if (ch >= 33 && ch <= 126) {
                hasSpecialChar = true;
            }
        }
        if (!hasUppercase || !hasLowercase || !hasNumber || !hasSpecialChar || !hasValidLength) {
            if (!hasUppercase) {
                System.err.print("Password must contain at least 1 uppercase letter ");
            }
            if (!hasLowercase) {
                System.err.print("Password must contain at least 1 lowercase letter ");
            }
            if (!hasNumber) {
                System.err.print("Password must contain at least 1 number ");
            }
            if (!hasSpecialChar) {
                System.err.print("Password must contain at least 1 special character");
            }
            if (!hasValidLength) {
                System.err.print("Password must be between 8 and 16 characters");
            }
            return false;
        } else {
            return true;
        }
    }

}
