package uz.hamroev.tulipsofuzbekistan.fragment.tulipsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import uz.hamroev.tulipsofuzbekistan.adapter.ImageViewPager2Adapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentImageAndMapBinding
import uz.hamroev.tulipsofuzbekistan.model.ImageViewPager2

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ImageAndMapFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImageAndMapFragment : Fragment() {
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


    lateinit var binding: FragmentImageAndMapBinding
    lateinit var listImage: ArrayList<ImageViewPager2>
    lateinit var imageViewPager2Adapter: ImageViewPager2Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentImageAndMapBinding.inflate(layoutInflater, container, false)

        checkCacheData()
        imageViewPager2Adapter = ImageViewPager2Adapter(binding.root.context, listImage)
        binding.viewPager2.adapter = imageViewPager2Adapter

        binding.imageSizeTv.text = listImage.size.toString()
        binding.viewPager2.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                var positionLive = position + 1
                binding.imagePositionTv.text = positionLive.toString()
                super.onPageSelected(position)
            }
        })




        return binding.root
    }

    private fun checkCacheData() {
        when (Cache.tulipsPosition) {
            "1" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1cMeatmZx0myYO9Sik9V6BU8WbHPnwpzW&export=download"))
            }
            "2" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1Eri2STaOUCE3Hyxj0AXg9l2meE3fLSE3&export=download"))
            }
            "3" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1fh8QJsaSZo-fvjvPSAnUjkEyFdAYfS_2&export&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1AS8YaYYjwT2KOIaJLWdmsuK08ZW91lCV&export=download"))
            }
            "4" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1Tcv22of_tIUJsGWJY7BRSgmza7F_w6y7&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1MiRRa_Q-Xmd4vCdUkGaNqYBj_8BHwMze&export=download"))
            }
            "5" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=14SauKDwy0-i6ulR-O6aGpYYh1lHDlzm3&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1wQ20IcrbPesv9UVK-i99dsYwZfLFwg5T&export=download"))
            }
            "6" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1ziluJtqvdV-oWQhs0rBXOiqnYv_H2Yqq&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1AbY0o75uxtUft1yu0JitkDKQECgyJhd3&export=download"))
            }
            "7" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1JydhF2P-qyzW_OOxFDp8xMLPey86jhLP&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1F7ZC_icwAXUZhaYXIHS8aId5KMmta_EN&export=download"))
            }
            "8" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1MkgUHYdCXSdY8pgAoufgSqImWCzX8R_s&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1gsLPdZ2C7UBU7F8sazgOle_vVe8-UG8E&export=download"))
            }
            "9" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1TMMmzmzV2MDA7AwhEpXw-S9At4xs70Ej&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1VGiit_Pdfh6yOUNJlAwvFmcgauFqBER2&export=download"))
            }
            "10" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1WS4ddWfqG1t2Xek0Y1-feZvPVl7_vqRh&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1JAa3SA4VQkKrGM-7Ut8ofmunZT06NfNl&export=download"))
            }
            "11" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1gNG-94EuX1zX1azY9874N6KMSnqDuOdm&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1QJaVACdTZi6ZcFvZf7K3-o_kqQDYbBme&export=download"))
            }
            "12" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1_dyP9p1Zit3MfQ2xS3LHdd4u0hs23Qsy&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1GdzKOObVjf71fLCY3w4RU1DfNpfo4YDx&export=download"))
            }
            "13" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1Aa5kdgWwQtIU0ssdFIxpQuiEU8ZR1qPE&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1u4wuezmcfcaAwrwszduB5_KqTN4UG8Rx&export=download"))
            }
            "14" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1rV5Eebn8K2csxEnly8rj4VXm_x9blvS-&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1SyNM9-3LeXlsemWhdrPq6GTrKDcs7QlC&export=download"))
            }
            "15" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1m9Ll-PKRwcLot-bX5G57m-jMK-aRErdi&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1_RXvL0XTxuOwHlMb35HpJqiRrBbcKc0c&export=download"))
            }
            "16" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1bvwmVIP4DBniZLFLysUAYmgYiwKW_EOX&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1_9iCmFNXkfQFcr6YnTBuqCyY4fjHjRPA&export=download"))
            }
            "17" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1DFwZEmah9S2jEtZgNz5IEBJBhfcTejbF&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1iRUO3hNmVUBnShncJivduxZbspHoEfN2&export=download"))
            }
            "18" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=16C5sbzds6sgrPFoji1HOsswOBxfgWURG&export=download"))
            }
            "19" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1j3nAlIy-9TE25fTOeiU2UXLcyU8yQJfB&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1QeuUD_uxpgAfA1a8HDvvrDRLFn-Lqxzh&export=download"))
            }
            "20" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1j-0cjsJn2CTfolOt4KX54aqX7DBBiXKs&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1l7K0_ZodbBZjRdCRDqxs6NOcVh5fghuE&export=download"))
            }
            "21" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1yZoZnDctoXsTROpAdsGt1g8s8jXS1XYI&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1QjvMv1Itn3J9A0ehxZeIUTlZCt3lTAev&export=download"))
            }
            "22" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1NVk7--TGEiPS918mmlW-XWnla_JEXjB2&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1Sru3gn0oJZ0DRII5VNocjdjJ5ls3sQ-y&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1_1jHc8zPxSmyXGqE0thS8yn9zQnb1DsT&export=download"))
            }
            "23" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1fkFusYKLQzyfHU-yQoEtjIx9yEp0QgtH&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1lW-ATfrAAgqnDbMKeFHUtCDCCYtNYimV&export=download"))
            }
            "24" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=11bzV3UP8uTvvyQ35B9Wc7sjPbkMb1hz7&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1KcRsg3x8mY7E-DEE7jZhm2MhTUJEs-qi&export=download"))
            }
            "25" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=17bLWWSPUUdpoMJJJ_JGGDmAgw9RpCL7R&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=17ND2rW7o6wPYYLsF2JQQ-DhlilYA4kTL&export=download"))
            }
            "26" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=10xN7qFfGfBUBje752xE0nQ4zmAehlFHo&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1nB41C36GclvL_mtSefDO5lgNrHp_IGB5&export=download"))
            }
            "27" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1Yp5RN6oGTv6KnNxMHNoW8S5d2IkhT64n&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=16-l8B2K5FrZE5GQ5c3_PJm_aBjPUqYcu&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1f26MxUuWF9B0kIvoDbwC-2_49kKFw-Sr&export=download"))
            }
            "28" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=11zAfAOw8kysraDEv6YRbjLa5imOsmk7u&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1N38DWciRk1AEAdMuMP5G54Nn37VQF1ZY&export=download"))
            }
            "29" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1zFWzXI0xv_Ovd2oADm9XoZq9LCvWNLrn&export=download"))
            }
            "30" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1M2hgMad3grXHb7KbBBh9yLO_dGGfjYGI&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1N0PjZRIsTBWAKp948QBjDr6wWoRtR7IV&export=download"))
            }
            "31" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1kc5Ou5naP6IwnFOcpwhpSevh1mE1vjZp&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1OcC2sRx3CLj_kipcE_4FyToJXHC2EAh7&export=download"))
            }
            "32" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=12jJTZDNTXKysosAzTxy59yyfJvR0s7hS&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1eJJtrKIkPkfNAbTLv7JDbzIfyRuwj5Xc&export=download"))
            }
            "33" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1DTG-VklfWWCiKSu_Ka54KKaitbZ0W-X7&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1IAEcJKsX-tx5IOfLLnszUJH314KIq--i&export=download"))
            }
            "34" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1hnLqp2VU3YS9D1prP0kOA1rvfJevyZO-&export=download"))
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1csU0f0YdK_K906Evu0xLFgws1jEXM2tb&export=download"))
            }
            "35" -> {
                listImage = ArrayList()
                listImage.add(ImageViewPager2("https://drive.google.com/u/0/uc?id=1hQ0IHJ3rTXWBegSVQkevJKZwE8QWscXk&export=download"))
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
         * @return A new instance of fragment ImageAndMapFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ImageAndMapFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}