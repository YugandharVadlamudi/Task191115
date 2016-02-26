package com.example.kiran.task191115;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kiran on 19-11-2015.
 */
public class listviewFragment extends Fragment
{

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        displayListView();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.listviewdisplay,container,false);
        return  view;
        /*String layout=((listviewArraryAdapter)getActivity()).getMyLayoutLink();
        return inflater.inflate(R.layout.listviewdisplay,container,false);*/
    }
    public void displayListView()
    {
        List<String> names=new ArrayList<String>();
        names.add("yugandahr");
        names.add("narendra");
        names.add("ravi");
        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(getActivity(), R.layout.listviewdisplay,R.id.TV_1,names);
        ListView lv=(ListView) getView().findViewById(R.id.LV_tag);
        lv.setAdapter(dataAdapter);
    }
}
