package com.xinke.myapplication23;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_xq, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Inflate the layout for this fragment
        ListView lv =(ListView)getView().findViewById(R.id.listview);
        List<Video> data =new ArrayList<>();
        Video vd = new Video();
        vd.num="9999次播放";
        vd.title="3LAU-Carly Paige-Touch(标清)";
        vd.path="lau";
        vd.time="3:17";
        data.add(vd);

        Video vd1 = new Video();
        vd1.num="9999次播放";
        vd1.title="Calvin Harris-Ellie Goulding-Outside(标清)";
        vd1.time="3:45";
        vd1.path="calvin";
        data.add(vd1);

        Video vd2 = new Video();
        vd2.num="9999次播放";
        vd2.title="G.E.M. 邓紫棋-你不是真正的快乐(标清)";
        vd2.path="dzq";
        vd2.time="5:41";
        data.add(vd2);

        Video vd3 = new Video();
        vd3.num="9999次播放";
        vd3.title="新歌热推站-《Right Na Na Na》编舞(标清)";
        vd3.time="2:22";
        vd3.path="nana";
        data.add(vd3);
        final VideoAdapter va=new VideoAdapter(this.getContext(),data);
        lv.setAdapter(va);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Video video =(Video) va.getItem(position);
                Intent intent =new Intent(getActivity(),SpxqActivity.class);
               Video.getpath= video.path;
                startActivity(intent);
            }
        });
    }
}