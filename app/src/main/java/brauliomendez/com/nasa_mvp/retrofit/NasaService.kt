package brauliomendez.com.nasa_mvp.retrofit

import brauliomendez.com.nasa_mvp.model.Example
import retrofit2.Call
import retrofit2.http.GET

/**
 * @author Braulio Méndez Jiménez
 * @since 02/01/17
 */
interface NasaService {

    @GET("v1/rovers/curiosity/photos?sol=1000&api_key=kKoXIMVlkEUs63Mwuf668kuxUive3KTvdwObcwqT")
    fun getCuriosityPhotos() : Call<Example>
}