package com.nestozo.enriq.cocinafacil.Autenticacion;

import com.nestozo.enriq.cocinafacil.Account;

public class AutenticacionModel implements AutenticacionContract.model {
    private AutenticacionContract.presenter presenter;
    @Override
    public void setPresenter(AutenticacionContract.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public boolean signIn(Account account) {
        boolean autenticado = false;

        return autenticado;
    }
}
