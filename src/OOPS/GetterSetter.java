package OOPS;
class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "sunil";
        a1.email = "sunilkoule38@gmail.com";
        a1.setPassword("asfrvr");
        System.out.println(a1.getPassword());
    }
}
