package com.example.srivi.fragments;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements CFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getFragmentManager().beginTransaction()
                .add( R.id.container, new CFragment(), "CREATE_TAG" )
                .commit();
    }

    @Override
    public void onFragmentInteraction(Student student) {
        getFragmentManager().beginTransaction()
                .replace( R.id.container, new MFragment( student ), "DISPLAY_TAG"  )
                .commit();
    }
}
