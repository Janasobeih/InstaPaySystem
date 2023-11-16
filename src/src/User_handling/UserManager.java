package User_handling.User_handling;
import Payment.*;

import java.util.Scanner;

public class UserManager {
    public static User_handling.User CurrentUser;
    public User_handling.SigningUpTemplate SigningUp;
    public User_handling.SigningInTemplate SigningIn;

    public static void setCurrentUser(User u) {
        CurrentUser = u;
    }

    public static void InquireBalance() {
        System.out.println("Your balance: " + CurrentUser.getAccount().getBalance());
    }

    public static void main(String[] args)
    {
        int choice = 0;
        User_handling.SigningUpTemplate S1;
        User_handling.SigningInTemplate S2;
        User_handling.InstaPayUsersManager Manager = new InstaPayUsersManager();
        while (choice != 3) {
            System.out.println("Welcome!");
            System.out.println("1-Sign Up");
            System.out.println("2-Sign in");
            System.out.println("3-Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("1-Wallet Account");
                System.out.println("2-Bank Account");
                choice = sc.nextInt();
                if (choice == 1) {
                    S1 = new WalletSigningUp();
                    S1.setManager(Manager);
                    S2 = new User_handling.WalletSigningIn();
                    S2.setManager(Manager);
                }
                else {
                    S1 = new BankSigningUp();
                    S1.setManager(Manager);
                    S2 = new User_handling.BankSigningIn();
                    S2.setManager(Manager);
                }
                if (S1.SignUp()) {
                    setCurrentUser(S1.getUser());
                    System.out.println("Signed Up!");
                    if (!S2.SignIn()) {
                        System.out.println("Failed to sign in.");
                    } else {
                        choice = 0;
                        while (choice != 4) {
                            System.out.println("1-Inquire Balance");
                            System.out.println("2-Pay Bills");
                            System.out.println("3-Transfer Money");
                            System.out.println("4-Exit");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                InquireBalance();
                            } else if (choice == 2) {
                                System.out.println("what type of bill");
                                System.out.println("1-water");
                                System.out.println("2-gas");
                                System.out.println("1-electricity");
                                choice = sc.nextInt();
                                if (choice == 1) {
                                    BillPaymentTemplate B = new WaterPaymentTemplate();
                                    B.setUser(CurrentUser);
                                    B.payBill();

                                } else if (choice == 2) {
                                    BillPaymentTemplate B = new GasPaymentTemplate();
                                    B.setUser(CurrentUser);
                                    B.payBill();
                                }
                            } else if (choice == 3)
                            {
                                System.out.println("what type of transfer");
                                System.out.println("1-instapayuser");
                                System.out.println("2-bank");
                                System.out.println("3-wallet");
                                if (choice == 1)
                                {
                                    TransferTemplate t = new InstaPayTransferTemplate();
                                    t.transfer();

                                } else if (choice == 2)
                                {
                                    TransferTemplate t = new BankTransferTemplate();
                                    t.setUser(CurrentUser);
                                    t.transfer();
                                } else {
                                    TransferTemplate t = new WalletTransferTemplate();
                                    t.setUser(CurrentUser);
                                    t.transfer();
                                }
                            } else
                            {

                                return;
                            }

                        }
                    }
                } else {
                    System.out.println("Signing Up failed.");
                }
            } else if (choice == 2) {
                System.out.println("Sign in using: ");
                System.out.println("1-Wallet Account ");
                System.out.println("2-Bank Account ");
                choice = sc.nextInt();
                if (choice == 1) {
                    S2 = new WalletSigningIn();
                } else {
                    S2 = new BankSigningIn();
                }
                if (!S2.SignIn()) {

                    System.out.println("Failed to sign in.");
                } else {
                    choice = 0;
                    while (choice != 4) {
                        System.out.println("1-Inquire Balance");
                        System.out.println("2-Pay Bills");
                        System.out.println("3-Transfer Money");
                        System.out.println("4-Exit");
                        choice = sc.nextInt();
                        if (choice == 1) {
                            InquireBalance();
                        } else if (choice == 2) {
                            System.out.println("what type of bill");
                            System.out.println("1-water");
                            System.out.println("2-gas");
                            System.out.println("1-electricity");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                BillPaymentTemplate B = new WaterPaymentTemplate();
                                B.setUser(CurrentUser);
                                B.payBill();

                            } else if (choice == 2) {
                                BillPaymentTemplate B = new GasPaymentTemplate();
                                B.setUser(CurrentUser);
                                B.payBill();
                            }

                        } else if (choice == 3) {
                            System.out.println("what type of transfer");
                            System.out.println("1-instapayuser");
                            System.out.println("2-bank");
                            System.out.println("3-wallet");
                            if (choice == 1) {
                                TransferTemplate t = new InstaPayTransferTemplate();
                                t.transfer();

                            } else if (choice == 2) {
                                TransferTemplate t = new BankTransferTemplate();
                                t.setUser(CurrentUser);
                                t.transfer();
                            } else {
                                TransferTemplate t = new WalletTransferTemplate();
                                t.setUser(CurrentUser);
                                t.transfer();
                            }

                        } else
                        {
                            return;
                        }
                    }
                }
            } else
            {
                System.out.println("Exiting.");
                return;
            }
        }
    }
}
