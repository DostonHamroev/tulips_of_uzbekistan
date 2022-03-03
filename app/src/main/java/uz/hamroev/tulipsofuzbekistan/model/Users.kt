package uz.hamroev.tulipsofuzbekistan.model

class Users {

    var user_name: String? = null
    var user_info: String? = null
    var user_image: Int? = null


    constructor(user_name: String?, user_info: String?, user_image: Int?) {
        this.user_name = user_name
        this.user_info = user_info
        this.user_image = user_image
    }


}