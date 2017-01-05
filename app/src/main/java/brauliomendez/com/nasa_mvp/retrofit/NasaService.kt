package brauliomendez.com.nasa_mvp.retrofit

import brauliomendez.com.nasa_mvp.model.Example
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Braulio Méndez Jiménez
 * @since 02/01/17
 */
interface NasaService {

    @GET(ApiConstants.PHOTOS)
    fun getCuriosityPhotos(@Query("api_key") apiKey : String) : Call<Example>
}