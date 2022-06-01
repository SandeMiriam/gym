package oyuga.dev.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnShowPhotos:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnShowPhotos=findViewById(R.id.btnShowPhotos)
        btnShowPhotos.setOnClickListener{
            val intent= Intent(this, Album1Activity::class.java)
            startActivity(intent)

        }
    }
}