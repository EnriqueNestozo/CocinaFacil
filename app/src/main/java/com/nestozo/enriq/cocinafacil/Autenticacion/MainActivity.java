package com.nestozo.enriq.cocinafacil.Autenticacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import com.nestozo.enriq.cocinafacil.R;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener{

    MainPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        commitFragment();
    }

    @Override
    protected void onResume() {

        super.onResume();
        presenter.subscribe();
    }

    @Override
    protected void onPause() {

        super.onPause();
        presenter.subscribe();
    }

    private void commitFragment(){
        MainFragment mainFragment = new MainFragment();
        presenter = new MainPresenterImpl(mainFragment);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main,mainFragment,null);
        fragmentTransaction.commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
