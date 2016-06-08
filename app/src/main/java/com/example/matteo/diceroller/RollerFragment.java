package com.example.matteo.diceroller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RollerFragment extends Fragment {


    public RollerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_roller, container, false);

        final Button button_d4 = (Button) v.findViewById(R.id.buttonD4);
        final Button button_d6 = (Button) v.findViewById(R.id.buttonD6);
        final Button button_d8 = (Button) v.findViewById(R.id.buttonD8);
        final Button button_d10 = (Button) v.findViewById(R.id.buttonD12);
        final Button button_d12 = (Button) v.findViewById(R.id.buttonD20);
        final Button button_d20 = (Button) v.findViewById(R.id.buttonD100);
        final Button button_d100 = (Button) v.findViewById(R.id.buttonD100);
        final Button button_setPlayer = (Button) v.findViewById(R.id.buttonSetPlayer);
        final Button button_goToSetPlayer = (Button) v.findViewById(R.id.goToSetPlayer);

        button_d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_d100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_setPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_goToSetPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return v;
    }

}
