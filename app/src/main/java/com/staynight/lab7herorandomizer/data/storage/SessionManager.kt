package com.staynight.lab7herorandomizer.data.storage

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SessionManager @Inject constructor(private val sharedPreferences: SharedPreferences) {

    companion object {
        private const val SESSION_ID = "SESSION_ID"
    }

    private val editor = sharedPreferences.edit()

    fun saveSessionID(sessionID: String) {
        editor.putString(SESSION_ID, sessionID).apply()
    }

    fun getSessionID(): String {
        return sharedPreferences.getString(SESSION_ID, "") ?: ""
    }
}