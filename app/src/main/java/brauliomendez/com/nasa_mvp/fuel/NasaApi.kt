package brauliomendez.com.nasa_mvp.fuel

import brauliomendez.com.nasa_mvp.model.Example
import brauliomendez.com.nasa_mvp.model.Photo
import com.github.salomonbrys.kotson.fromJson
import com.google.gson.Gson

/**
 * Created by Braulio on 22/12/2016.
 */
class NasaApi : AbstractApi() {

    override fun getBaseUrl(): String = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key={api_key}"

    override fun getParams(): List<Pair<String, Any?>> = listOf("api_key" to "kKoXIMVlkEUs63Mwuf668kuxUive3KTvdwObcwqT")

    fun getInfo(info: String, pictures: (List<Photo>) -> Unit) {
        getFromEndpoint(info, { response ->
            pictures(Gson().fromJson<Example>(response).photos)
        })
    }
}