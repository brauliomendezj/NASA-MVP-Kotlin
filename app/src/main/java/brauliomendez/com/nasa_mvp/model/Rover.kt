package brauliomendez.com.nasa_mvp.model

/**
 * Created by Braulio on 19/12/2016.
 */
data class Rover(var id : Int?,
                 var name : String?,
                 var landigDate : String?,
                 var launchDate : String?,
                 var status : String?,
                 var maxSol : Int?,
                 var maxDate : String?,
                 var totalPhotos : Int?,
                 var cameras : List<Camera_>?){

}