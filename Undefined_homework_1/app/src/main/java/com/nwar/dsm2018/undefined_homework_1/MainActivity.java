package com.nwar.dsm2018.undefined_homework_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen);
        e1 = (EditText)findViewById(R.id.id);
        e2 = (EditText)findViewById(R.id.password);
    }
    public void loginButton(View v) {
        if (e1.getText().toString().length() == 0 || e2.getText().toString().length() == 0) {
            Toast.makeText(this, "아이디와 비밀번호 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "로그인 성공", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,recycler_view.class);
            e1.setText("");
            e2.setText("");
            startActivity(intent);
        }
    }
}
