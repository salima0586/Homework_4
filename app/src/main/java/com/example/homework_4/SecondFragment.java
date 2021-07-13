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


public class SecondFragment extends Fragment {


    private RecyclerView recyclerView;
    private SecondAdapter secondAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_second, container, false );

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );

     recyclerView = view.findViewById( R.id.recycler_view2 );


     List<String>list = new ArrayList<>();
     list.add( "1");
     list.add( "2");
     list.add( "3");
     list.add( "4");
     list.add( "5");
     list.add( "6");
     list.add( "7");
     list.add( "8");
     list.add( "9");
     list.add( "10");


     secondAdapter = new SecondAdapter( list );
     recyclerView.setAdapter( secondAdapter );

    }
}
