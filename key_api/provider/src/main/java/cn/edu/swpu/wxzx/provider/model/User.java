package cn.edu.swpu.wxzx.provider.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class User implements Serializable {
    private int id;
    private String username;
    private String private_key;
    private String public_key;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(String private_key) {
        this.private_key = private_key;
    }

    public String getPublic_key() {
        return public_key;
    }

    public void setPublic_key(String public_key) {
        this.public_key = public_key;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", private_key='" + private_key + '\'' +
                ", public_key='" + public_key + '\'' +
                '}';
    }
}
