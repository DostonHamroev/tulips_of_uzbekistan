package uz.hamroev.tulipsofuzbekistan.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.tulipsofuzbekistan.R
import uz.hamroev.tulipsofuzbekistan.activity.TulipsActivity
import uz.hamroev.tulipsofuzbekistan.adapter.SectionMenuAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentSectionsMenuBinding
import uz.hamroev.tulipsofuzbekistan.model.SectionMenu

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SectionsMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SectionsMenuFragment : Fragment() {
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

    lateinit var binding: FragmentSectionsMenuBinding
    lateinit var sectionMenuAdapter: SectionMenuAdapter
    lateinit var list: ArrayList<SectionMenu>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSectionsMenuBinding.inflate(layoutInflater, container, false)
        Cache.init(binding.root.context)

        checkSectionPosition()
        sectionMenuAdapter = SectionMenuAdapter(
            binding.root.context,
            list,
            object : SectionMenuAdapter.OnMySectionMenuClickListener {
                override fun onClick(sectionMenu: SectionMenu, position: Int) {
                    when (Cache.sectionPosition) {
                        "0" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "1"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                1 -> {
                                    Cache.tulipsPosition = "2"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                2 -> {
                                    Cache.tulipsPosition = "3"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                3 -> {
                                    Cache.tulipsPosition = "4"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                4 -> {
                                    Cache.tulipsPosition = "5"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                5 -> {
                                    Cache.tulipsPosition = "6"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                6 -> {
                                    Cache.tulipsPosition = "7"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                7 -> {
                                    Cache.pdfPosition = "1"
                                    findNavController().navigate(R.id.pdfFragment)
                                }
                            }
                        }
                        "1" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "8"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                1 -> {
                                    Cache.tulipsPosition = "9"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                2 -> {
                                    Cache.tulipsPosition = "10"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                3 -> {
                                    Cache.tulipsPosition = "11"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                4 -> {
                                    Cache.tulipsPosition = "12"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                5 -> {
                                    Cache.tulipsPosition = "13"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                6 -> {
                                    Cache.tulipsPosition = "14"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                7 -> {
                                    Cache.tulipsPosition = "15"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                8 -> {
                                    Cache.tulipsPosition = "16"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                9 -> {
                                    Cache.tulipsPosition = "17"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                10 -> {
                                    Cache.tulipsPosition = "18"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                11 -> {
                                    Cache.pdfPosition = "2"
                                    findNavController().navigate(R.id.pdfFragment)
                                }
                            }

                        }
                        "2" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "19"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                1 -> {
                                    Cache.tulipsPosition = "20"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                2 -> {
                                    Cache.tulipsPosition = "21"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                3 -> {
                                    Cache.tulipsPosition = "22"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                4 -> {
                                    Cache.tulipsPosition = "23"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                5 -> {
                                    Cache.pdfPosition = "3"
                                    findNavController().navigate(R.id.pdfFragment)
                                }
                            }

                        }
                        "3" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "24"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                1 -> {
                                    Cache.tulipsPosition = "25"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                2 -> {
                                    Cache.tulipsPosition = "26"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                3 -> {
                                    Cache.tulipsPosition = "27"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                4 -> {
                                    Cache.pdfPosition = "4"
                                    findNavController().navigate(R.id.pdfFragment)
                                }
                            }

                        }
                        "4" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "28"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                1 -> {
                                    Cache.tulipsPosition = "29"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                2 -> {
                                    Cache.tulipsPosition = "30"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                3 -> {
                                    Cache.tulipsPosition = "31"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                4 -> {
                                    Cache.tulipsPosition = "32"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                5 -> {
                                    Cache.tulipsPosition = "33"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                6 -> {
                                    Cache.tulipsPosition = "34"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                7 -> {
                                    Cache.tulipsPosition = "35"
                                    Cache.tulipsName = list[position].titleTulips
                                    startActivity(
                                        Intent(
                                            binding.root.context,
                                            TulipsActivity::class.java
                                        )
                                    )
                                }
                                8 -> {
                                    Cache.pdfPosition = "5"
                                    findNavController().navigate(R.id.pdfFragment)
                                }
                            }
                        }
                    }

                }
            })
        binding.rvSectionMenu.adapter = sectionMenuAdapter


        return binding.root
    }

    private fun checkSectionPosition() {
        when (Cache.sectionPosition) {
            "0" -> {
                load0Section()
            }
            "1" -> {
                load1Section()
            }
            "2" -> {
                load2Section()
            }
            "3" -> {
                load3Section()
            }
            "4" -> {
                load4Section()
            }
        }
    }

    private fun load0Section() {
        binding.sectionMenuTitle.text = "Lanatae"
        list = ArrayList()
        list.clear()
        list.add(
            SectionMenu(
                "Tulipa tubergeniana Hoog",
                "https://drive.google.com/u/0/uc?id=1cMeatmZx0myYO9Sik9V6BU8WbHPnwpzW&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa bactriana J.J. de Groot & Tojibaev",
                "https://drive.google.com/u/0/uc?id=1Eri2STaOUCE3Hyxj0AXg9l2meE3fLSE3&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa lanata Regel",
                "https://drive.google.com/u/0/uc?id=1fh8QJsaSZo-fvjvPSAnUjkEyFdAYfS_2&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa ingens Hoog",
                "https://drive.google.com/u/0/uc?id=1Tcv22of_tIUJsGWJY7BRSgmza7F_w6y7&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa carinata Vved",
                "https://drive.google.com/u/0/uc?id=14SauKDwy0-i6ulR-O6aGpYYh1lHDlzm3&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa fosteriana W.Irving",
                "https://drive.google.com/u/0/uc?id=1ziluJtqvdV-oWQhs0rBXOiqnYv_H2Yqq&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa affinis Botschanz",
                "https://drive.google.com/u/0/uc?id=1JydhF2P-qyzW_OOxFDp8xMLPey86jhLP&export=download"
            )
        )
        list.add(SectionMenu("Lanatae Info", ""))
    }

    private fun load1Section() {
        binding.sectionMenuTitle.text = "Kolpakowskianae"
        list = ArrayList()
        list.clear()
        list.add(
            SectionMenu(
                "Tulipa lehmanniana Mercklin",
                "https://drive.google.com/u/0/uc?id=1MkgUHYdCXSdY8pgAoufgSqImWCzX8R_s&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa borszczowii Baker",
                "https://drive.google.com/u/0/uc?id=1TMMmzmzV2MDA7AwhEpXw-S9At4xs70Ej&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa korolkowii Regel",
                "https://drive.google.com/u/0/uc?id=1WS4ddWfqG1t2Xek0Y1-feZvPVl7_vqRh&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa korolkowii f.rosea (Vved) Zonn",
                "https://drive.google.com/u/0/uc?id=1gNG-94EuX1zX1azY9874N6KMSnqDuOdm&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa ferganica Vved",
                "https://drive.google.com/u/0/uc?id=1_dyP9p1Zit3MfQ2xS3LHdd4u0hs23Qsy&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa scharipovii Tojibaev",
                "https://drive.google.com/u/0/uc?id=1Aa5kdgWwQtIU0ssdFIxpQuiEU8ZR1qPE&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa intermedia Tojibaev & J.J. de Groot",
                "https://drive.google.com/u/0/uc?id=1rV5Eebn8K2csxEnly8rj4VXm_x9blvS-&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa intermedia var. korolkowioides Tojibaev & J.J. de Groot",
                "https://drive.google.com/u/0/uc?id=1m9Ll-PKRwcLot-bX5G57m-jMK-aRErdi&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa talassica Lazkov",
                "https://drive.google.com/u/0/uc?id=1bvwmVIP4DBniZLFLysUAYmgYiwKW_EOX&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa hissarica Popov & Vved",
                "https://drive.google.com/u/0/uc?id=1DFwZEmah9S2jEtZgNz5IEBJBhfcTejbF&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa korshinskyi Vved",
                "https://drive.google.com/u/0/uc?id=16C5sbzds6sgrPFoji1HOsswOBxfgWURG&export=download"
            )
        )
        list.add(SectionMenu("Kolpakowskianae Info", ""))
    }

    private fun load2Section() {
        binding.sectionMenuTitle.text = "Vinistriatae"
        list = ArrayList()
        list.clear()
        list.add(
            SectionMenu(
                "Tulipa greigii Regel",
                "https://drive.google.com/u/0/uc?id=1j3nAlIy-9TE25fTOeiU2UXLcyU8yQJfB&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa mogoltavica Popov & Vved",
                "https://drive.google.com/u/0/uc?id=1j-0cjsJn2CTfolOt4KX54aqX7DBBiXKs&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa micheliana Hoog",
                "https://drive.google.com/u/0/uc?id=1yZoZnDctoXsTROpAdsGt1g8s8jXS1XYI&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa vvedenskyi Botschantz",
                "https://drive.google.com/u/0/uc?id=1NVk7--TGEiPS918mmlW-XWnla_JEXjB2&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa butkovii Botschantz",
                "https://drive.google.com/u/0/uc?id=1fkFusYKLQzyfHU-yQoEtjIx9yEp0QgtH&export=download"
            )
        )
        list.add(SectionMenu("Vinistriatae Info", ""))
    }

    private fun load3Section() {
        binding.sectionMenuTitle.text = "Spiranthera"
        list = ArrayList()
        list.clear()
        list.add(
            SectionMenu(
                "Tulipa kaufmanniana Regel",
                "https://drive.google.com/u/0/uc?id=17bLWWSPUUdpoMJJJ_JGGDmAgw9RpCL7R&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa tschimganica Botschantz",
                "https://drive.google.com/u/0/uc?id=11bzV3UP8uTvvyQ35B9Wc7sjPbkMb1hz7&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa dubia Vved",
                "https://drive.google.com/u/0/uc?id=10xN7qFfGfBUBje752xE0nQ4zmAehlFHo&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa uzbekistanica Botschantz. & Scharipov",
                "https://drive.google.com/u/0/uc?id=1Yp5RN6oGTv6KnNxMHNoW8S5d2IkhT64n&export=download"
            )
        )
        list.add(SectionMenu("Spiranthera Info", ""))
    }

    private fun load4Section() {
        binding.sectionMenuTitle.text = "Biflores"
        list = ArrayList()
        list.clear()
        list.add(
            SectionMenu(
                "Tulipa sogdiana Bunge",
                "https://drive.google.com/u/0/uc?id=11zAfAOw8kysraDEv6YRbjLa5imOsmk7u&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa biflora Pallas",
                "https://drive.google.com/u/0/uc?id=1zFWzXI0xv_Ovd2oADm9XoZq9LCvWNLrn&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa buhseana Boiss",
                "https://drive.google.com/u/0/uc?id=1M2hgMad3grXHb7KbBBh9yLO_dGGfjYGI&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa turkestanica (Regel) Regel",
                "https://drive.google.com/u/0/uc?id=1kc5Ou5naP6IwnFOcpwhpSevh1mE1vjZp&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa bifloriformis Vved",
                "https://drive.google.com/u/0/uc?id=12jJTZDNTXKysosAzTxy59yyfJvR0s7hS&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa dasystemon (Regel) Regel",
                "https://drive.google.com/u/0/uc?id=1DTG-VklfWWCiKSu_Ka54KKaitbZ0W-X7&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa dasystemonoides Vved",
                "https://drive.google.com/u/0/uc?id=1hnLqp2VU3YS9D1prP0kOA1rvfJevyZO-&export=download"
            )
        )
        list.add(
            SectionMenu(
                "Tulipa orithyioides Vved",
                "https://drive.google.com/u/0/uc?id=1hQ0IHJ3rTXWBegSVQkevJKZwE8QWscXk&export=download"
            )
        )
        list.add(SectionMenu("Biflores Info", ""))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SectionsMenuFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SectionsMenuFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}