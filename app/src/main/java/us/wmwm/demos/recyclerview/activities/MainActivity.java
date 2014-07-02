package us.wmwm.demos.recyclerview.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;

import us.wmwm.demos.recyclerview.R;
import us.wmwm.demos.recyclerview.fragments.MainFragment;

/**
 * Created by gravener on 7/1/14.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, MainFragment.newInstance()).commit();
    }
}
