package com.nisa.loginkotlin


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_play.*

/**
 * A simple [Fragment] subclass.
 */
class PlayFragment : Fragment() {

    companion object{
        //buat dijadiin hal utama
        fun newInstance(): PlayFragment{
            val fragment = PlayFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }

    val objectData = arrayOf("Web Design", "UI UX Development", "Fullstack Material", "Material Design", "Mobile Native Development", "Flow Diagram", "Flat Design", "Data Structure", "GitHub")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_play, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = this!!.context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, android.R.id.text1, objectData) }
        listView.adapter = adapter

    }
}
