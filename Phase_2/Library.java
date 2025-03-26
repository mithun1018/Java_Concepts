package Phase_2;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> bookArrayList=new ArrayList<>();
    private static ArrayList<Account> accountArrayList=new ArrayList<>();

    public static ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public static ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }
}
