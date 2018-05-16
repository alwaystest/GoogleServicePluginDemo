package com.example.eric.googleserviceplugindemo;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by eric on 2018/5/16
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
  private static final String TAG = "MyFirebaseInstanceIDSer";

  @Override public void onTokenRefresh () {
    super.onTokenRefresh();
    // Get updated InstanceID token.
    String refreshedToken = FirebaseInstanceId.getInstance().getToken();
    Log.d(TAG, "Refreshed token: " + refreshedToken);
  }
}
