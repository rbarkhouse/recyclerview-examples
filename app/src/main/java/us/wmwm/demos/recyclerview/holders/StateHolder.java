package us.wmwm.demos.recyclerview.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import us.wmwm.demos.recyclerview.R;
import us.wmwm.demos.recyclerview.State;

/**
 * Created by gravener on 7/1/14.
 */
public class StateHolder extends RecyclerView.ViewHolder {

    TextView name;

    public StateHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
    }

    public void setState(State state) {
        name.setText(state.name());
    }
}
