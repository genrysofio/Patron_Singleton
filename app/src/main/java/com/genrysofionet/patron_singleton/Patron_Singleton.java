package com.genrysofionet.patron_singleton;

/**
 * Created by mimcrea on 22.01.2018.
 */

public class Patron_Singleton {
    private static Patron_Singleton modelo=new Patron_Singleton();
    private String usuario, nombreCom;
    private Integer edadUsuario;

    public static Patron_Singleton getInformacion(){
        if (modelo == null){
            modelo = new Patron_Singleton();
        }

        return modelo;
    }

    private Patron_Singleton(){
        }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public Integer getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(Integer edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

}
