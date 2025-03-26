package Phase_2;

import java.util.ArrayList;

public class User extends Account{
    public User(String id,String password){
        super(id,password);
    }
    private ArrayList<Book> borrowArrayList=new ArrayList<>();

    public ArrayList<Book> getBorrowArrayList() {
        return borrowArrayList;
    }

    public void setBorrowArrayList(ArrayList<Book> borrowArrayList) {
        this.borrowArrayList = borrowArrayList;
    }
}
