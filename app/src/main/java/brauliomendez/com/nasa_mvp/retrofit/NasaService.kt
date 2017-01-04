package brauliomendez.com.nasa_mvp.retrofit

import brauliomendez.com.nasa_mvp.model.Example
import retrofit2.http.GET
import rx.Observable

/**
 * Created by Braulio on 02/01/2017.
 */
interface NasaService {

    @GET("v1/rovers/curiosity/photos?sol=1000&api_key=kKoXIMVlkEUs63Mwuf668kuxUive3KTvdwObcwqT")
    fun getCuriosityPhotos() : Observable<Example>
}