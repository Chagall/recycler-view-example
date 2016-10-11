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
        TextView castMemberCharacterName;

        CastMemberViewHolder(View castMemberCardView) {
            super(castMemberCardView);
            castMemberImageView = (ImageView) castMemberCardView.findViewById(R.id.card_view_image_view);
            castMemberName = (TextView) castMemberCardView.findViewById(R.id.card_view_image_title);
            castMemberCharacterName = (TextView) castMemberCardView.findViewById(R.id.card_view_image_subtitle);
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
        ((CastMemberViewHolder)holder).castMemberCharacterName.setText(castMemberArrayList.get(position).getCharacterName());


        switch (position){
            case 0:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.evan_rachel_wood);
                break;
            case 1:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.thandie_newton);
                break;
            case 2:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.jeffrey_wright);
                break;
            case 3:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.james_marsden);
                break;
            case 4:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.luke_hemsworth);
                break;
            case 5:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.sidse_babett_knudsen);
                break;
            case 6:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.simon_quarterman



                );
                break;
            case 7:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 8:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 9:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 10:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 11:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 12:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 13:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 14:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 15:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 16:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 17:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 18:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 19:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 20:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 21:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 22:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 23:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            case 24:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;
            default:
                ((CastMemberViewHolder)holder).castMemberImageView.setImageResource(R.drawable.westworld);
                break;

        }
    }

    @Override
    public int getItemCount() {
        return castMemberArrayList.size();
    }
}

