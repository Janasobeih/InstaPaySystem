package User_handling;

public interface OTPverification {
    Boolean verify(String verifiable);
    int sendOTP(String verifiable);
}
