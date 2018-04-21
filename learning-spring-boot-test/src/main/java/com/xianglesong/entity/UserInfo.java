package com.xianglesong.entity;

import org.hibernate.annotations.Proxy;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
@Proxy(lazy = false)
public class UserInfo implements Serializable {

  @Id
  private String id;

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    return "UserInfo{" + "id='" + id + '\'' + ", userName='" + userName + '\'' + ", userPwd='"
        + userPwd + '\'' + ", updateTime=" + updateTime + ", insertTime=" + insertTime
        + ", status=" + status + '}';
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getInsertTime() {
    return insertTime;
  }

  public void setInsertTime(Date insertTime) {
    this.insertTime = insertTime;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }

  @Column(name = "user_name")
  private String userName;

  @Column(name = "user_pwd")
  private String userPwd;

  @Column(name = "update_time")
  private Date updateTime;

  @Column(name = "insert_time")
  private Date insertTime;

  @Column(name = "status")
  private int status;

}
