package jp.webta.testnotificationlistenerservice.service;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/**
 * Created by kntmrkm on 16/09/07.
 */
public class MyNotificationListenerService extends NotificationListenerService {
    private static final String TAG = "MyNotificationA";

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        Log.d(TAG, "onNotificationPosted: " + sbn.toString());
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
    }
}
