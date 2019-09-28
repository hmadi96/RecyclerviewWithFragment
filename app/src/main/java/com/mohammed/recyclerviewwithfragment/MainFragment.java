package com.mohammed.recyclerviewwithfragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        //set data in array list
        ArrayList<Data> myData = new ArrayList<>();
        myData.add(new Data("1","Mohammed Qasim","23"));
        myData.add(new Data("2","Ahmed Ali","33"));
        myData.add(new Data("3","Noor Ali","19"));
        myData.add(new Data("4","Sajjad Sami","37"));
        myData.add(new Data("5","Qasim Hassan","53"));
        myData.add(new Data("7","Hassan Al Noore","27"));
        myData.add(new Data("8","Zaynab ahmed","19"));

        RecyclerViewAdapter adapter =new RecyclerViewAdapter(myData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view ;
    }

}
