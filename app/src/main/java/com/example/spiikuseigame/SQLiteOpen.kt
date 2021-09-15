package com.example.spiikuseigame

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

public class SQLiteOpen (context: Context,
                         databaseName: String,
                         factory: SQLiteDatabase.CursorFactory?,
                         version: Int
): SQLiteOpenHelper(context, databaseName, factory, version) {

//    override fun onCreate(database: SQLiteDatabase?) {
//        database?.execSQL(
//            "create table if not exists SampleTable (id text primary key, name text)");
//    }
//
//    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
//        if (oldVersion < newVersion) {
//            database?.execSQL(
//                "alter table SampleTable add column deleteFlag integer default 0")
//        }
//    }
    override fun onCreate(database: SQLiteDatabase?) {
        database?.execSQL(
            "create table if not exists sumTable (id text, correct text, incorrect text, answer text, days text)");
        database?.execSQL(
            "create table if not exists monthTable (id text, correct text, incorrect text, answer text, days text)");
        database?.execSQL(
            "create table if not exists QuestionTable (id text, genre int, question text, ans1 text, ans2 text, ans3 text, ans4 text, Answer text)");
    }

    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion < newVersion) {
            database?.execSQL(
                "alter table sumTable add column deleteFlag integer default 0")
            database?.execSQL(
                "alter table monthTable add column deleteFlag integer default 0")
            database?.execSQL(
                    "alter table QuestionTable add column deleteFlag integer default 0")
        }
    }


}