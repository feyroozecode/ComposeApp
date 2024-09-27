    package com.example.composeapp

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent  {
            val painter = painterResource(id = R.drawable.kaaba)
            val description = "The Kaaba - Holy Mosque Makkah"
            val title = "Beitoul AlHaram"
            ImageCard(painter =painter , contentDescription =description , title = title)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Salam Aletkoum $name!",
        modifier = modifier
    )
}

@Composable fun ColumnText(){
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxWidth()
            .fillMaxHeight()
            .requiredHeight(350.dp)
            .padding(16.dp)
            .border(5.dp, Color.White)
            .padding(5.dp)
            .border(5.dp, Color.Black)
            .padding(5.dp)
            .border(5.dp, Color.Red)
            .padding(5.dp)
            .border(5.dp, Color.Green)
        ,
        //horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Text one showed now",
                color = Color.White,
                modifier = Modifier
                    .clickable {}
                    .height(30.dp)
                    .padding(5.dp)
            )
            Text(text = "Copyright © 2024 ")
        }
    }
}
 @Composable fun ImageCard(
     painter: Painter,
     contentDescription: String,
     title: String,
     modifier: Modifier = Modifier
 ) {
     Card(
         modifier = modifier.fillMaxWidth(),
         shape = RoundedCornerShape(15.dp),
         //elevation = cardView.card
          ) {
         Box(
             modifier = Modifier
                 .height(200.dp),
             ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
             Box(
                 modifier = Modifier
                     .fillMaxSize()
                     .padding(12.dp),
                 contentAlignment = Alignment.BottomStart
             ) {
                 Text(
                     text = title,
                     style = TextStyle(color = Color.White, fontSize = 16.sp)
                     )
             }
         }
     }
 }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeAppTheme {
            Greeting("Android")
        }
    }

