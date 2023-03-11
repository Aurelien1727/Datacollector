package com.example.datacollector.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.datacollector.Interfaces.RecyclersView;
import com.example.datacollector.R;
import com.example.datacollector.Detail_Stade;
import com.example.datacollector.Model.Terrain;

import java.util.List;

public class TerrainAdapter extends RecyclerView.Adapter<TerrainAdapter.ViewHolder> {

    List<Terrain> Stade;

    Context context;

    RecyclersView recyclersView;

    public TerrainAdapter(Context context, List<Terrain> Stade) {
        this.context=context;
        this.Stade = Stade;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row_item,parent,false);
        return new ViewHolder(view);
    }

    public void setFilteredList(List<Terrain> filteredList) {
        this.Stade = filteredList;
        notifyDataSetChanged();
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Stade.setText(Stade.get(position).getNom());
        holder.type.setText(Stade.get(position).getType());
        holder.price.setText(Stade.get(position).getTarif()+" DH");

        holder.id.setText(Stade.get(position).getId()+"");
        Glide.with(holder.Stade.getContext()).load(Stade.get(position).getPhoto()).into(holder.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, Detail_Stade.class);
                //send data
                intent.putExtra("id",Stade.get(position).getId()+"");
                intent.putExtra("nom",Stade.get(position).getNom());
                intent.putExtra("adresse",Stade.get(position).getAdresse());
                intent.putExtra("tarif",Stade.get(position).getTarif());
                intent.putExtra("lat",Stade.get(position).getLat());
                intent.putExtra("long",Stade.get(position).getLongitude());
                intent.putExtra("rang",Stade.get(position).getRang());
                intent.putExtra("description",Stade.get(position).getDescription());
                intent.putExtra("image",Stade.get(position).getPhoto());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Stade.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView Stade;
        TextView type;
        TextView prix;
        TextView id;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Stade=itemView.findViewById(R.id.nom);
            type=itemView.findViewById(R.id.pays);
            price=itemView.findViewById(R.id.prix);
            id=itemView.findViewById(R.id.id_terrain);
            image=itemView.findViewById(R.id.place_image);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position= getAdapterPosition();
            Toast.makeText(context,"position"+position,Toast.LENGTH_LONG).show();
            Intent intent=new Intent(context, Detail_Stade.class);
            //send data
            intent.putExtra("id",Stade.get(position).getId());

            context.startActivity(intent);
        }
    }

}
