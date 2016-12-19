package brauliomendez.com.nasa_mvp.viewholder

import android.view.View
import brauliomendez.com.nasa_mvp.model.Info
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_card.view.*
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder

/**
 * Created by Braulio on 19/12/2016.
 */
class NasaViewHolder(view : View) : EasyItemViewHolder(view) {

    fun bindItem(info : Info){
        Glide.with(itemView.space_imageView.context).load(info.image).into(itemView.space_imageView)
        itemView.name_textView.setText(info.info)
    }
}