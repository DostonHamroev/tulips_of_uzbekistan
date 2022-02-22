package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.realpacific.clickshrinkeffect.applyClickShrink
import render.animations.Attention
import render.animations.Render
import uz.hamroev.tulipsofuzbekistan.databinding.ItemHomeMenuBinding
import uz.hamroev.tulipsofuzbekistan.model.HomeMenu

class HomeMenuAdapter(
    var context: Context,
    var list: ArrayList<HomeMenu>,
    var onHomeClickListener: OnHomeClickListener
) :
    RecyclerView.Adapter<HomeMenuAdapter.VhHomeMenu>() {

    inner class VhHomeMenu(var itemHomeMenuBinding: ItemHomeMenuBinding) :
        RecyclerView.ViewHolder(itemHomeMenuBinding.root) {

        fun onBind(homeMenu: HomeMenu, position: Int) {
            itemHomeMenuBinding.titleMenu.text = homeMenu.titleMenu
            homeMenu.titleImage?.let { itemHomeMenuBinding.imageMenu.setImageResource(it) }
            itemHomeMenuBinding.root.setOnClickListener {
                onHomeClickListener.onClickMenu(homeMenu, position)
                itemHomeMenuBinding.root.applyClickShrink()
            }
            val render = Render(context)
            render.setDuration(700)
            render.setAnimation(Attention.Bounce(itemHomeMenuBinding.root))
            render.start()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhHomeMenu {
        return VhHomeMenu(
            ItemHomeMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhHomeMenu, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnHomeClickListener {
        fun onClickMenu(homeMenu: HomeMenu, position: Int)
    }
}