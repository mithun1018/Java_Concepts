package Phase_2;

import java.util.Scanner;

public class LibraryAction {

    public static void action(){
        int inp=0;
        Scanner scan=new Scanner(System.in);
        Library.getAccountArrayList().add(new Admin("1","1"));
        Library.getAccountArrayList().add(new User("2","2"));
        while (true){

            System.out.println("1.Admin Login\n2.User Login\nEnter your Role:");
            inp=Integer.parseInt(scan.next());
            switch (inp){
                case 1:
                    AdminAction.checkAdmin();
                    break;
                case 2:
                    UserAction.checkUser();
                    break;
                default:
                    System.out.println("invalid input...");
            }
        }
    }
}
