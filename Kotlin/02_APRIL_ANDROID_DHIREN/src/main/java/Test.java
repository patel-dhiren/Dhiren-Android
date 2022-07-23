import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Objects;

class User{

    int id;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {       // hers o - user1 Object
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Test {

    public static void main(String[] args) {

        try {
            FileOutputStream out = new FileOutputStream("d://");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
