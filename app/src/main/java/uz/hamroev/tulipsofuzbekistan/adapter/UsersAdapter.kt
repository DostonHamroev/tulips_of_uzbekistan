package uz.hamroev.tulipsofuzbekistan.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.tulipsofuzbekistan.databinding.ItemUsersBinding
import uz.hamroev.tulipsofuzbekistan.model.Users

class UsersAdapter(var context: Context, var list: ArrayList<Users>) :
    RecyclerView.Adapter<UsersAdapter.VhUsers>() {

    inner class VhUsers(var itemUsersBinding: ItemUsersBinding) :
        RecyclerView.ViewHolder(itemUsersBinding.root) {

        fun onBind(users: Users, position: Int) {
            itemUsersBinding.userName.text = users.user_name
            itemUsersBinding.userInfo.text = users.user_info
            users.user_image?.let { itemUsersBinding.userImage.setImageResource(it) }

//            Glide.with(context)
//                .load(users.user_image_url)
//                .onlyRetrieveFromCache(true)
//                .centerCrop()
//                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
//                .into(itemUsersBinding.userImage)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhUsers {
        return VhUsers(ItemUsersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhUsers, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}