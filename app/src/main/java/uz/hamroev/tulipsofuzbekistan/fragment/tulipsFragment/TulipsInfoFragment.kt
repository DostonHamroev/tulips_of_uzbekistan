package uz.hamroev.tulipsofuzbekistan.fragment.tulipsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentTulipsInfoBinding
import uz.hamroev.tulipsofuzbekistan.info.InfoTulips

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TulipsInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TulipsInfoFragment : Fragment() {
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

    lateinit var binding: FragmentTulipsInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTulipsInfoBinding.inflate(layoutInflater, container, false)

        loadInfo()

        return binding.root
    }

    private fun loadInfo() {
        when (Cache.tulipsPosition) {
            "1" -> {
                binding.tulipsInfo.text = InfoTulips.tulips1Info
            }
            "2" -> {
                binding.tulipsInfo.text = InfoTulips.tulips2Info
            }
            "3" -> {
                binding.tulipsInfo.text = InfoTulips.tulips3Info
            }
            "4" -> {
                binding.tulipsInfo.text = InfoTulips.tulips4Info
            }
            "5" -> {
                binding.tulipsInfo.text = InfoTulips.tulips5Info
            }
            "6" -> {
                binding.tulipsInfo.text = InfoTulips.tulips6Info
            }
            "7" -> {
                binding.tulipsInfo.text = InfoTulips.tulips7Info
            }
            "8" -> {
                binding.tulipsInfo.text = InfoTulips.tulips8Info
            }
            "9" -> {
                binding.tulipsInfo.text = InfoTulips.tulips9Info
            }
            "10" -> {
                binding.tulipsInfo.text = InfoTulips.tulips10Info
            }
            "11" -> {
                binding.tulipsInfo.text = InfoTulips.tulips11Info
            }
            "12" -> {
                binding.tulipsInfo.text = InfoTulips.tulips12Info
            }
            "13" -> {
                binding.tulipsInfo.text = InfoTulips.tulips13Info
            }
            "14" -> {
                binding.tulipsInfo.text = InfoTulips.tulips14Info
            }
            "15" -> {
                binding.tulipsInfo.text = InfoTulips.tulips15Info
            }
            "16" -> {
                binding.tulipsInfo.text = InfoTulips.tulips16Info
            }
            "17" -> {
                binding.tulipsInfo.text = InfoTulips.tulips17Info
            }
            "18" -> {
                binding.tulipsInfo.text = InfoTulips.tulips18Info
            }
            "19" -> {
                binding.tulipsInfo.text = InfoTulips.tulips19Info
            }
            "20" -> {
                binding.tulipsInfo.text = InfoTulips.tulips20Info
            }
            "21" -> {
                binding.tulipsInfo.text = InfoTulips.tulips21Info
            }
            "22" -> {
                binding.tulipsInfo.text = InfoTulips.tulips22Info
            }
            "23" -> {
                binding.tulipsInfo.text = InfoTulips.tulips23Info
            }
            "24" -> {
                binding.tulipsInfo.text = InfoTulips.tulips24Info
            }
            "25" -> {
                binding.tulipsInfo.text = InfoTulips.tulips25Info
            }
            "26" -> {
                binding.tulipsInfo.text = InfoTulips.tulips26Info
            }
            "27" -> {
                binding.tulipsInfo.text = InfoTulips.tulips27Info
            }
            "28" -> {
                binding.tulipsInfo.text = InfoTulips.tulips28Info
            }
            "29" -> {
                binding.tulipsInfo.text = InfoTulips.tulips29Info
            }
            "30" -> {
                binding.tulipsInfo.text = InfoTulips.tulips30Info
            }
            "31" -> {
                binding.tulipsInfo.text = InfoTulips.tulips31Info
            }
            "32" -> {
                binding.tulipsInfo.text = InfoTulips.tulips32Info
            }
            "33" -> {
                binding.tulipsInfo.text = InfoTulips.tulips33Info
            }
            "34" -> {
                binding.tulipsInfo.text = InfoTulips.tulips34Info
            }
            "35" -> {
                binding.tulipsInfo.text = InfoTulips.tulips35Info
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
         * @return A new instance of fragment TulipsInfoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TulipsInfoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}