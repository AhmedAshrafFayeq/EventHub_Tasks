package com.example.registrationtaask;

import android.content.Intent;



public interface RegisterContract {
    interface RegisterView {
        void showToast(String message);
        void errorEmail(String message);
        void errorPassword(String message);
        void errorUserName(String message);
    }

    interface RegisterPresenter {


        void updateMessage(String message);
        boolean validateEmail(String email);
        void updateErrorEmail(String message);
        boolean validatePassword(String password);
        void updateErrorPassword(String message);
        boolean validateUsername(String userName);
        void updateErrorUsername(String userName);
    }
}
