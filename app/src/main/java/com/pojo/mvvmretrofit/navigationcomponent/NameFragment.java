package com.pojo.mvvmretrofit.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.pojo.mvvmretrofit.R;

public class NameFragment extends Fragment {

    EditText editName;
    Button btnName;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_name, container, false);

        editName=(EditText)view.findViewById(R.id.name);
        btnName=(Button)view.findViewById(R.id.btnSubmitName);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_nameFragment_to_amountFragment);
            }
        });

        return view;
    }
}
