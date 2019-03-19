package edu.cecar.controladores;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 *
 *
 * http://scienti.colciencias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000402478
 */
public class ExtraerDatoCVLACUnitTest {

    @Rule
    public GestionTestExtraerDatosCVLAC gestionTestExtraerDatosCVLAC = new GestionTestExtraerDatosCVLAC();
    @Test
    public void validarDatosCVLAC() {

        // Se define los datos de referencia con los que se probara el metodo extraerDatos

        Investigador investigador1 = ExtraerDatoCVLAC.getDatos("http://scienti.colciencias" +
                ".gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0001376707");

        Investigador investigador2 = ExtraerDatoCVLAC.getDatos("http://scienti.colciencias.g" +
                "ov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000787132");

        // Se define los datos esperados

        //Luty Del Carmen Gomezcaceres Peréz

        String nombreInvestigador1="Guillermo Carlos Hernández Hernández";
        String nombreInvestigador2="Namuel Francisco Solórzano Peralta";

        // Se comprueba o testea el valor esperado con el obtenido

        assertEquals(nombreInvestigador1,investigador1.getNombres());
        assertEquals(nombreInvestigador2,investigador2.getNombres());
     
    }

    @Test
    public void testDatosCVLAC1(){

        //Se obtienen los datos del investigador
        Investigador investigador=ExtraerDatoCVLAC.getDatos("http://scienti.colcien" +
                "cias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000402478");

        //Se define los datos esperados

        String nombreInvestigador="Luty Del Carmen Gomezcaceres Peréz";


        //se comparan ambos datos

        assertEquals(nombreInvestigador,investigador.getNombres());
    }

    @Test
    public void testDatosCVLAC2(){

        //Se obtienen los datos del investigador
        Investigador investigador=ExtraerDatoCVLAC.getDatos("http://scienti.colciencias.gov." +
                "co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000733180");

        //Se define los datos esperados

        String investigacion="Ingeniería de Software, Activa:Si";


        //se comparan ambos datos


        assertEquals(investigacion,investigador.getArregloInvestigacion().get(1));
    }
    @Test
    public void testDatosCVLAC3(){

        //Se obtienen los datos del investigador
        Investigador investigador=ExtraerDatoCVLAC.getDatos("http://scienti.colcienc" +
                "ias.gov.co:8081/cvlac/visualizador/generarCurriculoCv.do?cod_rh=0000402478");

        //Se define los datos esperados

        String investigacion="control de calidad de alimentos, Activa:Si";
        String investigacion2="Tecnologìa y Calidad en la industria del Alimento Calidad en alimento, Activa:Si";
        String investigacion3="contaminación ambiental, Activa:Si";

        //se comparan ambos datos


        assertEquals(investigacion,investigador.getArregloInvestigacion().get(1));
        assertEquals(investigacion2,investigador.getArregloInvestigacion().get(2));
        assertEquals(investigacion3,investigador.getArregloInvestigacion().get(3));
    }



}

