package us.wmwm.demos.recyclerview.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import us.wmwm.demos.recyclerview.R;
import us.wmwm.demos.recyclerview.adapters.StateAdapter;

public class MainFragment extends Fragment {

    RecyclerView recycler;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main,container,false);
        recycler = (RecyclerView) root.findViewById(R.id.recycler_view);
        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setHasFixedSize(true);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recycler.setAdapter(new StateAdapter());
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }
}
