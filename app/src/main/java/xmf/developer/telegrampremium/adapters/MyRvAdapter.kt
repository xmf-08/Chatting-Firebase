package xmf.developer.telegrampremium.adapters

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import xmf.developer.telegrampremium.databinding.ItemRvBinding
import xmf.developer.telegrampremium.models.MyShablon

class MyRvAdapter(val usersList: ArrayList<MyShablon>) :
        RecyclerView.Adapter<MyRvAdapter.Vh>() {

        inner class Vh(private val itemRvBinding: ItemRvBinding) :
            RecyclerView.ViewHolder(itemRvBinding.root) {
            fun onBind(myShablon: MyShablon, position: Int) {
                itemRvBinding.apply {
                    tvNameOfUser.text = myShablon.name
                    Glide.with(itemView.context).load(myShablon.image).into(image)
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
            return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun onBindViewHolder(holder: Vh, position: Int) =
            holder.onBind(usersList[position], position)

        override fun getItemCount(): Int = usersList.size
    }