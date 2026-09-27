package com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.pages
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahammadapps.modern_login_jetpack_compose.R
import com.ahammadapps.modern_login_jetpack_compose.core.theme.Black
import com.ahammadapps.modern_login_jetpack_compose.core.theme.Grey
import com.ahammadapps.modern_login_jetpack_compose.features.auth.presentation.components.CustomTextfield


@Composable
fun LoginPageView(modifier: Modifier){
    Column(modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)
        .padding(16.dp)) {
        Spacer(modifier= Modifier.size(50.dp))
        Text("Sign in or create\nan account", style = TextStyle(fontSize = 45.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier= Modifier.size(10.dp))
        Text("Your everyday grocery shopping is here!\n" +
                "It only takes a minute to create your account.", style = TextStyle(fontSize = 17.sp, fontWeight = FontWeight.Normal, color = Grey))


        Spacer(modifier= Modifier.size(40.dp))

        CustomTextfield(value = "", onValueChange = {}, label = {Text("Email")}, modifier = Modifier.fillMaxWidth())


        Spacer(modifier= Modifier.size(10.dp))

        CustomTextfield(value = "", onValueChange = {}, label = {Text("Password")}, modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier= Modifier.size(10.dp))

        Text("Forgot Password", style = TextStyle(color = Black, fontSize = 17.sp, fontWeight = FontWeight.Normal), modifier= Modifier.clickable{

        })


        Spacer(modifier= Modifier.size(40.dp))


        ElevatedButton(
            onClick = {}, 
            elevation = ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 0.dp, 
                pressedElevation = 0.dp, 
                disabledElevation = 0.dp, 
                hoveredElevation = 0.dp, 
                focusedElevation = 0.dp
            ), 
            shape = RoundedCornerShape(
                topEnd = 16.dp, 
                topStart = 16.dp,  
                bottomStart = 16.dp, 
                bottomEnd = 16.dp
            ), 
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.outlineVariant
            ), 
            modifier = Modifier.fillMaxWidth(), 
            contentPadding = PaddingValues(vertical = 24.dp)
        ) {
            Text(
                "Continue", 
                style = TextStyle(
                    color = MaterialTheme.colorScheme.outlineVariant, 
                    fontSize = 17.sp, 
                    fontWeight = FontWeight.Bold
                )
            )
        }

        Spacer( Modifier.size(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            Text("Don’t Have Any Account?", style= TextStyle(fontSize = 17.sp))

            Spacer(Modifier.size(5.dp))

            Text("Terms of Service", style = TextStyle(color = Black, fontSize = 17.sp, fontWeight = FontWeight.Bold), modifier= Modifier.clickable{

            })
        }


        Spacer(modifier= Modifier.size(40.dp))

        Text("or continue with", style = TextStyle(fontSize = 14.sp, color = Grey, textAlign = TextAlign.Center), modifier= Modifier.fillMaxWidth().align(Alignment.CenterHorizontally))

        Spacer(modifier= Modifier.size(15.dp))


        OutlinedButton (onClick = {}) {
            Row(modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically,) {
                Image(painter = painterResource(id = R.drawable.google_icon), contentDescription = null, modifier = Modifier.size(24.dp))
            Spacer(Modifier.size(5.dp))
                Text("Continue with Google", style = TextStyle(fontSize = 14.sp))
            }
        }

Spacer(modifier= Modifier.size(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            Text("By continuing you agree to", style= TextStyle(fontSize = 14.sp))

            Spacer(Modifier.size(5.dp))

            Text("Terms of Service", style = TextStyle(color = Black, fontSize = 14.sp, fontWeight = FontWeight.Bold), modifier= Modifier.clickable{

            })

            Spacer(modifier=Modifier.size(5.dp))

            Text("and", style= TextStyle(fontSize = 14.sp))
        }
        Spacer(Modifier.size(5.dp))
        Text(
            "Privacy Policy",
            style = TextStyle(color = Black, fontSize = 14.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable { }
        )

    }
}


@Preview(showBackground = true)
@Composable
fun LoginPageViewPreview(){
    LoginPageView(modifier = Modifier)
}





