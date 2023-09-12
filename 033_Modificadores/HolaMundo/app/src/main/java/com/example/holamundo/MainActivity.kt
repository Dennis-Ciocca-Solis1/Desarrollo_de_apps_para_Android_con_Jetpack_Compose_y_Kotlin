package com.example.holamundo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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

//=======MODIFICADORES=======

//Tipos de Modificadores:
//- De Posicionamiento = width, height
//- De Funcionalidad = onClick,scroll
//- De Apariencia = background, padding, border
//- De Escucha = onKeyEvent


@Preview(showBackground = true)
@Composable
fun Content() {
    Text(//'Text' es un componente

        //Parámetros del componente 'Text':

        //escribir texto
        text = "Hola Jetpack",

        //cambiar color a la letra
        color = Color.Red,

        //poner el texto en negrita
        fontWeight = FontWeight.Bold,

        //darle tamaño a la letra
        fontSize = 40.sp,

        //centrar el texto
        textAlign = TextAlign.Center,

        //Agregando Modificadores al componente
        modifier = Modifier
            .background(Color.Black) //color de fondo
            //.padding(30.dp) //padding completo
            //.padding(vertical = 30.dp) //padding sólo vertical
            .padding(horizontal = 30.dp) //padding sólo horizontal
            .clickable {//convierte el texto en un botón
                println("Hola Jetpack")//imprime en la consola al cliquear
            }
    )

}