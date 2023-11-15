package User_handling;

public class BankSigningIn extends SigningInTemplate
{
    @Override
    public void loadProfile()
    {
        System.out.println("Welcome back, "+ user.getName()+"!");
        System.out.println("Username: "+ user.getUsername());
        System.out.println("phone number: "+ user.getPhoneNumber());
        System.out.println("Bank: "+ user.getAccount().getProvider().getClass().getSimpleName());
        System.out.println("Account number: "+ user.getAccount().getUserInfo());
    }
}
