package com.anzelmas.lkl.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anzelmas.lkl.adapters.NaujienozAdapter;
import com.anzelmas.lkl.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NaujienosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NaujienosFragment extends Fragment {

    RecyclerView naujienosList;

    public int newsImages[] = {R.drawable.naujienos1, R.drawable.naujienos2, R.drawable.naujienos3, R.drawable.naujienos4,
            R.drawable.naujienos5, R.drawable.naujienos6, R.drawable.naujienos1, R.drawable.naujienos2,
            R.drawable.naujienos3, R.drawable.naujienos4, R.drawable.naujienos5, R.drawable.naujienos6,
            R.drawable.naujienos1, R.drawable.naujienos2, R.drawable.naujienos3};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NaujienosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ExploreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NaujienosFragment newInstance(String param1, String param2) {
        NaujienosFragment fragment = new NaujienosFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_naujienos, container, false);

        naujienosList = rootView.findViewById(R.id.naujienosList);
        String[] s1 = getResources().getStringArray(R.array.naujienos);

        // create an adapter
        NaujienozAdapter naujienozAdapter = new NaujienozAdapter(s1, newsImages);

        // set an adapter
        naujienosList.setAdapter(naujienozAdapter);
        naujienosList.setLayoutManager(new LinearLayoutManager(requireContext()));

        // Inflate the layout for this fragment
        return rootView;
    }
}