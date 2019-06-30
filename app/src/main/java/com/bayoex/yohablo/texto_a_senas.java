package com.bayoex.yohablo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class texto_a_senas extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_a_senas);

        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listview);

        videoList=new ArrayList<>();
        //lista delos videos de las palabras
        videoList.add("Buenas Noches");
        videoList.add("Buenos Tardes");
        videoList.add("Buenos Dias");
        videoList.add("Chau");
        videoList.add("Como estas");
        videoList.add("Estoy Bien");
        videoList.add("Gracias");
        videoList.add("Hola");
        videoList.add("Lo Siento");
        videoList.add("Mal");
        videoList.add("Mas o Menos");
        videoList.add("No");
        videoList.add("Nombre");
        videoList.add("No Puedo");
        videoList.add("Permiso");
        videoList.add("Por Favor");
        videoList.add("Puedo");
        videoList.add("Si");
        videoList.add("Te Amor");

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), position +"",Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.buenasnoches));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.buenastardes));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.buenosdias));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.chau));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.comoestas));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.estoybien));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.gracias));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hola));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.losiento));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mal));
                        break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.masomenos));
                        break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.no));
                        break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nombre));
                        break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nopuedo));
                        break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.permiso));
                        break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.porfavor));
                        break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.puedo));
                        break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.si));
                        break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.teamo));
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(texto_a_senas.this));
                videoView.requestFocus();
                videoView.start();
            }
        });

    }
}
