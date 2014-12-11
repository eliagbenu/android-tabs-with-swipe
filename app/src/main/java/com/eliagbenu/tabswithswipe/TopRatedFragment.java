package com.eliagbenu.tabswithswipe;

/**
 * Created by eli on 11/14/14.
 */

import android.support.v4.app.Fragment;

import com.eliagbenu.tabswithswipe.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TopRatedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_top_rated, container, false);

        return rootView;
    }
}