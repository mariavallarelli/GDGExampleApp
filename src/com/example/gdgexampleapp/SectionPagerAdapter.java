package com.example.gdgexampleapp;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to one
 * of the sections/tabs/pages.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {

	private Context ctx;
	private List<Fragment> fragments;

	public SectionPagerAdapter(FragmentManager fm, Context ctx) {
		super(fm);
		this.ctx = ctx;

		fragments = new ArrayList<Fragment>();

		fillFragments();
	}

	private void fillFragments() {

		fragments.add(new RotateFragment());
		fragments.add(new ColorFragment());
		fragments.add(new DrawFragment());
	}

	@Override
	public Fragment getItem(int position) {
		
		//this is to prevent crash
		if (position > fragments.size())
			return new Fragment();
		
		//return the fragment of the list at the given position
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return ctx.getString(R.string.title_section1).toUpperCase();
		case 1:
			return ctx.getString(R.string.title_section2).toUpperCase();
		case 2:
			return ctx.getString(R.string.title_section3).toUpperCase();
		}
		return null;
	}
}
