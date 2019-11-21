package com.example.practice_login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextInputEditText registrationNumber;
    TextInputEditText name;
    TextInputEditText password;
    TextInputEditText confirmPassword;
    MaterialButton show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registrationNumber=findViewById(R.id.number);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirm_password);
        show=findViewById(R.id.button_show);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(registrationNumber.getText().toString().isEmpty()||name.getText().toString().isEmpty()||
                        password.getText().toString().isEmpty()||confirmPassword.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Fill All the Details",Toast.LENGTH_SHORT).show();
                }
                else if(!password.getText().toString().equals(confirmPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Passwords DO NOT MATCH",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Bahut Shukriya",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
