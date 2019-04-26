package io.androidedu.hoop.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Bugra on 26.04.2019 - 22:11
 */
@Entity(tableName = "chat_table")
data class ChatEntity(

    @PrimaryKey(autoGenerate = true) val id: Int = 0,

    @ColumnInfo(name = "profilePhoto") val profilePhoto: Int,

    @ColumnInfo(name = "userName") val userName: String,

    @ColumnInfo(name = "userMessage") val userMessage: String,

    @ColumnInfo(name = "date") val date: String

) {
}