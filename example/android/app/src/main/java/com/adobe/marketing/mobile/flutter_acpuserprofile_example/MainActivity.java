package com.adobe.marketing.mobile.flutter_acpuserprofile_example;

import android.os.Bundle;
import androidx.annotation.NonNull;

import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    GeneratedPluginRegistrant.registerWith(flutterEngine);
  }
}
