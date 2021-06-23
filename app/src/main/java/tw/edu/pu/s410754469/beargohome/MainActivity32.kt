package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main31.*
import kotlinx.android.synthetic.main.activity_main32.*

class MainActivity32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main32)

        //intent 按下action2到第4-2頁
        action2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity32, MainActivity51::class.java)
                startActivity(intent)
            }
        })
    }
}