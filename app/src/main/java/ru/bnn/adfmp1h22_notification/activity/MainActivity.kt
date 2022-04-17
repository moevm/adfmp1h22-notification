package ru.bnn.adfmp1h22_notification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import ru.bnn.adfmp1h22_notification.activity.EventTypeSettingsActivity
import ru.bnn.adfmp1h22_notification.activity.EventsActivity
import ru.bnn.adfmp1h22_notification.activity.NotifyActivity

//import ru.bnn.adfmp1h22notification.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Что нужно взять"
        setContentView(R.layout.activity_main)
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
                val intent = Intent(this, EventsActivity::class.java)
                this.startActivity(intent)
            }
            R.id.notify -> {
                val intent = Intent(this, NotifyActivity::class.java)
                this.startActivity(intent)
            }
            R.id.setting_types -> {
                val intent = Intent(this, EventTypeSettingsActivity::class.java)
                this.startActivity(intent)
            }
        }
        return true
    }
}