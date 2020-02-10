package com.BetzalelKenig;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {
    private ArrayList<TodoItem> todoList;

    public TodoAdapter(ArrayList<TodoItem> todoList) {
        this.todoList = todoList;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item,parent,false);
        TodoViewHolder tvh = new TodoViewHolder(v);
        return tvh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        TodoItem currentItem = todoList.get(position);
        holder.mShortDescription.setText(currentItem.getmShortDescription());
        holder.mDeadline.setText(currentItem.getDeadline().toString());
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }

    public class TodoViewHolder extends RecyclerView.ViewHolder{
        public TextView mShortDescription;
        public TextView mDeadline;



        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mShortDescription = itemView.findViewById(R.id.shortDescription);
            this.mDeadline = itemView.findViewById(R.id.deadline);
        }


    }
}
