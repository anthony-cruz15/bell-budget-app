package com.example.bellbudgetapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bellbudgetapp.placeholder.PlaceholderContent;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class ItemListFragment extends Fragment {

    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;
    private List<Item> items;
    private ItemRecyclerViewAdapter adapter;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemListFragment() {
    }

    @SuppressWarnings("unused")
    public static ItemListFragment newInstance(int columnCount) {
        ItemListFragment fragment = new ItemListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
        loadItems();
        adapter = new ItemRecyclerViewAdapter(items);
    }

    private void loadItems() {
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
        String constructionItemListString = sharedPreferences.getString(MainActivity.CONSTRUCTION_LIST_KEY, null);
        String mileFurnitureItemListString = sharedPreferences.getString(MainActivity.MILE_FURNITURE_LIST_KEY, null);
        Type type = new TypeToken<ArrayList<Item>>(){}.getType();
        Gson gson = new Gson();
        ArrayList<Item> constructionItems = gson.fromJson(constructionItemListString, type);
        ArrayList<Item> mileFurnitureItems = gson.fromJson(mileFurnitureItemListString, type);
        ArrayList<Item> allItems = new ArrayList<>();
        allItems.addAll(constructionItems);
        allItems.addAll(mileFurnitureItems);
        if (mileFurnitureItems == null) {
            mileFurnitureItems = new ArrayList<Item>();
        }
        items = allItems;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(adapter);
        }
        return view;
    }
}