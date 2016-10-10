package com.pereira.fabio.recylerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView castMemberRecyclerView;
    CastMemberRecyclerViewAdapter castMemberRecyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    ArrayList<CastMember> castMemberArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        castMemberRecyclerView = (RecyclerView) findViewById(R.id.activity_recycler_view);
        castMemberRecyclerView.setHasFixedSize(true);
        recyclerViewLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        castMemberRecyclerView.setLayoutManager(recyclerViewLayoutManager);

        initCastMemberArrayList();

        castMemberRecyclerViewAdapter = new CastMemberRecyclerViewAdapter(castMemberArrayList);
        castMemberRecyclerView.setAdapter(castMemberRecyclerViewAdapter);
    }

    private void initCastMemberArrayList() {
        castMemberArrayList = new ArrayList<>();

        castMemberArrayList.add(new CastMember(getString(R.string.marcos_name), "Olar"));
        castMemberArrayList.add(new CastMember(getString(R.string.simone_name), "Olar"));
        castMemberArrayList.add(new CastMember(getString(R.string.malu_name), "Olar"));
        castMemberArrayList.add(new CastMember(getString(R.string.adriano_name), "Olar"));
    }
}