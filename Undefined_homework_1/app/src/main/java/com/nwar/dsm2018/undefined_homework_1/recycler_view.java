package com.nwar.dsm2018.undefined_homework_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


public class recycler_view extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setTheme(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        ArrayList<RecyclerItem> mItems = new ArrayList<>();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(mItems);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
        mItems.add(new RecyclerItem(R.drawable.mainimage,"저희집에 놀러오세요!!","저희집은 넓은 평수와 한강뷰를 자랑하고 있으며..."));
    }
}
