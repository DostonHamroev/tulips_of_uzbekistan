package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import uz.hamroev.tulipsofuzbekistan.databinding.ItemLikeBinding
import uz.hamroev.tulipsofuzbekistan.model.Like

class LikeAdapter(
    var context: Context,
    var list: ArrayList<Like>,
    var onLikeClickListener: OnLikeClickListener
) :
    RecyclerView.Adapter<LikeAdapter.VhLike>() {

    inner class VhLike(var itemLikeBinding: ItemLikeBinding) :
        RecyclerView.ViewHolder(itemLikeBinding.root) {

        fun onBind(like: Like, position: Int) {

            itemLikeBinding.title.text = like.title

            Glide.with(context)
                .load(like.image_url)
                .centerCrop()
                .onlyRetrieveFromCache(true)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(itemLikeBinding.imageLike)

            itemLikeBinding.root.setOnClickListener {
                onLikeClickListener.onClickLike(like, position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhLike {
        return VhLike(ItemLikeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhLike, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface OnLikeClickListener {
        fun onClickLike(like: Like, position: Int)
    }
}