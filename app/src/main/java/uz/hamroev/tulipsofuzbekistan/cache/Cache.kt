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

    var tulipsName: String?
        get() = sharedPreferences.getString("tulipsname", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("tulipsname", value)
            }
        }

    var mapImage: String?
        get() = sharedPreferences.getString("mapimage", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("mapimage", value)
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



    /* tulips for like */

    var like1: String?
        get() = sharedPreferences.getString("like1", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like1", value)
            }
        }

    var like2: String?
        get() = sharedPreferences.getString("like2", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like2", value)
            }
        }

    var like3: String?
        get() = sharedPreferences.getString("like3", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like3", value)
            }
        }

    var like4: String?
        get() = sharedPreferences.getString("like4", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like4", value)
            }
        }

    var like5: String?
        get() = sharedPreferences.getString("like5", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like5", value)
            }
        }

    var like6: String?
        get() = sharedPreferences.getString("like6", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like6", value)
            }
        }

    var like7: String?
        get() = sharedPreferences.getString("like7", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like7", value)
            }
        }

    var like8: String?
        get() = sharedPreferences.getString("like8", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like8", value)
            }
        }

    var like9: String?
        get() = sharedPreferences.getString("like9", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like9", value)
            }
        }

    var like10: String?
        get() = sharedPreferences.getString("like10", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like10", value)
            }
        }

    var like11: String?
        get() = sharedPreferences.getString("like11", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like11", value)
            }
        }

    var like12: String?
        get() = sharedPreferences.getString("like12", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like12", value)
            }
        }

    var like13: String?
        get() = sharedPreferences.getString("like13", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like13", value)
            }
        }

    var like14: String?
        get() = sharedPreferences.getString("like14", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like14", value)
            }
        }

    var like15: String?
        get() = sharedPreferences.getString("like15", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like15", value)
            }
        }

    var like16: String?
        get() = sharedPreferences.getString("like16", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like16", value)
            }
        }

    var like17: String?
        get() = sharedPreferences.getString("like17", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like17", value)
            }
        }

    var like18: String?
        get() = sharedPreferences.getString("like18", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like18", value)
            }
        }

    var like19: String?
        get() = sharedPreferences.getString("like19", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like19", value)
            }
        }

    var like20: String?
        get() = sharedPreferences.getString("like20", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like20", value)
            }
        }

    var like21: String?
        get() = sharedPreferences.getString("like21", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like21", value)
            }
        }

    var like22: String?
        get() = sharedPreferences.getString("like22", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like22", value)
            }
        }

    var like23: String?
        get() = sharedPreferences.getString("like23", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like23", value)
            }
        }

    var like24: String?
        get() = sharedPreferences.getString("like24", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like24", value)
            }
        }

    var like25: String?
        get() = sharedPreferences.getString("like25", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like25", value)
            }
        }

    var like26: String?
        get() = sharedPreferences.getString("like26", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like26", value)
            }
        }

    var like27: String?
        get() = sharedPreferences.getString("like27", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like27", value)
            }
        }

    var like28: String?
        get() = sharedPreferences.getString("like28", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like28", value)
            }
        }

    var like29: String?
        get() = sharedPreferences.getString("like29", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like29", value)
            }
        }

    var like30: String?
        get() = sharedPreferences.getString("like30", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like30", value)
            }
        }

    var like31: String?
        get() = sharedPreferences.getString("like31", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like31", value)
            }
        }

    var like32: String?
        get() = sharedPreferences.getString("like32", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like32", value)
            }
        }

    var like33: String?
        get() = sharedPreferences.getString("like33", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like33", value)
            }
        }

    var like34: String?
        get() = sharedPreferences.getString("like34", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like34", value)
            }
        }

    var like35: String?
        get() = sharedPreferences.getString("like35", "0")
        set(value) = sharedPreferences.edit() {
            if (value != null) {
                it.putString("like35", value)
            }
        }




}
