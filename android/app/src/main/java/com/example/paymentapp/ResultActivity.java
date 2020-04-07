package com.example.paymentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

import android.app.Activity;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class ResultActivity extends Activity {

    private static final String CHANNEL = "back";
    Uri appLinkUri;

//    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//        GeneratedPluginRegistrant.registerWith(flutterEngine);
//
//        Intent resultIntent = new Intent();
//        resultIntent.putExtra("NAME OF THE PARAMETER", "teste");
//        setResult(Activity.RESULT_OK, resultIntent);
//        finish();
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_result);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("NAME OF THE PARAMETER", "teste");
        setResult(Activity.RESULT_OK, resultIntent);
        finish();


//        try
//        {
//            super.onCreate(savedInstanceState);
//            this.setContentView(R.layout.activity_result);
//
//            MethodChannel channel = new MethodChannel(getFlutterEngine().getDartExecutor().getBinaryMessenger(), "payment");
//            channel.invokeMethod("payment",null);
//
//            appLinkUri = Uri.parse(this.getIntent().getDataString()) ;
//
//            String responseCode = appLinkUri.getQueryParameter("responseCode");
//
//            if (responseCode.equals("0")) {
//
//                //this.finish();
//
//
//                Button buttonBack = (Button) this.findViewById(R.id.button_back);
//                buttonBack.setOnClickListener((View.OnClickListener) this);
//
//            }
//
//
//            else {
//               // String reason = appLinkUri.getQueryParameter("reason");
//               // Toast.makeText(this, reason, Toast.LENGTH_LONG).show();
//
//                this.finish();
//            }
//        }
//        catch (Exception e) {
//            //Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
//            this.finish();
//        }
    }

//    @Override
//    public void onClick(View view) {
//        this.finish();
//    }


}
