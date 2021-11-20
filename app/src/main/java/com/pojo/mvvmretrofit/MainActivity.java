package com.pojo.mvvmretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listOne=new ArrayList();
        List<String> listTwo=new ArrayList();
        List<String> newlist=new ArrayList();

        listOne.add("Murali");
        listOne.add("Rajesh");
        listOne.add("Mathi");
        listOne.add("murali");
        listOne.add("Suresh");
        listOne.add("Rajesh");

        if(newlist.contains(listOne)) {

            newlist.addAll(listOne);

        }




    }
}