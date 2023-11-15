package User_handling;

import java.util.Vector;

public class InstaPayUsersManager {
    Vector<User> allUsers;

    public void addUser(User U) {
        allUsers.add(U);
    }

    public Boolean checkUser(User U) {
        Boolean exists=false;
        for(int i=0;i<allUsers.size();i++) {
            if (allUsers.get(i).getUsername().equals(U.getUsername()))
                exists=true;
        }
        return exists;
    }

    public void updateBalance(User U) {
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getUsername().equals(U.getUsername())) {
                Account a = allUsers.get(i).getAccount();
                a.setBalance(U.getAccount().getBalance());
                allUsers.get(i).setAccount(a);
            }
        }
    }

    public User getUser(String username) {
        User U=new User();
        for (int i = 0; i < allUsers.size(); i++)
        {
            if (allUsers.get(i).getUsername().equals(username)){

                U= allUsers.get(i);
            }
        }
        return U;
    }
}

