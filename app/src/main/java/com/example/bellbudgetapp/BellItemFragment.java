package com.example.bellbudgetapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BellItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BellItemFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public BellItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BellItemFragment.
     */
    public static BellItemFragment newInstance(String param1, String param2) {
        BellItemFragment fragment = new BellItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void goConstruction(View view) {
        Intent intent = new Intent(getActivity(), ConstructionActivity.class);
        startActivity(intent);
    }

    public void goFurniture(View view) {
        Intent intent = new Intent(getActivity(), BellFurnitureActivity.class);
        startActivity(intent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bell_item, container, false);
        //Inflate other stuff
        Button constructButton = view.findViewById(R.id.construction_button);
        constructButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goConstruction(view);
            }
        });
        Button furnitureButton = view.findViewById(R.id.bellFurniture_button);
        furnitureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goFurniture(view);
            }
        });
        //end
        return view;
    }
}