package com.kiran.memesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String q1 = "Why don't scientists trust atoms? Because they make up everything!";
    String q2 = "How does a penguin build its house? Igloos it together!";
    String q3 = "What did one wall say to the other wall? I'll meet you at the corner!";
    String q4 = "Why don't skeletons fight each other? They don't have the guts!";
    String q5 = "Why did the scarecrow win an award? Because he was outstanding in his field!";
    String q6 = "How does a dog stop a video? It presses the paws button!";
    String q7 = "What did one ocean say to the other ocean? Nothing, they just waved!";
    String q8 = "Why did the bicycle fall over? It was two-tired!";
    String q9 = "What do you call a bear with no teeth? A gummy bear!";
    String q10 = "How do you organize a space party? You \"planet\"!";
    String q11 = "Why did the tomato turn red? Because it saw the salad dressing!";
    String q12 = "What do you call a fake noodle? An impasta!";
    String q13= "Why don't oysters donate to charity? Because they are shellfish!";
    String q14= "Why did the math book look sad? Because it had too many problems!";
    String q15 = "How do you catch a squirrel? Climb a tree and act like a nut!";
    String q16 = "Why did the golfer bring two pairs of pants? In case he got a hole in one!";
    String q17= "What do you call a snowman with a six-pack? An abdominal snowman!";
    String q18 = "How does a vampire start a letter? Tomb it may concern...";
    String q19 = "Why did the cookie go to the doctor? It was feeling crumby!";
    String q20= "What did one hat say to the other hat? You stay here, I'll go on ahead!";
    String q21 = "How do you organize a space party? You \"planet\"!";
    String q22 = "Why don't scientists trust atoms? Because they make up everything!";
    String q23 = "What did the grape say when it got stepped on? Nothing, it just let out a little wine!";
    String q24 = "Why did the scarecrow win an award? Because he was outstanding in his field!";
    String q25 = "How do you make a tissue dance? You put a little boogie in it!";
    String q26 = "What do you call a snowman with a six-pack? An abdominal snowman!";
    String q27 = "Why did the computer go to the doctor? Because it had a virus!";
    String q28 = "What's brown and sticky? A stick!";
    String q29 = "Why did the tomato turn red? Because it saw the salad dressing!";
    String q30 = "How do you make a lemon drop? Just let it fall!";


    RecyclerView recyclerView;

    myAdapter adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList = new ArrayList<>();
        adapter= new myAdapter(arrayList);
        recyclerView.setAdapter(adapter);

        arrayList.add(q1);
        arrayList.add(q2);
        arrayList.add(q3);
        arrayList.add(q4);
        arrayList.add(q5);
        arrayList.add(q6);

        arrayList.add(q7);
        arrayList.add(q8);
        arrayList.add(q9);
        arrayList.add(q10);
        arrayList.add(q11);
        arrayList.add(q12);
        arrayList.add(q13);
        arrayList.add(q14);
        arrayList.add(q15);
        arrayList.add(q16);
        arrayList.add(q17);
        arrayList.add(q18);
        arrayList.add(q19);
        arrayList.add(q20);
        arrayList.add(q21);
        arrayList.add(q22);
        arrayList.add(q23);
        arrayList.add(q24);
        arrayList.add(q25);
        arrayList.add(q26);
        arrayList.add(q27);
        arrayList.add(q28);
        arrayList.add(q29);
        arrayList.add(q30);


        adapter.notifyDataSetChanged();


    }
}