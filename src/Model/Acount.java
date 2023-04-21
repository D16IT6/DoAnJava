/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class Acount {

    private String password;
    private String accountname;

    public Acount() {
    }

    public String getPassword() {
        return password;
    }

    public Acount(String password, String accountname) {
        this.password = password;
        this.accountname = accountname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

}
