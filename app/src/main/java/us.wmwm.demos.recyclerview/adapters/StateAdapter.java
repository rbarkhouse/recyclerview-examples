package us.wmwm.demos.recyclerview.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import us.wmwm.demos.recyclerview.R;
import us.wmwm.demos.recyclerview.State;
import us.wmwm.demos.recyclerview.holders.StateHolder;

/**
 * Created by gravener on 7/1/14.
 */
public class StateAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new StateHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_state,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        StateHolder h = (StateHolder)viewHolder;
        h.setState(State.values()[i]);
    }

    @Override
    public int getItemCount() {
        return State.values().length;
    }
}
