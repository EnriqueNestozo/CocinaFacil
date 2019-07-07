package com.nestozo.enriq.cocinafacil.Autenticacion;

import com.nestozo.enriq.cocinafacil.BaseModel;
import com.nestozo.enriq.cocinafacil.BasePresenter;
import com.nestozo.enriq.cocinafacil.BaseView;
import com.nestozo.enriq.cocinafacil.Account;

public interface AutenticacionContract {
    interface view extends BaseView<MainPresenterImpl> {
        void displayErrorMessage(String value);
        void displayCatalogosActivity();
    }

    interface presenter extends BasePresenter {
        void saveAccountInstance(String correo, String contrasena);
        void getLogInResponse(String correo, String contrasena);
        void updateViewToCatalogos();
        void updateViewToFailAutentication(String message);

    }

    interface model extends BaseModel {
        void logIn(String correo, String contrasena);
    }
}
