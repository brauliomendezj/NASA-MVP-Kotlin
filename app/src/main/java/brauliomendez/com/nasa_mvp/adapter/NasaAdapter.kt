package brauliomendez.com.nasa_mvp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import brauliomendez.com.nasa_mvp.R
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.viewholder.NasaViewHolder
import mx.leo.easyrecycler.adapter.EasyAdapter

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
class NasaAdapter : EasyAdapter<NasaViewHolder, Photo?>() {

    override fun createHolder(parent: ViewGroup?, viewType: Int): NasaViewHolder {
        return NasaViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_card, parent, false))
    }

    override fun onBindItemViewHolder(holder: NasaViewHolder, item: Photo?, position: Int) {
        holder.bindItem(item)
    }
}