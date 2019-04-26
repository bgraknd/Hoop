package io.androidedu.hoop.dao

import androidx.room.*
import io.androidedu.hoop.entity.ChatEntity

/**
 * Created by Bugra on 26.04.2019 - 22:11
 */
@Dao
interface ChatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertChat(chatEntity: ChatEntity)

    @Delete
    fun removeChat(chatEntity: ChatEntity)

    @Update
    fun updateChat(chatEntity: ChatEntity)

    @Query("SELECT * FROM chat_table WHERE id LIKE :id")
    fun findSingleChat(id: Int): ChatEntity

    @Query("SELECT * FROM chat_table")
    fun getAllChats(): List<ChatEntity>


}