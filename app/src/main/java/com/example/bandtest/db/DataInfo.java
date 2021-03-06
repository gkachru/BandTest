package com.example.bandtest.db;

/**
 * Created by Harry on 2017/9/5.
 */

public class DataInfo {
    //Database Info
    public static String DATABASE_NAME = "Database.db";
    public static int DATABASE_VERSION = 2;

    //Table Names
    public static String TABLE_CURRENT_DATA="currentData";//实时数据(计步、卡路里、睡眠值)
    public static String TABLE_HOURLY_DATA="hourlyData";//整点数据(计步、卡路里、心率、血氧、血压、睡眠时间)
    public static String TABLE_BAND_TEST_DATA="bandTestData";//手环单机测量的数据(心率、血氧、血压)
    public static String TABLE_REMIND_DATA="remindData";//祈祷数据

    //Table Colums
    public static String TIMEINMILLIS = "timeInMillis";
    public static String HEARTRATE = "heartRate";
    public static String BLOODOXYGEN = "bloodOxygen";
    public static String BLOODPRESSURELOW = "bloodPressureLow";
    public static String BLOODPRESSUREHIGH = "bloodPressureHigh";
    public static String STEPCOUNT = "stepCount";
    public static String CALORIES = "calories";
    public static String DISTANCE = "distance";
    public static String SHALLOWSLEEPTIME = "shallowSleepTime";
    public static String DEEPSLEEPTIME = "deepSleepTime";
    public static String SLEEPTIME = "sleepTime";
    public static String WAKEUPTIMES = "wakeupTimes";
    public static String MACADDRESS = "macAddress";

    //祈祷表
    public static String DAY = "day";
    public static String TIME = "time";
    public static String REPEAT = "REPEAT";
    public static String REMIND_ID = "remindId";
    public static String SWITCH = "switch";
    public static String NUMBER = "number";



    //create table
    public static final String CREATE_CURRENTDATA = "create table " +TABLE_CURRENT_DATA+
            "(" +
            TIMEINMILLIS+" bigint,"+   //bigint-->long
            STEPCOUNT+" int unique,"+  //unique
            CALORIES+" int,"+
            DISTANCE+" float,"+
            MACADDRESS+" varchar"+");";


    public static final String CREATE_HOURLYDATA = "create table " +TABLE_HOURLY_DATA+
            "(" +
            TIMEINMILLIS+" bigint unique,"+
            STEPCOUNT+" int,"+
            CALORIES+" int,"+
            DISTANCE+" float,"+
            HEARTRATE+" int,"+
            BLOODOXYGEN+" int,"+
            BLOODPRESSUREHIGH+" int,"+
            BLOODPRESSURELOW+" int,"+
            SHALLOWSLEEPTIME+" int,"+
            DEEPSLEEPTIME+" int,"+
            SLEEPTIME+" int,"+
            WAKEUPTIMES+" int,"+
            MACADDRESS+" varchar"+");";

    public static final String CREATE_BANDTESTDATA = "create table " +TABLE_BAND_TEST_DATA+
            "(" +
            TIMEINMILLIS+" bigint unique,"+   //bigint-->long
            HEARTRATE+" int,"+  //unique
            BLOODOXYGEN+" int,"+
            BLOODPRESSUREHIGH+" int,"+
            BLOODPRESSURELOW+" int,"+
            MACADDRESS+" varchar"+");";



    public static final String CREATE_REMINDDATA = "create table "+TABLE_REMIND_DATA+
            "("+
            DAY+" varchar,"+
            TIME+" varchar,"+
            REPEAT+" varchar,"+
            REMIND_ID+" varchar,"+
            SWITCH+" varchar,"+
            NUMBER+" varchar"+");"
            ;
}
