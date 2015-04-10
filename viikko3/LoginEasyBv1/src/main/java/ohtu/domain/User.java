package ohtu.domain;

<<<<<<< HEAD
public class User {
=======
import java.io.Serializable;

public class User implements Serializable {
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
