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

public class RezultataiAdapter extends RecyclerView.Adapter<RezultataiAdapter.RezultataiViewHolder> {

    String data1[], data2[], data3[];
    int homeTeamImages[], awayTeamImages[];
    Context context;

    public RezultataiAdapter(String[] s1, String[] s2, String[] s3, int[] img1, int[] img2) {
        data1 = s1;
        data2 = s2;
        data3 = s3;
        homeTeamImages = img1;
        awayTeamImages = img2;
    }

    @NonNull
    @Override
    public RezultataiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_rezultatai, parent, false);
        return new RezultataiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RezultataiViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage1.setImageResource(homeTeamImages[position]);
        holder.myImage2.setImageResource(awayTeamImages[position]);

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class RezultataiViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2, myText3;
        ImageView myImage1, myImage2;

        RezultataiViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.dateResults);
            myText2 = itemView.findViewById(R.id.cityResults);
            myText3 = itemView.findViewById(R.id.gameTimeResults);
            myImage1 = itemView.findViewById(R.id.homeTeamResults);
            myImage2 = itemView.findViewById(R.id.awayTeamResults);

        }
    }
}
