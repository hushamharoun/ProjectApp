package com.example.buscis_c2_l9.projectapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TimePicker;

import java.util.Date;

import static com.example.buscis_c2_l9.projectapp.R.id.LanguageOp;

public class Main2Activity extends AppCompatActivity
{
    private Spinner spinner;
    private Button PickDate;
    private Button PickTime;
    private RadioButton LanguageOp;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        spinner = (Spinner) findViewById(R.id.spinner);
        PickDate = (Button) findViewById(R.id.PickDate);
        PickTime = (Button) findViewById(R.id.PickTime);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        int position = spinner.getSelectedItemPosition();
        String selectedText = (String) spinner.getSelectedItem();
    }
}
