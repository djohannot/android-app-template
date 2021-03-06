package com.ysdc.utils;

import android.util.Log;

import com.crashlytics.android.Crashlytics;

import androidx.annotation.Nullable;
import timber.log.Timber;

/**
 * Contains all the operation on Crashlytics and the logic to decide if a message should be sent
 * or not to the server.
 */

public final class CrashlyticsUtils {

    public static final class CrashlyticsTree extends Timber.Tree {
        private static final String CRASHLYTICS_KEY_PRIORITY = "priority";
        private static final String CRASHLYTICS_KEY_TAG = "tag";
        private static final String CRASHLYTICS_KEY_MESSAGE = "message";

        @Override
        protected void log(int priority, @Nullable String tag, @Nullable String message, @Nullable Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO) {
                return;
            }

            //TODO: uncomment when Fabric is set
//            Crashlytics.setInt(CRASHLYTICS_KEY_PRIORITY, priority);
//            Crashlytics.setString(CRASHLYTICS_KEY_TAG, tag);
//            Crashlytics.setString(CRASHLYTICS_KEY_MESSAGE, message);
//
//            if (t == null) {
//                Crashlytics.logException(new Exception(message));
//            } else {
//                Crashlytics.logException(t);
//            }
        }
    }
}
