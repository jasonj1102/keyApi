package example;

import java.io.Serializable;
import java.math.BigInteger;

public class User implements Serializable {
    private String username;
    private BigInteger public_key;
    private BigInteger private_key;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigInteger getPublic_key() {
        return public_key;
    }

    public void setPublic_key(BigInteger public_key) {
        this.public_key = public_key;
    }

    public BigInteger getPrivate_key() {
        return private_key;
    }

    public void setPrivate_key(BigInteger private_key) {
        this.private_key = private_key;
    }
}
