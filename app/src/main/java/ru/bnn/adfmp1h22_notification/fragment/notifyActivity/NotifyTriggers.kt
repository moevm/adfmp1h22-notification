package ru.bnn.adfmp1h22_notification.fragment.notifyActivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.bnn.adfmp1h22_notification.R

class NotifyTriggers : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notify_triggers, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            NotifyTriggers().apply {
            }
    }
}