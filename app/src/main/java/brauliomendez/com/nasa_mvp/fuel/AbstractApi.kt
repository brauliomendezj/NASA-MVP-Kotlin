package brauliomendez.com.nasa_mvp.fuel

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet

/**
 * Created by Braulio on 22/12/2016.
 */
abstract class AbstractApi {

    init {
        FuelManager.instance.basePath = getBaseUrl()
        FuelManager.instance.baseParams = getParams()
    }

    abstract fun getBaseUrl(): String

    abstract fun getParams(): List<Pair<String, Any?>>

    fun getFromEndpoint(endpoint: String, response: (result: String) -> Unit) {
        endpoint.httpGet().responseString {
            req, res, result ->
            response(result.get())
        }
    }
}