package com.example.compose_introducao.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.compose_introducao.R
import org.jetbrains.annotations.Async

@Composable
fun LoginScreen () {

    var usuario by remember { mutableStateOf ("") }
    var senha by remember { mutableStateOf ("") }

    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        Column (
            modifier = Modifier.fillMaxSize() ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.ifro_campus_vertical),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 24.dp)
                .size(150.dp)
        )

            OutlinedTextField (
                value = usuario,
                onValueChange = { usuario = it },
                label = { Text ("Usuário") }
            )

            OutlinedTextField (
                value = senha,
                onValueChange = { senha = it },
                label = { Text ("Senha") },
                visualTransformation = PasswordVisualTransformation()
            )
            Button(
                onClick = {
                },
                modifier = Modifier
                    .padding(24.dp)
                    .width (280.dp)
                    .height (50.dp)
            ) {
                Text("Entrar")
            }
        }
    }
}

@Preview(showBackground =  true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}