package edu.cecar.controladores;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class GestionTestExtraerDatosCVLAC extends TestWatcher {

    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);

        System.out.println("La prueba del metodo "+description.getMethodName()+" Ha sido exitosa");
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);

        System.out.println("La prueba del metodo "+description.getMethodName()+" Ha Fallado");
        System.out.println("El error presentado es "+e.getLocalizedMessage());
    }
}
