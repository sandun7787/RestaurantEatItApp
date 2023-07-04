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
public class birthdaycupcakeFragment extends Fragment {


    public birthdaycupcakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fast_food, container, false);

        ArrayList<birthdaycupcakeClass> fastfood = new ArrayList<birthdaycupcakeClass>();
        fastfood.add(new birthdaycupcakeClass("Chocalatcup Cake", "250 Rs", R.drawable.chocalatcup,"0"));
        fastfood.add(new birthdaycupcakeClass("BlueCup Cake", "220 Rs", R.drawable.blue,"0"));
        fastfood.add(new birthdaycupcakeClass("RanbowCup Cake", "350 Rs", R.drawable.cupcake,"0"));
        fastfood.add(new birthdaycupcakeClass("Color Cup Cake", "120 Rs", R.drawable.big,"0"));
        fastfood.add(new birthdaycupcakeClass("Vnila Cup Cake", "200 Rs", R.drawable.unnamed,"0"));
        fastfood.add(new birthdaycupcakeClass("Wish Cup Cake", "250 Rs", R.drawable.wish,"0"));
        fastfood.add(new birthdaycupcakeClass("Cofee CupCake", "170 Rs", R.drawable.cofeeeee,"0"));
        fastfood.add(new birthdaycupcakeClass("Love CupCake", "550 Rs", R.drawable.love,"0"));
        fastfood.add(new birthdaycupcakeClass("BirthDay CupCake", "200 Rs", R.drawable.birthday,"0"));

        birthdaycupcake fastfoodadapter = new birthdaycupcake(getActivity(),fastfood);

        ListView listView = (ListView) view.findViewById(R.id.listview_fastfood);
        listView.setAdapter(fastfoodadapter);
        return view;

    }

}
