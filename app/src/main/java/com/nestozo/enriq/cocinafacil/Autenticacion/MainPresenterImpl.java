package com.nestozo.enriq.cocinafacil.Autenticacion;

import com.nestozo.enriq.cocinafacil.Account;

public class MainPresenterImpl implements AutenticacionContract.presenter {
    private AutenticacionContract.view view;
    private AutenticacionContract.model model;

    public MainPresenterImpl(AutenticacionContract.view view){
        this.view = view;
        this.view.setPresenter(this);
        this.model = new AutenticationByEmailModel();
        this.model.setPresenter(this);
    }

    @Override
    public void obtenerRespuesta(String correo, String contrasena) {
        //Consulta a bd
        model.signIn(correo,contrasena);
    }

    @Override
    public void subscribe() {
        //Crear instancia singleton de Account;
        view.cargarActivityCatalogos();
    }

    @Override
    public void unSubscribe() {
        view.mostrarError("Usuario y/o contraseña incorrectos");
    }
}
