package com.kelin.commonview.indicator.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kelin.commonview.R;

public class TestFragment2 extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_sample,
                container, false);
        TextView textView = new TextView(getActivity());
        textView.setText("page 2");
        rootView.addView(textView);
        return rootView;

    }
}
