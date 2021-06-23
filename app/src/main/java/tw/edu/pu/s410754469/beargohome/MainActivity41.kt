package tw.edu.pu.s410754469.beargohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main41.*
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity41 : AppCompatActivity() {

    //拖曳部分
    lateinit var a:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main41)

        //拖曳部分
        val actionBar = supportActionBar
        actionBar!!.hide()

        //長方形拖曳
        a = findViewById(R.id.a)
        a.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    a.y = motionEvent.rawY-a.height
                    a.x = motionEvent.rawX-a.width/2
                }
                return true
            }
        })

    }
}