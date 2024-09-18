package com.example.ejercicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Este código es para crear una tarjeta de presentacion 
//con la imagen de un curso, el nombre del instructor y su profesion
//y datos de contacto

//En esta clase se crea la actividad principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFD1E7D3)
            ){
                GreetingCard()
            }

        }
    }
}

//En esta función se define la interfaz de la tarjeta de presentación
//con la imagen, nombre, profesion y datos de contacto del instructor
//y se usan columnas y filas para organizar los elementos
//y se usan espaciadores(Spacer) para darle un margen a los elementos
@Composable
fun GreetingCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Course Image",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Jennifer Doe",
            fontSize = 28.sp,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 10.sp,
            fontWeight = FontWeight.Black,
            color = Color(0xFF006731)
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = Icons.Filled.Phone,
                contentDescription = "Phone Icon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "+11 (123) 444 555 666")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = "Share Icon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "@AndroindDev")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "Email Icon",
                modifier = Modifier.size(30.dp)
            )
            Text(text = "jen.doe@android.com")
        }
    }
}

//Aqui se muestra la vista previa de la tarjeta de presentación
@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFC0FFDC) //fondo verde
    ) {
        GreetingCard()
    }
}