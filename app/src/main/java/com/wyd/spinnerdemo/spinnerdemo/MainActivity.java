package com.wyd.spinnerdemo.spinnerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner my_spinner;
    SpinnerAdapter spinnerAdapter;
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_spinner = (Spinner) findViewById(R.id.my_spinner);
        list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            if (0 == i) {
                list.add("请选择单条Item");
            } else {
                list.add("spinner_Item" + (i - 1));
            }
        }
        spinnerAdapter = new SpinnerAdapter(list, this);
        my_spinner.setAdapter(spinnerAdapter);
        my_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    view.setVisibility(View.INVISIBLE);
                }else {
                    Toast.makeText(MainActivity.this,list.get(position),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
