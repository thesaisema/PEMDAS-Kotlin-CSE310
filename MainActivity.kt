package com.example.pemdas

//import android.content.res.Configuration
import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.Insets.add
import com.google.android.material.button.MaterialButton
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder
import kotlin.coroutines.EmptyCoroutineContext.plus

//import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var SolutionTv: TextView
    private lateinit var button0: MaterialButton
    private lateinit var button1: MaterialButton
    private lateinit var button2: MaterialButton
    private lateinit var button3: MaterialButton
    private lateinit var button4: MaterialButton
    private lateinit var button5: MaterialButton
    private lateinit var button6: MaterialButton
    private lateinit var button7: MaterialButton
    private lateinit var button8: MaterialButton
    private lateinit var button9: MaterialButton
    private lateinit var buttonPlus: MaterialButton
    private lateinit var buttonSubtract: MaterialButton
    private lateinit var buttonOpenParenthesis: MaterialButton
    private lateinit var buttonCloseParenthesis: MaterialButton
    private lateinit var buttonDivide: MaterialButton
    private lateinit var buttonMultiply: MaterialButton
    private lateinit var buttonEquals: MaterialButton
    private lateinit var buttonPeriod: MaterialButton
    private lateinit var buttonClear: MaterialButton
    // The basic display of the buttons.

    // Here the buttons are being assigned to the value.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0 = findViewById(R.id.button_0)
        button1 = findViewById(R.id.button_1)
        button2 = findViewById(R.id.button_2)
        button3 = findViewById(R.id.button_3)
        button4 = findViewById(R.id.button_4)
        button5 = findViewById(R.id.button_5)
        button6 = findViewById(R.id.button_6)
        button7 = findViewById(R.id.button_7)
        button8 = findViewById(R.id.button_8)
        button9 = findViewById(R.id.button_9)
        buttonClear = findViewById(R.id.button_c)
        buttonMultiply = findViewById(R.id.button_star)
        buttonDivide = findViewById(R.id.button_divide)
        buttonSubtract = findViewById(R.id.button_subtraction)
        buttonPlus = findViewById(R.id.button_addition)
        buttonPeriod = findViewById(R.id.button_period)
        buttonCloseParenthesis = findViewById(R.id.button_close_bracket)
        buttonOpenParenthesis = findViewById(R.id.button_open_bracket)
        buttonEquals = findViewById(R.id.button_equals)
        SolutionTv = findViewById(R.id.solution_tv)

        // The numbers will display the value once the user clicks it.
        button0.setOnClickListener {
            SolutionTv.text = "0"
        }
        button1.setOnClickListener {
            SolutionTv.text = "1"
        }
        button2.setOnClickListener {
            SolutionTv.text = "2"
        }
        button3.setOnClickListener {
            SolutionTv.text = "3"
        }
        button4.setOnClickListener {
            SolutionTv.text = "4"
        }
        button5.setOnClickListener {
            SolutionTv.text = "5"
        }
        button6.setOnClickListener {
            SolutionTv.text = "6"
        }
        button7.setOnClickListener {
            SolutionTv.text = "7"
        }
        button8.setOnClickListener {
            SolutionTv.text = "8"
        }
        button9.setOnClickListener {
            SolutionTv.text = "9"
        }
        buttonPeriod.setOnClickListener {
            SolutionTv.text = "."
        }
        buttonOpenParenthesis.setOnClickListener {
            SolutionTv.text = "("
        }
        buttonCloseParenthesis.setOnClickListener {
            SolutionTv.text = ")"
        }
        buttonDivide.setOnClickListener {
            SolutionTv.text = "/"
        }
        buttonPlus.setOnClickListener {
            SolutionTv.text = "+"
        }
        buttonSubtract.setOnClickListener {
            SolutionTv.text = "-"
        }
        buttonMultiply.setOnClickListener {
            SolutionTv.text = "*"
        }
        buttonEquals.setOnClickListener {
            val text = "6/2(1+2)"
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                SolutionTv.text = longResult.toString()
            } else {
                SolutionTv.text = result.toString()
            }

        }
    }
}
