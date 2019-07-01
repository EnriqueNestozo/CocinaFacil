package com.nestozo.enriq.cocinafacil.Autenticacion;

import com.nestozo.enriq.cocinafacil.BaseModel;
import com.nestozo.enriq.cocinafacil.BasePresenter;
import com.nestozo.enriq.cocinafacil.BaseView;
import com.nestozo.enriq.cocinafacil.Account;

public interface AutenticacionContract {
    interface view extends BaseView<MainPresenterImpl> {
        void mostrarError(String value);
        void cargarActivityCatalogos();
    }

    interface presenter extends BasePresenter {
        void obtenerRespuesta(String correo, String contrasena);
    }

    interface model extends BaseModel {
        void setPresenter(AutenticacionContract.presenter presenter);
        boolean signIn(String correo, String contrasena);
    }
}
