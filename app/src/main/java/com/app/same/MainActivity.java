package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  Button entranceButton;
  Button toRegisterButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);

    entranceButton = (Button) findViewById(R.id.bNext);
    entranceButton.setOnClickListener(this);
    toRegisterButton = (Button) findViewById(R.id.bToRegister);
    toRegisterButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bNext:
        Intent intentAccount = new Intent(this, AccountActivity.class);
        startActivity(intentAccount);
        break;
      case R.id.bToRegister:
        Intent intentRegister = new Intent(this, RegisterActivity.class);
        startActivity(intentRegister);
        break;
      default:
        break;
    }
  }

}