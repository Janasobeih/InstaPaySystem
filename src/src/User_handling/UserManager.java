package User_handling;

public class UserManager
{
     User CurrentUser;
     SigningUpTemplate SigningUp;
     SigningInTemplate SigningIn;
     public void setCurrentUser(User u)
     {
         CurrentUser=u;
     }
 /*    public void InquireBalance(){
        System.out.println("Your balance: "+ CurrentUser.Account.getBalance());
     }*/
}
