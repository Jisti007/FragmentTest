package com.dontgodont.jisti007.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by K1697 on 23.10.2017.
 */

public class SomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_some, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("Main Fragment Content");
        return rootView;
    }
}

