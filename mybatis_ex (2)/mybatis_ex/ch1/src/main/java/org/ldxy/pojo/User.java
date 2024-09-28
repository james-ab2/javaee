package org.ldxy.pojo;

import lombok.Data;

@Data
public class User {
    private  Integer uid;
    private String uname;
    private String password;
    private boolean enable;

    public User(String uname, String upassword, boolean enable) {
        this.uname = uname;
        this.password = upassword;
        this.enable = enable;
    }
}
