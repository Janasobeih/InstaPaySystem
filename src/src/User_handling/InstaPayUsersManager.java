package User_handling;
import Payment.*;
import ThirdParties.*;
import Bill.*;
import java.util.Vector;

public class InstaPayUsersManager {
    Vector<User> allUsers;
public InstaPayUsersManager()
{
    allUsers= new Vector<>();
}
    public void addUser(User U) {
        allUsers.add(U);
    }

    public Boolean checkUsernameValidity(String username) {
        Boolean exists = false;
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUsername().equals(username))
                exists = true;
        }
        return exists;
    }

    public Boolean checkPhoneNumberValidity(String phoneNumber) {
        Boolean exists = false;
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getPhoneNumber().equals(phoneNumber))
                exists = true;
        }
        return exists;
    }

    public Boolean checkCredentialsValidity(String username, String Password) {
        Boolean exists = false;
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUsername().equals(username) && allUsers.get(i).getPassword().equals(Password)) {
                exists = true;
            }
        }
        return exists;
    }
        public void updateBalance (User U)
        {
            for (int i = 0; i < allUsers.size(); i++) {
                if (allUsers.get(i).getUsername().equals(U.getUsername())) {
                    Account a = allUsers.get(i).getAccount();
                    a.setBalance(U.getAccount().getBalance());
                    allUsers.get(i).setAccount(a);
                }
            }
        }
        public User getUser (String username)
        {
            User U = new User();
            for (int i = 0; i < allUsers.size(); i++) {
                if (allUsers.get(i).getUsername().equals(username)) {

                    U = allUsers.get(i);
                }
            }
            return U;
        }
    }

