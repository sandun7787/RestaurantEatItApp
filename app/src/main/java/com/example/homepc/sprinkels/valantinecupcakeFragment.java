package com.example.homepc.sprinkels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class valantinecupcakeFragment extends Fragment {


    public valantinecupcakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sea, container, false);

        ArrayList<valantinecupcakeClass> sea_food = new ArrayList<valantinecupcakeClass>();
        sea_food.add(new valantinecupcakeClass(" Choalat CupCake", "600 Rs", R.drawable.chocolatevalentines,"0"));
        sea_food.add(new valantinecupcakeClass("Greggs CupCake", "900 Rs", R.drawable.valantain,"0"));
        sea_food.add(new valantinecupcakeClass("Red CupCake", "650 Rs", R.drawable.valantine,"0"));
        sea_food.add(new valantinecupcakeClass("Rose CupCake", "450 Rs", R.drawable.valantain1,"0"));

        valantinecupcakeAdapter seaadapter = new valantinecupcakeAdapter(getActivity(),sea_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_sea);
        listView.setAdapter(seaadapter);





        return view;
    }

}
