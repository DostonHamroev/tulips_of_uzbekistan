package uz.hamroev.tulipsofuzbekistan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.hamroev.tulipsofuzbekistan.R
import uz.hamroev.tulipsofuzbekistan.adapter.UsersAdapter
import uz.hamroev.tulipsofuzbekistan.databinding.FragmentUsersBinding
import uz.hamroev.tulipsofuzbekistan.model.Users

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UsersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UsersFragment : Fragment() {
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

    lateinit var binding: FragmentUsersBinding
    lateinit var list: ArrayList<Users>
    lateinit var usersAdapter: UsersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsersBinding.inflate(layoutInflater, container, false)

        loadUsers()
        usersAdapter = UsersAdapter(binding.root.context, list)
        binding.rvUsers.adapter = usersAdapter


        return binding.root
    }

    private fun loadUsers() {
        list = ArrayList()
        //list.add(Users("Beknazarova Saida \nSafibullayevna","professor of Tashkent university of information technologies, doctor of technical science",R.drawable.ic_saida))
        list.add(
            Users(
                "Tojibaev \nKomiljon \nSharobitdinovich",
                "Head of the laboratory \"Flora of Uzbekistan\" of the Institute of Botany of the Academy of Sciences of the Republic of Uzbekistan.",
                R.drawable.ic_tojibaev
            )
        )
        list.add(
            Users(
                "Makhmudjanov Dilmurod \nIbrokhim ugli",
                "Junior researcher of the laboratory \"Flora of Uzbekistan\" of the Institute of Botany of the Academy of Sciences of the Republic of Uzbekistan.",
                R.drawable.ic_dilmurod
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
         * @return A new instance of fragment UsersFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            UsersFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}