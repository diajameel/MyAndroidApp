package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {
    Button  btnLogin;
    Button  btnSignin;
    RadioButton radCust,radGarage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginAccount), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
              });
        radCust=new RadioButton(this);
        radGarage=new RadioButton(this);

        btnLogin=findViewById( R.id.btnLogin);
        btnLogin.setOnClickListener(e->{
if(radCust.isChecked()) {
    Intent intent = new Intent(LogIn.this, signUp.class);
    startActivity(intent);
} else if (radGarage.isChecked()) {
    Intent intent = new Intent(LogIn.this, GarageSignUp.class);
    startActivity(intent);
}

});
        btnSignin=findViewById( R.id.btnSignin);
        btnSignin.setOnClickListener(e->{
            if(radCust.isChecked()) {
                Intent intent = new Intent(LogIn.this, SearchGarage.class);
                startActivity(intent);
            }else if (radGarage.isChecked()) {
                Intent intent = new Intent(LogIn.this, GarageSignUp.class);
                startActivity(intent);
            }
       });
    }
}