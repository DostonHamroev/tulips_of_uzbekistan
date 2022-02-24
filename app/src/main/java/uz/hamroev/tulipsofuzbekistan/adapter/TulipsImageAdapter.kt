package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import uz.hamroev.tulipsofuzbekistan.databinding.ItemTulipsImageBinding
import uz.hamroev.tulipsofuzbekistan.model.TulipsImage

class TulipsImageAdapter(
    var context: Context,
    var list: ArrayList<TulipsImage>,
    var onMyTulipsImageClickListener: OnMyTulipsImageClickListener
) :
    RecyclerView.Adapter<TulipsImageAdapter.VhTulipsImage>() {


    inner class VhTulipsImage(var itemTulipsImageBinding: ItemTulipsImageBinding) :
        RecyclerView.ViewHolder(itemTulipsImageBinding.root) {

        fun onBind(tulipsImage: TulipsImage, position: Int) {

            tulipsImage.image_drawable?.let { itemTulipsImageBinding.tulipsImage.setImageResource(it) }

            Glide.with(context)
                .load(tulipsImage.image_url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(itemTulipsImageBinding.tulipsImage)

            itemTulipsImageBinding.root.setOnClickListener {
                onMyTulipsImageClickListener.onClick(tulipsImage, position)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhTulipsImage {
        return VhTulipsImage(
            ItemTulipsImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VhTulipsImage, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnMyTulipsImageClickListener {
        fun onClick(tulipsImage: TulipsImage, position: Int)
    }
}