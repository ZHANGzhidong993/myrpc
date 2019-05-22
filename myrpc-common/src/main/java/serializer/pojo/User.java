package serializer.pojo;

import java.io.Serializable;

/**
 * @author zhangzhidong
 * @since 2019/5/13
 */
public class User implements Serializable {

    private String username;

    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
