package com.pojo.mvvmretrofit.navigationcomponent;

import android.app.IntentService;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.pojo.mvvmretrofit.R;

public class AmountFragment extends Fragment {

    EditText editamount;
    Button btnAmount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_amount, container, false);

        editamount=(EditText)view.findViewById(R.id.amount);
        btnAmount=(Button)view.findViewById(R.id.btnSubmitAmt);

        String name=AmountFragmentArgs.fromBundle(getArguments()).getName();

        System.out.println("ReceivedNameFromNameFragment "+name);

        btnAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavDirections navDirections=AmountFragmentDirections.actionAmountFragmentToConfirmationFragment(name, Integer.parseInt(editamount.getText().toString()));
                Navigation.findNavController(v).navigate(navDirections);
            }
        });

        return view;
    }
}
