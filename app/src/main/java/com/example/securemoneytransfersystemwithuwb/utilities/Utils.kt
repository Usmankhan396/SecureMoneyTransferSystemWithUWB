package com.example.securemoneytransfersystemwithuwb.utilities

import android.content.Context
import android.os.Build
import org.json.JSONArray
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Utils {

    /**
     * Primarily used to define class level variables and methods (static variables)
     */
    companion object {

        /**
         * Method returns the device information
         */
        fun getDeviceInformation(): String {
            val manufacturer: String = Build.MANUFACTURER;
            val model: String = Build.MODEL;

            if (model.startsWith(manufacturer)) {
                return model.uppercase()
            }
            return manufacturer.uppercase() + " " + model
        }

        /**
         * Returns the current time stamp
         */
        fun getCurrentTimeStamp(): String {
            val timeStamp = System.currentTimeMillis()
            val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
            return formatter.format(Date(timeStamp))
        }

        fun getUserDataByEmail(context: Context?, email: String): JSONObject? {
            context?.assets!!.open("user_profiles.json").use { inputStream ->
                val json = inputStream.bufferedReader().use { it.readText() }
                val jsonArray = JSONArray(json)
                for (i in 0 until jsonArray.length()) {
                    val jsonObject: JSONObject = jsonArray.getJSONObject(i)
                    if (jsonObject.getString("email").equals(email, ignoreCase = true)) {
                        return jsonObject
                    }
                }
            }
            return null
        }


    }
}