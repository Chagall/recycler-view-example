package com.pereira.fabio.recylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by fabiopereira on 10/10/16.
 */

public class CastMemberRecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<CastMember> castMemberArrayList;
    private Context recyclerViewAdapaterContext;

    public CastMemberRecyclerViewAdapter(ArrayList<CastMember> castMemberArrayList, Context context) {
        this.castMemberArrayList = castMemberArrayList;
        this.recyclerViewAdapaterContext = context;
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
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.evan_rachel_wood)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 1:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.thandie_newton)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 2:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.jeffrey_wright)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 3:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.james_marsden)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 4:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.luke_hemsworth)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 5:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.sidse_babett_knudsen)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 6:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.simon_quarterman)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 7:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.angela_sarafyan)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 8:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.shannon_woodward)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 9:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.ed_harris)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 10:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.anthony_hopkins)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 11:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.jimmi_simpson)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 12:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.rodrigo_santoro)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 13:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.ingrid_bolso_berdal)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 14:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.ben_barnes)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 15:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.clifton_collins_jr)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 16:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.tessa_thompson)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 17:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.vivienne_taylor)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 18:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.louis_herthum)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 19:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.oliver_bell)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 20:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.jeff_daniel_phillips)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 21:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.bradley_fisher)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 22:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.james_landry_herbert)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            case 23:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.mike_watson)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
            default:
                Picasso.with(recyclerViewAdapaterContext)
                        .load(R.drawable.westworld)
                        .resize(500, 500)
                        .centerCrop()
                        .into(((CastMemberViewHolder)holder).castMemberImageView);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return castMemberArrayList.size();
    }
}

