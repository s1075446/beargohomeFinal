package tw.edu.pu.s410754469.beargohome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main42.*
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity42 : AppCompatActivity() {

    //拖曳部分
    lateinit var g1: ImageView
    lateinit var h1: ImageView
    lateinit var i1: ImageView
    lateinit var j1: ImageView
    lateinit var k1: ImageView
    lateinit var l1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main42)

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

        //紫色拖曳
        h1 = findViewById(R.id.h1)
        h1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    h1.y = motionEvent.rawY-h1.height
                    h1.x = motionEvent.rawX-h1.width/2
                }
                return true
            }
        })

        //綠色拖曳
        i1 = findViewById(R.id.i1)
        i1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    i1.y = motionEvent.rawY-i1.height
                    i1.x = motionEvent.rawX-i1.width/2
                }
                return true
            }
        })

        //黃色拖曳
        j1 = findViewById(R.id.j1)
        j1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    j1.y = motionEvent.rawY-j1.height
                    j1.x = motionEvent.rawX-j1.width/2
                }
                return true
            }
        })

        //紅色拖曳
        k1 = findViewById(R.id.k1)
        k1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    k1.y = motionEvent.rawY-k1.height
                    k1.x = motionEvent.rawX-k1.width/2
                }
                return true
            }
        })

        //藍色拖曳
        l1 = findViewById(R.id.l1)
        l1.setOnTouchListener(object: View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    l1.y = motionEvent.rawY-l1.height
                    l1.x = motionEvent.rawX-l1.width/2
                }
                return true
            }
        })

    }
}