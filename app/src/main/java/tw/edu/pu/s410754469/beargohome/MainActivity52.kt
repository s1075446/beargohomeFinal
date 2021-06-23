package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main51.*

class MainActivity52 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main52)

        //藍色菇
        l.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity52, MainActivity53::class.java)
                startActivity(intent)
            }
        })

        h.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity52, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        i.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity52, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        j.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity52, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        k.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity52, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })

        g.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity52, "回答錯誤，請重新選擇", Toast.LENGTH_SHORT).show()
            }
        })
    }
}