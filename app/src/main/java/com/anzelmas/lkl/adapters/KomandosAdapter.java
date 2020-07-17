package com.anzelmas.lkl.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anzelmas.lkl.R;

public class KomandosAdapter extends RecyclerView.Adapter<KomandosAdapter.KomandosViewHolder> {

    String data1[], data2[];
    int teamImages[];
    Context context;

    public KomandosAdapter(String[] s1, String[] s2, int[] img) {
        data1 = s1;
        data2 = s2;
        teamImages = img;
    }

    @NonNull
    @Override
    public KomandosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_komandos, parent, false);
        return new KomandosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KomandosViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(teamImages[position]);
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class KomandosViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2;
        ImageView myImage;

        KomandosViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.teamNameTeams);
            myText2 = itemView.findViewById(R.id.teamCoachTeams);
            myImage = itemView.findViewById(R.id.teamLogoTeams);
        }
    }
}
