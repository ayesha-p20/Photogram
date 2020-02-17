package com.example.photogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Region;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername;
    TextInputEditText etPassword;
    Button btnLogin;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                login(username,password);

            }
        });
        }

    private void login(String username, String password) {
        //open new activity if login info is correct
        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) { //null if no exception
                if (e != null){
                    Log.e(TAG,"Incorrect username or password");
                    e.printStackTrace();
                    return;
                }

                goMainActivity();

            }
        });
    }

    private void goMainActivity() {
        Log.d(TAG,"Navigating to MainActivity");
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();  //when user presses back icon from main activity, the app closes

    }


}

