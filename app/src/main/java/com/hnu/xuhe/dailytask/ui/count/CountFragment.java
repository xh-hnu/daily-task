package com.hnu.xuhe.dailytask.ui.count;

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

import com.hnu.xuhe.dailytask.R;

public class CountFragment extends Fragment {

    private CountViewModel countViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        countViewModel =
                ViewModelProviders.of(this).get(CountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_count, container, false);
        return root;
    }
}