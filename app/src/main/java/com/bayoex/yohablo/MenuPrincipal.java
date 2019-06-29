package com.bayoex.yohablo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }
    //para cambiar al chat
    public void hablar(View view)
    {
        Intent hablar = new Intent(this, LoginActivity.class);
        startActivity(hablar);
    }
    //para cambiar al convertidor de texto a voz
    public void texto_voz(View view)
    {
        Intent texto_voz = new Intent(this, textoVoz.class);
        startActivity(texto_voz);
    }//para cambiar al convertidor de voz a texto
    public void voz_texto(View view)
    {
        Intent voz_texto = new Intent(this, VozTexto.class);
        startActivity(voz_texto);
    }
}
