package com.example.appnaza

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CadastroScreen() {
    var nome by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF061323))
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        // Logo
        Image(
            painter = painterResource(id = R.drawable.logo), // coloque seu logo em res/drawable
            contentDescription = "Logo",
            modifier = Modifier.height(120.dp)
        )

        // Campos de entrada
        CustomTextField("Nome completo", Icons.Default.Person, nome) { nome = it }
        CustomTextField("email", Icons.Default.Email, email) { email = it }
        CustomTextField("Escolha uma senha", Icons.Default.Lock, senha, isPassword = true) { senha = it }

        // Botão Cadastrar
        Button(
            onClick = { /* lógica de cadastro */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF25022)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text("CADASTRAR", color = Color.White)
        }

        TextButton(onClick = { /* recuperar senha */ }) {
            Text("Esqueceu sua senha?", color = Color.White, fontSize = 12.sp)
        }

        Text("Já possui cadastro?", color = Color.White, fontSize = 12.sp)

        OutlinedButton(
            onClick = { /* login */ },
            border = ButtonDefaults.outlinedBorder,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("ENTRAR", color = Color.White)
        }

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun CustomTextField(
    placeholder: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    value: String,
    isPassword: Boolean = false,
    onValueChange: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(4.dp))
            .padding(horizontal = 8.dp)
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = Color(0xFFF25022))
        Spacer(modifier = Modifier.width(8.dp))
        TextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = { Text(placeholder) },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = if (isPassword) KeyboardType.Password else KeyboardType.Text)
        )
    }
}
