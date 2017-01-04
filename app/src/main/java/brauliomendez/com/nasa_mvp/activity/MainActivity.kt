package brauliomendez.com.nasa_mvp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import brauliomendez.com.nasa_mvp.R
import brauliomendez.com.nasa_mvp.adapter.NasaAdapter
import brauliomendez.com.nasa_mvp.model.Photo
import brauliomendez.com.nasa_mvp.presenter.RequestPresenter
import brauliomendez.com.nasa_mvp.view.RequestView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * @author Braulio Méndez Jiménez
 * @since 19/12/16
 */
class MainActivity : AppCompatActivity(), RequestView {

    var adapter : NasaAdapter
    var presenter : RequestPresenter

    init {
        adapter = NasaAdapter()
        presenter = RequestPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
        presenter.getPhotos()
    }

    private fun setUpRecyclerView(){
        request_recycler_view.layoutManager = LinearLayoutManager(this)
        request_recycler_view.adapter = adapter
    }

    override fun showNasaPictures(pictures: List<Photo?>) {
        adapter.items = pictures as ArrayList<Photo?>
    }
}