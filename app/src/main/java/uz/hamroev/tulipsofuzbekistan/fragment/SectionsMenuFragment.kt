package uz.hamroev.tulipsofuzbekistan.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
                                }
                                1 -> {
                                    Cache.tulipsPosition = "2"
                                }
                                2 -> {
                                    Cache.tulipsPosition = "3"
                                }
                                3 -> {
                                    Cache.tulipsPosition = "4"
                                }
                                4 -> {
                                    Cache.tulipsPosition = "5"
                                }
                                5 -> {
                                    Cache.tulipsPosition = "6"
                                }
                                6 -> {
                                    Cache.tulipsPosition = "7"
                                }
                            }
                        }
                        "1" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "8"
                                }
                                1 -> {
                                    Cache.tulipsPosition = "9"
                                }
                                2 -> {
                                    Cache.tulipsPosition = "10"
                                }
                                3 -> {
                                    Cache.tulipsPosition = "11"
                                }
                                4 -> {
                                    Cache.tulipsPosition = "12"
                                }
                                5 -> {
                                    Cache.tulipsPosition = "13"
                                }
                                6 -> {
                                    Cache.tulipsPosition = "14"
                                }
                                7 -> {
                                    Cache.tulipsPosition = "15"
                                }
                                8 -> {
                                    Cache.tulipsPosition = "16"
                                }
                                9 -> {
                                    Cache.tulipsPosition = "17"
                                }
                                10 -> {
                                    Cache.tulipsPosition = "18"
                                }
                            }

                        }
                        "2" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "19"
                                }
                                1 -> {
                                    Cache.tulipsPosition = "20"
                                }
                                2 -> {
                                    Cache.tulipsPosition = "21"
                                }
                                3 -> {
                                    Cache.tulipsPosition = "22"
                                }
                                4 -> {
                                    Cache.tulipsPosition = "23"
                                }
                            }

                        }
                        "3" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "24"
                                }
                                1 -> {
                                    Cache.tulipsPosition = "25"
                                }
                                2 -> {
                                    Cache.tulipsPosition = "26"
                                }
                                3 -> {
                                    Cache.tulipsPosition = "27"
                                }
                            }

                        }
                        "4" -> {
                            when (position) {
                                0 -> {
                                    Cache.tulipsPosition = "28"
                                }
                                1 -> {
                                    Cache.tulipsPosition = "29"
                                }
                                2 -> {
                                    Cache.tulipsPosition = "30"
                                }
                                3 -> {
                                    Cache.tulipsPosition = "31"
                                }
                                4 -> {
                                    Cache.tulipsPosition = "32"
                                }
                                5 -> {
                                    Cache.tulipsPosition = "33"
                                }
                                6 -> {
                                    Cache.tulipsPosition = "34"
                                }
                                7 -> {
                                    Cache.tulipsPosition = "35"
                                }
                            }
                        }
                    }
                    startActivity(Intent(binding.root.context, TulipsActivity::class.java))
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
        list.add(SectionMenu("1", "https://mfiles.alphacoders.com/793/793193.jpg"))
        list.add(SectionMenu("2", ""))
        list.add(SectionMenu("3", "https://mfiles.alphacoders.com/793/793193.jpg"))
        list.add(SectionMenu("4", "https://wallpaperboat.com/wp-content/uploads/2019/09/Magnolia-flower2.jpg"))
        list.add(SectionMenu("5", ""))
        list.add(SectionMenu("6", ""))
        list.add(SectionMenu("7", ""))

    }

    private fun load1Section() {
        binding.sectionMenuTitle.text = "Kolpakowskianae"
        list = ArrayList()
        list.clear()
        list.add(SectionMenu("8", ""))
        list.add(SectionMenu("9", ""))
        list.add(SectionMenu("10", ""))
        list.add(SectionMenu("11", ""))
        list.add(SectionMenu("12", ""))
        list.add(SectionMenu("13", ""))
        list.add(SectionMenu("14", ""))
        list.add(SectionMenu("15", ""))
        list.add(SectionMenu("16", ""))
        list.add(SectionMenu("17", ""))
        list.add(SectionMenu("18", ""))

    }

    private fun load2Section() {
        binding.sectionMenuTitle.text = "Vinistriatae"
        list = ArrayList()
        list.clear()
        list.add(SectionMenu("19", ""))
        list.add(SectionMenu("20", ""))
        list.add(SectionMenu("21", ""))
        list.add(SectionMenu("22", ""))
        list.add(SectionMenu("23", ""))

    }

    private fun load3Section() {
        binding.sectionMenuTitle.text = "Spiranthera"
        list = ArrayList()
        list.clear()
        list.add(SectionMenu("24", ""))
        list.add(SectionMenu("25", ""))
        list.add(SectionMenu("26", ""))
        list.add(SectionMenu("27", ""))

    }

    private fun load4Section() {
        binding.sectionMenuTitle.text = "Biflores"
        list = ArrayList()
        list.clear()
        list.add(SectionMenu("28", ""))
        list.add(SectionMenu("29", ""))
        list.add(SectionMenu("30", ""))
        list.add(SectionMenu("31", ""))
        list.add(SectionMenu("32", ""))
        list.add(SectionMenu("33", ""))
        list.add(SectionMenu("34", ""))
        list.add(SectionMenu("35", ""))

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