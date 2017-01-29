package com.botty.home.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.botty.home.R;
import com.botty.home.Recycler.RecyclerViewAdapter;

import java.util.ArrayList;

/**
 * Created by BottyIvan on 29/01/17.
 */

public class WatcherFragment extends Fragment{

    public WatcherFragment(){

    }

    private ArrayList<String> recyclerItemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.watcher_fragment, container,
                false);


        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        //set layout manager for the recycler view
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        setData();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), recyclerItemList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void setData() {
        recyclerItemList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            recyclerItemList.add(String.valueOf(i));
        }
    }
}