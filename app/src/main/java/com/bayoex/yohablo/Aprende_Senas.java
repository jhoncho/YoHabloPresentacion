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

public class Aprende_Senas extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprende__senas);

        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listview);

        videoList=new ArrayList<>();
        //lista delos videos del abecedario
        videoList.add("a");
        videoList.add("b");
        videoList.add("c");
        videoList.add("ch");
        videoList.add("d");
        videoList.add("e");
        videoList.add("f");
        videoList.add("g");
        videoList.add("h");
        videoList.add("i");
        videoList.add("j");
        videoList.add("k");
        videoList.add("l");
        videoList.add("ll");
        videoList.add("m");
        videoList.add("n");
        videoList.add("o");
        videoList.add("p");
        videoList.add("q");
        videoList.add("r");
        videoList.add("rr");
        videoList.add("s");
        videoList.add("t");
        videoList.add("u");
        videoList.add("v");
        videoList.add("w");
        videoList.add("x");
        videoList.add("y");
        videoList.add("z");

        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), position +"",Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.b));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.c));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ch));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.d));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.e));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.f));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.g));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.h));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.i));
                        break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.j));
                        break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.k));
                        break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.l));
                        break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ll));
                        break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.m));
                        break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.n));
                        break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.o));
                        break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.p));
                        break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.q));
                        break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.r));
                        break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rr));
                        break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.s));
                        break;
                    case 22:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.t));
                        break;
                    case 23:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.u));
                        break;
                    case 24:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v));
                        break;
                    case 25:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.w));
                        break;
                    case 26:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.x));
                        break;
                    case 27:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.y));
                        break;
                    case 28:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.z));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(Aprende_Senas.this));
                videoView.requestFocus();
                videoView.start();
            }
        });

    }
}
