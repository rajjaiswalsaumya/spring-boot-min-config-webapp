package org.cdac.gist.domain.bo;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.DateTime;

/**
 * Created by grohit on 9/17/2015.
 */
public class LoginUser {
    private String emailId;
    @NotBlank(message = "Username can't be empty")
    private String userName;
    @NotBlank(message = "Password can't be empty")
    private String passWord;
    private DateTime lastLoggedInDate;

    public LoginUser() {
    }

    public LoginUser(String emailId, String userName, String passWord, DateTime lastLoggedInDate) {
        this.emailId = emailId;
        this.userName = userName;
        this.passWord = passWord;
        this.lastLoggedInDate = lastLoggedInDate;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public DateTime getLastLoggedInDate() {
        return lastLoggedInDate;
    }

    public void setLastLoggedInDate(DateTime lastLoggedInDate) {
        this.lastLoggedInDate = lastLoggedInDate;
    }
}
