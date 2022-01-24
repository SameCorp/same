package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class FriendsActivity extends AppCompatActivity implements View.OnClickListener{

  Button allChatButton;
  Button chatNameButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_friends);

    allChatButton = (Button) findViewById(R.id.bAllChats);
    allChatButton.setOnClickListener(this);
    chatNameButton = (Button) findViewById(R.id.bChatName2);
    chatNameButton.setOnClickListener(this);

  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bChatName2:
        Intent intentSelectedChat = new Intent(this, SelectedChatActivity.class);
        startActivity(intentSelectedChat);
        break;
      case R.id.bAllChats:
        Intent intentAllChats = new Intent(this, ChatsActivity.class);
        startActivity(intentAllChats);
        break;
      default:
        break;
    }
  }

}