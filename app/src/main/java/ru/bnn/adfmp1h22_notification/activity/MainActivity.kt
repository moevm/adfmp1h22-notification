package ru.bnn.adfmp1h22_notification.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AlertDialog
import ru.bnn.adfmp1h22_notification.R
import ru.bnn.adfmp1h22_notification.fragment.mainActivity.BottomFragment
import ru.bnn.adfmp1h22_notification.fragment.mainActivity.FutureEvents
import ru.bnn.adfmp1h22_notification.fragment.mainActivity.TopFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Что нужно взять"
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.topMainFrag, TopFragment.newInstance()).commit()
        supportFragmentManager.beginTransaction()
            .replace(R.id.bottomMainFrag, BottomFragment.newInstance()).commit()
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

    fun showFuture(view : View){
        val dialog = FutureEvents()
        dialog.show(supportFragmentManager, "FutureEvents")
    }

    override fun onPostResume(){
        super.onPostResume()

        val extrasFromActivity = intent.extras
        if (extrasFromActivity != null) {
            if(extrasFromActivity.containsKey("alert_delete")) {
                val text = extrasFromActivity.getString("text");

                val builder = AlertDialog.Builder(this)
                builder.setTitle("")
                builder.setMessage(text)

                builder.setPositiveButton("Да")
                { _, _ ->
                    this.finish()
                }

                builder.setNegativeButton("Назад")
                { _, _ ->
                    this.finish()
                }

                builder.setOnCancelListener {
                    this.finish()
                }
                builder.show()
            }
        }
    }
}