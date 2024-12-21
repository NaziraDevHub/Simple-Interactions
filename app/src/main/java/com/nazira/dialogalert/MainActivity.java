package com.nazira.dialogalert;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        makeToast();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeDialog();
            }
        });

    }

    private void makeToast(){

        Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
    }

    private void makeDialog(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("This is a title")
                .setMessage("Hello")
                .show();

    }
}