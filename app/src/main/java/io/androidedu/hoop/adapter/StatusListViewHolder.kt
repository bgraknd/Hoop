package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.StatusModel

/**
 * Created by Bugra on 17.04.2019 - 16:25
 */
class StatusListViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_status_list,
        parent, false
    )
) {


    private val imgStatusProfilePhoto: ImageView
    private val txtStatusUserName: TextView
    private val txtStatusDate: TextView

    init {
        imgStatusProfilePhoto = itemView.findViewById(R.id.imgbStatusPicture)
        txtStatusUserName = itemView.findViewById(R.id.txtStatusUserName)
        txtStatusDate = itemView.findViewById(R.id.txtStatusDate)
    }

    fun bind(statusModel: StatusModel, onItemClickListener: (statusModel: StatusModel) -> Unit) {

        imgStatusProfilePhoto.setBackgroundResource(statusModel.statusProfilePhoto)
        txtStatusUserName.text = statusModel.statusUserName
        txtStatusDate.text = statusModel.statusDate

        itemView.setOnClickListener {
            onItemClickListener(statusModel)
        }
    }

}