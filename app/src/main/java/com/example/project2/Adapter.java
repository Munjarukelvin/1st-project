package com.example.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    List<String> title;
    List<Integer> images;
    Context context;
    LayoutInflater inflater;

    public Adapter(Context ctx, List<String> title, List<Integer> images){

        this.title = title;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view= inflater.inflate(R.layout.grid_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(title.get(position));
        holder.gridIcon.setImageResource(images.get(position));

    }

    @Override
    public int getItemCount() {
        return title.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView gridIcon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView6);
            gridIcon = itemView.findViewById(R.id.imageView6);

         itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(v.getContext(), "clicked" +getAdapterPosition(),Toast.LENGTH_SHORT).show();
             }
         });
        }
    }
}
