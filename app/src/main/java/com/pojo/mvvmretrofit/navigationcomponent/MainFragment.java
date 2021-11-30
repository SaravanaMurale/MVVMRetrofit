package com.pojo.mvvmretrofit.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pojo.mvvmretrofit.R;


public class MainFragment extends Fragment {

    Button btnTransaction,btnSendMoney,btnViewBalance;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_main, container, false);

        btnTransaction=view.findViewById(R.id.viewTransaction);
        btnSendMoney=view.findViewById(R.id.sendMoney);
        btnViewBalance=view.findViewById(R.id.viewBalance);


        btnTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_mainFragment2_to_transactionFragment2);

            }
        });

        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_mainFragment2_to_sendMoneyFragment);

            }
        });

        btnViewBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_mainFragment2_to_viewBalanceFragment);
            }
        });

        return view ;
    }
}