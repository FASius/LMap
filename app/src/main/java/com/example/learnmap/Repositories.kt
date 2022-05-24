package com.example.learnmap

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.learnmap.model.account.AccountRepository
import com.example.learnmap.model.account.SQLAccountManager
import com.example.learnmap.model.account.SharedPreferencesAccount
import com.example.learnmap.sqlite.AppSQLiteHelper

object Repositories {

    private lateinit var applicationContext: Context

    private val database: SQLiteDatabase by lazy<SQLiteDatabase> {
        AppSQLiteHelper(applicationContext).writableDatabase
    }

    lateinit var currentAccount:SharedPreferencesAccount

    val accountsRepository: AccountRepository by lazy {
        SQLAccountManager(database, currentAccount)
    }

    fun initAppContext (context: Context) {
        applicationContext = context
    }

    fun initCurrentAccount () {
        currentAccount = SharedPreferencesAccount(applicationContext)
    }
}