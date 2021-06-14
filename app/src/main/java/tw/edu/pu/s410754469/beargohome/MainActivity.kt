package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enter.setOnClickListener(object: View.OnClickListener{
                override fun onClick(p0: View?) {
                    intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)
                }
            })
    }
}