/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Hoang Tran
 */
public class LoginBean {
    private String name, passWord;

    public String getName() {
        return name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public boolean validate() {
        if (passWord.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}
