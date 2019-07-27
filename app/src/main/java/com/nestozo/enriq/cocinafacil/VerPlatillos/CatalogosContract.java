package com.nestozo.enriq.cocinafacil.VerPlatillos;

import com.nestozo.enriq.cocinafacil.BaseModel;
import com.nestozo.enriq.cocinafacil.BasePresenter;
import com.nestozo.enriq.cocinafacil.BaseView;

import java.util.List;

public interface CatalogosContract {
    interface view extends BaseView<CatalogosPresenterImpl>{
        void displayCategories(List<String> categories);
        void navigateToCategory();
        void logOut();
        void displayConnectionFailedMessage(String message);
    }

    interface presenter extends BasePresenter{
        void loadCategories();
        void logOutFromApp();
        void updateCategoriesList(List<String> categories);
        void updateMessageUnableToLoadCategories();
    }

    interface model extends BaseModel{
        void getCategories();
    }
}
