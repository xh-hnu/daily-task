package com.hnu.xuhe.dailytask.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hnu.xuhe.dailytask.R;
import com.hnu.xuhe.dailytask.ui.home.entity.TaskItem;
import com.hnu.xuhe.dailytask.ui.home.entity.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private List<TaskItem> tasks;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);
        initTasks();
        MyAdapter adapter = new MyAdapter(tasks, getContext());
        recyclerView.setAdapter(adapter);
        return root;
    }

    private void initTasks() {
        tasks = new ArrayList<>();
        tasks.add(new TaskItem("学习英语听力", "10", "A", R.drawable.card_bg));
        tasks.add(new TaskItem("学习英语写作", "10", "B", R.drawable.card_bg_1));
        tasks.add(new TaskItem("学习Android", "20", "B", R.drawable.card_bg_2));
    }
}