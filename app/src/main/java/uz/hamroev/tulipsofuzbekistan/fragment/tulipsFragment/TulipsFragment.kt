package uz.hamroev.tulipsofuzbekistan.fragment.tulipsFragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import uz.hamroev.tulipsofuzbekistan.R
import uz.hamroev.tulipsofuzbekistan.activity.HomeActivity
import uz.hamroev.tulipsofuzbekistan.adapter.TulipsImageAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentTulipsBinding
import uz.hamroev.tulipsofuzbekistan.info.InfoTulips
import uz.hamroev.tulipsofuzbekistan.model.TulipsImage

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TulipsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TulipsFragment : Fragment() {
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

    lateinit var binding: FragmentTulipsBinding
    lateinit var listImage: ArrayList<TulipsImage>
    lateinit var tulipsImageAdapter: TulipsImageAdapter
    var map_image_url = ""
    var isClick = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTulipsBinding.inflate(layoutInflater, container, false)

        Cache.init(binding.root.context)

        checkCacheData()
        isLike()
        Glide.with(binding.root.context)
            .load(map_image_url)
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(binding.mapImage)

        tulipsImageAdapter = TulipsImageAdapter(
            binding.root.context,
            listImage,
            object : TulipsImageAdapter.OnMyTulipsImageClickListener {
                override fun onClick(tulipsImage: TulipsImage, position: Int) {
                    findNavController().navigate(uz.hamroev.tulipsofuzbekistan.R.id.action_tulipsFragment_to_imageAndMapFragment)
                }
            })
        binding.rvTulips.adapter = tulipsImageAdapter


        //map image click and open full image
        binding.mapImage.setOnClickListener {
            Cache.mapImage = map_image_url
            findNavController().navigate(uz.hamroev.tulipsofuzbekistan.R.id.action_tulipsFragment_to_mapImageFragment)

        }

        binding.cardInfo.setOnClickListener {
            findNavController().navigate(uz.hamroev.tulipsofuzbekistan.R.id.action_tulipsFragment_to_tulipsInfoFragment)
        }

        binding.imagesLinear.setOnClickListener {
            findNavController().navigate(R.id.imageAndMapFragment)
        }
        binding.locationLinear.setOnClickListener {
            Cache.mapImage = map_image_url
            findNavController().navigate(R.id.mapImageFragment)
        }
        binding.infoLinear.setOnClickListener {
            findNavController().navigate(R.id.tulipsInfoFragment)
        }

        binding.cardMenu.setOnClickListener {
            startActivity(Intent(binding.root.context, HomeActivity::class.java))
        }

        binding.cardGalleryTop.setOnClickListener {
            if (!isClick) {
                unLiked()
                binding.likeImage.setImageResource(R.drawable.ic_like_line)
                isClick = true
            } else {
                liked()
                binding.likeImage.setImageResource(R.drawable.ic_like_red)
                isClick = false
            }
        }


        binding.tulipsName.text = Cache.tulipsName



        return binding.root
    }

    private fun isLike() {

        when (Cache.tulipsPosition) {
            "1" -> {
                when (Cache.like1) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "2" -> {
                when (Cache.like2) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "3" -> {
                when (Cache.like3) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "4" -> {
                when (Cache.like4) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "5" -> {
                when (Cache.like5) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "6" -> {
                when (Cache.like6) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "7" -> {
                when (Cache.like7) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "8" -> {
                when (Cache.like8) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "9" -> {
                when (Cache.like9) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "10" -> {
                when (Cache.like10) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "11" -> {
                when (Cache.like11) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "12" -> {
                when (Cache.like12) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "13" -> {
                when (Cache.like13) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "14" -> {
                when (Cache.like14) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "15" -> {
                when (Cache.like15) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "16" -> {
                when (Cache.like16) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "17" -> {
                when (Cache.like17) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "18" -> {
                when (Cache.like18) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "19" -> {
                when (Cache.like19) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "20" -> {
                when (Cache.like20) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "21" -> {
                when (Cache.like21) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "22" -> {
                when (Cache.like22) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "23" -> {
                when (Cache.like23) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "24" -> {
                when (Cache.like24) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "25" -> {
                when (Cache.like25) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "26" -> {
                when (Cache.like26) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "27" -> {
                when (Cache.like27) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "28" -> {
                when (Cache.like28) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "29" -> {
                when (Cache.like29) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "30" -> {
                when (Cache.like30) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "31" -> {
                when (Cache.like31) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "32" -> {
                when (Cache.like32) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "33" -> {
                when (Cache.like33) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "34" -> {
                when (Cache.like34) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
            "35" -> {
                when (Cache.like35) {
                    "1" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_red)
                        isClick = false
                    }
                    "0" -> {
                        binding.likeImage.setImageResource(R.drawable.ic_like_line)
                        isClick = true
                    }
                }
            }
        }
    }


    private fun unLiked() {

        when (Cache.tulipsPosition) {
            "1" -> {
                Cache.like1 = "0"
            }
            "2" -> {
                Cache.like2 = "0"
            }
            "3" -> {
                Cache.like3 = "0"
            }
            "4" -> {
                Cache.like4 = "0"
            }
            "5" -> {
                Cache.like5 = "0"
            }
            "6" -> {
                Cache.like6 = "0"
            }
            "7" -> {
                Cache.like7 = "0"
            }
            "8" -> {
                Cache.like8 = "0"
            }
            "9" -> {
                Cache.like9 = "0"
            }
            "10" -> {
                Cache.like10 = "0"
            }
            "11" -> {
                Cache.like11 = "0"
            }
            "12" -> {
                Cache.like12 = "0"
            }
            "13" -> {
                Cache.like13 = "0"
            }
            "14" -> {
                Cache.like14 = "0"
            }
            "15" -> {
                Cache.like15 = "0"
            }
            "16" -> {
                Cache.like16 = "0"
            }
            "17" -> {
                Cache.like17 = "0"
            }
            "18" -> {
                Cache.like18 = "0"
            }
            "19" -> {
                Cache.like19 = "0"
            }
            "20" -> {
                Cache.like20 = "0"
            }
            "21" -> {
                Cache.like21 = "0"
            }
            "22" -> {
                Cache.like22 = "0"
            }
            "23" -> {
                Cache.like23 = "0"
            }
            "24" -> {
                Cache.like24 = "0"
            }
            "25" -> {
                Cache.like25 = "0"
            }
            "26" -> {
                Cache.like26 = "0"
            }
            "27" -> {
                Cache.like27 = "0"
            }
            "28" -> {
                Cache.like28 = "0"
            }
            "29" -> {
                Cache.like29 = "0"
            }
            "30" -> {
                Cache.like30 = "0"
            }
            "31" -> {
                Cache.like31 = "0"
            }
            "32" -> {
                Cache.like32 = "0"
            }
            "33" -> {
                Cache.like33 = "0"
            }
            "34" -> {
                Cache.like34 = "0"
            }
            "35" -> {
                Cache.like35 = "0"
            }
        }
    }

    private fun liked() {
        when (Cache.tulipsPosition) {
            "1" -> {
                Cache.like1 = "1"
            }
            "2" -> {
                Cache.like2 = "1"
            }
            "3" -> {
                Cache.like3 = "1"
            }
            "4" -> {
                Cache.like4 = "1"
            }
            "5" -> {
                Cache.like5 = "1"
            }
            "6" -> {
                Cache.like6 = "1"
            }
            "7" -> {
                Cache.like7 = "1"
            }
            "8" -> {
                Cache.like8 = "1"
            }
            "9" -> {
                Cache.like9 = "1"
            }
            "10" -> {
                Cache.like10 = "1"
            }
            "11" -> {
                Cache.like11 = "1"
            }
            "12" -> {
                Cache.like12 = "1"
            }
            "13" -> {
                Cache.like13 = "1"
            }
            "14" -> {
                Cache.like14 = "1"
            }
            "15" -> {
                Cache.like15 = "1"
            }
            "16" -> {
                Cache.like16 = "1"
            }
            "17" -> {
                Cache.like17 = "1"
            }
            "18" -> {
                Cache.like18 = "1"
            }
            "19" -> {
                Cache.like19 = "1"
            }
            "20" -> {
                Cache.like20 = "1"
            }
            "21" -> {
                Cache.like21 = "1"
            }
            "22" -> {
                Cache.like22 = "1"
            }
            "23" -> {
                Cache.like23 = "1"
            }
            "24" -> {
                Cache.like24 = "1"
            }
            "25" -> {
                Cache.like25 = "1"
            }
            "26" -> {
                Cache.like26 = "1"
            }
            "27" -> {
                Cache.like27 = "1"
            }
            "28" -> {
                Cache.like28 = "1"
            }
            "29" -> {
                Cache.like29 = "1"
            }
            "30" -> {
                Cache.like30 = "1"
            }
            "31" -> {
                Cache.like31 = "1"
            }
            "32" -> {
                Cache.like32 = "1"
            }
            "33" -> {
                Cache.like33 = "1"
            }
            "34" -> {
                Cache.like34 = "1"
            }
            "35" -> {
                Cache.like35 = "1"
            }
        }
    }

    private fun checkCacheData() {
        when (Cache.tulipsPosition) {
            "1" -> {
                binding.infoTulips.text = InfoTulips.tulips1Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=19-mOw9v6DEvpN0B71V5uS6oK_JAcgGJp&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1cMeatmZx0myYO9Sik9V6BU8WbHPnwpzW&export=download"))
            }
            "2" -> {
                binding.infoTulips.text = InfoTulips.tulips2Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1LDtf-qsGerKcavAH5sdlhTXtsNjZ4wHc&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1Eri2STaOUCE3Hyxj0AXg9l2meE3fLSE3&export=download"))
            }
            "3" -> {
                binding.infoTulips.text = InfoTulips.tulips3Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1rpxFGFE0Geu0NDH282uZvsuA2U6lFZ5b&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1fh8QJsaSZo-fvjvPSAnUjkEyFdAYfS_2&export&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1AS8YaYYjwT2KOIaJLWdmsuK08ZW91lCV&export=download"))
            }
            "4" -> {
                binding.infoTulips.text = InfoTulips.tulips4Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=10hrJBIwAa7Kax4nKI3GrsG74naxKkNix&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1Tcv22of_tIUJsGWJY7BRSgmza7F_w6y7&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1MiRRa_Q-Xmd4vCdUkGaNqYBj_8BHwMze&export=download"))
            }
            "5" -> {
                binding.infoTulips.text = InfoTulips.tulips5Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1S2lO1MIfjM9BPp-nfOiSndbRqHebvbI3&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=14SauKDwy0-i6ulR-O6aGpYYh1lHDlzm3&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1wQ20IcrbPesv9UVK-i99dsYwZfLFwg5T&export=download"))
            }
            "6" -> {
                binding.infoTulips.text = InfoTulips.tulips6Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1SX8Vetzk22ULAxHzWXfZzjqwbeSkK4Aw&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1ziluJtqvdV-oWQhs0rBXOiqnYv_H2Yqq&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1AbY0o75uxtUft1yu0JitkDKQECgyJhd3&export=download"))
            }
            "7" -> {
                binding.infoTulips.text = InfoTulips.tulips7Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1WEddMH1dFBWQRsbSaHzTC-jjydQ33AoZ&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1JydhF2P-qyzW_OOxFDp8xMLPey86jhLP&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1F7ZC_icwAXUZhaYXIHS8aId5KMmta_EN&export=download"))
            }
            "8" -> {
                binding.infoTulips.text = InfoTulips.tulips8Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1xRm-5LfBzsGJaL_3tpvfFE0dcDNcKCa9&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1MkgUHYdCXSdY8pgAoufgSqImWCzX8R_s&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1gsLPdZ2C7UBU7F8sazgOle_vVe8-UG8E&export=download"))
            }
            "9" -> {
                binding.infoTulips.text = InfoTulips.tulips9Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1wKYs9h2Mx9Ab84C5l4n7Opg04zCSwgFY&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1TMMmzmzV2MDA7AwhEpXw-S9At4xs70Ej&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1VGiit_Pdfh6yOUNJlAwvFmcgauFqBER2&export=download"))
            }
            "10" -> {
                binding.infoTulips.text = InfoTulips.tulips10Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1xn6xTzAX9e_SH8j6c1M2--oRajWeY-y9&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1WS4ddWfqG1t2Xek0Y1-feZvPVl7_vqRh&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1JAa3SA4VQkKrGM-7Ut8ofmunZT06NfNl&export=download"))
            }
            "11" -> {
                binding.infoTulips.text = InfoTulips.tulips11Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1rEtJsFF8xpvTZ3O1jLHtXTd_wDBSE_6A&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1gNG-94EuX1zX1azY9874N6KMSnqDuOdm&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1QJaVACdTZi6ZcFvZf7K3-o_kqQDYbBme&export=download"))
            }
            "12" -> {
                binding.infoTulips.text = InfoTulips.tulips12Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1mEsLC157ULLc67Gzdo66iAbAEfQMU4Xp&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1_dyP9p1Zit3MfQ2xS3LHdd4u0hs23Qsy&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1GdzKOObVjf71fLCY3w4RU1DfNpfo4YDx&export=download"))
            }
            "13" -> {
                binding.infoTulips.text = InfoTulips.tulips13Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1Snix4PnE1Fn9d1hVrKh8T3HVbeeeEIT_&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1Aa5kdgWwQtIU0ssdFIxpQuiEU8ZR1qPE&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1u4wuezmcfcaAwrwszduB5_KqTN4UG8Rx&export=download"))
            }
            "14" -> {
                binding.infoTulips.text = InfoTulips.tulips14Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1FCd9PCwRuYMebvgoX9CJmRWWYFoeFxaG&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1rV5Eebn8K2csxEnly8rj4VXm_x9blvS-&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1SyNM9-3LeXlsemWhdrPq6GTrKDcs7QlC&export=download"))
            }
            "15" -> {
                binding.infoTulips.text = InfoTulips.tulips15Info
                //*map 15 no*/
                map_image_url = ""
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1m9Ll-PKRwcLot-bX5G57m-jMK-aRErdi&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1_RXvL0XTxuOwHlMb35HpJqiRrBbcKc0c&export=download"))
            }
            "16" -> {
                binding.infoTulips.text = InfoTulips.tulips16Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1okqCkoOKhwdnjex-MWMNEOgooxzBQs0N&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1bvwmVIP4DBniZLFLysUAYmgYiwKW_EOX&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1_9iCmFNXkfQFcr6YnTBuqCyY4fjHjRPA&export=download"))
            }
            "17" -> {
                binding.infoTulips.text = InfoTulips.tulips17Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1MWekKRN3HVS5LHQK5CyNrGuRSrfCuzZ0&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1DFwZEmah9S2jEtZgNz5IEBJBhfcTejbF&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1iRUO3hNmVUBnShncJivduxZbspHoEfN2&export=download"))
            }
            "18" -> {
                binding.infoTulips.text = InfoTulips.tulips18Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1dYFjBropyshWIJhPEY9czYIgyQQLmUbk&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=16C5sbzds6sgrPFoji1HOsswOBxfgWURG&export=download"))
            }
            "19" -> {
                binding.infoTulips.text = InfoTulips.tulips19Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1T0LcABkIsUt5DRZtUPdcpGCCLCaXD3MU&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1j3nAlIy-9TE25fTOeiU2UXLcyU8yQJfB&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1QeuUD_uxpgAfA1a8HDvvrDRLFn-Lqxzh&export=download"))
            }
            "20" -> {
                binding.infoTulips.text = InfoTulips.tulips20Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=195_7_1gAgWO313zwNekrrHrL58v07cwJ&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1j-0cjsJn2CTfolOt4KX54aqX7DBBiXKs&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1l7K0_ZodbBZjRdCRDqxs6NOcVh5fghuE&export=download"))
            }
            "21" -> {
                binding.infoTulips.text = InfoTulips.tulips21Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1ITxg0rbU5wGW5H4yriIgXiOBHa6U-vlw&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1yZoZnDctoXsTROpAdsGt1g8s8jXS1XYI&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1QjvMv1Itn3J9A0ehxZeIUTlZCt3lTAev&export=download"))
            }
            "22" -> {
                binding.infoTulips.text = InfoTulips.tulips22Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1nwoQTVJM0MpBvCyjZu84VrDsrg-fKBPB&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1NVk7--TGEiPS918mmlW-XWnla_JEXjB2&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1Sru3gn0oJZ0DRII5VNocjdjJ5ls3sQ-y&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1_1jHc8zPxSmyXGqE0thS8yn9zQnb1DsT&export=download"))
            }
            "23" -> {
                binding.infoTulips.text = InfoTulips.tulips23Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1j53wkwGICcvlPjhWv9Rw4zDBbBVM_2HD&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1fkFusYKLQzyfHU-yQoEtjIx9yEp0QgtH&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1lW-ATfrAAgqnDbMKeFHUtCDCCYtNYimV&export=download"))
            }
            "24" -> {
                binding.infoTulips.text = InfoTulips.tulips24Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1nHmZktyxZH_Jnp-_RWP0pmsXFDoNe-Ux&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=17bLWWSPUUdpoMJJJ_JGGDmAgw9RpCL7R&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=17ND2rW7o6wPYYLsF2JQQ-DhlilYA4kTL&export=download"))
            }
            "25" -> {
                binding.infoTulips.text = InfoTulips.tulips25Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1lceRx-jv4FfA38vGVtiYmZFdhf43VWY6&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=11bzV3UP8uTvvyQ35B9Wc7sjPbkMb1hz7&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1KcRsg3x8mY7E-DEE7jZhm2MhTUJEs-qi&export=download"))
            }
            "26" -> {
                binding.infoTulips.text = InfoTulips.tulips26Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1eAtqBCOZVnpGv6cU2w6YI41wtlNg8f68&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=10xN7qFfGfBUBje752xE0nQ4zmAehlFHo&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1nB41C36GclvL_mtSefDO5lgNrHp_IGB5&export=download"))
            }
            "27" -> {
                binding.infoTulips.text = InfoTulips.tulips27Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1Ic3wvw37Eyv-K5goWr7xen6Bgm-GANRG&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1Yp5RN6oGTv6KnNxMHNoW8S5d2IkhT64n&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=16-l8B2K5FrZE5GQ5c3_PJm_aBjPUqYcu&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1f26MxUuWF9B0kIvoDbwC-2_49kKFw-Sr&export=download"))
            }
            "28" -> {
                binding.infoTulips.text = InfoTulips.tulips28Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1PrEh0odGkyc4M_y4DMtNGze06QQCAy6p&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=11zAfAOw8kysraDEv6YRbjLa5imOsmk7u&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1N38DWciRk1AEAdMuMP5G54Nn37VQF1ZY&export=download"))
            }
            "29" -> {
                binding.infoTulips.text = InfoTulips.tulips29Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1azm3aDKjHMK32R1EmkAdi1KCOLJKQqgD&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1zFWzXI0xv_Ovd2oADm9XoZq9LCvWNLrn&export=download"))
            }
            "30" -> {
                binding.infoTulips.text = InfoTulips.tulips30Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=15lO-BpzPOnu7l2-5a6Z3AUhkoqwl5QAj&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1M2hgMad3grXHb7KbBBh9yLO_dGGfjYGI&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1N0PjZRIsTBWAKp948QBjDr6wWoRtR7IV&export=download"))
            }
            "31" -> {
                binding.infoTulips.text = InfoTulips.tulips31Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1uCWOE_XqREal9kg-PEIIuourWYUPbKSi&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1kc5Ou5naP6IwnFOcpwhpSevh1mE1vjZp&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1OcC2sRx3CLj_kipcE_4FyToJXHC2EAh7&export=download"))
            }
            "32" -> {
                binding.infoTulips.text = InfoTulips.tulips32Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1PUqGY1UCKxVnabIEnzfnXjmTuVG7oqL9&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=12jJTZDNTXKysosAzTxy59yyfJvR0s7hS&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1eJJtrKIkPkfNAbTLv7JDbzIfyRuwj5Xc&export=download"))
            }
            "33" -> {
                binding.infoTulips.text = InfoTulips.tulips33Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1g6iCTLECVHmfPpTFy82X9k-OKe70EEry&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1DTG-VklfWWCiKSu_Ka54KKaitbZ0W-X7&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1IAEcJKsX-tx5IOfLLnszUJH314KIq--i&export=download"))
            }
            "34" -> {
                binding.infoTulips.text = InfoTulips.tulips34Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1RARSxImRg9PyvcV8QGrLAjaySXNRE81Z&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1hnLqp2VU3YS9D1prP0kOA1rvfJevyZO-&export=download"))
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1csU0f0YdK_K906Evu0xLFgws1jEXM2tb&export=download"))
            }
            "35" -> {
                binding.infoTulips.text = InfoTulips.tulips35Info
                map_image_url =
                    "https://drive.google.com/u/0/uc?id=1kp4CR0TIVfZ8yWcDbx0pIJUmc55Ya5G9&export=download"
                listImage = ArrayList()
                listImage.add(TulipsImage("https://drive.google.com/u/0/uc?id=1hQ0IHJ3rTXWBegSVQkevJKZwE8QWscXk&export=download"))
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
         * @return A new instance of fragment TulipsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TulipsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}