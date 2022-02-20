package uz.hamroev.bardambolnew.image

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface ApiServiceImage {

    @GET
    fun getImage(@Url image_url: String): Call<ResponseBody>
}