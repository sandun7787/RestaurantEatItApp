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
public class classiccupcakeFragment extends Fragment {


    public classiccupcakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_italian, container, false);


        ArrayList<classiccupcakeClass> i_food = new ArrayList<classiccupcakeClass>();
        i_food.add(new classiccupcakeClass("Vanila CupCake", "450 Rs", R.drawable.pastaone,"0"));
        i_food.add(new classiccupcakeClass("Lasagna", "650 Rs", R.drawable.chineselogo,"0"));
        i_food.add(new classiccupcakeClass("Italian Pizza", "1250 Rs", R.drawable.pizza,"0"));
        i_food.add(new classiccupcakeClass("Focaccia Bread", "450 Rs", R.drawable.italiaone,"0"));

        classiccupcakeAdapter cadapter = new classiccupcakeAdapter(getActivity(),i_food);

        ListView listView = (ListView) view.findViewById(R.id.listview_italian);
        listView.setAdapter(cadapter);





        return view;
    }

}
