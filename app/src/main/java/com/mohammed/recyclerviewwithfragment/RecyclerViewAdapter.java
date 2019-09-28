package com.mohammed.recyclerviewwithfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHoldr> {
    private ArrayList<Data> myData ;

    RecyclerViewAdapter(ArrayList<Data> myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public MyViewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item, null, false);
        return new MyViewHoldr(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoldr holder, int position) {
      Data data = myData.get(position);
        holder.idText.setText(data.getId());
        holder.fullNameText.setText(data.getFullName());
        holder.ageText.setText(data.getAge());

    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    class MyViewHoldr extends RecyclerView.ViewHolder {

        TextView idText,fullNameText,ageText;

        MyViewHoldr(@NonNull View itemView) {
            super(itemView);
            idText = itemView.findViewById(R.id.idText);
           fullNameText = itemView.findViewById(R.id.fullNameText);
           ageText = itemView.findViewById(R.id.ageText);

        }
    }
}
