package com.example.friendsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //array to store listview data

    String[] listName = new String[]{
            "Krati", "Raghvendra", "Abhimanyu", "Aryan", "Manas"
    };

    String[] listCatchphrase = new String[]{
            "Life is beautiful", "Everything is a mistake", "Spread knowledge, Grow together", "I don't know what to do", "I have a cunning plan! "
    };

    int [] listImages = new int[]{
            R.drawable.krati,
            R.drawable.raghvendra,
            R.drawable.abhimanyu,
            R.drawable.aryan,
            R.drawable.manas

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String >>();
        for(int i = 0; i<5; i++){
            HashMap<String, String > hm = new HashMap<String, String>();
            hm.put("ListName", listName[i]);
            hm.put("ListCatchphrase", listCatchphrase[i]);
            hm.put("ListImages", Integer.toString(listImages[i]));
            aList.add(hm);

        }

        String[] from = {
             "ListImages", "ListName", "ListCatchphrase"
        };

        int[] to = {
            R.id.list_image, R.id.name, R.id.catchphrase
        };

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.layout_items, from, to);

        ListView simpleListView = (ListView)findViewById(R.id.list_view);

        simpleListView.setAdapter(simpleAdapter);
    }
}