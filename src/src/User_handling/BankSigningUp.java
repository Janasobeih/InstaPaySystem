package User_handling;

import java.util.Scanner;

import static User_handling.BankProviders.QNB;

public class BankSigningUp extends SigningUpTemplate {
    @Override
    Boolean createAccount() {
        Account account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        BankProviders choice;
        System.out.println("Choose your Bank provider: ");
        System.out.println("-QNB");
        System.out.println("-CIB ");
        choice = BankProviders.valueOf(sc.next());
        switch (choice) {
            case QNB: {

                user.getAccount().setProvider(new QNB());

                break;
            }
            case CIB: {
                user.getAccount().setProvider(new CIB());
                break;
            }
            default: {
                System.out.println("Invalid Bank provider");
                return false;
                break;
            }
        }
        System.out.println("Please enter your bank account number ");
        String accNo = sc.nextLine();
        if (user.getAccount().getProvider().UserExists(accNo)) {
            if (user.getAccount().getProvider().authenticateUser(user.getPhoneNumber(), accNo)) {
                account.setUserInfo(accNo);
                account.setBalance(user.getAccount().getProvider().retreiveBalance(user.getAccount().getUserInfo()));
                user.setAccount(account);
                return true;
            } else {
                System.out.println("This phone number isn't associated with the account you entered.");
                return false;
            }
        } else
        {
            System.out.println("No such bank account exists.");
            return false;
        }
    }
}
