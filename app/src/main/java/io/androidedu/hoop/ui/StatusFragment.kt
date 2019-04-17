package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.StatusListAdapter
import kotlinx.android.synthetic.main.fragment_status.*

class StatusFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_status, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recycStatusListRecent) {

            adapter = StatusListAdapter(io.androidedu.hoop.util.GenerateDummyData.getDummyStatusList()) { statusModel ->

                android.widget.Toast.makeText(
                    activity,
                    "${statusModel.statusUserName}",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }

            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }

        with(recycStatusListViewed) {

            adapter = StatusListAdapter(io.androidedu.hoop.util.GenerateDummyData.getDummyStatusList()) { statusModel ->

                android.widget.Toast.makeText(
                    activity,
                    "${statusModel.statusUserName}",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }

            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }

        with(recycStatusListMuted) {

            adapter = StatusListAdapter(io.androidedu.hoop.util.GenerateDummyData.getDummyStatusList()) { statusModel ->

                android.widget.Toast.makeText(
                    activity,
                    "${statusModel.statusUserName}",
                    android.widget.Toast.LENGTH_SHORT
                ).show()
            }

            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = StatusFragment()
    }
}
