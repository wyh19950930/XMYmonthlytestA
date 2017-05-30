package com.bwei.haozi.moni0527;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.bwei.haozi.moni0527.newsdrag.ChannelActivity;

public class MainActivity extends Activity {

    private Button jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button jump =  (Button) findViewById(R.id.jump);

    jump.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(MainActivity.this, ChannelActivity.class);

            startActivity(intent);

        }
    });

    }
}
