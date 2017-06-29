package com.zy.internal.model;

/**
 * Created by zhangyanyan on 2017/6/25.
 */
public class AccountModel extends BaseModel {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
