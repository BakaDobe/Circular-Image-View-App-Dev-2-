package com.example.circularimageview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {
    CircleImageView image;
    TextView imageName;
    ConstraintLayout parentLayout;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
        imageName = itemView.findViewById(R.id.textView);
        parentLayout = itemView.findViewById(R.id.parent);
    }
}
