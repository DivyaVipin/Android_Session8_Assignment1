package assignment.android.acadgild.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

/**
 * Created by DivyaVipin on 1/12/2017.
 */

public class UserSettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,new MyPreferenceFragment()).commit();

    }
    public static  class MyPreferenceFragment extends PreferenceFragment
    {
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.user_settings);
        }

    }
}
