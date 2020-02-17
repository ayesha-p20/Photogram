package com.example.photogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText etDescription;
    private Button btnTakepic;
    private Button btnSubmit;
    private ImageView ivPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDescription = findViewById(R.id.etDescription);
        btnTakepic = findViewById(R.id.btnTakepic);
        ivPic = findViewById(R.id.ivPic);
        btnSubmit = findViewById(R.id.btnSubmit);
    }
}
