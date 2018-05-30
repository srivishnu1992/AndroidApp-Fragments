package com.example.srivi.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class CFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    String name;
    String email;
    String department;
    int mood;
    EditText editName;
    EditText editEmail;
    RadioGroup rgDept;
    SeekBar seekBar;
    RadioButton rbDept;
    Student student;
    Button btnSubmit;

    public CFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_c, container, false );
        btnSubmit = view.findViewById( R.id.btnSubmit );
        btnSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editName = getView().findViewById( R.id.editName );
                editEmail = getView().findViewById( R.id.editEmail );
                name = editName.getText().toString();
                email = editEmail.getText().toString();
                student = new Student( name, email, "er", 1 );
                mListener.onFragmentInteraction( student );
            }
        } );

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Student student) {
        if (mListener != null) {
            mListener.onFragmentInteraction( student );
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach( context );
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException( context.toString()
                    + " must implement OnFragmentInteractionListener" );
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Student student);
    }
}
