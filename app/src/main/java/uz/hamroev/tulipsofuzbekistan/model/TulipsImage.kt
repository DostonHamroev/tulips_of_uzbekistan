package uz.hamroev.tulipsofuzbekistan.model

class TulipsImage {
    var image_url: String? = null

    var image_drawable: Int? = null

    constructor(image_url: String?) {
        this.image_url = image_url
    }

    constructor(image_drawable: Int?) {
        this.image_drawable = image_drawable
    }


}