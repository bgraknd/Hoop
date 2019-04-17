package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.CallModel

/**
 * Created by Bugra on 17.04.2019 - 12:08
 */
class CallListAdapter(val callList: ArrayList<CallModel>, val onItemClickListener: (callModel: CallModel) -> Unit) :
    RecyclerView.Adapter<CallListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallListViewHolder = CallListViewHolder(parent)

    override fun getItemCount(): Int = callList.size

    override fun onBindViewHolder(holder: CallListViewHolder, position: Int) {
        holder.bind(callList[position], onItemClickListener)
    }
}