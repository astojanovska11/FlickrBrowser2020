package com.example.flickrbrowser2020;

import android.net.Uri;
import android.provider.BaseColumns;

import static android.app.SearchManager.SUGGEST_URI_PATH_QUERY;
import static com.example.flickrbrowser2020.SearchProvider.CONTENT_AUTHORITY_URI;

public class TableContract {
    static final String TABLE_NAME = "Table";
    public static class Columns {
        public static final String _ID = BaseColumns._ID;
        public static final String SUGGEST_COLUMN_TEXT_1 = "SuggestColumnText1";

    }
    public static final Uri CONTENT_URI = Uri.withAppendedPath(CONTENT_AUTHORITY_URI, SUGGEST_URI_PATH_QUERY);
}
