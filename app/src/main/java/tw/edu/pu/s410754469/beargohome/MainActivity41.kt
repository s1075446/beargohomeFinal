package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
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

        b1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity41, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        c1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity41, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        d1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity41, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        e1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity41, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        f1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity41, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

    }

}