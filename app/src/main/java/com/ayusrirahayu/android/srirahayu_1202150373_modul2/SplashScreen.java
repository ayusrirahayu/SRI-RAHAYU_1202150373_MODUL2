package com.ayusrirahayu.android.srirahayu_1202150373_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {
    //TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        Context context	=	getApplicationContext();
        Toast nama	=	Toast.makeText(context,	"SRI RAHAYU_1202150373",	Toast.LENGTH_LONG);
        nama.show();

        //tvSplash = (TextView) findViewByID(R.id.tvSplash)
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}

