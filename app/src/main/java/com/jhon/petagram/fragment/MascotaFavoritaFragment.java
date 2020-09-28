package com.jhon.petagram.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jhon.petagram.Contacto;
import com.jhon.petagram.adaptadores.ContactoAdapter;
import com.jhon.petagram.R;

import java.util.ArrayList;


public class MascotaFavoritaFragment extends Fragment {
    private RecyclerView ListaMascotas;
    ArrayList<Contacto> contactos;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mascota_favorita,container,false);
        ListaMascotas = v.findViewById(R.id.ListaMascotas);
       // LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(getActivity() ,3 );
        ListaMascotas.setLayoutManager(glm);
        inicializardatos();
        inicializarAdaptador();
        return v;

    }

    public void inicializardatos() {
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.perrito,"5"));
        contactos.add(new Contacto(R.drawable.perrito,"3"));
        contactos.add(new Contacto(R.drawable.perrito,"3"));
        contactos.add(new Contacto(R.drawable.perrito,"2"));
        contactos.add(new Contacto(R.drawable.perrito,"1"));
        contactos.add(new Contacto(R.drawable.perrito,"15"));
        contactos.add(new Contacto(R.drawable.perrito,"13"));
        contactos.add(new Contacto(R.drawable.perrito,"23"));
        contactos.add(new Contacto(R.drawable.perrito,"2"));
        contactos.add(new Contacto(R.drawable.perrito,"1"));
    }
    public ContactoAdapter adaptador;
    public void inicializarAdaptador (){
        //asigan a contacto adaptador a la lista contactos
        adaptador = new ContactoAdapter(contactos,getActivity());
        ListaMascotas.setAdapter(adaptador);

    }


}