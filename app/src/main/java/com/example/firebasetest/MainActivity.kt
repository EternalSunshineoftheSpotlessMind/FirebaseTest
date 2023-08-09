package com.example.firebasetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.firebasetest.ui.theme.FirebaseTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        emailField()
                        passwordField()
                        SignInButton()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun emailField() {
    var text by remember{ mutableStateOf(TextFieldValue("")) }

    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        label = { Text(text = "Email")},
        placeholder = { Text(text = "Email")}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun passwordField() {
    var text by remember{ mutableStateOf(TextFieldValue("")) }

    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        label = { Text(text = "Password")},
        placeholder = { Text(text = "Password")}
    )
}

@Composable
fun SignInButton() {
    Button(onClick = {}) {
        Text(text = "Log!")
    }
}

@Composable
fun SignUpButton(){
    Button(onClick = {}) {
        Text(text = "Log!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirebaseTestTheme {

    }
}