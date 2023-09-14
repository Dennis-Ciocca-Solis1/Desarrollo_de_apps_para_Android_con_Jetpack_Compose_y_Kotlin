package com.example.botonesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botonesapp.ui.theme.BotonesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotonesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

//==========BOTONES PARTE 1==========

@Composable
fun Content() {
    //2. Creando nuestra columna principal
    Column(//3. Centrando thodo nuestro contenido
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()

        Space()
        BotonNormal2()

        Space()
        Botontexto()

        Space()
        BotonOutline()
    }
}

//1. Creando nuestro botón común
@Composable
fun BotonNormal() {
    Button(
        onClick = { /*TODO*/ },
        enabled = false
    ) {//desactivar mi botón
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//4. Creando otro botón
@Composable
fun BotonNormal2() {
    Button(
        onClick = { /*TODO*/ },
        //cambiándole el color al botón
        //colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red) //antes de material3
        colors = ButtonDefaults.buttonColors(containerColor = Color.Red) //a partir de material3
    ) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//5. Creando un TextButton
@Composable
fun Botontexto() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//6. Creando un OutlineButton
@Composable
fun BotonOutline() {
    OutlinedButton(
        onClick = { /*TODO*/ },
        border = BorderStroke(3.dp, Color.Blue) //cambiarle el color al borde borde
    ) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//espaciador
@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}