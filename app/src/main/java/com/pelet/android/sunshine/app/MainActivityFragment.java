package com.pelet.android.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Create dummy data for the forecast
        ArrayList<String> forecast = new ArrayList();
        forecast.add("Today - Sunny -20");
        forecast.add("Tomorrow - Cloudy -19");
        forecast.add("Sun - Cloudy -15");
        forecast.add("Mon - Sunny -13");
        forecast.add("Tue - Muddy -11");
        forecast.add("Wed - Snow -8");
        forecast.add("Thu - Sunny -5");
        forecast.add("Fri - Cloudy -7");

        // Create an ArrayAdapter that takes data from a source (in this case the dummy data)
        // and populates the ListView
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
