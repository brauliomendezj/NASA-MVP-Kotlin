package brauliomendez.com.nasa_mvp.retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Braulio Méndez Jiménez
 * @since 02/01/17
 */
class NasaClient {

    val nasaService : NasaService

    init {
        val builder = OkHttpClient.Builder()
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.networkInterceptors().add(httpLoggingInterceptor)

        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.nasa.gov/mars-photos/api/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build()
        nasaService = retrofit.create(NasaService::class.java)
    }
}