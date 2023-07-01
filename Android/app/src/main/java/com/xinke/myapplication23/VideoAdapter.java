package com.xinke.myapplication23;

import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class VideoAdapter extends BaseAdapter {
    List<Video> vd;
    Context context;
    public VideoAdapter(Context context, List<Video> vd){
        this.vd=vd;
        this.context=context;
    }
    @Override
    public int getCount() { //有多少子项
        return vd.size();
    }

    @Override
    public Object getItem(int position) { //在position位置的数据
        return vd.get(position);
    }

    @Override
    public long getItemId(int position) { //在position位置的数据的id什么
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_voideof,null,false);
            Video video = (Video) getItem(position);
            TextView titleTV = convertView.findViewById(R.id.title);
            titleTV.setText(video.getTitle());
            TextView bfTV = convertView.findViewById(R.id.bfcs);
            bfTV.setText(video.getNum());
            TextView sjTV = convertView.findViewById(R.id.sj);
            sjTV.setText(video.getTime());
        }
        return convertView;
    }
}
