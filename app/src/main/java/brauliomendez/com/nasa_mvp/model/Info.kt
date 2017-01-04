package brauliomendez.com.nasa_mvp.model

import com.google.gson.annotations.SerializedName

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
data class Info(@SerializedName("image") var image : String?,
                @SerializedName("info") var info : String?) {
}