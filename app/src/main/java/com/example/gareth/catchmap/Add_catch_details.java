package com.example.gareth.catchmap;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Add_catch_details extends Fragment
{

    private CatchViewModel catchViewModel;
    private boolean done = false;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        catchViewModel = ViewModelProviders.of(this).get(CatchViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //View to hold the current views inflater
        View view = inflater.inflate(R.layout.add_catch_details, container, false);

        //Retrieve the bitmap from the activity
        Bitmap img = getArguments().getParcelable("image");

        //Add image to the fragment
        ImageView imgView = view.findViewById(R.id.image_container);
        imgView.setImageBitmap(img);

        Button addButton = view.findViewById(R.id.btn_add);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Variables to hold the views inputs
                String type = "";
                float weight;
                float length;
                String description = "";
                float latitude;
                float longitude;

                //Create EditText instances take values from them
                //Fish type
                EditText typeText = view.findViewById(R.id.txt_fish_type);
                type = typeText.getText().toString();

                //Fish weight
                EditText weightText = view.findViewById(R.id.txt_fish_weight);
                weight = Float.valueOf(weightText.getText().toString());

                //Fish length
                EditText lengthText = view.findViewById(R.id.txt_fish_length);
                length = Float.valueOf(lengthText.getText().toString());

                //Description
                EditText descText = view.findViewById(R.id.txt_fish_desc);
                description = descText.getText().toString();

                //Fish lat
                EditText latText = view.findViewById(R.id.txt_fish_lat);
                latitude = Float.valueOf(latText.getText().toString());

                //Fish lng
                EditText longText = view.findViewById(R.id.txt_fish_long);
                longitude = Float.valueOf(longText.getText().toString());

                Catch newCatch = new Catch(type, length, weight,
                        description, latitude, longitude, "");

                catchViewModel.insert(newCatch);

                //Finishes parent activity
                getActivity().finish();

            }
        });

        return view;
    }




}
