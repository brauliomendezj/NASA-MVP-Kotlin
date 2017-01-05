package brauliomendez.com.nasa_mvp.presenter

import android.app.Activity
import android.content.Intent
import brauliomendez.com.nasa_mvp.adapter.NasaAdapter
import brauliomendez.com.nasa_mvp.interactor.RequestInteractor
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.view.RequestView

/**
 * @author Braulio Méndez Jiménez
 * @since 22/12/16
 */
class RequestPresenter(var view : RequestView) {

    fun getPhotos() {
        val requestInteractor = RequestInteractor()
        requestInteractor.getPictures({
          list -> view.showNasaPictures(list)
        })
    }
}