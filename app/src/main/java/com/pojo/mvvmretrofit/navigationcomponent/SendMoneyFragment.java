package com.pojo.mvvmretrofit.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.pojo.mvvmretrofit.R;

public class SendMoneyFragment extends Fragment {

    Button btnSendMoney;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_sendmoney, container, false);

        btnSendMoney=(Button)view.findViewById(R.id.btnSendMoney);

        btnSendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_sendMoneyFragment_to_nameFragment);

            }
        });

        return view;
    }
}
