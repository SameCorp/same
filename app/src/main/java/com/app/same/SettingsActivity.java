package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{

  Button toTestButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_settings);


    toTestButton = (Button) findViewById(R.id.bToTest);
    toTestButton.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bToTest:
        Intent intentToTest = new Intent(this, TestActivity.class);
        startActivity(intentToTest);
        break;
      default:
        break;
    }
  }

}