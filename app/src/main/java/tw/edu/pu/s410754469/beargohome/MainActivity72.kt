package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main72.*

class MainActivity72 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main72)

        //intent 按下back2鈕返回第二頁
        back2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity72, MainActivity2::class.java)
                startActivity(intent)
            }
        })
    }
}