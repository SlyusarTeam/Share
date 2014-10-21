package com.example.vi34.test_project;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vi34 on 14.10.14.
 */
public class MyAdapter<T> extends BaseAdapter {
    private List<T> data;

    public MyAdapter(List<T> data) {

        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list, parent, false);

        //TextView txt = (TextView)convertView.findViewById(android.R.id.text1);
        ((Button)((LinearLayout)v).getChildAt(1)).setId(position);
        ((TextView)((LinearLayout)v).getChildAt(0)).setText(String.valueOf(data.get(position)));
        ((TextView)((LinearLayout)v).getChildAt(0)).setTextColor(position % 2 == 1 ? Color.WHITE : Color.BLACK);
        getItem(position);
        return v;
    }
}
