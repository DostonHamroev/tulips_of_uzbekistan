package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import uz.hamroev.tulipsofuzbekistan.databinding.ItemImageViewPager2Binding
import uz.hamroev.tulipsofuzbekistan.model.ImageViewPager2

class ImageViewPager2Adapter(var context: Context, var list: ArrayList<ImageViewPager2>) :
    RecyclerView.Adapter<ImageViewPager2Adapter.VhImageViewPager2>() {


    inner class VhImageViewPager2(var itemImageViewPager2Binding: ItemImageViewPager2Binding) :
        RecyclerView.ViewHolder(itemImageViewPager2Binding.root) {

        fun onBind(imageViewPager2: ImageViewPager2, position: Int) {

            Glide.with(context)
                .load(imageViewPager2.image_url)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(itemImageViewPager2Binding.photoView)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhImageViewPager2 {
        return VhImageViewPager2(
            ItemImageViewPager2Binding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhImageViewPager2, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}