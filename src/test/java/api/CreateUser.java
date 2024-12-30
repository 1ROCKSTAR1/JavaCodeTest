package api;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateUser {

    private String email;
    private String password;

    public CreateUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
