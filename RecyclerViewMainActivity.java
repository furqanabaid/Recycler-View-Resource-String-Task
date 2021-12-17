package com.example.lab02.RecyclerViewExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.lab02.R;

import java.util.ArrayList;

public class RecyclerViewMainActivity extends AppCompatActivity {
    ArrayList<String> myList;
    RecyclerView recyclerView;
    recyclerViewExampleAdaptor adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_main);
        recyclerView=findViewById(R.id.iteamListRV);
        myList=new ArrayList<String>();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        String[] list=getResources().getStringArray(R.array.itemsList);
        for (int i=0;i<list.length;i++){
            myList.add(list[i]);
        }
        adaptor=new recyclerViewExampleAdaptor(myList,getApplicationContext());
        recyclerView.setAdapter(adaptor);
        Toast.makeText(this, myList.get(1), Toast.LENGTH_SHORT).show();
    }
}
