package com.example.homework_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.RecyclerViewHolder> {

    private List<String> list;

    public SecondAdapter(List<String>list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SecondAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list2,parent,false);
            return new SecondAdapter.RecyclerViewHolder( view );

    }

    @Override
    public void onBindViewHolder(@NonNull SecondAdapter.RecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView item_list2;

        public RecyclerViewHolder(@NonNull View itemView) {
            super( itemView );

            item_list2 = itemView.findViewById( R.id.items_numbers );
        }

    }
}
