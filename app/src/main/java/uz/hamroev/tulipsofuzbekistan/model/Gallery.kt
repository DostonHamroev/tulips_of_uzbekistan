package uz.hamroev.tulipsofuzbekistan.model

class Gallery {

    var image_name: String? = null
    var image_url_tulips: String? = null


    constructor(image_url_tulips: String?) {
        this.image_url_tulips = image_url_tulips
    }

    constructor(image_name: String?, image_url_tulips: String?) {
        this.image_name = image_name
        this.image_url_tulips = image_url_tulips
    }


}