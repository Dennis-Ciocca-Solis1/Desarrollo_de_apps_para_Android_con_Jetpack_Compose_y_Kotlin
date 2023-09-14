package com.example.botonesapp




import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.botonesapp.components.BotonIcono
import com.example.botonesapp.ui.theme.BotonesAppTheme

//3. Importando del archivo Botones.kt
/*
import com.example.botonesapp.components.BotonNormal
import com.example.botonesapp.components.BotonNormal2
import com.example.botonesapp.components.BotonOutline
import com.example.botonesapp.components.BotonSwitch
import com.example.botonesapp.components.Botontexto
import com.example.botonesapp.components.DarkMode
import com.example.botonesapp.components.FloatingAction
import com.example.botonesapp.components.Space
*/
import com.example.botonesapp.components.* //Importando thodos los componentes


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Ccreando nuestra variable de darkMode
            val darkMode = remember { mutableStateOf(false) }

            BotonesAppTheme(//Pásandole el valor de darkMode al darkTheme
                darkTheme = darkMode.value
            ) {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Mostrando la variable darkMode
                    Content(darkMode = darkMode)
                }
            }
        }
    }
}

//==========CARPETA COMPONENTES==========

@Composable
fun Content(darkMode: MutableState<Boolean>) {//Recibiendo el parámetro aquí
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
        DarkMode(darkMode = darkMode) //Mostrando el parámetro
        //Ir a setContent (línea 48)

        Space()
        FloatingAction()
    }
}

//1. Cambiando de lugar a todos nuestros componentes
//crear una carpera llamada componentes y crear un Kotlin File Botones.kt e ir