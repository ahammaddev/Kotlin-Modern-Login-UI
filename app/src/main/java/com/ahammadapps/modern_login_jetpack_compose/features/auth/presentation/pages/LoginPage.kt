package com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.pages
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahammadapps.modern_login_jetpack_compose.core.theme.Grey
import com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.components.CustomTextfield


@Composable
fun LoginPageView(modifier: Modifier){
    Column(modifier.fillMaxSize().padding(16.dp).background(Color(0xFFFFFFFF))) {
        Text("Sign in or create\nan account", style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier= Modifier.size(10.dp))
        Text("Your everyday grocery shopping is here!\n" +
                "It only takes a minute to create your account.", style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight.Normal, color = Grey))


        Spacer(modifier= Modifier.size(25.dp))

        CustomTextfield(value = "", onValueChange = {}, label = {Text("Email")}, modifier = Modifier.fillMaxWidth())


        Spacer(modifier= Modifier.size(10.dp))

        CustomTextfield(value = "", onValueChange = {}, label = {Text("Password")}, modifier = Modifier.fillMaxWidth()

        )


    }
}


@Preview(showBackground = true)
@Composable
fun LoginPageViewPreview(){
    LoginPageView(modifier = Modifier)
}





