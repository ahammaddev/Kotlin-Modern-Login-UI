package com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.pages

import android.content.res.Resources
import android.os.Bundle
import android.provider.CalendarContract
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahammadapps.modern_login_jetpack_compose.core.theme.Grey


@Composable
fun LoginPageView(modifier: Modifier){
    Column(modifier.fillMaxSize().padding(0.dp).background(Color(0xFFFFFFFF))) {
        Text("Sign in or create\nan account", style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier= Modifier.size(10.dp))
        Text("Your everyday grocery shopping is here!\n" +
                "It only takes a minute to create your account.", style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight.Normal, color = Grey))


        Spacer(modifier= Modifier.size(25.dp))

    }
}


@Preview(showBackground = true)
@Composable
fun LoginPageViewPreview(){
    LoginPageView(modifier = Modifier)
}