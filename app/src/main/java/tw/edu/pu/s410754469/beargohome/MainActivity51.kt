package tw.edu.pu.s410754469.beargohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main51.*
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity51 : AppCompatActivity() {

    //拖曳部分
    lateinit var g1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main51)

        //拖曳部分
        val actionBar = supportActionBar
        actionBar!!.hide()

        //橙色拖曳
        g1 = findViewById(R.id.g1)
        g1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    g1.y = motionEvent.rawY-g1.height
                    g1.x = motionEvent.rawX-g1.width/2
                }
                return true
            }
        })


    }
}