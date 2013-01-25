package com.example.gdgexampleapp;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RotateFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		ImageView img = new ImageView(getActivity());
		img.setImageResource(R.drawable.ic_launcher);

		//Apply the rotation animation in a given imageview
		Animation anim = AnimationUtils.loadAnimation(getActivity(),R.anim.rotate);
		img.startAnimation(anim);
		container.removeAllViews();
		return img;
	}

}
