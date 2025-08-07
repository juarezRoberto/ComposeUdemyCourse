package com.juar3z.composeudemycourse.ui.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.juar3z.composeudemycourse.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(loginViewModel: LoginViewModel = viewModel()) {
    val uiState by loginViewModel.uiState.collectAsStateWithLifecycle()

//    var email by remember { mutableStateOf("") }

    Scaffold { padding ->
        Column(
            Modifier
                .background(Color.White)
                .padding(padding)
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(modifier = Modifier.padding(top = 16.dp), text = "España (España)")
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.weight(1f))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = uiState.email,
                shape = RoundedCornerShape(10.dp),
                label = { Text("Usuario, correo electrónico o móvil") },
                onValueChange = { loginViewModel.onEmailChange(it) })
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = uiState.password,
                shape = RoundedCornerShape(10.dp),
                label = { Text("Contraseña") },
                onValueChange = {loginViewModel.onPasswordChange(it) })
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                ),
                enabled = uiState.isLoginEnabled,
                onClick = { }) {
                Text(modifier = Modifier.padding(vertical = 4.dp), text = "Iniciar Sesión")
            }
            Text(modifier = Modifier.padding(top = 16.dp), text = "¿Has olvidado la contraseña?")
            Spacer(modifier = Modifier.weight(1f))
            OutlinedButton(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                Text("Crear cuenta nueva")
            }
            Image(
                modifier = Modifier.size(50.dp),
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = ""
            )
        }
    }
}