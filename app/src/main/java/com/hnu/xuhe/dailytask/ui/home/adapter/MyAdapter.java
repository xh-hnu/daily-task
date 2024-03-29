package com.hnu.xuhe.dailytask.ui.home.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hnu.xuhe.dailytask.R;
import com.hnu.xuhe.dailytask.ui.home.entity.TaskItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<TaskItem> tasks;
    private Context context;

    public MyAdapter(List<TaskItem> tasks, Context context) {
        this.tasks = tasks;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TaskItem task = tasks.get(position);
        holder.studyContent.setText(task.getStudyContent());
        holder.bgColor.setBackground(context.getResources().getDrawable(task.getBgColor()));
        holder.studyTime.setText(task.getStudyTime());
        holder.level.setText(task.getLevel());
        holder.startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TAG = "click start btn ";
                Log.d(TAG, task.toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView studyContent, studyTime, countTime, level;
        private Button startBtn;
        private ConstraintLayout bgColor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            startBtn = itemView.findViewById(R.id.start_btn);
            studyContent = itemView.findViewById(R.id.study_content);
            studyTime = itemView.findViewById(R.id.study_time);
            countTime = itemView.findViewById(R.id.count_time);
            level = itemView.findViewById(R.id.level);
            bgColor = itemView.findViewById(R.id.color_bg);
        }
    }
}
