package com.yalantis_intership;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

//Class holds ImageView for representing image of task to user
public class ImageHolder extends RecyclerView.ViewHolder {

    protected ImageView imageView;

    public ImageHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image_recycler);
    }

    public ImageView getimg() {
        return imageView;
    }
}