package com.example.registrationtaask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements RegisterContract.RegisterView{

    private Button signup, signin;
    private EditText nametxt, emailtxt, passtxt, repasstxt;
    private RegisterPresenterImpl registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerPresenter = new RegisterPresenterImpl(this);
        signup = findViewById(R.id.btn_signUp);
        nametxt = findViewById(R.id.usernameTxt);
        emailtxt = findViewById(R.id.emailTxt);
        passtxt = findViewById(R.id.passwordTxt);
        repasstxt = findViewById(R.id.repasswordTxt);

    }

    @Override
    public void showToast(String message) {

    }

    @Override
    public void errorEmail(String message) {

    }

    @Override
    public void errorPassword(String message) {

    }

    @Override
    public void errorUserName(String message) {

    }
}
