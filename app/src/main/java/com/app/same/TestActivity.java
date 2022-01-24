package com.app.same;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

  private float x1, x2;
  private static int MIN_DISTANCE = 150;
  private GestureDetector gestureDetector;
  private int questionCount = 5;
  private int questionCounter = 0;

  TextView questionText;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_test);

    questionText = (TextView) findViewById(R.id.textViewQuestion);

    questionText.setText("Да - свайп вправо, нет - свайп влево");

    this.gestureDetector = new GestureDetector(TestActivity.this, this);

  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    gestureDetector.onTouchEvent(event);
    switch (event.getAction()){
      case MotionEvent.ACTION_DOWN:
        x1 = event.getX();
        break;
      case MotionEvent.ACTION_UP:
        x2 = event.getX();

        float valueX = x2 - x1;

        if (Math.abs(valueX) > MIN_DISTANCE && questionCounter <= questionCount){
          questionCounter++;
          if (x2 > x1){
            Toast.makeText(this, "Да", Toast.LENGTH_SHORT).show();
            String textI = questionCounter + " вопрос";
            questionText.setText(textI);
          }
          else{
            Toast.makeText(this, "Нет", Toast.LENGTH_SHORT).show();
            String textI = questionCounter + " вопрос";
            questionText.setText(textI);
          }
        }

        if (questionCounter >= questionCount+1){
          Intent intentAccount = new Intent(this, AccountActivity.class);
          startActivity(intentAccount);
        }

    }

    return super.onTouchEvent(event);
  }

  @Override
  public boolean onDown(MotionEvent e) {
    return false;
  }

  @Override
  public void onShowPress(MotionEvent e) {

  }

  @Override
  public boolean onSingleTapUp(MotionEvent e) {
    return false;
  }

  @Override
  public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
    return false;
  }

  @Override
  public void onLongPress(MotionEvent e) {

  }

  @Override
  public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
    return false;
  }
}