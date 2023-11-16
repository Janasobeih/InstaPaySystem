package User_handling;
import Payment.*;
import ThirdParties.*;
import Bill.*;
import java.util.Random;
import java.util.Scanner;

public class MobileNumberVerification implements OTPverification {
    @Override
    public Boolean verify(String phoneNumber) {
        Scanner sc = new Scanner(System.in);
        phoneNumber = sc.nextLine();
        int sentOTP = sendOTP(phoneNumber);
        System.out.println("Enter the OTP you received: ");
        int enteredOTP = sc.nextInt();
        if (sentOTP == enteredOTP) {
            return true;
        } else
            return false;
    }

    public int sendOTP(String verifiable) {
        Random random = new Random();
        int random4DigitNumber = 1000 + random.nextInt(9000);
        System.out.println(random4DigitNumber);
        return random4DigitNumber;
    }
}
