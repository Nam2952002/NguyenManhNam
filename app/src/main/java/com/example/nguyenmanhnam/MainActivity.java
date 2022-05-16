package com.example.nguyenmanhnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edUser, edEmail, edDes;
    Spinner spinner;
    CheckBox ckBox;
    Button btSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edUser = findViewById(R.id.edUser);
        edEmail = findViewById(R.id.edEmail);
        edDes = findViewById(R.id.edDes);
        ckBox = findViewById(R.id.ckBox);
        btSend = findViewById(R.id.btSend);
        btSend.setOnClickListener(this);

        setSpinner();

    }

    @Override
    public void onClick(View view) {
        if (view == btSend){
            onValidate();
        }
    }

    private void setSpinner(){
        String[] genders = {"Male", "Female", "Unknown"};
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                genders);
        this.spinner.setAdapter(adapter);}

    private void onValidate(){
        if (edUser.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter user name", Toast.LENGTH_LONG).show();
            return;
        }
        if (edEmail.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter email", Toast.LENGTH_LONG).show();
            return;
        }
        if (edDes.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter description", Toast.LENGTH_LONG).show();

        }

        if (!ckBox.isChecked()){
            Toast.makeText(this,"Please check", Toast.LENGTH_LONG).show();
            return;
        }


    }
}
