package com.anzelmas.lkl.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.anzelmas.lkl.adapters.KomandosAdapter;
import com.anzelmas.lkl.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KomandosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KomandosFragment extends Fragment {

    RecyclerView teamList;

    public int teamsImages[] = {R.drawable.gargzdai, R.drawable.jonava, R.drawable.joniskis, R.drawable.kaunas,
            R.drawable.klaipeda, R.drawable.marijampole, R.drawable.mazeikiai, R.drawable.moletai,
            R.drawable.palanga, R.drawable.sakiai, R.drawable.silale, R.drawable.silute,
            R.drawable.taurage, R.drawable.telsiai, R.drawable.vilnius};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public KomandosFragment() {
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
    public static KomandosFragment newInstance(String param1, String param2) {
        KomandosFragment fragment = new KomandosFragment();
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

        View rootView = inflater.inflate(R.layout.fragment_komandos, container, false);

        teamList = rootView.findViewById(R.id.teamList);
        String[] s1 = getResources().getStringArray(R.array.komandos);
        String[] s2 = getResources().getStringArray(R.array.treneriai);

        // create an adapter
        KomandosAdapter komandosAdapter = new KomandosAdapter(s1, s2, teamsImages);

        // set an adapter
        teamList.setAdapter(komandosAdapter);
        teamList.setLayoutManager(new LinearLayoutManager(requireContext()));

        // Inflate the layout for this fragment
        return rootView;
    }
}