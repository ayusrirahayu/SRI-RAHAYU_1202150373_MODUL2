package com.ayusrirahayu.android.srirahayu_1202150373_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickOrder(View view) {
        // apabila memilih Dine In dan klik pesan sekarang akan menampilkan pesan Dine In
        if (((RadioButton)findViewById(R.id.buttonDineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            // apabila memilih Take Away dan klik pesan sekarang akan menampilkan pesan Take Away
        }else if (((RadioButton)findViewById(R.id.buttonTakeAway)).isChecked()){
            Intent intent = new Intent(this, detail.class);
            Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.buttonDineIn:
                if (checked)
                    // Same day service
                    displayToast("Take Away");

                break;
            case R.id.buttonTakeAway:
                if (checked)
                    // Next day delivery
                    displayToast("Dine In");
                break;

            default:
        }
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}
