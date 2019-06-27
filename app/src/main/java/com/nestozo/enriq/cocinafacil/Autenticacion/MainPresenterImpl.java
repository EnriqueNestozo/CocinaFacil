package com.nestozo.enriq.cocinafacil.Autenticacion;

import com.nestozo.enriq.cocinafacil.Account;

public class MainPresenterImpl implements AutenticacionContract.presenter {
    private AutenticacionContract.view view;
    private AutenticacionContract.model model;

    public MainPresenterImpl(AutenticacionContract.view view){
        this.view = view;
        this.view.setPresenter(this);
        this.model = new AutenticacionModel();
        this.model.setPresenter(this);
    }

    @Override
    public void obtenerRespuesta(String usuario, String contrasena) {
        //Consulta a bd
        if(model.signIn(new Account(usuario,contrasena))){
            view.cargarActivityCatalogos();
        }else{
            view.mostrarError("Usuario y/o contraseña incorrectos");
        }

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}
