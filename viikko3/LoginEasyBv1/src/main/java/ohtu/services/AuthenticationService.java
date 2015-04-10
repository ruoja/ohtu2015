package ohtu.services;

import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.UserDao;
<<<<<<< HEAD

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
public class AuthenticationService {

    private UserDao userDao;

<<<<<<< HEAD
=======
    @Autowired
>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password) {
        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    private boolean invalid(String username, String password) {
        // validity check of username and password
<<<<<<< HEAD

        return false;
    }
=======
        if (goodUsername(username) && goodPassword(password)) {
            return false;
        }
        return true;
    }

    private boolean goodPassword(String password) {
        if (password.length() < 8 || !hasDigit(password)) {
            return false;
        }
        return true;
    }

    private boolean goodUsername(String username) {
        if (username.length() < 3) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

>>>>>>> b8fdb13364a17f588f1e118e79a823648e4c104e
}
