package uz.hamroev.tulipsofuzbekistan.activity

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import com.realpacific.clickshrinkeffect.applyClickShrink
import uz.hamroev.tulipsofuzbekistan.R
import uz.hamroev.tulipsofuzbekistan.adapter.NavMenuAdapter
import uz.hamroev.tulipsofuzbekistan.cache.Cache
import uz.hamroev.tulipsofuzbekistan.databinding.ActivityHomeBinding
import uz.hamroev.tulipsofuzbekistan.model.NavMenu

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var navMenuAdapter: NavMenuAdapter
    lateinit var listNav: ArrayList<NavMenu>
    var isHome = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Cache.init(this)
        supportActionBar?.hide()


        val navController = Navigation.findNavController(this, R.id.my_nav_host_fragment)

        loadNavData()

        navMenuAdapter = NavMenuAdapter(
            binding.root.context,
            listNav,
            object : NavMenuAdapter.OnMyNavMenuClickListener {
                override fun onClick(navMenu: NavMenu, position: Int) {
                    when (position) {
                        0 -> {
                            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_green)
                            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
                            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
                            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
                            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
                            navController.navigate(R.id.homeFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        1 -> {
                            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
                            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_green)
                            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
                            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
                            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
                            navController.navigate(R.id.galleryFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        2 -> {
                            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
                            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
                            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_green)
                            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
                            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
                            navController.navigate(R.id.likeFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        3 -> {
                            navController.navigate(R.id.certificateFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        4 -> {
                            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
                            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
                            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
                            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_green)
                            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
                            navController.navigate(R.id.appAboutFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        5 -> {
                            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
                            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
                            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
                            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
                            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_green)
                            navController.navigate(R.id.usersFragment)
                            binding.drawerLayout.closeDrawers()
                        }
                        6 -> {
                            try {
                                val uri: Uri = Uri.parse("market://details?id=$packageName")
                                val intent = Intent(Intent.ACTION_VIEW, uri)
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                startActivity(intent)
                            } catch (e: ActivityNotFoundException) {
                                val uri: Uri =
                                    Uri.parse("http://play.google.com/store/apps/details?id=$packageName")
                                val intent = Intent(Intent.ACTION_VIEW, uri)
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                                startActivity(intent)
                            }
                            binding.drawerLayout.closeDrawers()
                        }
                        7 -> {
                            try {
                                val intent = Intent(Intent.ACTION_SEND)
                                intent.setType("text/plain")
                                intent.putExtra(Intent.EXTRA_SUBJECT, "Tulips of Uzbekistan")
                                val shareMessage: String =
                                    "https://play.google.com/store/apps/details?id=" + packageName
                                intent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                                startActivity(Intent.createChooser(intent, "share by"))
                            } catch (e: Exception) {
                            }
                            binding.drawerLayout.closeDrawers()
                        }
                        8 -> {
                            finish()
                            binding.drawerLayout.closeDrawers()
                        }
                    }
                }
            })
        binding.rvNav.adapter = navMenuAdapter

        binding.cardMenu.setOnClickListener {
            binding.drawerLayout.open()
        }

        binding.cardGalleryTop.setOnClickListener {
            isHome = 0
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_green)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
            navController.navigate(R.id.galleryFragment)
        }

        binding.bottomHome.setOnClickListener {
            isHome = 1
            binding.bottomHome.applyClickShrink()
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_green)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
            navController.navigate(R.id.homeFragment)
            binding.drawerLayout.closeDrawers()
        }

        binding.bottomGallery.setOnClickListener {
            isHome = 0
            binding.bottomLike.applyClickShrink()
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_green)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
            navController.navigate(R.id.galleryFragment)
            binding.drawerLayout.closeDrawers()
        }

        binding.bottomLike.setOnClickListener {
            isHome = 0
            binding.bottomLike.applyClickShrink()
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_green)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
            navController.navigate(R.id.likeFragment)
            binding.drawerLayout.closeDrawers()
        }

        binding.bottomInfo.setOnClickListener {
            isHome = 0
            binding.bottomInfo.applyClickShrink()
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_green)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_grey)
            navController.navigate(R.id.appAboutFragment)
            binding.drawerLayout.closeDrawers()
        }
        binding.bottomUsers.setOnClickListener {
            isHome = 0
            binding.bottomUsers.applyClickShrink()
            binding.bottomHomeImage.setImageResource(R.drawable.ic_home_grey)
            binding.bottomGalleryImage.setImageResource(R.drawable.ic_gallery_grey)
            binding.bottomLikeImage.setImageResource(R.drawable.ic_like_grey)
            binding.bottomInfoImage.setImageResource(R.drawable.ic_info_grey)
            binding.bottomUsersImage.setImageResource(R.drawable.ic_users_green)
            navController.navigate(R.id.usersFragment)
            binding.drawerLayout.closeDrawers()
        }


    }


    private fun loadNavData() {
        listNav = ArrayList()
        listNav.add(NavMenu("Home", R.drawable.ic_home))
        listNav.add(NavMenu("Gallery", R.drawable.ic_gallery))
        listNav.add(NavMenu("Like", R.drawable.ic_like))
        listNav.add(NavMenu("Certificate", R.drawable.ic_certificat))
        listNav.add(NavMenu("App About", R.drawable.ic_info))
        listNav.add(NavMenu("Authors", R.drawable.ic_users))
        listNav.add(NavMenu("Rate us", R.drawable.ic_rate))
        listNav.add(NavMenu("Share", R.drawable.ic_share))
        listNav.add(NavMenu("Exit", R.drawable.ic_exit))
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else
            super.onBackPressed()
    }

}