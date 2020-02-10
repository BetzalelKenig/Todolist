package com.BetzalelKenig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<TodoItem> todoItems;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createTodoList();
        buildRecyclerView();

    }

    public void createTodoList(){
        todoItems = new ArrayList<>();
        todoItems.add(new TodoItem("todo 1","10.2.20"));
        todoItems.add(new TodoItem("todo 2","10.2.20"));
        todoItems.add(new TodoItem("todo 3","10.2.20"));
        todoItems.add(new TodoItem("todo 4","10.2.20"));
        todoItems.add(new TodoItem("todo 5","10.2.20"));
        todoItems.add(new TodoItem("todo 6","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
        todoItems.add(new TodoItem("todo 7","10.2.20"));
    }
    private void buildRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new TodoAdapter(todoItems);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
