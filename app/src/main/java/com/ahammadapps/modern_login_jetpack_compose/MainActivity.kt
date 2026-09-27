package com.ahammadapps.modern_login_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ahammadapps.modern_login_jetpack_compose.core.theme.CustomTheme
import com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.pages.LoginPageView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomTheme  {
                Scaffold() {innerPadding ->
                    LoginPageView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
