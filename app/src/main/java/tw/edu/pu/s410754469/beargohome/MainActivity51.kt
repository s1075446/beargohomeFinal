package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main51.*
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main41.*

class MainActivity51 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main51)

        //橙色菇
        g.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity51, MainActivity52::class.java)
                startActivity(intent)
            }
        })

        h.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity51, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        i.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity51, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        j.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity51, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        k.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity51, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        l.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity51, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })
    }
}