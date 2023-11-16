package User_handling.User_handling;

import Payment.Account;
import ThirdParties.CIBWalletProvider;
import ThirdParties.FawryWalletProvider;
import ThirdParties.VodafoneWalletProvider;

import java.util.Scanner;

public class WalletSigningUp extends SigningUpTemplate {
    @Override
    Boolean createAccount() {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        EWalletProviders choice;
        System.out.println("Choose your wallet provider: ");
        System.out.println("-Vodafone");
        System.out.println("-Fawry ");
        System.out.println("-CIB ");
        choice = EWalletProviders.valueOf(sc.next());
        switch (choice) {
            case vodafone: {
                user.getAccount().setProvider(new VodafoneWalletProvider());
                break;
            }
            case fawry: {
                user.getAccount().setProvider(new FawryWalletProvider());
                break;
            }
            case cib: {
                user.getAccount().setProvider(new CIBWalletProvider());
                break;
            }
            default: {
                System.out.println("Invalid wallet provider");
                return false;
            }
        }
        if (user.getAccount().getProvider().UserExists(user.getPhoneNumber()))
        {
                account.setUserInfo(user.getPhoneNumber());
                account.setBalance(user.getAccount().getProvider().retreiveBalance(user.getAccount().getUserInfo()));
                user.setAccount(account);
                return true;
        }
         else
         {
            System.out.println("Incorrect wallet information.");
            return false;
        }
    }
}