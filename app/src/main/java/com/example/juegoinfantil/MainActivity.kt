package com.example.juegoinfantil

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.juegoinfantil.ui.theme.JuegoInfantilTheme

private var btnPlay: ImageButton? = null
private var btnPause: ImageButton? = null
private var btnStop: ImageButton? = null
private var mediaplayer: MediaPlayer? = null
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JuegoInfantilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaInfantill(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun PantallaInfantill(modifier: Modifier) {
    val context = LocalContext.current
    mediaplayer = remember { MediaPlayer.create(context, R.raw.elephant)}

    Column (modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row (){
            Column {
                Image(painter = painterResource(id = R.drawable.elefante), contentDescription = "Elefante", modifier.size(150.dp))
                Image(painter = painterResource(id = R.drawable.buho), contentDescription = "Buho", modifier.size(150.dp))
                Image(painter = painterResource(id = R.drawable.conejo), contentDescription = "Conejo", modifier.size(150.dp))
                Image(painter = painterResource(id = R.drawable.zorro), contentDescription = "Zorro", modifier.size(150.dp))
            }

            Column {
                Image(painter = painterResource(id = R.drawable.cerdo), contentDescription = "Cerdo", modifier.size(180.dp))
                Image(painter = painterResource(id = R.drawable.leon), contentDescription = "Leon", modifier.size(150.dp))
                Image(painter = painterResource(id = R.drawable.hipopotamo), contentDescription = "Hipopotamo", modifier.size(150.dp))
                Image(painter = painterResource(id = R.drawable.perro), contentDescription = "Perro", modifier.size(150.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JuegoInfantilTheme {
        PantallaInfantill(modifier = Modifier)
    }
}