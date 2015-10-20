package org.cdac.gist.domain.bo.entities;

import org.joda.time.DateTime;

/**
 * Created by grohit on 9/17/2015.
 */

public class Users {
    private Long Id;
    private String emailId;
    private String userName;
    private String passWord;
    private DateTime lastLoggedInDate;
    private DateTime registrationDate;
    private Long mobileNum;
    private boolean isDeactivated;
    private boolean isLockedOut;

    public Users() {
    }

    public Users(String userName, String passWord) {
        this("", userName, passWord, DateTime.now(), null, 0L, true, false);
    }

    public Users(String emailId, String userName, String passWord,
                 DateTime lastLoggedInDate, DateTime registrationDate,
                 Long mobileNum, boolean isDeactivated, boolean isLockedOut) {
        this.emailId = emailId;
        this.userName = userName;
        this.passWord = passWord;
        this.lastLoggedInDate = lastLoggedInDate;
        this.registrationDate = registrationDate;
        this.mobileNum = mobileNum;
        this.isDeactivated = isDeactivated;
        this.isLockedOut = isLockedOut;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public DateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(DateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Long getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(Long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public boolean isDeactivated() {
        return isDeactivated;
    }

    public void setIsDeactivated(boolean isDeactivated) {
        this.isDeactivated = isDeactivated;
    }

    public boolean isLockedOut() {
        return isLockedOut;
    }

    public void setIsLockedOut(boolean isLockedOut) {
        this.isLockedOut = isLockedOut;
    }
}
