package com.example.gdgexampleapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the string to be visualized by the textView
		 * fragment.
		 */
		public static final String ARG= "string_initial";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// Create a new TextView and set its text to the fragment's section
			// number argument value.
			TextView textView = new TextView(getActivity());
			textView.setGravity(Gravity.CENTER);
			textView.setText(getArguments().getString(
					ARG));
			textView.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					TextView tv = (TextView)arg0;
					tv.setText("Clicked!");
				}
			});
			return textView;
		}
	}
