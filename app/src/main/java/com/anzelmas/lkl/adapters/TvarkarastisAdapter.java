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

public class TvarkarastisAdapter extends RecyclerView.Adapter<TvarkarastisAdapter.TvarkarastisViewHolder> {

    String data1[], data2[], data3[];
    int homeTeamImages[], awayTeamImages[];
    Context context;

    public TvarkarastisAdapter(String[] s1, String[] s2, String[] s3, int[] img1, int[] img2) {
        data1 = s1;
        data2 = s2;
        data3 = s3;
        homeTeamImages = img1;
        awayTeamImages = img2;
    }

    @NonNull
    @Override
    public TvarkarastisViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_tvarkarastis, parent, false);
        return new TvarkarastisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvarkarastisViewHolder holder, int position) {
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

    public static class TvarkarastisViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2, myText3;
        ImageView myImage1, myImage2;

        TvarkarastisViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.dateSchedule);
            myText2 = itemView.findViewById(R.id.citySchedule);
            myText3 = itemView.findViewById(R.id.gameTimeSchedule);
            myImage1 = itemView.findViewById(R.id.homeTeamSchedule);
            myImage2 = itemView.findViewById(R.id.awayTeamSchedule);
        }
    }
}
