package brauliomendez.com.nasa_mvp.interactor

import brauliomendez.com.nasa_mvp.fuel.NasaApi
import brauliomendez.com.nasa_mvp.model.Photo

/**
 * Created by Braulio on 22/12/2016.
 */
class RequestInteractor {

    fun getNasaPictures(data : String, result : (List<Photo>) -> Unit) {
        NasaApi().getInfo(data, {
            pictures -> result(pictures)
        })
    }
}