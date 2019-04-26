package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ChatListAdapter
import io.androidedu.hoop.db.HoopDB
import io.androidedu.hoop.util.GenerateDummyData
import kotlinx.android.synthetic.main.fragment_chats.*

class ChatsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hoopDB = HoopDB.getInstance(view.context)
        val chatDao = hoopDB?.getChatDao()

        with(recycChatList) {

            adapter = ChatListAdapter(GenerateDummyData.getDummyChatList()) { chatEntity ->

                Toast.makeText(activity, "${chatEntity.userName}", Toast.LENGTH_SHORT).show()
            }

            layoutManager = LinearLayoutManager(activity)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ChatsFragment()
    }
}
