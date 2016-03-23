package com.yalantis_intership;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * RecyclerView adapter instance for inflating recycler.xml and showing list of images to user
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ImageHolder> {
    private static List<String> urls; //[Comment] Why static?
    private Context context; //[Comment] Wrong names
    public  RecyclerViewAdapter (Context _context, List<String> _urls)
    {
        this.context = _context;
        this.urls = _urls; //[Comment] Wrong formatting
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View imgView = LayoutInflater
                .from(context)
                .inflate(R.layout.recycler, parent, false);
        return  new ImageHolder(imgView);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        Picasso
                .with(context)
                .load(urls.get(position))
                .resizeDimen(R.dimen.image_width, R.dimen.image_height)
                .into(holder.getimg());
        holder.getimg().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, v.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return urls.size();
    }
}
