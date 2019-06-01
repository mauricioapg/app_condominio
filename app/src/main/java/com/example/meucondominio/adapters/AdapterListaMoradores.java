package com.example.meucondominio.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.meucondominio.R;
import com.example.meucondominio.model.Morador;

import java.util.List;

public class AdapterListaMoradores extends BaseAdapter {

    private Context context;
    private List<Morador> listaMoradores;

    public AdapterListaMoradores(Context context, List<Morador> listaMoradores) {
        this.context = context;
        this.listaMoradores = listaMoradores;
    }

    @Override
    public int getCount() {
        return this.listaMoradores.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaMoradores.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void removeItem(int position){
        this.listaMoradores.remove(position);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(this.context, R.layout.layout_moradores, null);

        TextView viewNomeMorador = (TextView) view.findViewById(R.id.viewNomeMorador);
        TextView viewDataNascimento = (TextView) view.findViewById(R.id.viewDataNascimento);

        viewNomeMorador.setText(this.listaMoradores.get(position).getNome());
        viewDataNascimento.setText((this.listaMoradores.get(position).getDataNascimento()));

        return view;
    }
}
