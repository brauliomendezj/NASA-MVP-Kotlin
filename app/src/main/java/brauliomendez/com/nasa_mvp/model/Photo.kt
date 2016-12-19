package brauliomendez.com.nasa_mvp.model

/**
 * Created by Braulio on 19/12/2016.
 */
data class Photo(var id : Int?,
                 var sol : Int?,
                 var camera : Camera?,
                 var imgSrc : String?,
                 var earthDate : String?,
                 var rover : Rover?){
}