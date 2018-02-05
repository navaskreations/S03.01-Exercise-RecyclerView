package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by navas on 2/1/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // TODO (15) Add a class file called ForecastAdapter
    // TODO (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // TODO (23) Create a private string array called mWeatherData

    // TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

    // TODO (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
    // TODO (17) Extend RecyclerView.ViewHolder

    // TODO (29) Override getItemCount
    // TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // TODO (32) After you save mWeatherData, call notifyDataSetChanged
    // Within ForecastAdapter.java /////////////////////////////////////////////////////////////////

    private String [] mWeatherData;

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // TODO (24) Override onCreateViewHolder
        // TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
        // TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.forecast_list_item, parent, false);

            ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);

            return viewHolder;

    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        // TODO (27) Override onBindViewHolder
        // TODO (28) Set the text of the TextView to the weather for this list item's position

        holder.mWeatherTextView.setText(mWeatherData[position]);

    }

    @Override
    public int getItemCount() {
        // TODO (29) Override getItemCount
        // TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
        if (mWeatherData != null){
            return mWeatherData.length;
        }
        return 0;
    }

    public void setWeatherData(String[] weatherData) {
        // TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
        // TODO (32) After you save mWeatherData, call notifyDataSetChanged

        mWeatherData = weatherData;
        notifyDataSetChanged();
    }


    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
        // TODO (18) Create a public final TextView variable called mWeatherTextView

        // TODO (19) Create a constructor for this class that accepts a View as a parameter
        // TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
        // TODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
        // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view){
            super(view);

            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }

    }
}
