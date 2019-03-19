/**

    Clase: Investigador.java

    Version: 0.1

    Fecha Creaci�n: 12/02/2019

    Ultima Fecha de Modificaci�n: 

    Copyright: Jhon Jaime Mendez
*/

package edu.cecar.controladores;

import java.util.ArrayList;

/**
  Esta clase modela los datos de un Investigador
*/

public class Investigador {

    private String nombres;
    private String nacionalidad;
    private String sexo;
    private String prueba;
    //private String[] arregloInvestigacion;
    private ArrayList<String> arregloInvestigacion;
    private boolean categorizado;



    public Investigador(String nombres, String nacionalidad, String sexo, String prueba,ArrayList arregloInvestigacion, boolean categorizado) {

        this.nombres = nombres;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.prueba = prueba;
        this.arregloInvestigacion = arregloInvestigacion;
        this.categorizado = categorizado;

    }

    public ArrayList<String> getArregloInvestigacion() {
        return arregloInvestigacion;
    }

    public void setArregloInvestigacion(ArrayList<String> arregloInvestigacion) {
        this.arregloInvestigacion = arregloInvestigacion;
    }

    public String getPrueba() {
        return prueba;
    }

    public String getNombres() {
            return nombres;
    }

    public void setNombres(String nombres) {
            this.nombres = nombres;
    }

    public String getNacionalidad() {
            return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
            this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
            return sexo;
    }

    public void setSexo(String sexo) {
            this.sexo = sexo;
    }

    public boolean isCategorizado() {
        return categorizado;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
