package com.example.homework_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {
    
    private RecyclerView recyclerView;
    private FirstAdapter firstAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        return inflater.inflate( R.layout.fragment_first, container, false );

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );


        recyclerView = view.findViewById( R.id.recycler_view );


        List<String> list = new ArrayList<>();
        list.add( "Кайрат Кайратович");
        list.add( "Салима Толон кызы");
        list.add( "Максим Галкинович");
        list.add( "Акылай Асылбековна");
        list.add( "Зарина Толоновна");
        list.add( "Улан Толонович");
        list.add( "Асылбек Рысбекович");
        list.add( "Рашид Алыкович");
        list.add( "Жылдыз Мелисовна");
        list.add( "Жанер Асылбекович");


        firstAdapter = new FirstAdapter( list );
        recyclerView.setAdapter( firstAdapter );


    }
}