package User_handling;
import Payment.*;
import ThirdParties.*;
import Bill.*;
public interface OTPverification {
    Boolean verify(String verifiable);
    int sendOTP(String verifiable);
}
