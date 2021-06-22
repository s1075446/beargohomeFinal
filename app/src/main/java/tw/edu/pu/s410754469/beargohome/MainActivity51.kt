package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main51.*

class MainActivity51 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main51)

        //intent 按下back鈕返回第二頁
        back.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity51, MainActivity2::class.java)
                startActivity(intent)
            }
        })
    }
}