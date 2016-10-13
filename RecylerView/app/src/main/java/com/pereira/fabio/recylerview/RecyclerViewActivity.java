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
        castMemberRecyclerView.addItemDecoration(new GridSpacingItemDecoration(2, 16, true));
        castMemberRecyclerView.setHasFixedSize(true);
        recyclerViewLayoutManager = new GridLayoutManager(this, 2);
        castMemberRecyclerView.setLayoutManager(recyclerViewLayoutManager);

        initCastMemberArrayList();

        castMemberRecyclerViewAdapter = new CastMemberRecyclerViewAdapter(castMemberArrayList, this);
        castMemberRecyclerView.setAdapter(castMemberRecyclerViewAdapter);
    }

    private void initCastMemberArrayList() {
        castMemberArrayList = new ArrayList<>();

        castMemberArrayList.add(new CastMember(getString(R.string.evan_rachel_wood), getString(R.string.dolores_abernathy)));
        castMemberArrayList.add(new CastMember(getString(R.string.thandie_newton), getString(R.string.maeve_millay)));
        castMemberArrayList.add(new CastMember(getString(R.string.jeffrey_wright), getString(R.string.bernard_lowe)));
        castMemberArrayList.add(new CastMember(getString(R.string.james_marsden), getString(R.string.teddy_flood)));
        castMemberArrayList.add(new CastMember(getString(R.string.luke_hemsworth), getString(R.string.ashley_stubbs)));
        castMemberArrayList.add(new CastMember(getString(R.string.sidse_babett_knudsen), getString(R.string.theresa_cullen)));
        castMemberArrayList.add(new CastMember(getString(R.string.simon_quarterman), getString(R.string.lee_sizemore)));
        castMemberArrayList.add(new CastMember(getString(R.string.angela_sarafyan), getString(R.string.clementine_pennyfeather)));
        castMemberArrayList.add(new CastMember(getString(R.string.shannon_woodward), getString(R.string.elsie_hughes)));
        castMemberArrayList.add(new CastMember(getString(R.string.ed_harris), getString(R.string.man_in_black)));
        castMemberArrayList.add(new CastMember(getString(R.string.anthony_hopkins), getString(R.string.dr_robert_ford)));
        castMemberArrayList.add(new CastMember(getString(R.string.jimmi_simpson), getString(R.string.william)));
        castMemberArrayList.add(new CastMember(getString(R.string.rodrigo_santoro), getString(R.string.hector_escaton)));
        castMemberArrayList.add(new CastMember(getString(R.string.ingrid_bolsø_berdal), getString(R.string.armistice)));
        castMemberArrayList.add(new CastMember(getString(R.string.ben_barnes), getString(R.string.logan)));
        castMemberArrayList.add(new CastMember(getString(R.string.clifton_collins_jr), getString(R.string.lawrence)));
        castMemberArrayList.add(new CastMember(getString(R.string.tessa_thompson), getString(R.string.charlotte_hale)));
        castMemberArrayList.add(new CastMember(getString(R.string.vivienne_taylor), getString(R.string.reveler)));
        castMemberArrayList.add(new CastMember(getString(R.string.louis_herthum), getString(R.string.peter_abernathy)));
        castMemberArrayList.add(new CastMember(getString(R.string.oliver_bell), getString(R.string.little_boy)));
        castMemberArrayList.add(new CastMember(getString(R.string.jeff_daniel_phillips), getString(R.string.tenderloin)));
        castMemberArrayList.add(new CastMember(getString(R.string.bradley_fisher), getString(R.string.mariposa_bartender)));
        castMemberArrayList.add(new CastMember(getString(R.string.james_landry_hébert), getString(R.string.slim_miller)));
        castMemberArrayList.add(new CastMember(getString(R.string.mike_watson), getString(R.string.watson)));
    }
}