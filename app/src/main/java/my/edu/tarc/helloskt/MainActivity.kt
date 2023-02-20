package my.edu.tarc.helloskt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//token: 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
//instance name : class name
class MainActivity : AppCompatActivity() {
    //main function
    override fun onCreate(savedInstanceState: Bundle?) {
        //load UI to memory
        super.onCreate(savedInstanceState)
        //R here refers to resources
        setContentView(R.layout.activity_main)

        //Linking UI to program code
        //Declare variable here
        //val = value //cannot be changed during runtime, var = variable //can be changed during runtime
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShow : Button = findViewById(R.id.buttonShow)
        val buttonHide = findViewById<Button>(R.id.buttonHide)

        //event handler
        buttonShow.setOnClickListener{
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener{
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}