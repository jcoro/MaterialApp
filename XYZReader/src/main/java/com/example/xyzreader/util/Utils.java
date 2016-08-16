package com.example.xyzreader.util;

import android.text.format.DateUtils;

/**
 * Utility Functions
 */
public class Utils {

    /**
     * Gets a date string that can translate to different locales.
     * @param publishedDate The date in milliseconds since epoch.
     * @return The friendly date String
     */
    public static CharSequence getArticleInfo(Long publishedDate, String author ) {
        Long now = System.currentTimeMillis();
        CharSequence articleInfo;
        articleInfo =
                DateUtils.getRelativeTimeSpanString (publishedDate, now, DateUtils.HOUR_IN_MILLIS, DateUtils.FORMAT_ABBREV_ALL)
        + " by "
        + author;
        return articleInfo;
    }
}
