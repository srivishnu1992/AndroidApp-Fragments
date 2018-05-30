package com.example.srivi.fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MFragment extends Fragment {

    TextView textView6;
    TextView textView8;
    TextView textView10;
    TextView textView12;
    Student student;

    public MFragment() {

    }

    public MFragment(Student student) {
        // Required empty public constructor
        this.student = student;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_m, container, false );
        textView6 = view.findViewById( R.id.textView6 );
        textView8 = view.findViewById( R.id.textView8 );
        textView10 = view.findViewById( R.id.textView10 );
        textView12 = view.findViewById( R.id.textView12 );
        textView6.setText( student.name );
        textView8.setText( student.email );
        textView10.setText( student.department );
        textView12.setText( String.valueOf( student.mood ));
        return view;
    }
}
