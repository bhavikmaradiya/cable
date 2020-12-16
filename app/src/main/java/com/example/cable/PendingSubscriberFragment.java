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

public class PendingSubscriberFragment extends Fragment {
    View view;
    RecyclerView rvPendingSubscribers;
    Spinner areaSpinner;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_current, container, false);
        rvPendingSubscribers = view.findViewById(R.id.rvPendingSubscriber);
        areaSpinner = view.findViewById(R.id.areaSpinner);
        rvPendingSubscribers.setHasFixedSize(true);
        rvPendingSubscribers.setLayoutManager(new LinearLayoutManager(getActivity()));
//        rvPendingSubscribers.setAdapter();
        areaSpinner.setAdapter(new AreaAdapter(getActivity()));
        return view;
    }
}
