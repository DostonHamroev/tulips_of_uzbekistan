package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import render.animations.Attention
import render.animations.Render
import uz.hamroev.tulipsofuzbekistan.databinding.ItemSectionMenuBinding
import uz.hamroev.tulipsofuzbekistan.model.SectionMenu

class SectionMenuAdapter(
    var context: Context,
    var list: ArrayList<SectionMenu>,
    var onMySectionMenuClickListener: OnMySectionMenuClickListener
) :
    RecyclerView.Adapter<SectionMenuAdapter.VhSectionMenu>() {

    inner class VhSectionMenu(var itemSectionMenuBinding: ItemSectionMenuBinding) :
        RecyclerView.ViewHolder(itemSectionMenuBinding.root) {

        fun onBind(sectionMenu: SectionMenu, position: Int) {
            itemSectionMenuBinding.titleTulips.text = sectionMenu.titleTulips
            Glide.with(context)
                .load(sectionMenu.imageTulips)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(itemSectionMenuBinding.imageTulips)

            val render = Render(context)
            render.setDuration(700)
            render.setAnimation(Attention.Bounce(itemSectionMenuBinding.root))
            render.start()

            itemSectionMenuBinding.root.setOnClickListener {
                onMySectionMenuClickListener.onClick(sectionMenu, position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhSectionMenu {
        return VhSectionMenu(
            ItemSectionMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhSectionMenu, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnMySectionMenuClickListener {
        fun onClick(sectionMenu: SectionMenu, position: Int)
    }
}