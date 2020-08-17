package com.example.just10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
   public static  class ViewHolder extends RecyclerView.ViewHolder{
       private TextView nombre;

       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           nombre=(TextView)itemView.findViewById(R.id.tvNombre);
       }
   }
   public List<CalificacionesModelo> calificacionLista;

    public RecyclerViewAdaptador(List<CalificacionesModelo> calificacionLista) {
        this.calificacionLista = calificacionLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_calificaciones,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(calificacionLista.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return calificacionLista.size();
    }
}
