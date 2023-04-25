package Ngay25_04;

public class Account {
    private int id;
    private final String username;
    private final String password;
    private int phoneNumber;
    private String address;
    private String fullName;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public Account(int id, String username, String password, String fullName, int phoneNumber, String address) {
        this.id = id;
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
