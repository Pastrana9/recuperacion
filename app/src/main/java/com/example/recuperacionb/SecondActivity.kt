package com.example.examengrupoarecuperacin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_2.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {

                s?.let {
                    button.isEnabled = it.isNotEmpty()

                }
            }
        })

        val guardado = editTextTextPersonName.text.toString()

        editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            //continuar.setOnClickListener {
            //texto?.let {
            //textView.text = remplazarVocalporpunto(it, editText.text.toString())
            //}
            //}

            private fun remplazarporpunto(texto: String, caracterAReemplazar: String) : String{
                if (texto.isEmpty()){
                    return texto
                }
                if (!texto.contains(caracterAReemplazar)){
                    return ""
                }
                return texto.replace(caracterAReemplazar, ":)", true)
            }
        })
    }
}