package com.example.fluks77.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RVadapter extends RecyclerView.Adapter<RVadapter.ViewHolder>{
    private ArrayList<String> team1 = new ArrayList<>();
    private ArrayList<String> team2 = new ArrayList<>();
    private ArrayList<String> mUrl = new ArrayList<>();
    private ArrayList<String> score1 = new ArrayList<>();
    private ArrayList<String> score2 = new ArrayList<>();
    private ArrayList<String> image1 = new ArrayList<>();
    private ArrayList<String> image2 = new ArrayList<>();
    private Context mContext;

    public RVadapter( Context mContext, ArrayList<String> team1, ArrayList<String> team2, ArrayList<String> mUrl, ArrayList<String> score1, ArrayList<String> score2, ArrayList<String> image1, ArrayList<String> image2) {
        this.team1 = team1;
        this.team2 = team2;
        this.mUrl = mUrl;
        this.score1 = score1;
        this.score2 = score2;
        this.image1 = image1;
        this.image2 = image2;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listmatch, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.t1.setText(team1.get(i));
        viewHolder.t2.setText(team2.get(i));

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "This is A Great Match", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, Detail.class);
                intent.putExtra("tim1",team1.get(i));
                intent.putExtra("tim2",team2.get(i));
                intent.putExtra("url", mUrl.get(i));
                intent.putExtra("scr1",score1.get(i));
                intent.putExtra("scr2", score2.get(i));
                intent.putExtra("imgt1",image1.get(i));
                intent.putExtra("imgt2",image2.get(i));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return team1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView t1;
        TextView t2;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.tim1);
            t2 = itemView.findViewById(R.id.tim2);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

