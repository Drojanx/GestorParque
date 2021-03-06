package com.programacion.alanz.actividadaprendizaje2.domain;

public class Jardinero {
    String jardineroId;
    String jardineroCuadrillaId;
    String jardineroNombre;
    String jardineroApellidos;
    String jardineroNumTfno;
    double jardineroSalario;
    String jardineroFechaContr;
    
    public Jardinero(){
        
    }

    public String getJardineroId() {
        return jardineroId;
    }

    public void setJardineroId(String jardineroId) {
        this.jardineroId = jardineroId;
    }

    public String getJardineroCuadrillaId() {
        return jardineroCuadrillaId;
    }

    public void setJardineroCuadrillaId(String jardineroCuadrillaId) {
        this.jardineroCuadrillaId = jardineroCuadrillaId;
    }

    public String getJardineroNombre() {
        return jardineroNombre;
    }

    public void setJardineroNombre(String jardineroNombre) {
        this.jardineroNombre = jardineroNombre;
    }

    public String getJardineroApellidos() {
        return jardineroApellidos;
    }

    public void setJardineroApellidos(String jardineroApellidos) {
        this.jardineroApellidos = jardineroApellidos;
    }

    public String getJardineroNumTfno() {
        return jardineroNumTfno;
    }

    public void setJardineroNumTfno(String jardineroNumTfno) {
        this.jardineroNumTfno = jardineroNumTfno;
    }

    public double getJardineroSalario() {
        return jardineroSalario;
    }

    public void setJardineroSalario(double jardineroSalario) {
        this.jardineroSalario = jardineroSalario;
    }

    public String getJardineroFechaContr() {
        return jardineroFechaContr;
    }

    public void setJardineroFechaContr(String jardineroFechaContr) {
        this.jardineroFechaContr = jardineroFechaContr;
    }

    @Override
    public String toString() {
        return "Jardinero{" + "jardineroId=" + jardineroId + ", jardineroCuadrillaId=" + jardineroCuadrillaId + ", jardineroNombre=" + jardineroNombre + ", jardineroApellidos=" + jardineroApellidos + ", jardineroNumTfno=" + jardineroNumTfno + ", jardineroSalario=" + jardineroSalario + ", jardineroFechaContr=" + jardineroFechaContr + '}';
    }
    
    
}
