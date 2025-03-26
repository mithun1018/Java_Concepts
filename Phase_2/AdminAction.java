package Phase_2;

import java.util.Scanner;

public class AdminAction {
    public static void checkAdmin(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Admin id:");
        String checkID=scan.next();
        System.out.println("Enter Admin Password:");
        String checkPass=scan.next();
        for(Account induvidualAccount:Library.getAccountArrayList()){
            if(induvidualAccount instanceof Admin){
                if(induvidualAccount.getId().equals(checkID) && induvidualAccount.getPassword().equals(checkPass)){
                    AdminAction.action();
                }
            }
        }

    }
    public static void action(){
        int inp=0;
        Scanner scan=new Scanner(System.in);
        Library.getAccountArrayList().add(new Admin("1","1"));
        Library.getAccountArrayList().add(new User("2","2"));
        while (true){
            System.out.println("1.Add Book\n2.Remove Book\n3.Search For a Book\n4.Exit\nEnter your choice:");
            inp=Integer.parseInt(scan.nextLine());
            switch(inp){
                case 1:
                    AdminAction.addBook();
                    break;
                case 2:
                    AdminAction.removeBook();
                    break;
                case  3:
                    AdminAction.showBook();
                    break;
                case 4:
                    LibraryAction.action();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }

    public static void addBook(){
        Scanner scan=new Scanner(System.in);
        System.out.println("how many book to add:");
        int addBookCount=Integer.parseInt(scan.next());
        for(int i=0;i<addBookCount;i++){
            System.out.println("enter book name:");
            String bookName=scan.next();
            System.out.println("enter the author name:");
            String authonName=scan.next();
            System.out.println("enter the ISBN number:");
            String isbnNumber=scan.next();
            boolean checkBook=true;
            for(Book book:Library.getBookArrayList()){
                if(book.getIsbn().equals(isbnNumber)){
                    checkBook=false;
                }
            }
            if(checkBook){
                Book newBook=new Book(bookName,authonName,isbnNumber);
                Library.getBookArrayList().add(newBook);
                System.out.println("new book is added...");
            }
            else {
                System.out.println("Already Exist...");
            }

        }
    }

    public static void removeBook(){
        Scanner scan=new Scanner(System.in);
        int i=1;
        for(Book book:Library.getBookArrayList()){
            System.out.println(Library.getBookArrayList().size());
            System.out.println(i+" - "+book.getTitle());
            i++;
        }
        System.out.println("enter the book to remove: ");
        int removeBook=Integer.parseInt(scan.next());
        Library.getBookArrayList().remove(removeBook-1);
    }
    public static void showBook(){
        int i=1;
        for (Book book:Library.getBookArrayList()){
            System.out.println(i+" - TITLE: "+book.getTitle()+"\n    AUTHOR: "+book.getAuthor()+"\n    ISBN NUMBER: "+book.getIsbn()+"\n    Availability Status: "+book.isBookAvailability());
            i++;
        }
    }
}
