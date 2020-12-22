package com.example.examengrupoarecuperacin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //      Duplicar Inverso  ---------------------------------------------

        botonduplicar.setOnClickListener{
            val inver = textView.text.reversed()

            inver?.let {
                textView.text = duplicar(it)
            }
            private fun duplicar(texto : String) : String {
                var output = texto
                original.forEach {
                    output = output.replace(it, it+it, true)
                }
                return output
            }

            inver?.let {
                textView.text = invertir(it)
            }
            private fun invertir(texto: String) : String{
                val lista = texto.toList()
                val listaInvertida = lista.reversed()
                var output = ""
                listaInvertida.forEach {
                    output += it
                }
                return output
            }


            //      Añadir numero   --------------------------------------------------

            botonañadir.setOnClickListener{
                textView.text = "${original}${Random.nextInt((1000 - 10)) + 10 }"
                botonsiguiente.isEnabled = it.isClickable
            }

            botonsiguiente.setOnClickListener{

                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }

            fun Random( length: Int ){

                val sb = StringBuilder(length)

                val alphabet = "1000"

                val rand = Random
                for ( i in 0 until sb.capacity() ) {

                    val index = rand.nextInt( alphabet.length )
                    sb.append( alphabet[ index ] )
                }

            }
        }
    }