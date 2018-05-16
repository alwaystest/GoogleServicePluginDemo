package com.example.eric.googleserviceplugindemo;

import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by eric on 2018/5/16
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
  private static final String TAG = "MyFirebaseMessagingServ";

  @Override public void onMessageReceived (RemoteMessage message) {
    Log.d(TAG, "onMessageReceived: " + message);
  }
}
