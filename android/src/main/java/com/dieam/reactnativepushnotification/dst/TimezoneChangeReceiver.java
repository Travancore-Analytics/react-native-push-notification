package com.dieam.reactnativepushnotification.dst;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TimezoneChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        if (action.equals(Intent.ACTION_TIMEZONE_CHANGED) || action.equals(Intent.ACTION_TIME_CHANGED)) {
            new DSTManager().scheduleDSTTransitionAlarms(context);
        }
    }
}