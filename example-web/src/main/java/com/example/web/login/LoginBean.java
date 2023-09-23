package com.example.web.login;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.example.commons.StringUtil;

@Named("loginBean")
@ViewScoped
public class LoginBean implements Serializable {
  private String id;
  private String password;
  private String secondaryPassword;

  public void login() {
    secondaryPassword = StringUtil.getRandomUpperString(10);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSecondaryPassword() {
    return secondaryPassword;
  }

  public void setSecondaryPassword(String secondaryPassword) {
    this.secondaryPassword = secondaryPassword;
  }
}
