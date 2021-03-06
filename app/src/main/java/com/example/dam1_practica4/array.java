package com.example.dam1_practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.text.ChoiceFormat;

public class array extends AppCompatActivity {
    private ImageView img;
    private ViewGroup rootLayout;
    private int _xDelta;
    private int _yDelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        rootLayout = (ViewGroup) findViewById (R.id.view_root);
        img = (ImageView) rootLayout.findViewById (R.id.imageView1) ;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams (150, 150);
        img.setLayoutParams (layoutParams);
        img.setOnTouchListener(new ChoiceTouchListener());
    }
    private final class ChoiceTouchListener implements View.OnTouchListener {
        public boolean onTouch( View view, MotionEvent event){
            final int X = (int) event.getRawX () ;
            final int Y= (int) event.getRawY();
            switch (event.getAction () & MotionEvent.ACTION_MASK) {
                case MotionEvent.ACTION_DOWN:
                    RelativeLayout.LayoutParams tParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    _xDelta = X - tParams.leftMargin;
                    _yDelta = Y - tParams.topMargin;
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE:
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                            .getLayoutParams();
                    layoutParams.leftMargin = X - _xDelta;
                    layoutParams.topMargin = Y - _yDelta;
                    layoutParams.rightMargin = -250;
                    layoutParams.bottomMargin = -250;
                    view.setLayoutParams(layoutParams);
                    break;
            }
            rootLayout.invalidate();
            return true;

        }
    }

}
