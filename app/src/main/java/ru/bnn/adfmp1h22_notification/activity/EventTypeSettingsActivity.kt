package ru.bnn.adfmp1h22_notification.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import ru.bnn.adfmp1h22_notification.MainActivity
import ru.bnn.adfmp1h22_notification.R
import ru.bnn.adfmp1h22_notification.fragment.eventTypeSettings.EditEventFragment
import ru.bnn.adfmp1h22_notification.fragment.eventTypeSettings.NewEventFragment

class EventTypeSettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Настройка типов событий"
        setContentView(R.layout.activity_event_type_settings)
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
                val intent = Intent(this, NotifyActivity::class.java)
                this.finish()
                this.startActivity(intent)
            }
            R.id.setting_types -> {
            }
        }
        return true
    }

    fun deleteEventOnClick(view : View){
        val intent = Intent(this, MainActivity::class.java)
        val bundle = Bundle()
        bundle.putString("alert_delete", "alert_delete")
        bundle.putString("text", "Удалить событие?")
        intent.putExtras(bundle)
        startActivity(intent)
    }

    fun showNewEvent(view : View){
        val dialog = NewEventFragment()
        dialog.show(supportFragmentManager, "NewEvent")
    }

    fun showEditEvent(view : View){
        val dialog = EditEventFragment()
        dialog.show(supportFragmentManager, "EditEvents")
    }
}