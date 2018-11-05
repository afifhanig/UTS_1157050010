package com.example.fluks77.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        terimadata();
    }

    public void terimadata(){
        if(getIntent().hasExtra("tim1")&&getIntent().hasExtra("tim2")&&getIntent().hasExtra("scr1")&&getIntent().hasExtra("scr2")&&getIntent().hasExtra("imgt1")&&getIntent().hasExtra("imgt2")){
            String timone = getIntent().getStringExtra("tim1");
            String timsecond = getIntent().getStringExtra("tim2");
            String timscr1 = getIntent().getStringExtra("scr1");
            String timscr2 = getIntent().getStringExtra("scr2");
            String imagetim1 = getIntent().getStringExtra("imgt1");
            String imagetim2 = getIntent().getStringExtra("imgt2");
            setAll(timone, timsecond, timscr1, timscr2, imagetim1, imagetim2);
        }
    }

    private void setAll(String timsatu, String timdua, String tm1scr, String tm2scr, String imga1, String imga2){
        TextView tm1 = findViewById(R.id.tm1);
        tm1.setText(timsatu);
        TextView tm2 = findViewById(R.id.tm2);
        tm2.setText(timdua);
        TextView sc1 = findViewById(R.id.tm1_s);
        sc1.setText(tm1scr);
        TextView sc2 = findViewById(R.id.tm2_s);
        sc2.setText(tm2scr);

        ImageView ig1 = findViewById(R.id.img1);
        Glide.with(this)
                .asBitmap()
                .load(imga1)
                .into(ig1);

        ImageView ig2 = findViewById(R.id.img2);
        Glide.with(this)
                .asBitmap()
                .load(imga2)
                .into(ig2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.det){
            String urlMatch = getIntent().getStringExtra("url");
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlMatch));
            startActivity(intent);
        }
        if(item.getItemId()==R.id.rumah){
            Intent intent = new Intent(getApplicationContext(), Home.class);
            startActivity(intent);
        }
        return true;
    }
}
