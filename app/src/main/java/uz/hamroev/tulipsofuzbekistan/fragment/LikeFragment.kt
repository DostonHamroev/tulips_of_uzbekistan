package uz.hamroev.tulipsofuzbekistan.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.hamroev.tulipsofuzbekistan.activity.TulipsActivity
import uz.hamroev.tulipsofuzbekistan.adapter.LikeAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentLikeBinding
import uz.hamroev.tulipsofuzbekistan.model.Like

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LikeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LikeFragment : Fragment() {
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

    lateinit var binding: FragmentLikeBinding
    lateinit var listLike: ArrayList<Like>
    lateinit var likeAdapter: LikeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLikeBinding.inflate(layoutInflater, container, false)

        isLike()
        likeAdapter =
            LikeAdapter(binding.root.context, listLike, object : LikeAdapter.OnLikeClickListener {
                override fun onClickLike(like: Like, position: Int) {
                    checkPositionTulip(listLike[position].title.toString())
                }

                private fun checkPositionTulip(titleTulips: String) {
                    when (titleTulips) {
                        "Tulipa tubergeniana Hoog" -> {
                            Cache.tulipsPosition = "1"
                        }
                        "Tulipa bactriana J.J. de Groot & Tojibaev" -> {
                            Cache.tulipsPosition = "2"
                        }
                        "Tulipa lanata Regel" -> {
                            Cache.tulipsPosition = "3"
                        }
                        "Tulipa ingens Hoog" -> {
                            Cache.tulipsPosition = "4"
                        }
                        "Tulipa carinata Vved" -> {
                            Cache.tulipsPosition = "5"
                        }
                        "Tulipa fosteriana W.Irving" -> {
                            Cache.tulipsPosition = "6"
                        }
                        "Tulipa affinis Botschanz" -> {
                            Cache.tulipsPosition = "7"
                        }
                        "Tulipa lehmanniana Mercklin" -> {
                            Cache.tulipsPosition = "8"
                        }
                        "Tulipa borszczowii Baker" -> {
                            Cache.tulipsPosition = "9"
                        }
                        "Tulipa korolkowii Regel" -> {
                            Cache.tulipsPosition = "10"
                        }
                        "Tulipa korolkowii f.rosea (Vved) Zonn" -> {
                            Cache.tulipsPosition = "11"
                        }
                        "Tulipa ferganica Vved" -> {
                            Cache.tulipsPosition = "12"
                        }
                        "Tulipa scharipovii Tojibaev" -> {
                            Cache.tulipsPosition = "13"
                        }
                        "Tulipa intermedia Tojibaev & J.J. de Groot" -> {
                            Cache.tulipsPosition = "14"
                        }
                        "Tulipa intermedia var. korolkowioides Tojibaev & J.J. de Groot" -> {
                            Cache.tulipsPosition = "15"
                        }
                        "Tulipa talassica Lazkov" -> {
                            Cache.tulipsPosition = "16"
                        }
                        "Tulipa hissarica Popov & Vved" -> {
                            Cache.tulipsPosition = "17"
                        }
                        "Tulipa korshinskyi Vved" -> {
                            Cache.tulipsPosition = "18"
                        }
                        "Tulipa greigii Regel" -> {
                            Cache.tulipsPosition = "19"
                        }
                        "Tulipa mogoltavica Popov & Vved" -> {
                            Cache.tulipsPosition = "20"
                        }
                        "Tulipa micheliana Hoog" -> {
                            Cache.tulipsPosition = "21"
                        }
                        "Tulipa vvedenskyi Botschantz" -> {
                            Cache.tulipsPosition = "22"
                        }
                        "Tulipa butkovii Botschantz" -> {
                            Cache.tulipsPosition = "23"
                        }
                        "Tulipa kaufmanniana Regel" -> {
                            Cache.tulipsPosition = "24"
                        }
                        "Tulipa tschimganica Botschantz" -> {
                            Cache.tulipsPosition = "25"
                        }
                        "Tulipa dubia Vved" -> {
                            Cache.tulipsPosition = "26"
                        }
                        "Tulipa uzbekistanica Botschantz. & Scharipov" -> {
                            Cache.tulipsPosition = "27"
                        }
                        "Tulipa sogdiana Bunge" -> {
                            Cache.tulipsPosition = "28"
                        }
                        "Tulipa biflora Pallas" -> {
                            Cache.tulipsPosition = "29"
                        }
                        "Tulipa buhseana Boiss" -> {
                            Cache.tulipsPosition = "30"
                        }
                        "Tulipa turkestanica (Regel) Regel (" -> {
                            Cache.tulipsPosition = "31"
                        }
                        "Tulipa bifloriformis Vved" -> {
                            Cache.tulipsPosition = "32"
                        }
                        "Tulipa dasystemon (Regel) Regel" -> {
                            Cache.tulipsPosition = "33"
                        }
                        "Tulipa dasystemonoides Vved" -> {
                            Cache.tulipsPosition = "34"
                        }
                        "Tulipa orithyioides Vved" -> {
                            Cache.tulipsPosition = "35"
                        }
                    }

                    startActivity(Intent(binding.root.context, TulipsActivity::class.java))

                }
            })
        binding.rvLike.adapter = likeAdapter


        return binding.root
    }


    private fun isLike() {

        listLike = ArrayList()

        when (Cache.like1) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa tubergeniana Hoog",
                        "https://drive.google.com/u/0/uc?id=1cMeatmZx0myYO9Sik9V6BU8WbHPnwpzW&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like2) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa bactriana J.J. de Groot & Tojibaev",
                        "https://drive.google.com/u/0/uc?id=1Eri2STaOUCE3Hyxj0AXg9l2meE3fLSE3&export=download"
                    )
                )
            }
            "0" -> {
            }
        }
        when (Cache.like3) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa lanata Regel",
                        "https://drive.google.com/u/0/uc?id=1fh8QJsaSZo-fvjvPSAnUjkEyFdAYfS_2&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like4) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa ingens Hoog",
                        "https://drive.google.com/u/0/uc?id=1Tcv22of_tIUJsGWJY7BRSgmza7F_w6y7&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like5) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa carinata Vved",
                        "https://drive.google.com/u/0/uc?id=14SauKDwy0-i6ulR-O6aGpYYh1lHDlzm3&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like6) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa fosteriana W.Irving",
                        "https://drive.google.com/u/0/uc?id=1ziluJtqvdV-oWQhs0rBXOiqnYv_H2Yqq&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like7) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa affinis Botschanz",
                        "https://drive.google.com/u/0/uc?id=1JydhF2P-qyzW_OOxFDp8xMLPey86jhLP&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like8) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa lehmanniana Mercklin",
                        "https://drive.google.com/u/0/uc?id=1MkgUHYdCXSdY8pgAoufgSqImWCzX8R_s&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like9) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa borszczowii Baker",
                        "https://drive.google.com/u/0/uc?id=1TMMmzmzV2MDA7AwhEpXw-S9At4xs70Ej&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like10) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa korolkowii Regel",
                        "https://drive.google.com/u/0/uc?id=1WS4ddWfqG1t2Xek0Y1-feZvPVl7_vqRh&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like11) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa korolkowii f.rosea (Vved) Zonn",
                        "https://drive.google.com/u/0/uc?id=1gNG-94EuX1zX1azY9874N6KMSnqDuOdm&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like12) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa ferganica Vved",
                        "https://drive.google.com/u/0/uc?id=1_dyP9p1Zit3MfQ2xS3LHdd4u0hs23Qsy&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like13) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa scharipovii Tojibaev",
                        "https://drive.google.com/u/0/uc?id=1Aa5kdgWwQtIU0ssdFIxpQuiEU8ZR1qPE&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like14) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa intermedia Tojibaev & J.J. de Groot",
                        "https://drive.google.com/u/0/uc?id=1rV5Eebn8K2csxEnly8rj4VXm_x9blvS-&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like15) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa intermedia var. korolkowioides Tojibaev & J.J. de Groot",
                        "https://drive.google.com/u/0/uc?id=1m9Ll-PKRwcLot-bX5G57m-jMK-aRErdi&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like16) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa talassica Lazkov",
                        "https://drive.google.com/u/0/uc?id=1bvwmVIP4DBniZLFLysUAYmgYiwKW_EOX&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like17) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa hissarica Popov & Vved",
                        "https://drive.google.com/u/0/uc?id=1DFwZEmah9S2jEtZgNz5IEBJBhfcTejbF&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like18) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa korshinskyi Vved",
                        "https://drive.google.com/u/0/uc?id=16C5sbzds6sgrPFoji1HOsswOBxfgWURG&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like19) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa greigii Regel",
                        "https://drive.google.com/u/0/uc?id=1j3nAlIy-9TE25fTOeiU2UXLcyU8yQJfB&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like20) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa mogoltavica Popov & Vved",
                        "https://drive.google.com/u/0/uc?id=1j-0cjsJn2CTfolOt4KX54aqX7DBBiXKs&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like21) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa micheliana Hoog",
                        "https://drive.google.com/u/0/uc?id=1yZoZnDctoXsTROpAdsGt1g8s8jXS1XYI&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like22) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa vvedenskyi Botschantz",
                        "https://drive.google.com/u/0/uc?id=1NVk7--TGEiPS918mmlW-XWnla_JEXjB2&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like23) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa butkovii Botschantz",
                        "https://drive.google.com/u/0/uc?id=1fkFusYKLQzyfHU-yQoEtjIx9yEp0QgtH&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like24) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa kaufmanniana Regel",
                        "https://drive.google.com/u/0/uc?id=11bzV3UP8uTvvyQ35B9Wc7sjPbkMb1hz7&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like25) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa tschimganica Botschantz",
                        "https://drive.google.com/u/0/uc?id=17bLWWSPUUdpoMJJJ_JGGDmAgw9RpCL7R&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like26) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa dubia Vved",
                        "https://drive.google.com/u/0/uc?id=10xN7qFfGfBUBje752xE0nQ4zmAehlFHo&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like27) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa uzbekistanica Botschantz. & Scharipov",
                        "https://drive.google.com/u/0/uc?id=1Yp5RN6oGTv6KnNxMHNoW8S5d2IkhT64n&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like28) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa sogdiana Bunge",
                        "https://drive.google.com/u/0/uc?id=11zAfAOw8kysraDEv6YRbjLa5imOsmk7u&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like29) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa biflora Pallas",
                        "https://drive.google.com/u/0/uc?id=1zFWzXI0xv_Ovd2oADm9XoZq9LCvWNLrn&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like30) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa buhseana Boiss",
                        "https://drive.google.com/u/0/uc?id=1M2hgMad3grXHb7KbBBh9yLO_dGGfjYGI&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like31) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa turkestanica (Regel) Regel",
                        "https://drive.google.com/u/0/uc?id=1kc5Ou5naP6IwnFOcpwhpSevh1mE1vjZp&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like32) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa bifloriformis Vved",
                        "https://drive.google.com/u/0/uc?id=12jJTZDNTXKysosAzTxy59yyfJvR0s7hS&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like33) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa dasystemon (Regel) Regel",
                        "https://drive.google.com/u/0/uc?id=1DTG-VklfWWCiKSu_Ka54KKaitbZ0W-X7&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like34) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa dasystemonoides Vved",
                        "https://drive.google.com/u/0/uc?id=1hnLqp2VU3YS9D1prP0kOA1rvfJevyZO-&export=download"
                    )
                )

            }
            "0" -> {
            }
        }
        when (Cache.like35) {
            "1" -> {
                listLike.add(
                    Like(
                        "Tulipa orithyioides Vved",
                        "https://drive.google.com/u/0/uc?id=1hQ0IHJ3rTXWBegSVQkevJKZwE8QWscXk&export=download"
                    )
                )

            }
            "0" -> {
            }
        }


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LikeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LikeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}