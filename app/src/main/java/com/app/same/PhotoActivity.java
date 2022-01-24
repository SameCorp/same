package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class PhotoActivity extends AppCompatActivity implements View.OnClickListener{

  Button nextButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_photo);

    nextButton = (Button) findViewById(R.id.bNext2);
    nextButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bNext2:
        Intent intentTest = new Intent(this, TestActivity.class);
        startActivity(intentTest);
        break;
      default:
        break;
    }
  }

}