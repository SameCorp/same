package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

  Button entranceButton;
  Button toEntranceButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_register);

    entranceButton = (Button) findViewById(R.id.bNext);
    entranceButton.setOnClickListener(this);
    toEntranceButton = (Button) findViewById(R.id.bToEntrance);
    toEntranceButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bNext:
        Intent intentGetPhoto = new Intent(this, PhotoActivity.class);
        startActivity(intentGetPhoto);
        break;
      case R.id.bToEntrance:
        Intent intentEntrance = new Intent(this, MainActivity.class);
        startActivity(intentEntrance);
        break;
      default:
        break;
    }
  }

}