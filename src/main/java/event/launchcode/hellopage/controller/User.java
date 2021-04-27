package event.launchcode.hellopage.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String username;
    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public User(){}

    public User(String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
