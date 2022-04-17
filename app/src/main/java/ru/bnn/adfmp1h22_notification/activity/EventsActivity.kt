package ru.bnn.adfmp1h22_notification.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import ru.bnn.adfmp1h22_notification.R

class EventsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Ваши события"
        setContentView(R.layout.activity_events)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.take -> {
            }
            R.id.events -> {
            }
            R.id.notify -> {
            }
            R.id.setting_types -> {
            }
        }
        return true
    }
}