package com.feelingcook.db;

import android.content.Context;

import com.feelingcook.constant.ConstantDB;

/**
 * Created by Administrator on 2016/3/14.
 */
public class DBHelper {
    private static DBHelper mDbHelper;
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;

    public static DBHelper getInstance(){
        if(mDbHelper==null){
            mDbHelper = new DBHelper();
        }
        return mDbHelper;
    }

    public static void init(Context context){
        getmDaoMaster(context);
        getmDaoSession(context);
        getInstance();
    }

    private static DaoMaster getmDaoMaster(Context context) {
        if (mDaoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context, ConstantDB.DBNAME, null);
            mDaoMaster = new DaoMaster(helper.getReadableDatabase());
        }
        return mDaoMaster;
    }

    private static DaoSession getmDaoSession(Context context) {
        if(mDaoSession==null){
            if(mDaoMaster==null){
                getmDaoMaster(context);
            }
            mDaoSession=mDaoMaster.newSession();
        }
        return mDaoSession;
    }
}
