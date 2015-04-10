package ohtu.data_access;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ohtu.domain.User;

public class FileUserDao implements UserDao {

    private List<User> users;
    private FileOutputStream fout;
    private FileInputStream fin;
    private ObjectOutputStream objWriter;
    private ObjectInputStream objReader;

    private File userData;

    public FileUserDao(String file) throws ClassNotFoundException {
        userData = new File(file);
        try {
            if (userData.createNewFile()) {
                users = new ArrayList<User>();
            } else {
                fin = new FileInputStream(userData);
                objReader = new ObjectInputStream(fin);
                users = (ArrayList<User>) objReader.readObject();
                objReader.close();
                fin.close();
            }
            users.add(new User("pekka", "akkep"));

        } catch (IOException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> listAll() {
        return users;
    }

    @Override
    public User findByName(String name) {
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void add(User user) {
        users.add(user);
        try {
            fout = new FileOutputStream(userData);
            objWriter = new ObjectOutputStream(fout);
            objWriter.writeObject(users);
            objWriter.close();
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileUserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
