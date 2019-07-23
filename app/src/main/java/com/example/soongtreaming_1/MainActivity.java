package com.example.soongtreaming_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button broadcast;
    private Button subscribe;
    private Button setting;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    String[] myDataset = {"안녕", "숭실대", "소프트프로젝트"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcast = (Button) findViewById(R.id.buttonBroad);
        subscribe = (Button) findViewById(R.id.buttonSub);
        setting = (Button) findViewById(R.id.buttonSetting);

        broadcast.setOnClickListener(this);
        subscribe.setOnClickListener(this);
        setting.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSetting:
                Log.i("test", "MainActivity");
                Intent intentSetting = new Intent(this, TestListActivity.class);
                startActivity(intentSetting);
                break;

            case R.id.buttonBroad :
                Intent intentBroad = new Intent(this, TestListActivity.class);
                startActivity(intentBroad);
                break;

            case R.id.buttonSub :
                Intent intentSub = new Intent(this, TestListActivity.class);
                startActivity(intentSub);
                break;
        }
    }
}
