package com.example.hw_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_entrance = findViewById(R.id.tv_entrance);
        TextView tv_welcome = findViewById(R.id.tv_welcome);
        TextView tv_mini1 = findViewById(R.id.tv_mini1);
        TextView tv_mini2 = findViewById(R.id.tv_mini2);
        CardView pasword_container = findViewById(R.id.password_container);
        CardView emailContainer = findViewById(R.id.email_container);



        EditText et_email = findViewById(R.id.et_email);
        EditText et_password = findViewById(R.id.et_password);

        TextView tv_forgot = findViewById(R.id.tv_forgot);
        TextView tv_click_here = findViewById(R.id.tv_click_here);

        Button btn_entrance = findViewById(R.id.btn_entrance);

        et_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_email.getText().toString().isEmpty()){
                    btn_entrance.setBackgroundColor(Color.GRAY);
                }
                else {
                    btn_entrance.setBackgroundColor(Color.YELLOW);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(et_password.getText().toString().isEmpty()){
                    btn_entrance.setBackgroundColor(Color.GRAY);
                }
                else {
                    btn_entrance.setBackgroundColor(Color.YELLOW);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btn_entrance.setOnClickListener(view -> {
            String enteredEmail = et_email.getText().toString();
            String enteredPassword = et_password.getText().toString();

            if (enteredEmail.equals("admin") || enteredPassword.equals("admin")){
                Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT);
                tv_welcome.setVisibility(View.VISIBLE);
                emailContainer.setVisibility(View.INVISIBLE);
                pasword_container.setVisibility(View.INVISIBLE);
                btn_entrance.setVisibility(View.INVISIBLE);
                tv_entrance.setVisibility(View.INVISIBLE);
                tv_forgot.setVisibility(View.INVISIBLE);
                et_email.setVisibility(View.INVISIBLE);
                et_password.setVisibility(View.INVISIBLE);
                tv_mini1.setVisibility(View.INVISIBLE);
                tv_mini2.setVisibility(View.INVISIBLE);
                tv_click_here.setVisibility(View.INVISIBLE);
            }
            else {
                Toast.makeText(MainActivity.this,"Неправильный логин и пароль",Toast.LENGTH_SHORT);
            }
        });
    }
}