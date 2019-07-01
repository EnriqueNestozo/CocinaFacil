package com.nestozo.enriq.cocinafacil.Autenticacion;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.nestozo.enriq.cocinafacil.Account;

public class AutenticationByEmailModel implements AutenticacionContract.model {
    private AutenticacionContract.presenter presenter;
    private FirebaseAuth firebaseAuth;
    @Override
    public void setPresenter(AutenticacionContract.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public boolean signIn(String correo, String contrasena) {
        boolean autenticado = false;
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword(correo, contrasena)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            presenter.subscribe();
                        }else{
                            presenter.unSubscribe();
                        }
                    }
                });
        return autenticado;
    }
}
