package com.example.doubleDB.siarp.domain;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GECat_Pais")
public class Pais {

  @Id
  private Short Id_Pais;
  private String Txt_Pais;
  private String Txt_Nacionalidad;
  private Short Id_Usuario;
  private Timestamp Fec_Actualiza;


  public Short getId_Pais() {
    return Id_Pais;
  }

  public void setId_Pais(Short id_Pais) {
    Id_Pais = id_Pais;
  }

  public String getTxt_Pais() {
    return Txt_Pais;
  }

  public void setTxt_Pais(String txt_Pais) {
    Txt_Pais = txt_Pais;
  }

  public String getTxt_Nacionalidad() {
    return Txt_Nacionalidad;
  }

  public void setTxt_Nacionalidad(String txt_Nacionalidad) {
    Txt_Nacionalidad = txt_Nacionalidad;
  }

  public Short getId_Usuario() {
    return Id_Usuario;
  }

  public void setId_Usuario(Short id_Usuario) {
    Id_Usuario = id_Usuario;
  }

  public Timestamp getFec_Actualiza() {
    return Fec_Actualiza;
  }

  public void setFec_Actualiza(Timestamp fec_Actualiza) {
    Fec_Actualiza = fec_Actualiza;
  }
}
