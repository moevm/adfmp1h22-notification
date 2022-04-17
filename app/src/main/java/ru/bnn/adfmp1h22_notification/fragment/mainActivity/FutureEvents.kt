package ru.bnn.adfmp1h22_notification.fragment.mainActivity

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import ru.bnn.adfmp1h22_notification.R

class FutureEvents : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_future_events, container, false)
        rootView.findViewById<Button>(R.id.button2).setOnClickListener { this.dismiss() }
        rootView.findViewById<Button>(R.id.button).setOnClickListener { this.dismiss() }
        return rootView
    }

    @SuppressLint("DialogFragmentCallbacksDetector")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setTitle("Предстоящие события")
        dialog.setOnDismissListener() {
            this.dismiss()
        }
        return dialog
    }
}