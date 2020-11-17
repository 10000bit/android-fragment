package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fragment.databinding.FragmentABinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment {

    public AFragment() {
        // Required empty public constructor
    }

    private FragmentABinding binding;
    private MyViewModel model;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater, container, false);

        model = new ViewModelProvider(requireActivity()).get(MyViewModel.class);

        binding.listview.setAdapter(new ArrayAdapter<>(requireContext(),
                android.R.layout.simple_list_item_activated_1, Food.MENUS));
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                model.select(i);
            }
        });
        binding.listview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}
