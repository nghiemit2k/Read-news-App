package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.TinTuc;

import java.util.ArrayList;

public class TinTucAdapter extends RecyclerView.Adapter<TinTucAdapter.ViewHolder> {
    public TinTucAdapter(Context context, ArrayList<TinTuc> mListTinTuc) {
        this.context = context;
        this.mListTinTuc = mListTinTuc;
    }

    private Context context;
    private ArrayList<TinTuc> mListTinTuc;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tin_tuc,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TinTuc tinTuc = mListTinTuc.get(position);
        holder.txtTitle.setText(tinTuc.getTitle());
        if(tinTuc.getImg().isEmpty())
            holder.image.setImageResource(R.drawable.ic_image);
        else

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
       ImageView image;
       TextView txtTitle;
       LinearLayout layout;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           image = itemView.findViewById(R.id.itemTinTuc_img);
           txtTitle = itemView.findViewById(R.id.itemTinTuc_title);
           layout = itemView.findViewById(R.id.itemTinTuc_layout);
       }
   }
}
