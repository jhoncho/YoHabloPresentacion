package com.bayoex.yohablo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class textoVoz extends AppCompatActivity {

    private Button hablarahoraboton;
    private EditText editText;
    TTSManager ttsManager= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_voz);

        ttsManager=new TTSManager();
        ttsManager.init(this);

        editText=findViewById(R.id.ingreso_texto);
        hablarahoraboton=findViewById(R.id.hablar_ahora);

        hablarahoraboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  text = editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }
}
