package brauliomendez.com.nasa_mvp.view

import brauliomendez.com.nasa_mvp.model.Photo

/**
 * @author Braulio Méndez Jiménez
 * @since 22/12/16
 */
interface RequestView {

    fun showNasaPictures(pictures : List<Photo?>)
}