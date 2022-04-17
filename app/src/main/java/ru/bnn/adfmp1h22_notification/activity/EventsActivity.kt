package ru.bnn.adfmp1h22_notification.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import ru.bnn.adfmp1h22_notification.MainActivity
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

    fun editEventOnClick(view : View) {
        val intent = Intent(this, EventSettingsActivity::class.java)
        this.startActivity(intent)
    }

    fun deleteEventOnClick(view : View){
        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle()
        bundle.putString("alert_delete", "alert_delete")
        bundle.putString("text", "Удалить событие?")
        intent.putExtras(bundle)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.take -> {
                this.finish()
            }
            R.id.events -> {
            }
            R.id.notify -> {
                val intent = Intent(this, NotifyActivity::class.java)
                this.finish()
                this.startActivity(intent)
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