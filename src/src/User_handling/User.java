package User_handling;

public class User {
    String name;
    String username;
    String password;
    String phoneNumber;

    //Account account;

       public String getName() {
           return name;
       }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
  /*  public void setAccount(Account account) {
        this.account = account;
    }
    public account getAccount(){return account;}*/

}
