package brauliomendez.com.nasa_mvp.viewholder

import android.view.View
import brauliomendez.com.nasa_mvp.model.Photo
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_card.view.*
import mx.leo.easyrecycler.viewholder.EasyItemViewHolder

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
class NasaViewHolder(view : View) : EasyItemViewHolder(view) {

    fun bindItem(info : Photo?){
        Glide.with(itemView.space_imageView.context).load(info!!.imgSrc).into(itemView.space_imageView)
        itemView.name_textView.text = info!!.camera!!.fullName
    }
}