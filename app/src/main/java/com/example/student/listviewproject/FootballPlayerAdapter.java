package com.example.student.listviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FootballPlayerAdapter extends BaseAdapter {
    private Context ctx;
    private int layout;
    private ArrayList<FootballPlayer> list;

    public FootballPlayerAdapter(Context ctx, int layout, ArrayList<FootballPlayer> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        FootballPlayer player = list.get(i);
        LayoutInflater inflater = LayoutInflater.from(ctx);
        v = inflater.inflate(R.layout.football_player, null);
        TextView tvName, tvBirthday;
        ImageView ivCountry;
        tvName = v.findViewById(R.id.tvName);
        tvBirthday = v.findViewById(R.id.tvBirthday);
        ivCountry = v.findViewById(R.id.ivCountry);
        tvName.setText(player.getName());
        tvBirthday.setText(Integer.toString(player.getBirthday()));
        ivCountry.setImageResource(player.getCountry());
        return v;
    }
}
