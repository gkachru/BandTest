package com.example.bandtest.utils;

import android.content.Context;
import android.location.LocationManager;

import java.text.SimpleDateFormat;

/**
 * Created by liuqiong on 2017/8/31.
 */

public class MyUtils {
    /**
     * 判断位置服务是否打开
     *
     * @return
     */
    public static boolean isOpenLocationService(Context context) {
        LocationManager locationManager
                = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        boolean gps = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        boolean network = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        if (gps || network) {
            return true;
        }
        return false;
    }

    public static String formatTime(long time,String type){
        SimpleDateFormat format=new SimpleDateFormat(type);
        return format.format(time);

    }
}
