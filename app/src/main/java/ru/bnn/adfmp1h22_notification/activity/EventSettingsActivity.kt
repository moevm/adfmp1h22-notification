package ru.bnn.adfmp1h22_notification.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.bnn.adfmp1h22_notification.R

class EventSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Редактирование события"
        setContentView(R.layout.activity_event_settings)
    }

    fun goHome(view: View) {
        this.finish()
    }

}