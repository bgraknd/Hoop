package io.androidedu.hoop.ui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.CallListAdapter
import kotlinx.android.synthetic.main.fragment_calls.*

class CallsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(recycCallList) {

            adapter = CallListAdapter(io.androidedu.hoop.util.GenerateDummyData.getDummyCallList()) { callModel ->

                android.widget.Toast.makeText(activity, "${callModel.callUserName}", android.widget.Toast.LENGTH_SHORT)
                    .show()
            }

            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(): CallsFragment = CallsFragment()
    }
}
