package com.example.aquaponics_project;

import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;


public class HistoryPage extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        System.out.println("In History Page");
        view = inflater.inflate(R.layout.history_page,container,false);
        Button button = (Button) view.findViewById(R.id.btnGraph);
        Button button1 = (Button) view.findViewById(R.id.btnTable);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.page_history, new HistoryGraph()).commit();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                fm.replace(R.id.page_history, new HistoryTable()).commit();
            }
        });
        return view;
    }
}





