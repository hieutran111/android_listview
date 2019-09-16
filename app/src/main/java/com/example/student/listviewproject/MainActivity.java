package com.example.student.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFootballPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFootballPlayer = findViewById(R.id.lvFootballPlayer);
        ArrayList<FootballPlayer> list = new ArrayList<>();
        FootballPlayer f1 = new FootballPlayer("Ronaldo", 1979, R.drawable.brazil);
        list.add(f1);
        FootballPlayer f2 = new FootballPlayer("Zidane", 1979, R.drawable.france);
        list.add(f2);
        FootballPlayerAdapter adapter = new FootballPlayerAdapter(this, R.layout.football_player, list);
        lvFootballPlayer.setAdapter(adapter);
    }
}
