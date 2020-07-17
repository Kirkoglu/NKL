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

public class LenteleAdapter extends RecyclerView.Adapter<LenteleAdapter.LenteleViewHolder> {

    String data1[], data2[], data3[], data4[], data5[];
    int teamImages[];
    Context context;

    public LenteleAdapter(String[] s1, String[] s2, String[] s3, String[] s4, String[] s5, int[] img) {
        data1 = s1;
        data2 = s2;
        data3 = s3;
        data4 = s4;
        data5 = s5;
        teamImages = img;
    }

    @NonNull
    @Override
    public LenteleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_lentele, parent, false);
        return new LenteleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LenteleViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myText4.setText(data4[position]);
        holder.myText5.setText(data5[position]);
        holder.myImage.setImageResource(teamImages[position]);
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class LenteleViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2, myText3, myText4, myText5;
        ImageView myImage;

        LenteleViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.positionTable);
            myText2 = itemView.findViewById(R.id.teamNameTable);
            myText3 = itemView.findViewById(R.id.gamesPlayedTable);
            myText4 = itemView.findViewById(R.id.winsTable);
            myText5 = itemView.findViewById(R.id.lossesTable);
            myImage = itemView.findViewById(R.id.teamLogoTable);
        }
    }
}
