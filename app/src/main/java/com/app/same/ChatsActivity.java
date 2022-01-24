package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ChatsActivity extends AppCompatActivity implements View.OnClickListener{

  Button frindsChatButton;
  Button chatNameButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_chats);

    frindsChatButton = (Button) findViewById(R.id.bFriendsChats);
    frindsChatButton.setOnClickListener(this);
    chatNameButton = (Button) findViewById(R.id.bChatName);
    chatNameButton.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bChatName:
        Intent intentSelectedChat = new Intent(this, SelectedChatActivity.class);
        startActivity(intentSelectedChat);
        break;
      case R.id.bFriendsChats:
        Intent intentFriends = new Intent(this, FriendsActivity.class);
        startActivity(intentFriends);
        break;
      default:
        break;
    }
  }

}