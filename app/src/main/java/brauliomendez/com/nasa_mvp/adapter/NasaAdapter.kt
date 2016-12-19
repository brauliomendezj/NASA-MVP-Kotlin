package brauliomendez.com.nasa_mvp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import brauliomendez.com.nasa_mvp.R
import brauliomendez.com.nasa_mvp.model.Info
import brauliomendez.com.nasa_mvp.viewholder.NasaViewHolder
import mx.leo.easyrecycler.adapter.EasyAdapter

/**
 * Created by Braulio on 19/12/2016.
 */
class NasaAdapter : EasyAdapter<NasaViewHolder, Info>() {

    override fun createHolder(parent: ViewGroup?, viewType: Int): NasaViewHolder {
        return NasaViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_card, parent, false))
    }

    override fun onBindItemViewHolder(holder: NasaViewHolder, item: Info, position: Int) {
        holder.bindItem(item)
    }
}