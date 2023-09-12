package com.example.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

//==========COLUMNAS==========//

@Preview(showBackground = true)
@Composable
fun Content() {
    //3. Modificando la columna
    Column(
        modifier = Modifier
            .fillMaxSize() //hace a la columna utilizar thodo el espacio disponible de la pantalla
            .wrapContentSize(Alignment.Center) //centrar el contenido de la columna
            .padding(horizontal = 5.dp) //le da padding a la columna completa

    ) {//1. Creando una columna con 3 elementos
        Texto(texto = "Bienvenido")
        //2. Añadiendo un espacio entre elementos directamente
        //Spacer(modifier = Modifier.height(5.dp))

        //Otra forma
        //Añadiendo un espacio entre elementos a través de una función
        Space()

        Texto(texto = "Jetpack")
        Space()
        Texto(texto = "Compose")

    }

}


@Composable
fun Texto(texto: String) {
    Text(
        text = texto, //este es el parámetro
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            //.padding(30.dp)
            //.padding(vertical = 30.dp)
            .padding(horizontal = 30.dp)
            .fillMaxWidth() //hace que utilice thodo el ancho disponible del componente
            .clickable {
                println("Hola Jetpack")
            }
    )
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}