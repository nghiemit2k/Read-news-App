package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.models.TinTuc;

import java.util.ArrayList;

public class BanTinActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<TinTuc> mListTinTuc;
    private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ban_tin2);
    }
}