package com.example.fluks77.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> nTeam1 = new ArrayList<>();
    private ArrayList<String> nTeam2 = new ArrayList<>();
    private ArrayList<String> nScore1 = new ArrayList<>();
    private ArrayList<String> nScore2 = new ArrayList<>();
    private ArrayList<String> nImg1 = new ArrayList<>();
    private ArrayList<String> nImg2 = new ArrayList<>();
    private ArrayList<String> url = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filling();
    }

    private void filling(){
        nTeam1.add("AFC Bour");
        nTeam2.add("Man. United");
        url.add("http://www.espn.com/soccer/matchstats?gameId=480740");
        nScore1.add("1");
        nScore2.add("2");
        nImg1.add("https://seeklogo.com/images/A/afc-bournemouth-logo-FAA541D485-seeklogo.com.png");
        nImg2.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");

        nTeam1.add("Man. United");
        nTeam2.add("Everton");
        url.add("http://www.espn.com/soccer/report?gameId=513744");
        nScore1.add("2");
        nScore2.add("1");
        nImg1.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");
        nImg2.add("https://i.pinimg.com/originals/1a/69/6f/1a696fef6fdaa806335c84d1b40f8de2.png");


        nTeam1.add("Man. United");
        nTeam2.add("Juventus");
        url.add("http://www.espn.com/soccer/matchstats?gameId=526471");
        nScore1.add("0");
        nScore2.add("1");
        nImg1.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");
        nImg2.add("https://s3.amazonaws.com/freebiesupply/large/2x/juventus-logo-png-transparent.png");

        nTeam1.add("Chelsea");
        nTeam2.add("Man. United");
        url.add("http://www.espn.co.uk/football/report?gameId=513756");
        nScore1.add("2");
        nScore2.add("2");
        nImg1.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e1.png");
        nImg2.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");

        nTeam1.add("Man. United");
        nTeam2.add("Newcastle");
        url.add("http://www.espn.com/soccer/report?gameId=513767");
        nScore1.add("3");
        nScore2.add("2");
        nImg1.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");
        nImg2.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4ec.png");

        nTeam1.add("Man. United");
        nTeam2.add("Valencia");
        url.add("http://www.espn.com/soccer/report?gameId=526489");
        nScore1.add("0");
        nScore2.add("0");
        nImg1.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");
        nImg2.add("https://clipart.info/images/ccovers/1503438216valencia-logo-png.png");

        nTeam1.add("West Ham");
        nTeam2.add("Man. United");
        url.add("http://www.espn.com/soccer/report?gameId=513776");
        nScore1.add("3");
        nScore2.add("1");
        nImg1.add("https://cdn.freebiesupply.com/logos/large/2x/west-ham-united-fc-2-logo-png-transparent.png");
        nImg2.add("http://assets.stickpng.com/thumbs/580b57fcd9996e24bc43c4e7.png");








        initRecycler();
    }

    private void initRecycler(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RVadapter adapter = new RVadapter(this, nTeam1, nTeam2, url, nScore1, nScore2, nImg1, nImg2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
