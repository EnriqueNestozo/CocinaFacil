package com.nestozo.enriq.cocinafacil.VerPlatillos;

import android.util.Log;

import java.util.List;

public class CatalogosPresenterImpl implements CatalogosContract.presenter {
    private CatalogosContract.view vista;
    private CatalogosContract.model modelo;

    public CatalogosPresenterImpl(CatalogosContract.view vista){
        this.vista = vista;
        this.vista.setPresenter(this);
        modelo = new CatalogosModel();
        modelo.setPresenter(this);
    }

    @Override
    public void loadCategories() {
        modelo.getCategories();
    }

    @Override
    public void updateCategoriesList(List<String> categories) {
        vista.displayCategories(categories);
    }

    @Override
    public void updateMessageUnableToLoadCategories() {
        vista.displayConnectionFailedMessage("Ups! Parece que ha habido un problema al cargar las categorias");
    }

    @Override
    public void logOutFromApp() {

    }



    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}
