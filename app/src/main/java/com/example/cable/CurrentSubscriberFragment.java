package com.example.cable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CurrentSubscriberFragment extends Fragment {
    View view;
    RecyclerView rvCurrentSubscribers;
    Spinner areaSpinner;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_current, container, false);
        rvCurrentSubscribers = view.findViewById(R.id.rvCurrentSubscriber);
        areaSpinner = view.findViewById(R.id.areaSpinner);
        rvCurrentSubscribers.setHasFixedSize(true);
        rvCurrentSubscribers.setLayoutManager(new LinearLayoutManager(getActivity()));
//        rvCurrentSubscribers.setAdapter();
        areaSpinner.setAdapter(new AreaAdapter(getActivity()));
        return view;
    }
}
