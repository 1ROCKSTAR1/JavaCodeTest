package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String email;
    private String password;

    public User(User user) {
        this.username = user.username;
        this.email = user.email;
        this.password = user.password;
    }

    public static User defaultOf() {
        return new User("Tom","tom@example.com","qwerty");
    }
}
