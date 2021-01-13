package com.dieam.reactnativepushnotification.dst;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DSTReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        DSTManager dstManager = new DSTManager();
        dstManager.scheduleDSTTransitionAlarms(context);
    }
}