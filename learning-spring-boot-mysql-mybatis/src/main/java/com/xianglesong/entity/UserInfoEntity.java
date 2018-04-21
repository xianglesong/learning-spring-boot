package com.xianglesong.entity;

import java.io.Serializable;

public class UserInfoEntity implements Serializable {
  private static final long serialVersionUID = -3258839839160856613L;
  private Long id;
  private String userName;
  private String passWord;

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getPassWord() {
      return passWord;
  }

  public void setPassWord(String passWord) {
      this.passWord = passWord;
  }

  public static long getSerialVersionUID() {
      return serialVersionUID;
  }

  public String getUserName() {
      return userName;
  }

  public void setUserName(String userName) {
      this.userName = userName;
  }
}
