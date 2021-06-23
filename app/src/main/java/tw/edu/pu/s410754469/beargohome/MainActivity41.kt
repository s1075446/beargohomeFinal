package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main41.*


class MainActivity41 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main41)

        //長方形
        a1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity41, MainActivity42::class.java)
                startActivity(intent)
            }
        })
    }
    //override fun onClick(v: View?) {}
}