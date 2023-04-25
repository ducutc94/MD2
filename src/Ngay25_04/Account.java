package Ngay25_04;

public class Account {
    private int id;
    private static int INDEX=0;
    private final String username;
    private final String password;
    private String phoneNumber;
    private String address;
    private String fullName;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public Account( String username, String password, String fullName, String phoneNumber, String address) {
        this.id = ++INDEX;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return
                id +
                        "," + username +
                        "," + password +
                        "," + phoneNumber +
                        "," + address +
                        "," + fullName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
