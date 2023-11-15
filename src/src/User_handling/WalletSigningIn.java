package User_handling;
public class WalletSigningIn extends SigningInTemplate
{
    @Override
    public void loadProfile()
    {
        System.out.println("Welcome back, "+ user.getName()+"!");
        System.out.println("Username: "+ user.getUsername());
        System.out.println("phone number: "+ user.getPhoneNumber());
        System.out.println("Wallet Provider: "+ user.getAccount().getProvider().getClass().getSimpleName());

    }
}
