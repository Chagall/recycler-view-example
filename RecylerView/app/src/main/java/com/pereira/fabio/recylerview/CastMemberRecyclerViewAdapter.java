package com.pereira.fabio.recylerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 10/10/16.
 */

public class CastMemberRecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<CastMember> castMemberArrayList;

    public CastMemberRecyclerViewAdapter(ArrayList<CastMember> castMemberArrayList) {
        this.castMemberArrayList = castMemberArrayList;
    }

    private static class CastMemberViewHolder extends RecyclerView.ViewHolder {
        ImageView castMemberImageView;
        TextView castMemberName;
        TextView castMemberBio;

        CastMemberViewHolder(View castMemberCardView) {
            super(castMemberCardView);
            castMemberImageView = (ImageView) castMemberCardView.findViewById(R.id.card_view_image_view);
            castMemberName = (TextView) castMemberCardView.findViewById(R.id.card_view_image_text_view);
            castMemberBio = (TextView) castMemberCardView.findViewById(R.id.card_view_description_text_view);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new CastMemberViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((CastMemberViewHolder)holder).castMemberName.setText(castMemberArrayList.get(position).getName());
        ((CastMemberViewHolder)holder).castMemberBio.setText(castMemberArrayList.get(position).getBio());

        switch (position){
            case 0:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.marcos_winter);
                break;
            case 1:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.simone_spoladore);
                break;
            case 2:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.malu);
                break;
            case 3:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.adriano_garib);
                break;
            default:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.marcos_winter);
                break;

        }
    }

    @Override
    public int getItemCount() {
        return castMemberArrayList.size();
    }
}

