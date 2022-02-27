package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import render.animations.Attention
import render.animations.Render
import uz.hamroev.tulipsofuzbekistan.databinding.ItemGalleryBinding
import uz.hamroev.tulipsofuzbekistan.model.Gallery

class GalleryAdapter(
    var context: Context,
    var list: ArrayList<Gallery>,
    var onMyGalleryClickListener: OnMyGalleryClickListener
) :
    RecyclerView.Adapter<GalleryAdapter.VhGallery>() {

    inner class VhGallery(var itemGalleryBinding: ItemGalleryBinding) : RecyclerView.ViewHolder(
        itemGalleryBinding.root
    ) {


        fun onBind(gallery: Gallery, position: Int) {

            Glide.with(context)
                .load(gallery.image_url_tulips)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(itemGalleryBinding.imageWithUrl)

            itemGalleryBinding.root.setOnClickListener {
                onMyGalleryClickListener.onClick(gallery, position)
            }

            val render = Render(context)
            render.setDuration(700)
            render.setAnimation(Attention.Bounce(itemGalleryBinding.root))
            render.start()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhGallery {
        return VhGallery(
            ItemGalleryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhGallery, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnMyGalleryClickListener {
        fun onClick(gallery: Gallery, position: Int)
    }
}