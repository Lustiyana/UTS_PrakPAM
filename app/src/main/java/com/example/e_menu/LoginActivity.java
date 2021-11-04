package com.example.e_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do something in response to button click
                login();
            }
        });
    }
    public void login(){
        TextView usernameET = findViewById(R.id.username);
        TextView passwordET = findViewById(R.id.password);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if(username.equals("lustiyana") && password.equals("1197050061")){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            this.finish();
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "coba lagi", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}