package brauliomendez.com.nasa_mvp.model

import com.google.gson.annotations.SerializedName

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
data class Camera_(@SerializedName("name") var name : String?,
                   @SerializedName("full_name") var fullName : String?){
}