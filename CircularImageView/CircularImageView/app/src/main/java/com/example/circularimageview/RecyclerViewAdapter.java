package com.example.circularimageview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    //
    Context mcontext;
    ArrayList<String> imageNames = new ArrayList<>();
    ArrayList<String> images = new ArrayList<>();

    public RecyclerViewAdapter(Context mcontext, ArrayList<String> imageNames, ArrayList<String> images) {
        this.mcontext = mcontext;
        this.imageNames = imageNames;
        this.images = images;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mcontext).asBitmap().load(images.get(position)).into(holder.image);
        holder.imageName.setText(imageNames.get(position));
    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
