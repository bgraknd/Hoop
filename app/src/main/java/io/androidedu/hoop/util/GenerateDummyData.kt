package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallModel
import io.androidedu.hoop.model.ChatModel
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

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {

        val chatModel = ChatModel(
            R.drawable.ic_avatar_woodcutter,
            "Bugra",
            "Merhaba ben geldim",
            "Yesterday"
        )

        repeat(20) {
            add(chatModel)
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