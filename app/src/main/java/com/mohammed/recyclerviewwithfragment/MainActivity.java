package com.mohammed.recyclerviewwithfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   // RecyclerView recyclerView ;
    //ArrayList<Data> myData ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* recyclerView = findViewById(R.id.recyclerView);
        myData=new ArrayList<>();
        myData.add(new Data("1","Mohammed Qasim","23"));
        myData.add(new Data("2","Ahmed Ali","33"));
        myData.add(new Data("3","Noor Ali","19"));
        myData.add(new Data("4","Sajjad Sami","37"));
        myData.add(new Data("5","Qasim Hassan","53"));
        myData.add(new Data("7","Hassan Al Noore","27"));
        myData.add(new Data("8","Zaynab ahmed","19"));
        RecyclerViewAdapter adapter =new RecyclerViewAdapter(myData);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);*/

        MainFragment fragment= new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,fragment);
        fragmentTransaction.commit();


    }
}
