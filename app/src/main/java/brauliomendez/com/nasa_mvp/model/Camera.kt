package brauliomendez.com.nasa_mvp.model

import com.google.gson.annotations.SerializedName

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
data class Camera(@SerializedName("id") var id : Int?,
                  @SerializedName("name") var name : String?,
                  @SerializedName("rover_id") var roverId : Int?,
                  @SerializedName("full_name") var fullName : String?) {
}