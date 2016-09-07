package jp.webta.testnotificationlistenerservice.service;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by kntmrkm on 16/09/07.
 */
public class MyAccessibilityService extends AccessibilityService {
    private static final String TAG = "MyNotificationTestB";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.d(TAG, "onAccessibilityEvent: " + event.getText());
    }

    @Override
    public void onInterrupt() {
    }
}
