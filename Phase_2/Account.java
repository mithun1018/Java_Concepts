package Phase_2;

public class Account {
    private String id;
    private String password;
    public Account(String id,String password){
        this.id=id;
        this.password=password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
