package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hindi = " + reportCard.getHindi_grade());
        arrayList.add("English = " + reportCard.getEnglish_grade());
        arrayList.add("Maths = " + reportCard.getMaths_grade());
        arrayList.add("Science = " + reportCard.getScience_grade());
        arrayList.add("Computer Science = " + reportCard.getComputer_grade());


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}