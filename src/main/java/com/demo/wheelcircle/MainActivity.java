package com.demo.wheelcircle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.wheelcircle.wheel.WheelMenu;
import com.demo.wheelcircle.wheel.WheelSelectionListener;


/**
 * Created by munnadroid on 9/23/14.
 */
public class MainActivity extends Activity implements WheelSelectionListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ImageView wheelImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeCircularWheel();
    }


    public void initializeCircularWheel() {
        wheelImage = (ImageView) findViewById(R.id.wheel);
        final WheelMenu wm = new WheelMenu(
                MainActivity.this, 7, R.drawable.wheel_number,
                wheelImage, true);

    }

    @Override
    public void onWheelSelectedListener(Integer result) {
        Log.v(TAG, "wheel selected...." + result);
        ((TextView) findViewById(R.id.textView)).setText("Selected Value: " + String.valueOf(result));
    }
}
