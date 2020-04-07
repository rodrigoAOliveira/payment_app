package com.example.paymentapp;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class MainActivity extends FlutterActivity {

  private static final String CHANNEL = "payment";
  MethodChannel channel;

  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    GeneratedPluginRegistrant.registerWith(flutterEngine);

    channel = new MethodChannel(getFlutterEngine().getDartExecutor().getBinaryMessenger(), CHANNEL);

    channel.setMethodCallHandler((call, result) -> {


      Uri capptaAppLink = new Uri.Builder()
              .scheme("cappta")
              .authority("payment")
              .appendQueryParameter("authKey", "2C1CE88C-6A0C-4FA6-BF2D-519B1DB31DF4")
              .appendQueryParameter("paymentId", "123456")
              .appendQueryParameter("amount", "100")
              .appendQueryParameter("cnpj", "")
              .appendQueryParameter("paymentType", "debit")
              .appendQueryParameter("installments", "1")
              .appendQueryParameter("installmentType", "2")
              .appendQueryParameter("scheme", "paymentapp")
              .build();

      Intent capptaIntent = new Intent(Intent.ACTION_VIEW, capptaAppLink);


      startActivityForResult(capptaIntent,  10);
    });

  }


  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);

    if (resultCode == RESULT_OK) {
      String value = (String) data.getStringExtra("NAME OF THE PARAMETER");
      Log.d("TESTE", "tete " + value);
    }
  }
//  @Override
//  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//    super.onActivityResult(requestCode, resultCode, data);
//    try {
//
//      Log.d("uri", "tete" + this.getIntent().getDataString());
//      Uri appLinkUri = Uri.parse(this.getIntent().getDataString()) ;
//
//      String responseCode = appLinkUri.getQueryParameter("responseCode");
//
//      if (responseCode.equals("0")) {
//        channel.invokeMethod("payment",null);
//
//      }
//    }
//    catch (Exception e){
//      Log.d("erro", e.getMessage());
//    }
//
//
//
//
//
//    Log.d("CALLED", "OnActivity Result");
//
//
//  }



}
