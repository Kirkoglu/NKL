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

public class NaujienozAdapter extends RecyclerView.Adapter<NaujienozAdapter.NaujienozViewHolder> {

    String data1[];
    int images[];

    Context context;

    public NaujienozAdapter(String[] s1, int[] img) {
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public NaujienozViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_naujienos, parent, false);
        return new NaujienozViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NaujienozViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myImage1.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class NaujienozViewHolder extends RecyclerView.ViewHolder {

        TextView myText1;
        ImageView myImage1;

        NaujienozViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.textViewNews);
            myImage1 = itemView.findViewById(R.id.imageNews);

        }
    }
}