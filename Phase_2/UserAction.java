package Phase_2;

import java.util.Scanner;

public class UserAction {

    public static void checkUser(){
        Scanner scan=new Scanner(System.in);
        User currentUser=null;
        System.out.println("Enter User id:");
        String checkID=scan.next();
        System.out.println("Enter User Password:");
        String checkPass=scan.next();
        for(Account induvidualAccount:Library.getAccountArrayList()){
            if(induvidualAccount instanceof User){
                if(induvidualAccount.getId().equals(checkID) && induvidualAccount.getPassword().equals(checkPass)){
                    currentUser= (User) induvidualAccount;
                    UserAction.action(currentUser);
                    return;
                }
            }
        }

    }
    public static void action(User currentUser){
        Scanner scan=new Scanner(System.in);
        while (true) {


            System.out.println("1.search for a Book\n2.return Book\n3.borrow Book\n4.Exit\nEnter your choice:");
            int userInp = Integer.parseInt(scan.next());
            switch (userInp) {
                case 1:
                    AdminAction.showBook();
                    break;
                case 2:
                    UserAction.returnBook(currentUser);
                    break;
                case 3:
                    UserAction.borrowBook(currentUser);
                    break;
                case 4:
                    System.out.println("exit...");
                    return;
                default:
                    System.out.println("Invalid input");
            }

        }
    }
    public static void borrowBook(User currentUser){
        Scanner scan=new Scanner(System.in);
        if(Library.getBookArrayList().isEmpty()){
            System.out.println("no books");
            return;
        }
        System.out.println("enter the title: ");
        String inpTitle=scan.next();
        System.out.println("Enter the ISBN number: ");
        String inpISBN=scan.next();
        for(Book book:Library.getBookArrayList()){
            if(book.getTitle().equals(inpTitle) && book.getIsbn().equals(inpISBN)){
                currentUser.getBorrowArrayList().add(book);
                for(Book availBook:currentUser.getBorrowArrayList()){
                    System.out.println(availBook.getTitle());
                }
                book.setBookAvailability(false);
                System.out.println("Successfully Book Borrowed...");

            }
        }


    }
    public static void returnBook(User currentUser){
        Scanner scan=new Scanner(System.in);
        for(Book availBook:currentUser.getBorrowArrayList()){
            System.out.println(availBook.getTitle());
        }
        if(currentUser.getBorrowArrayList().isEmpty()){
            System.out.println("no books are borrowed...");
            return;
        }
        System.out.println("enter the title: ");
        String inpTitle=scan.next();
        System.out.println("Enter the ISBN number: ");
        String inpISBN=scan.next();
        Book books=null;
        int index=0;
        for(Book book:currentUser.getBorrowArrayList()){
            if(book.getTitle().equals(inpTitle) && book.getIsbn().equals(inpISBN)){
                books=book;
                 index= Library.getBookArrayList().indexOf(book);
                Library.getBookArrayList().get(index).setBookAvailability(true);
                 break;
            }
        }
        currentUser.getBorrowArrayList().remove(books);
        System.out.println("Successfully Book Return...");

    }
}
