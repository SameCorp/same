package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener{

  ImageButton storeButton;
  ImageButton editButton;
  ImageButton settingsButton;
  Button chatsButton;
  Button findGroupsButton;
  Button mapButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_account);

    storeButton = (ImageButton) findViewById(R.id.imageButtonStore);
    storeButton.setOnClickListener(this);
    editButton = (ImageButton) findViewById(R.id.imageButtonEdit);
    editButton.setOnClickListener(this);
    settingsButton = (ImageButton) findViewById(R.id.imageButtonSettings);
    settingsButton.setOnClickListener(this);
    chatsButton = (Button) findViewById(R.id.bChats);
    chatsButton.setOnClickListener(this);
    /*findGroupsButton = (Button) findViewById(R.id.bFindGroups);
    findGroupsButton.setOnClickListener(this);*/
    mapButton = (Button) findViewById(R.id.bMap);
    mapButton.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.imageButtonStore:
        Intent intentStore = new Intent(this, StoreActivity.class);
        startActivity(intentStore);
        break;
      case R.id.imageButtonEdit:
        Intent intentEdit = new Intent(this, EditActivity.class);
        startActivity(intentEdit);
        break;
      case R.id.imageButtonSettings:
        Intent intentSettings = new Intent(this, SettingsActivity.class);
        startActivity(intentSettings);
        break;
      case R.id.bChats:
        Intent intentChats = new Intent(this, ChatsActivity.class);
        startActivity(intentChats);
        break;
      /*case R.id.bFindGroups:
        Intent intentFindGroups = new Intent(this, SettingsActivity.class);
        startActivity(intentFindGroups);
        break;*/
      case R.id.bMap:
        Intent intentMap = new Intent(this, MapActivity.class);
        startActivity(intentMap);
        break;
      default:
        break;
    }
  }

}