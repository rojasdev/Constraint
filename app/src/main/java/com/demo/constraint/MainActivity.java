package com.demo.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvOne, tvTwo;
    int counterOne = 0;
    int counterTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = (TextView) findViewById(R.id.tv_one);
        tvTwo = (TextView) findViewById(R.id.tv_tw);

        Button btnOne = (Button) findViewById(R.id.btn_one);
        Button btnTwo = (Button) findViewById(R.id.btn_two);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view instanceof Button) {
            Button button = (Button) view;

            // Get the ID of the clicked Button
            int buttonId = button.getId();
            Toast toast;

            if (buttonId == R.id.btn_one) {
                toast = Toast.makeText(getApplicationContext(), "Button One....", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 180); // Adjust the vertical offset as needed
                toast.show();
                counterOne += 1;
                tvOne.setText(Integer.toString(counterOne));
            } else if (buttonId == R.id.btn_two) {
                toast = Toast.makeText(getApplicationContext(), "Button Two....", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 180); // Adjust the vertical offset as needed
                toast.show();
                counterTwo += 1;
                tvTwo.setText(Integer.toString(counterTwo));
            }
        }
    }
}