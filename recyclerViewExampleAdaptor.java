package com.example.lab02.RecyclerViewExample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab02.FirebaseExample.myFirebaseAdaptor;
import com.example.lab02.R;

import java.util.ArrayList;

public class recyclerViewExampleAdaptor extends RecyclerView.Adapter<recyclerViewExampleAdaptor.ViewHolder> {

    public recyclerViewExampleAdaptor(ArrayList<String> myList, Context context) {
        this.myList = myList;
        this.context = context;
    }
    ArrayList<String> myList;
    Context context;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout_example1,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(myList.get(position));
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txtv1);
        }
    }
}