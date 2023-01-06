package com.example.appwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.appwithcompose.ui.ProfileData
import com.example.appwithcompose.ui.theme.AppWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
                Profile(ProfileData())

        }
    }
}

@Composable
fun Profile(data: ProfileData) {
    MaterialTheme {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(top = 16.dp, start = 8.dp, end = 8.dp)
                .fillMaxSize()
                .background(color = Color.White)

        )
        {
            Column(
                modifier = Modifier

                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top=16.dp, bottom = 32.dp, start = 16.dp, end = 16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(R.drawable.profil_img),
                    contentDescription = "Contact profile picture",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = data.firstName,
                    color = Color.Black,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )
                Text(
                    text = data.lastName,
                    color = Color.Gray,
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Text(
                    text = "Telephone",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(horizontal = 8.dp)

                )
                Text(
                    text = data.telephone,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 8.dp, top = 2.dp)
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(
                    text = "Email",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(start = 8.dp)
                )
                Text(
                    text = data.email,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 8.dp, top = 2.dp)
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp),
                )
                Text(
                    text = "Gender",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(start = 8.dp)
                )
                Text(
                    text = data.gender,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 8.dp, top = 2.dp)
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(
                    text = "Customer Number",
                    color = Color.Black,
                    fontFamily = FontFamily.Monospace,
                    modifier = Modifier.padding(start = 8.dp)
                )
                Text(
                    text = data.customerNo,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 8.dp, top = 2.dp)
                )

            }
        }
    }
}
