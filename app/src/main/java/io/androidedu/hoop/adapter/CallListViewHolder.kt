package io.androidedu.hoop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallModel

/**
 * Created by Bugra on 17.04.2019 - 12:09
 */
class CallListViewHolder(parent: ViewGroup)

    : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_item_call_list,
        parent,
        false
    )
) {


    private val imgCallProfilePhoto: ImageView
    private val txtCallUserName: TextView
    private val imgCallStatus: ImageView
    private val txtCallDate: TextView
    private val imgCallbackIcon: ImageView

    init {

        imgCallProfilePhoto = itemView.findViewById(R.id.imgbCallProfile)
        txtCallUserName = itemView.findViewById(R.id.txtCallUserName)
        imgCallStatus = itemView.findViewById(R.id.imgbCallStatus)
        txtCallDate = itemView.findViewById(R.id.txtCallDate)
        imgCallbackIcon = itemView.findViewById(R.id.imgbCallPicture)
    }

    fun bind(callModel: CallModel, onItemClickListener: (callModel: CallModel) -> Unit) {

        imgCallProfilePhoto.setBackgroundResource(callModel.callProfilePhoto)
        txtCallUserName.text = callModel.callUserName
        imgCallStatus.setBackgroundResource(callModel.callStatus)
        txtCallDate.text = callModel.callDate
        imgCallbackIcon.setBackgroundResource(callModel.callbackIcon)

        itemView.setOnClickListener {

            onItemClickListener(callModel)
        }
    }
}