package com.example.presentationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card(name = stringResource(R.string.name),
                        title = stringResource(R.string.experience_title),
                        number = stringResource(R.string.phone_number),
                        media = stringResource(R.string.social_media),
                        email = stringResource(R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, title: String, number: String, media: String, email: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x807AF78D))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NameAndTitle(
                name = name,
                title = title
            )
            Contact(
                number = number,
                media = media,
                email = email
            )
        }
    }
}

@Composable
fun NameAndTitle(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color(0xFF0F2D54))
        ) {
            Icon(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Person Icon",
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.Center)
            )
        }
        Text(
            text = name,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            fontSize = 45.sp,
            modifier = Modifier
                .padding(4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF0B711A),
            modifier = Modifier
                .padding(4.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun Contact(number: String, media: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier.padding(8.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(8.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = "Phone icon",
                tint = Color(0xFF0B711A),
                modifier = Modifier
                    .padding(4.dp)
                    .size(16.dp)
            )
            Text(
                text = number,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(8.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.share),
                contentDescription = "Share icon",
                tint = Color(0xFF0B711A),
                modifier = Modifier
                    .padding(4.dp)
                    .size(16.dp)
            )
            Text(
                text = media,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.padding(8.dp)
        ){
            Icon(
                painter = painterResource(id = R.drawable.email),
                contentDescription = "Email icon",
                tint = Color(0xFF0B711A),
                modifier = Modifier
                    .padding(4.dp)
                    .size(16.dp)
            )
            Text(
                text = email,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentationCardTheme {
        Card(name = stringResource(R.string.name),
            title = stringResource(R.string.experience_title),
            number = stringResource(R.string.phone_number),
            media = stringResource(R.string.social_media),
            email = stringResource(R.string.email)
        )
    }
}