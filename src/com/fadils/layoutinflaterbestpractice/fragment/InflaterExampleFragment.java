package com.fadils.layoutinflaterbestpractice.fragment;

import com.fadils.layoutinflaterbestpractice.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InflaterExampleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
    	/*
    	 * LayoutInflater done wrong
    	 * Passing null, the attributes in the R.layout.item_row are disregarded
    	 * Making it appear NOT exactly as we want.
    	 */
        //ViewGroup rootView = (ViewGroup) inflater.inflate(
        //        R.layout.item_row, null);
        
        /*
    	 * LayoutInflater done RIGHT
    	 * Not passing null. Instead setting attachment to container to false.
    	 * Attributes in R.layout.item_row will be taken.
    	 * Making it appear exactly as we want.
    	 */
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.item_row, container, false);


        return rootView;
    }
}