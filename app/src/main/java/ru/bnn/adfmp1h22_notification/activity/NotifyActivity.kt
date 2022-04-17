package ru.bnn.adfmp1h22_notification.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import ru.bnn.adfmp1h22_notification.R

class NotifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Уведомления"
        setContentView(R.layout.activity_notify)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.take -> {
                this.finish()
            }
            R.id.events -> {
                val intent = Intent(this, EventsActivity::class.java)
                this.finish()
                this.startActivity(intent)
            }
            R.id.notify -> {
            }
            R.id.setting_types -> {
                val intent = Intent(this, EventTypeSettingsActivity::class.java)
                this.finish()
                this.startActivity(intent)
            }
        }
        return true
    }

}