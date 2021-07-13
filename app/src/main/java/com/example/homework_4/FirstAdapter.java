package com.example.homework_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.RecyclerViewHolder> {
     private List<String>list;

     public FirstAdapter(List<String>list){
         this.list = list;
     }
    @NonNull
    @Override
    public FirstAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
         return new RecyclerViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull FirstAdapter.RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

         private TextView item_list,name_2;

        public RecyclerViewHolder(@NonNull View itemView) {
            super( itemView );

            item_list = itemView.findViewById( R.id. name_1 );
            name_2 = itemView.findViewById( R.id.name_2 );
        }

        public TextView getName_2() {
            return name_2;
        }
    }
}

