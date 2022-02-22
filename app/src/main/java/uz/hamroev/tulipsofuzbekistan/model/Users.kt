package uz.hamroev.tulipsofuzbekistan.model

class Users {

    var user_name: String? = null
    var user_info: String? = null
    var user_image: Int? = null
    var user_image_url: String? = null

    constructor(user_name: String?, user_info: String?, user_image: Int?) {
        this.user_name = user_name
        this.user_info = user_info
        this.user_image = user_image
    }

    constructor(user_name: String?, user_info: String?, user_image_url: String?) {
        this.user_name = user_name
        this.user_info = user_info
        this.user_image_url = user_image_url
    }


}