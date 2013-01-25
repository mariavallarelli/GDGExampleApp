package com.example.gdgexampleapp;



import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

public class ColorFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
	
	private View colorize;
	
	private SeekBar red;
	private SeekBar green;
	private SeekBar blue;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		//Set the layout to use
		View v = inflater.inflate(R.layout.color, container,false);
		
		//referencing
		colorize = v.findViewById(R.id.view);
		red = (SeekBar) v.findViewById(R.id.redBar);
		green = (SeekBar) v.findViewById(R.id.greenBar);
		blue = (SeekBar) v.findViewById(R.id.blueBar);
		
		//set initial color
		colorize.setBackgroundColor(Color.BLACK);
		
		//set actions to do
		red.setOnSeekBarChangeListener(this);
		green.setOnSeekBarChangeListener(this);
		blue.setOnSeekBarChangeListener(this);
		
		super.onCreateView(inflater, container, savedInstanceState);
		
		return v;
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		colorize.setBackgroundColor(
				Color.rgb(red.getProgress(), green.getProgress(), blue.getProgress())
				);
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
	}
	
}
