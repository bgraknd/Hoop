package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.entity.ChatEntity
import io.androidedu.hoop.model.CallModel
import io.androidedu.hoop.model.StatusModel


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │
//│ ─────────────────────────── │
//│ 14.04.2019 - 11:05          │
//└─────────────────────────────┘

object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatEntity> = ArrayList<ChatEntity>().apply {

        val chatEntity = ChatEntity(
            profilePhoto = R.drawable.ic_avatar_woodcutter,
            userName = "Bugra",
            userMessage = "Selam, naber?",
            date = "Yesterday"
        )

        repeat(20) {
            add(chatEntity)
        }
    }


    fun getDummyCallList(): ArrayList<CallModel> = ArrayList<CallModel>().apply {

        val callModel = CallModel(
            R.drawable.ic_avatar_jedi,
            "Bugra",
            R.drawable.ic_call_received_green,
            "12 March 09:53",
            R.drawable.ic_call_green
        )

        repeat(20) {
            add(callModel)
        }
    }

    fun getDummyStatusList(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {

        val statusModel = StatusModel(
            R.drawable.ic_avatar_scarf,
            "Bugra",
            "12 March 09:53"
        )

        repeat(3) {
            add(statusModel)
        }
    }

}