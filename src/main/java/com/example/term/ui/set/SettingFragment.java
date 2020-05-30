package com.example.term.ui.set;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.widget.Toast;

import androidx.preference.PreferenceFragmentCompat;

import com.example.term.R;
import java.util.Set;

public class SettingFragment extends PreferenceFragmentCompat {
    SharedPreferences pref;

    public void onCreatePreferences(Bundle savedInstanceState,String rootKey){
        setPreferencesFromResource(R.xml.setting, rootKey);
    }

}
