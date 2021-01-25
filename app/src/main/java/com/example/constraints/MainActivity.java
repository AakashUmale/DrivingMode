package com.example.constraints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    Button btn;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.textView3);
        et1 = findViewById(R.id.editTextTextEmailAddress);
        et2 = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et1.getText().toString().equals("aakash@gmail.com") & et2.getText().toString().equals("123")){
                    Intent intent = new Intent(getApplicationContext(),USERINTERFACE.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"you entered wrong password.",Toast.LENGTH_LONG).show();
                }
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SignUp.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"You Clicked on SignUp TextView.",Toast.LENGTH_LONG).show();
            }
        });
    }
}