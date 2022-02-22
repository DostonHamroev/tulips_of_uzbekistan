package uz.hamroev.tulipsofuzbekistan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.hamroev.tulipsofuzbekistan.R
import uz.hamroev.tulipsofuzbekistan.adapter.HomeMenuAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentHomeBinding
import uz.hamroev.tulipsofuzbekistan.model.HomeMenu

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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

    lateinit var binding: FragmentHomeBinding
    lateinit var list: ArrayList<HomeMenu>
    lateinit var homeMenuAdapter: HomeMenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        Cache.init(binding.root.context)
        startAnimation()
        loadData()
        homeMenuAdapter = HomeMenuAdapter(
            binding.root.context,
            list,
            object : HomeMenuAdapter.OnHomeClickListener {
                override fun onClickMenu(homeMenu: HomeMenu, position: Int) {
                    when (position) {
                        0 -> {
                            findNavController().navigate(R.id.sectionsMenuFragment)
                            Cache.sectionPosition = "0"
                        }
                        1 -> {
                            findNavController().navigate(R.id.sectionsMenuFragment)
                            Cache.sectionPosition = "1"
                        }
                        2 -> {
                            findNavController().navigate(R.id.sectionsMenuFragment)
                            Cache.sectionPosition = "2"
                        }
                        3 -> {
                            findNavController().navigate(R.id.sectionsMenuFragment)
                            Cache.sectionPosition = "3"
                        }
                        4 -> {
                            findNavController().navigate(R.id.sectionsMenuFragment)
                            Cache.sectionPosition = "4"
                        }
                    }
                }
            })
        binding.rvHomeMenu.adapter = homeMenuAdapter


        return binding.root
    }

    private fun startAnimation() {
        binding.mainAppNameTv.animateText("Tulips of\nUzbekistan")
        binding.mainAppNameTv.setCharacterDeley(50)
    }

    private fun loadData() {
        list = ArrayList()
        list.add(HomeMenu("Lanatae", R.drawable.ic_1lanatae))
        list.add(HomeMenu("Kolpakowskianae", R.drawable.ic_2kolpakowskiana))
        list.add(HomeMenu("Vinistriatae", R.drawable.ic_3vinistriatae))
        list.add(HomeMenu("Spiranthera", R.drawable.ic_4spiranthera))
        list.add(HomeMenu("Biflores", R.drawable.ic_5biflores))
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}