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
    public void getLogInResponse(String correo, String contrasena) {
        model.logIn(correo,contrasena);
    }

    @Override
    public void saveAccountInstance(String correo, String contrasena) {
        Account.getAccountInstance(correo,contrasena);
        updateViewToCatalogos();
    }

    @Override
    public void updateViewToCatalogos() {
        view.displayCatalogosActivity();
    }

    @Override
    public void updateViewToFailAutentication(String message) {
        view.displayErrorMessage("Usuario y/o contraseña incorrectos");
    }

    @Override
    public void subscribe() {


    }

    @Override
    public void unSubscribe() {

    }
}
