package pure_software.partyapp.service;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jfuchs on 08.07.2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String USER_TABLE_NAME = "user";
    private static final String DB_NAME = "AppInternalStorage";
    private static final String TABLE_CREATE = "CREATE TABLE " + USER_TABLE_NAME + " (" +
            "FIRST_NAME TEXT(50), NAME TEXT(50)"

    public DatabaseHandler(Context context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
