package com.example.adaptadores.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adaptadores.R;
import com.example.adaptadores.clases.Equipos;
import com.squareup.picasso.Picasso;

import java.util.List;

public class EquipoAdaptador extends RecyclerView.Adapter<EquipoAdaptador.ViewHolder> {

    private List<Equipos> datos;

    public EquipoAdaptador(List<Equipos> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public EquipoAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_equipo,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipoAdaptador.ViewHolder holder, int position) {
        Equipos dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgEquipo;
        TextView txtNombre,txtPais,txtTrofeos,txtFundacion;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imgEquipo = itemView.findViewById(R.id.imgEquipo);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtPais = itemView.findViewById(R.id.txtPais);
            txtTrofeos = itemView.findViewById(R.id.txtTrofeos);
            txtFundacion = itemView.findViewById(R.id.txtFundacion);


        }

        public void bind(Equipos dato) {
            txtNombre.setText(dato.getNombre());
            txtPais.setText(dato.getPais());
            txtTrofeos.setText(dato.getTrofeos());
            txtFundacion.setText(dato.getFundacion());
            Picasso.get().load(dato.getImagen()).into(imgEquipo);
        }

    }

}
