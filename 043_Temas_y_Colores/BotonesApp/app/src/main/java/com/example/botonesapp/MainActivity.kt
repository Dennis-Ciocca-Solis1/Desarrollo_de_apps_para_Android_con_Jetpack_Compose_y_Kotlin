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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.botonesapp.ui.theme.BotonesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //7. creando nuestra variable de darkMode
            val darkMode = remember { mutableStateOf(false) }

            BotonesAppTheme(//8. Pásandole el valor de darkMode al darkTheme
                darkTheme = darkMode.value
            ) {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //9. Mostrando la variable darkMode
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

//==========TEMAS Y COLORES==========

@Composable
fun Content(darkMode: MutableState<Boolean>) {//4. Recibiendo el parámetro aquí
    //Creando nuestra columna principal
    Column(// Centrando thodo nuestro contenido
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

        //=======================================================
        Space()
        BotonIcono()

        Space()
        BotonSwitch()

        Space()
        DarkMode(darkMode = darkMode) //5. Mostrando el parámetro
        //6. Ir a setContent (línea 48)

        Space()
        FloatingAction()
    }
}

//Creando nuestro botón común
@Composable
fun BotonNormal() {
    Button(
        onClick = { /*TODO*/ },
        enabled = false
    ) {//desactivar mi botón
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//Creando otro botón
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

//Creando un TextButton
@Composable
fun Botontexto() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//Creando un OutlineButton
@Composable
fun BotonOutline() {
    OutlinedButton(
        onClick = { /*TODO*/ },
        border = BorderStroke(3.dp, Color.Blue) //cambiarle el color al borde borde
    ) {
        Text(text = "Mi Boton", fontSize = 30.sp)
    }
}

//==================================================================================================
//Creando un ícono que funcione como un botón
@Composable
fun BotonIcono() {
    IconButton(onClick = { /*TODO*/ }
    ) {
        Icon(
            Icons.Filled.Home, //es la forma del ícono
            contentDescription = "Icono", //es una descripción opcional
            tint = Color.Red, //para cambiarle el color
            modifier = Modifier.size(50.dp) //para cambiar el tamaño
        )
    }
}

//Creando el ícono de botón Switch
@Composable
fun BotonSwitch() {
    var switched by remember { mutableStateOf(false) } //para que no se vea false

    Switch(
        checked = switched,
        onCheckedChange = { switched = it },
        colors = SwitchDefaults.colors(//cambiarle el color al switch
            checkedThumbColor = Color.Red,//cambiarle el color a la bolita cuando esta activado
            checkedTrackColor = Color.Green, //cambiarle el color al fondo cuando esta activado
            uncheckedThumbColor = Color.Blue, //cambiarle el color a la bolita cuando esta desactivado
            uncheckedTrackColor = Color.Magenta //cambiarle el color al fondo cuando esta desactivado
        )
    )
}

//Creando un botón con un ícono y texto
@Composable
fun DarkMode(darkMode: MutableState<Boolean>) { //1. Agregando un parámetro al botón Dark Mode
    //2. Intercambiando el valor de darkMode de true a false y viceversa cuando al dar clic
    Button(onClick = { darkMode.value = !darkMode.value })

    //3. Enviando el parámetro a la función Content

    {
        Icon(imageVector = Icons.Default.Star, contentDescription = "DarkMode")//, tint = Color.Red)
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode", fontSize = 30.sp)
    }
}

//========================================================================================================
//Creando nuestro botón flotante
@Composable
fun FloatingAction() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color.Blue, //cambiarle el color al fondo
        contentColor = Color.White  // cambiarle el color a la letra
    ) {
        Icon(
            Icons.Filled.Add, //ponerle el ícono en forma de 'más'
            contentDescription = "",
            modifier = Modifier.size(30.dp) //para cambiar el tamaño
        )
    }
}

//espaciador
@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}