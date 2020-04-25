package com.example.baitapthayhoanganh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText1,editText2;
Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.edt_TaiKhoan);
        editText2=(EditText) findViewById(R.id.edt_MatKhau);
        btn1=(Button) findViewById(R.id.btn_Login);
        btn2=(Button) findViewById(R.id.btn_Reset);
        btn3=(Button) findViewById(R.id.btn_Help);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("sa")&&editText2.getText().toString().equals("sa")){
                    Intent intent=new Intent(getApplicationContext(),Welcome.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"lỗi nha cậu",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("sa")&&editText2.getText().toString().equals("sa")){
                    Intent intent=new Intent(getApplicationContext(),Help.class);
                    startActivity(intent);
                }
            }
        });
    }
}
