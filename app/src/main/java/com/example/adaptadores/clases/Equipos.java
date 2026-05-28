package com.example.adaptadores.clases;

public class Equipos {
    private String imagen;
    private String nombre;
    private String Pais;

    private String trofeos;

    private String fundacion;

    public Equipos(String imagen, String nombre, String pais, String trofeos, String fundacion) {
        this.imagen = imagen;
        this.nombre = nombre;
        Pais = pais;
        this.trofeos = trofeos;
        this.fundacion = fundacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(String trofeos) {
        this.trofeos = trofeos;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }
}


