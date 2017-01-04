package brauliomendez.com.nasa_mvp.interactor

import brauliomendez.com.nasa_mvp.model.Example
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.retrofit.NasaClient
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author Braulio Méndez Jiménez
 * @since 29/12/16
 */
class RequestInteractor {

    fun getPictures(callback : (photos : List<Photo?>) -> Unit) {
        NasaClient().nasaService
                .getCuriosityPhotos()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe (object : Subscriber<Example>(){
                    override fun onCompleted() {

                    }

                    override fun onNext(t: Example?) {
                        callback(t!!.photos)
                    }

                    override fun onError(e: Throwable?) {

                    }

                })
    }
}