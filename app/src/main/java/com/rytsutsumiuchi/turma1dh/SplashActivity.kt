package com.rytsutsumiuchi.turma1dh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rytsutsumiuchi.turma1dh.MainActivity.Companion.KEY_INTENT_SALDO
import com.rytsutsumiuchi.turma1dh.MainActivity.Companion.KEY_INTENT_SALDO_LONG
import com.rytsutsumiuchi.turma1dh.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra(MainActivity.KEY_INTENT_NOME)
        val saldo = intent.getDoubleExtra(KEY_INTENT_SALDO, 0.0)
        val saldoLong = intent.getLongExtra(KEY_INTENT_SALDO_LONG, 0L)

        Log.i("resultIntent", "Meu nome é - $nome " +
                "e meu saldo é $saldo, meu saldo em long é $saldoLong")

        Log.i("lifecycle - splash", "onCreate")

        /*
        Activity -> Navigation -> Activity
         */
    }

    override fun onResume() {
        super.onResume()

        Log.i("lifecycle - splash", "onResume")
    }

    override fun onStart() {
        super.onStart()

        Log.i("lifecycle - splash", "onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.i("lifecycle - splash", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("lifecycle - splash", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("lifecycle - splash", "onDestroy")
    }
}