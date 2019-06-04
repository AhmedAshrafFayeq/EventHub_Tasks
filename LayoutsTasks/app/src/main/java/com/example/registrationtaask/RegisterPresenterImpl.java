package com.example.registrationtaask;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Patterns;


public class RegisterPresenterImpl implements RegisterContract.RegisterPresenter{

    private static final int RC_SIGN_IN =9001 ;
    private RegisterContract.RegisterView registerView;
    private static final String TAG = "RegisterActivity";

    private Context context;


    public RegisterPresenterImpl(RegisterContract.RegisterView registerView) {
        this.registerView = registerView;
        context= (Context) registerView;


    }


    @Override
    public void updateMessage(String message) {
        registerView.showToast(message);
    }

    @Override
    public boolean validateEmail(String email) {
        if(email.isEmpty())
        {
            updateErrorEmail("Field cannot be empty");
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            updateErrorEmail("Please enter a valid email");
            return false;
        }
        else
        {
            updateErrorEmail(null);
            return true;
        }
    }

    @Override
    public void updateErrorEmail(String message) {
        registerView.errorEmail(message);
    }

    @Override
    public boolean validatePassword(String password) {
        if (password.isEmpty()) {
            updateErrorPassword("Field can't be empty");
            return false;
        } else {
            updateErrorPassword(null);
            return true;
        }
    }

    @Override
    public boolean validateUsername(String userName) {
        if (userName.isEmpty()) {
            updateErrorUsername("Field can't be empty");
            return false;
        } else if (userName.length() > 15) {
            updateErrorUsername("Username too long");
            return false;
        } else {
            updateErrorUsername(null);
            return true;
        }
    }

    @Override
    public void updateErrorUsername(String userName) {
        registerView.errorUserName(userName);
    }
    @Override
    public void updateErrorPassword(String message) {
        registerView.errorPassword(message);
    }


}
