package com.ayusrirahayu.android.srirahayu_1202150373_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class detail extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button3;
    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(detail.this, menu.class);
                startActivity(b);
            }
        });


        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(detail.this);
        }
        // Create ArrayAdapter using the string array and default spinner layout.

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
        public void showText(View view) {
            EditText editText = (EditText) findViewById(R.id.editText5);
            if (editText != null) {
                String showString = (editText.getText().toString() + mSpinnerLabel  + " Choosed ");
                Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
            showText(view);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            Log.d(TAG, "onNothingSelected: ");
        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

