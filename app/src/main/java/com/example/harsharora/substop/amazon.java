package com.example.harsharora.substop;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class amazon extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
    }
    public void siteA(View view) {

        Intent launchBrowser = null;
        if (view.getId()==R.id.button) {
            Uri uriUrl = Uri.parse("https://www.primevideo.com/storefront/home/ref=dv_web_nav_logo");
            launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(launchBrowser);
        }
    }
        public void submit (View view)
        {
            EditText editTextF = (EditText) findViewById(R.id.editText);
            Double amount = Double.parseDouble(editTextF.getText().toString());
            if (amount != 0)
            {
                final LinearLayout layout = (LinearLayout) findViewById(R.id.doneMenu);
                layout.setVisibility(view.VISIBLE);


            }
        }
    }

