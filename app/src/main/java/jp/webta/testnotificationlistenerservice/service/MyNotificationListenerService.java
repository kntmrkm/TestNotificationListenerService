package jp.webta.testnotificationlistenerservice.service;

import android.annotation.TargetApi;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/**
 * Created by kntmrkm on 16/09/07.
 */
@TargetApi(18)
public class MyNotificationListenerService extends NotificationListenerService {
    private static final String TAG = "MyNotificationTestA";

    @TargetApi(18)
    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        Log.d(TAG, "onNotificationPosted: " + sbn.toString());
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
    }
}
