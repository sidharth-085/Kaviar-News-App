package com.sid.newsapp.presentation.contact_us

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.sid.newsapp.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sid.newsapp.presentation.Dimens

@Composable
fun ContactUs(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.contact_us),
            contentDescription = "Contact us Image"
        )

        Text(
            text = "Contact Us",
            fontSize = 40.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.semantics {
                contentDescription = "Info text"
            }
        )

        Text(
            text = "We value your feedback! Reach out with questions or suggestions through our Contact Us page, and let us enhance your app experience together.",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(35.dp, 20.dp, 35.dp, 30.dp)
                .semantics {
                    contentDescription = "Info Data"
                },
            textAlign = TextAlign.Justify,
        )

        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Image(painter = painterResource(id = R.drawable.email_logo),
                contentDescription = "email icon",
                modifier = Modifier.size(27.dp),
                alignment = Alignment.BottomCenter,
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.size(5.dp))

            Text(
                text = "sidharthkapoor085@gmail.com",
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif
            )
        }
    }
}

@Composable
fun Test() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "App Logo",
            modifier = Modifier
                .width(150.dp)
                .height(35.dp)
                .padding(horizontal = Dimens.MediumPadding1)
        )

        IconButton(onClick = { /*TODO*/ },
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.Transparent
            ),
            modifier = Modifier.align(Alignment.CenterVertically)
        ) {
            Icon(painter = painterResource(
                id = R.drawable.ic_contact_us),
                contentDescription = "",
                modifier = Modifier
                    .size(37.dp)
                    .padding(0.dp),
                tint = Color(0xFF1877F2)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TestPreview() {
    Test()
}