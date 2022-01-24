package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectedChatActivity extends AppCompatActivity implements View.OnClickListener{

  ImageButton backButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_selected_chat);

    backButton = (ImageButton) findViewById(R.id.imageButtonBack);
    backButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.imageButtonBack:
        Intent intentBack = new Intent(this, ChatsActivity.class);
        startActivity(intentBack);
        break;
      default:
        break;
    }
  }

}