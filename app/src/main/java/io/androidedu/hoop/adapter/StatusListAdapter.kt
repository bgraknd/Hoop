package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.StatusModel

/**
 * Created by Bugra on 17.04.2019 - 16:24
 */
class StatusListAdapter(
    val statusList: ArrayList<StatusModel>,
    val onItemClickListener: (statusModel: StatusModel) -> Unit
) :
    RecyclerView.Adapter<StatusListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusListViewHolder =
        StatusListViewHolder(parent)

    override fun getItemCount(): Int = statusList.size

    override fun onBindViewHolder(holder: StatusListViewHolder, position: Int) {

        holder.bind(statusList[position], onItemClickListener)
    }
}