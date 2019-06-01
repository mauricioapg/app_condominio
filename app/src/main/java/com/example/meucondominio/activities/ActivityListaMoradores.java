package com.example.meucondominio.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.meucondominio.R;
import com.example.meucondominio.adapters.AdapterListaMoradores;
import com.example.meucondominio.model.Morador;

import java.util.ArrayList;
import java.util.List;

public class ActivityListaMoradores extends AppCompatActivity {

    private ListView listViewMoradores;
    private List<Morador> listaMoradores;
    private AdapterListaMoradores adapterListaMoradores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_moradores);

        this.listaMoradores = new ArrayList<>();
        this.listViewMoradores = (ListView) findViewById(R.id.ListViewMoradores);
        this.adapterListaMoradores = new AdapterListaMoradores(ActivityListaMoradores.this, this.listaMoradores);
        listViewMoradores.setAdapter(adapterListaMoradores);
    }
}
