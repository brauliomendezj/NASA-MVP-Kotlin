package brauliomendez.com.nasa_mvp.model

import com.google.gson.annotations.SerializedName

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
data class Rover(@SerializedName("id") var id : Int?,
                 @SerializedName("name") var name : String?,
                 @SerializedName("landing_date") var landingDate : String?,
                 @SerializedName("launch_date") var launchDate : String?,
                 @SerializedName("status") var status : String?,
                 @SerializedName("max_sol") var maxSol : Int?,
                 @SerializedName("max_date") var maxDate : String?,
                 @SerializedName("total_photos") var totalPhotos : Int?,
                 @SerializedName("cameras") var cameras : List<Camera_>?){

}