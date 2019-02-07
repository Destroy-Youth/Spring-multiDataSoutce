package com.example.doubleDB.caminos.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  private Integer idUser;
  private String nameUser;
  private String passUser;
  private String rolUser;


  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public String getNameUser() {
    return nameUser;
  }

  public void setNameUser(String nameUser) {
    this.nameUser = nameUser;
  }

  public String getPassUser() {
    return passUser;
  }

  public void setPassUser(String passUser) {
    this.passUser = passUser;
  }

  public String getRolUser() {
    return rolUser;
  }

  public void setRolUser(String rolUser) {
    this.rolUser = rolUser;
  }
}
