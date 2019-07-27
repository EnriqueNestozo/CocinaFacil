package com.nestozo.enriq.cocinafacil.VerPlatillos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;

import com.nestozo.enriq.cocinafacil.Autenticacion.MainFragment;
import com.nestozo.enriq.cocinafacil.R;

public class CatalogosActivity extends AppCompatActivity implements CatalogosFragment.OnFragmentInteractionListener {
    CatalogosPresenterImpl presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogos);
        commitFragment();
    }

    private void commitFragment(){
        CatalogosFragment fragmentPrincipal = new CatalogosFragment();
        presenter = new CatalogosPresenterImpl(fragmentPrincipal);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_catalogos,fragmentPrincipal,null);
        fragmentTransaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
