package com.example.ciclodevida

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ciclodevida.ui.theme.CicloDeVidaTheme

class MainActivity : ComponentActivity() {

    private var tiempoInicio: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CicloDeVidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        Log.d("CicloDeVida", "onCreate llamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d("CicloDeVida", "onStart llamado")
    }

    override fun onResume() {
        super.onResume()
        tiempoInicio = System.currentTimeMillis()
        Log.d("CicloDeVida", "onResume llamado")
    }

    override fun onPause() {
        super.onPause()
        val tiempoPasa = System.currentTimeMillis() - tiempoInicio
        Log.d("CicloDeVida", "onPause llamado. Tiempo activo: $tiempoPasa milisegundos ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CicloDeVida", "onStop llamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CicloDeVida", "onDestroy llamado")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CicloDeVidaTheme {
        Greeting("Android")
    }
}