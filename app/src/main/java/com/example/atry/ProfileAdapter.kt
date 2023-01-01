package com.example.atry

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.atry.databinding.ItemRecyclerBinding

class ProfileAdapter(var profiles:ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {
    class CustomViewHolder(val binding: ItemRecyclerBinding) : RecyclerView.ViewHolder(binding.root) {
        fun setProfiles(profiles: Profiles) {
            binding.textName.text = profiles.name
            binding.textNb.text = profiles.nb
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent, false)

        return CustomViewHolder(binding).apply {
            itemView.setOnClickListener {
                val currentPosition: Int = adapterPosition
                val currentProfile: Profiles = profiles.get(currentPosition)
                Toast.makeText(
                    parent.context,
                    "${currentProfile.name} 데이터 클릭되었습니다.",Toast.LENGTH_SHORT).show()
            }
            }
        }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        val profiles = profiles.get(position)
        holder.setProfiles(profiles)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}