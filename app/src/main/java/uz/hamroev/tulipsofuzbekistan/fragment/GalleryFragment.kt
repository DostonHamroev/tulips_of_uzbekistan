package uz.hamroev.tulipsofuzbekistan.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import uz.hamroev.tulipsofuzbekistan.activity.TulipsActivity
import uz.hamroev.tulipsofuzbekistan.adapter.GalleryAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentGalleryBinding
import uz.hamroev.tulipsofuzbekistan.model.Gallery

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GalleryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GalleryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var binding: FragmentGalleryBinding
    lateinit var list: ArrayList<Gallery>
    lateinit var galleryAdapter: GalleryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGalleryBinding.inflate(layoutInflater, container, false)


        loadImages()
        galleryAdapter = GalleryAdapter(
            binding.root.context,
            list,
            object : GalleryAdapter.OnMyGalleryClickListener {
                override fun onClick(gallery: Gallery, position: Int) {
                    var tulipsPosition = position+1
                    var str = tulipsPosition.toString()
                    Cache.tulipsPosition = str
                    startActivity(Intent(binding.root.context, TulipsActivity::class.java))
                }
            })
        binding.rvGallery.adapter = galleryAdapter

        return binding.root
    }

    private fun loadImages() {
        list = ArrayList()
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
        list.add(Gallery(""))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GalleryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GalleryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}