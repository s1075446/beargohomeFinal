package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main52.*

class MainActivity52 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main52)

        //intent 按下enter鈕到第2頁
        next.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity52, MainActivity62::class.java)
                startActivity(intent)
            }
        })
    }
}