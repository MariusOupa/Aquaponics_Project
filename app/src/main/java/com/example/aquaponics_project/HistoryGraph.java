package com.example.aquaponics_project;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class HistoryGraph extends Fragment {

    LineChart lineChart;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get instance of LineChart
        View view = inflater.inflate(R.layout.history_graph,container,false);
        lineChart = view.findViewById(R.id.lineChartGraph);


        //Create List of X and Y values
        ArrayList<String> xValue = new ArrayList<>();
        ArrayList<Entry> yValue1 = new ArrayList<>();
        ArrayList<Entry> yValue2 = new ArrayList<>();

        //Change to populate ArrayList
        double x = 0;
        int numDataPoints = 100;

        for (int i = 0; i < numDataPoints; i++) {
            float sinFunc = Float.parseFloat(String.valueOf(Math.sin(x)));
            float cosFunc = Float.parseFloat(String.valueOf(Math.cos(x)));
            x = x + 0.1;
            yValue1.add(new Entry(sinFunc, i));
            yValue2.add(new Entry(cosFunc, i));
            xValue.add(i, String.valueOf(x));
        }


        String[] xvalue = new String[xValue.size()];
        for (int i = 0; i < xValue.size(); i++) {
            xvalue[i] = xValue.get(i);
        }

        ArrayList<ILineDataSet> lineDataSets = new ArrayList<>();

        LineDataSet lineDataSet = new LineDataSet(yValue1, "sin");
            lineDataSet.setDrawCircles(false);
            lineDataSet.setColor(Color.BLUE);

        LineDataSet lineDataSet1 = new LineDataSet(yValue2, "cos");
            lineDataSet1.setDrawCircles(false);
            lineDataSet1.setColor(Color.RED);

        lineDataSets.add(lineDataSet);
        lineDataSets.add(lineDataSet1);

        LineData lineData = new LineData(lineDataSets);

        lineChart.setData(lineData);

        lineChart.setVisibleXRangeMaximum(65f);

        return view;
    }
}
