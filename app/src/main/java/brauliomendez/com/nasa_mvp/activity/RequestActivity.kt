package brauliomendez.com.nasa_mvp.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import brauliomendez.com.nasa_mvp.R
import brauliomendez.com.nasa_mvp.adapter.NasaAdapter
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.presenter.RequestPresenter
import brauliomendez.com.nasa_mvp.view.RequestView
import kotlinx.android.synthetic.main.activity_request.*
import mx.leo.easyrecycler.util.RecyclerViewItemClickListener
import mx.leo.easyrecycler.util.extensions.onItemClickListener
import java.util.*

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
class RequestActivity : AppCompatActivity(), RequestView {

    var adapter : NasaAdapter
    var presenter : RequestPresenter

    init {
        adapter = NasaAdapter()
        presenter = RequestPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        setUpRecyclerView()
        presenter.getPhotos()
    }

    private fun setUpRecyclerView(){
        request_recycler_view.layoutManager = LinearLayoutManager(this)
        request_recycler_view.adapter = adapter
    }

    override fun showNasaPictures(pictures: List<Photo?>) {
       adapter.addItems(pictures as ArrayList<Photo?>)
    }
}