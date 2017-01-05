package brauliomendez.com.nasa_mvp.interactor

import brauliomendez.com.nasa_mvp.BuildConfig
import brauliomendez.com.nasa_mvp.model.Example
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.retrofit.NasaClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * @author Braulio Méndez Jiménez
 * @since 29/12/16
 */
class RequestInteractor {

    fun getPictures(callback : (photos : List<Photo?>) -> Unit) {
        NasaClient().nasaService
                .getCuriosityPhotos(BuildConfig.API_KEY)
                .enqueue(object : Callback<Example> {
                    override fun onResponse(call: Call<Example>?, response: Response<Example>?) {
                        callback(response!!.body().photos)
                    }

                    override fun onFailure(call: Call<Example>?, t: Throwable?) {

                    }
                })
    }
}