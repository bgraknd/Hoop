package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.entity.ChatEntity


class ChatListAdapter(val chatList: ArrayList<ChatEntity>, val onItemClickListener: (chatEntity: ChatEntity) -> Unit) :
    RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder = ChatListViewHolder(parent)

    override fun getItemCount(): Int = chatList.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {

        holder.bind(chatList[position], onItemClickListener)
    }
}