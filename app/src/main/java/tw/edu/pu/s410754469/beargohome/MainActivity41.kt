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
    lateinit var b:ImageView
    lateinit var c:ImageView
    lateinit var d:ImageView
    lateinit var e:ImageView
    lateinit var f:ImageView

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

        //圓形拖曳
        b = findViewById(R.id.b)
        b.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    b.y = motionEvent.rawY-b.height
                    b.x = motionEvent.rawX-b.width/2
                }
                return true
            }
        })

        //菱形拖曳
        c = findViewById(R.id.c)
        c.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    c.y = motionEvent.rawY-c.height
                    c.x = motionEvent.rawX-c.width/2
                }
                return true
            }
        })

        //星形拖曳
        d = findViewById(R.id.d)
        d.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    d.y = motionEvent.rawY-d.height
                    d.x = motionEvent.rawX-d.width/2
                }
                return true
            }
        })

        //正方形拖曳
        e = findViewById(R.id.e)
        e.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    e.y = motionEvent.rawY-e.height
                    e.x = motionEvent.rawX-e.width/2
                }
                return true
            }
        })

        //三角形拖曳
        f = findViewById(R.id.f)
        f.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    f.y = motionEvent.rawY-f.height
                    f.x = motionEvent.rawX-f.width/2
                }
                return true
            }
        })
    }
}