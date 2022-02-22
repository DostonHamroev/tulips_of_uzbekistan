package uz.hamroev.tulipsofuzbekistan.cache

import android.content.Context
import android.content.SharedPreferences

object Cache {

    private const val NAME = "tulips"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }



    var position: String?
        get() = sharedPreferences.getString("joy", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("joy", value)
            }
        }

    var tulipsPosition: String?
        get() = sharedPreferences.getString("tulipsposition", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("tulipsposition", value)
            }
        }

    var sectionPosition: String?
        get() = sharedPreferences.getString("sectionPosition", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("sectionPosition", value)
            }
        }

    var path: String?
        get() = sharedPreferences.getString("path", "")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("path", value)
            }
        }







}
