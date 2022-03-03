package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.tulipsofuzbekistan.databinding.ItemNavMenuBinding
import uz.hamroev.tulipsofuzbekistan.model.NavMenu

class NavMenuAdapter(
    var context: Context,
    var list: ArrayList<NavMenu>,
    var onMyNavMenuClickListener: OnMyNavMenuClickListener
) :
    RecyclerView.Adapter<NavMenuAdapter.VhNavMenu>() {


    inner class VhNavMenu(var itemNavMenuBinding: ItemNavMenuBinding) :
        RecyclerView.ViewHolder(itemNavMenuBinding.root) {


        fun onBind(navMenu: NavMenu, position: Int) {
            itemNavMenuBinding.navTitle.text = navMenu.navTitle
            navMenu.navIcon?.let { itemNavMenuBinding.navIcon.setImageResource(it) }

            itemNavMenuBinding.root.setOnClickListener {
                onMyNavMenuClickListener.onClick(navMenu, position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhNavMenu {
        return VhNavMenu(
            ItemNavMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhNavMenu, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    interface OnMyNavMenuClickListener {
        fun onClick(navMenu: NavMenu, position: Int)
    }
}