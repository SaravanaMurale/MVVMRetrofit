package com.pojo.mvvmretrofit.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.pojo.mvvmretrofit.R;

public class ConfirmationFragment extends Fragment {

    TextView name,amount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_confirmation, container, false);

        name=(TextView)view.findViewById(R.id.cName);
        amount=(TextView)view.findViewById(R.id.cAmt);


       name.setText( ConfirmationFragmentArgs.fromBundle(getArguments()).getName());
       amount.setText( String.valueOf(ConfirmationFragmentArgs.fromBundle(getArguments()).getAmount()));


        return view;
    }
}
