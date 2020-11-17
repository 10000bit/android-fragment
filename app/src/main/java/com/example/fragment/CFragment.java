package com.example.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.databinding.FragmentCBinding;


/**
 * A simple {@link Fragment} subclass.
 */



public class CFragment extends Fragment {

    public CFragment() {
        // Required empty public constructor
    }

    FragmentCBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCBinding.inflate(inflater, container, false);

        final MyViewModel model = new ViewModelProvider(requireActivity()).get(MyViewModel.class);

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
               model.select(0);
           }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.select(1);
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.select(2);
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.select(3);
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.select(4);
            }
        });

        return binding.getRoot();
    }
}


