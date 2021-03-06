package uz.hamroev.tulipsofuzbekistan.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
                    var tulipsPosition = position + 1
                    var str = tulipsPosition.toString()
                    Cache.tulipsPosition = str
                    Cache.tulipsName = list[position].image_name
                    startActivity(Intent(binding.root.context, TulipsActivity::class.java))
                }
            })
        binding.rvGallery.adapter = galleryAdapter

        return binding.root
    }

    private fun loadImages() {
        list = ArrayList()
        list.add(
            Gallery(
                "Tulipa tubergeniana Hoog",
                "https://drive.google.com/u/0/uc?id=1cMeatmZx0myYO9Sik9V6BU8WbHPnwpzW&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa bactriana J.J. de Groot & Tojibaev",
                "https://drive.google.com/u/0/uc?id=1Eri2STaOUCE3Hyxj0AXg9l2meE3fLSE3&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa lanata Regel",
                "https://drive.google.com/u/0/uc?id=1fh8QJsaSZo-fvjvPSAnUjkEyFdAYfS_2&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa ingens Hoog",
                "https://drive.google.com/u/0/uc?id=1Tcv22of_tIUJsGWJY7BRSgmza7F_w6y7&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa carinata Vved",
                "https://drive.google.com/u/0/uc?id=14SauKDwy0-i6ulR-O6aGpYYh1lHDlzm3&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa fosteriana W.Irving",
                "https://drive.google.com/u/0/uc?id=1ziluJtqvdV-oWQhs0rBXOiqnYv_H2Yqq&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa affinis Botschanz",
                "https://drive.google.com/u/0/uc?id=1JydhF2P-qyzW_OOxFDp8xMLPey86jhLP&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa lehmanniana Mercklin",
                "https://drive.google.com/u/0/uc?id=1MkgUHYdCXSdY8pgAoufgSqImWCzX8R_s&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa borszczowii Baker",
                "https://drive.google.com/u/0/uc?id=1TMMmzmzV2MDA7AwhEpXw-S9At4xs70Ej&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa korolkowii Regel",
                "https://drive.google.com/u/0/uc?id=1WS4ddWfqG1t2Xek0Y1-feZvPVl7_vqRh&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa korolkowii f.rosea (Vved) Zonn",
                "https://drive.google.com/u/0/uc?id=1gNG-94EuX1zX1azY9874N6KMSnqDuOdm&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa ferganica Vved",
                "https://drive.google.com/u/0/uc?id=1_dyP9p1Zit3MfQ2xS3LHdd4u0hs23Qsy&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa scharipovii Tojibaev",
                "https://drive.google.com/u/0/uc?id=1Aa5kdgWwQtIU0ssdFIxpQuiEU8ZR1qPE&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa intermedia Tojibaev & J.J. de Groot",
                "https://drive.google.com/u/0/uc?id=1rV5Eebn8K2csxEnly8rj4VXm_x9blvS-&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa intermedia var. korolkowioides Tojibaev & J.J. de Groot",
                "https://drive.google.com/u/0/uc?id=1m9Ll-PKRwcLot-bX5G57m-jMK-aRErdi&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa talassica Lazkov",
                "https://drive.google.com/u/0/uc?id=1bvwmVIP4DBniZLFLysUAYmgYiwKW_EOX&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa hissarica Popov & Vved",
                "https://drive.google.com/u/0/uc?id=1DFwZEmah9S2jEtZgNz5IEBJBhfcTejbF&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa korshinskyi Vved",
                "https://drive.google.com/u/0/uc?id=16C5sbzds6sgrPFoji1HOsswOBxfgWURG&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa greigii Regel",
                "https://drive.google.com/u/0/uc?id=1j3nAlIy-9TE25fTOeiU2UXLcyU8yQJfB&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa mogoltavica Popov & Vved",
                "https://drive.google.com/u/0/uc?id=1j-0cjsJn2CTfolOt4KX54aqX7DBBiXKs&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa micheliana Hoog",
                "https://drive.google.com/u/0/uc?id=1yZoZnDctoXsTROpAdsGt1g8s8jXS1XYI&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa vvedenskyi Botschantz",
                "https://drive.google.com/u/0/uc?id=1NVk7--TGEiPS918mmlW-XWnla_JEXjB2&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa butkovii Botschantz",
                "https://drive.google.com/u/0/uc?id=1fkFusYKLQzyfHU-yQoEtjIx9yEp0QgtH&export=download"
            )
        )

        list.add(
            Gallery(
                "Tulipa kaufmanniana Regel",
                "https://drive.google.com/u/0/uc?id=11bzV3UP8uTvvyQ35B9Wc7sjPbkMb1hz7&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa tschimganica Botschantz",
                "https://drive.google.com/u/0/uc?id=17bLWWSPUUdpoMJJJ_JGGDmAgw9RpCL7R&export=download"
            )
        )

        list.add(
            Gallery(
                "Tulipa dubia Vved",
                "https://drive.google.com/u/0/uc?id=10xN7qFfGfBUBje752xE0nQ4zmAehlFHo&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa uzbekistanica Botschantz. & Scharipov",
                "https://drive.google.com/u/0/uc?id=1Yp5RN6oGTv6KnNxMHNoW8S5d2IkhT64n&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa sogdiana Bunge",
                "https://drive.google.com/u/0/uc?id=11zAfAOw8kysraDEv6YRbjLa5imOsmk7u&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa biflora Pallas",
                "https://drive.google.com/u/0/uc?id=1zFWzXI0xv_Ovd2oADm9XoZq9LCvWNLrn&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa buhseana Boiss",
                "https://drive.google.com/u/0/uc?id=1M2hgMad3grXHb7KbBBh9yLO_dGGfjYGI&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa turkestanica (Regel) Regel",
                "https://drive.google.com/u/0/uc?id=1kc5Ou5naP6IwnFOcpwhpSevh1mE1vjZp&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa bifloriformis Vved",
                "https://drive.google.com/u/0/uc?id=12jJTZDNTXKysosAzTxy59yyfJvR0s7hS&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa dasystemon (Regel) Regel",
                "https://drive.google.com/u/0/uc?id=1DTG-VklfWWCiKSu_Ka54KKaitbZ0W-X7&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa dasystemonoides Vved",
                "https://drive.google.com/u/0/uc?id=1hnLqp2VU3YS9D1prP0kOA1rvfJevyZO-&export=download"
            )
        )
        list.add(
            Gallery(
                "Tulipa orithyioides Vved",
                "https://drive.google.com/u/0/uc?id=1hQ0IHJ3rTXWBegSVQkevJKZwE8QWscXk&export=download"
            )
        )
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