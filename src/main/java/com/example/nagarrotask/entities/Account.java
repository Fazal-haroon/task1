package com.example.nagarrotask.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Account {
    private Integer ID;
    private String account_type;
    private String account_number;

    public Integer getID() {
        return ID;
    }

    public String getAccount_type() {
        return account_type;
    }

    /**
     * It takes the account number, hashes it, and returns the hash
     *
     * @return The account number is being returned.
     */
    public String getAccount_number() throws NoSuchAlgorithmException {
        String plaintext = this.account_number;
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(plaintext.getBytes());
        byte[] digest = m.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashtext = bigInt.toString(16);
        // Now we need to zero pad it if you actually want the full 32 chars.
        while(hashtext.length() < 32 ){
            hashtext = "0"+hashtext;
        }
        return hashtext;
    }

    /**
     * The toString() method returns a string representation of the object
     *
     * @return The account ID, account type, and account number.
     */
    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", account_type='" + account_type + '\'' +
                ", account_number='" + account_number + '\'' +
                '}';
    }
}
