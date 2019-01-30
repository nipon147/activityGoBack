package com.example.nipon.activitygoback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);

            }
        });
                findViewById(R.id.button_x).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finishAffinity();
                        System.exit(0);

                    }
                });


    }//void
//    ถ้ากดปุ่ม Back จะไม่มีผลอะไร เพราะไม่มีคำสั่งใดๆ


    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}//main
