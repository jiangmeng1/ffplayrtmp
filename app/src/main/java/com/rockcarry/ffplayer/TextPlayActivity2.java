package com.rockcarry.ffplayer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextPlayActivity2 extends Activity {
    private EditText edRtmp;
    private TextView tvRtmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_play2);
        edRtmp=findViewById(R.id.ed_rtmp);
        tvRtmp=findViewById(R.id.tv_rtmp);
        tvRtmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TextPlayActivity2.this,MainActivity.class);
                intent.putExtra("rtmp",edRtmp.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}