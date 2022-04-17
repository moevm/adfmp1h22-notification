package ru.bnn.adfmp1h22_notification.fragment.eventTypeSettings

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment
import ru.bnn.adfmp1h22_notification.R

class EditEventFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView: View = inflater.inflate(R.layout.fragment_edit_event, container, false)
        rootView.findViewById<Button>(R.id.button2).setOnClickListener { this.dismiss() }
        rootView.findViewById<Button>(R.id.button).setOnClickListener { this.dismiss() }
        rootView.findViewById<ImageButton>(R.id.button4).setOnClickListener { this.dismiss() }
        return rootView
    }

    @SuppressLint("DialogFragmentCallbacksDetector")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.setOnDismissListener() {
            this.dismiss()
        }
        return dialog
    }
}