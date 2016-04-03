package com.yalantis_intership;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * RecyclerView adapter instance for inflating recycler.xml and showing list of images to user
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ImageHolder> {
    private List<String> mImagesUrls;
    private Context mContext;

    public RecyclerViewAdapter(Context _context, List<String> _urls) {
        this.mContext = _context;
        this.mImagesUrls = _urls;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View imgView = LayoutInflater
                .from(mContext)
                .inflate(R.layout.recycler, parent, false);
        return new ImageHolder(imgView);
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, int position) {
        Picasso
                .with(mContext)
                .load(mImagesUrls.get(position))
                .resizeDimen(R.dimen.image_width, R.dimen.image_height)
                .into(holder.getimg());
        holder.getimg().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, v.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImagesUrls.size();
    }
}
