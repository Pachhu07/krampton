package com.aximo.krampton.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.aximo.krampton.R;

public class RigFormActivity extends AppCompatActivity {

    TextView regTextView;
    Spinner regSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rig_form);

        regTextView = (TextView)findViewById(R.id.pro_textView);
        regSpinner = (Spinner)findViewById(R.id.regSpinner);

        String profe[]={"Hotel Owner","Employee","Equipment Vendor","Sevice Vendor","Company Catering Onwer","Consumer Supplier","Super User","Super Admin","Sales Person"};
        ArrayAdapter mArrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,profe);
        regSpinner.setAdapter(mArrayAdapter);
    }

}
