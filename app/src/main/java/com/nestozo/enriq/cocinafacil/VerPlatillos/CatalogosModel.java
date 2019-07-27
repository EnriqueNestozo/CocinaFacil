package com.nestozo.enriq.cocinafacil.VerPlatillos;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class CatalogosModel implements CatalogosContract.model {
    private CatalogosContract.presenter presenter;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    public void setPresenter(Object presenter) {
        this.presenter = (CatalogosContract.presenter) presenter;
    }

    @Override
    public void getCategories() {
        List<String> categorias = new ArrayList<>();
        db.collection("categorias")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if(task.isSuccessful()){
                            for(QueryDocumentSnapshot document : task.getResult()){
                                Log.d("categorias",document.get("tipo").toString());
                                categorias.add(document.get("tipo").toString());
                            }
                            presenter.updateCategoriesList(categorias);
                        }else{
                            Log.i("ERROR", "no se pudieron obtener las categorias");
                            presenter.updateMessageUnableToLoadCategories();
                        }
                    }
                });
    }

}
