package tw.edu.pu.s410754469.beargohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity61 : AppCompatActivity() {

    //拖曳部分
    lateinit var m1:ImageView
    lateinit var n1:ImageView
    lateinit var o1:ImageView
    lateinit var p1:ImageView
    lateinit var q1:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main52)

        //拖曳部分
        val actionBar = supportActionBar
        actionBar!!.hide()

        //黑色拖曳
        m1 = findViewById(R.id.m1)
        m1.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    m1.y = motionEvent.rawY-m1.height
                    m1.x = motionEvent.rawX-m1.width/2
                }
                return true
            }
        })

        //咖啡色拖曳
        n1 = findViewById(R.id.n1)
        n1.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    n1.y = motionEvent.rawY-n1.height
                    n1.x = motionEvent.rawX-n1.width/2
                }
                return true
            }
        })

        //粉色拖曳
        o1 = findViewById(R.id.o1)
        o1.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    o1.y = motionEvent.rawY-o1.height
                    o1.x = motionEvent.rawX-o1.width/2
                }
                return true
            }
        })

        //白色拖曳
        p1 = findViewById(R.id.p1)
        p1.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    p1.y = motionEvent.rawY-p1.height
                    p1.x = motionEvent.rawX-p1.width/2
                }
                return true
            }
        })

        //灰色拖曳
        q1 = findViewById(R.id.q1)
        q1.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    q1.y = motionEvent.rawY-q1.height
                    q1.x = motionEvent.rawX-q1.width/2
                }
                return true
            }
        })
    }
}