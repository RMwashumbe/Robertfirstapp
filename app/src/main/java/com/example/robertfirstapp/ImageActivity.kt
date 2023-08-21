package com.example.robertfirstapp

import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.robertfirstapp.ui.theme.RobertfirstAppTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.example.robertfirstapp.Images()

        }
    }
}
@Composable
fun Images(){
//    you can have image inside and outside the box as well.
    Image(
        painter = painterResource(id = R.drawable.luxy),
        contentDescription = null,
        modifier = Modifier
            .clip(RoundedCornerShape(10))
            .size(50.dp)
    )
    Box() {

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ){


        }

    }


}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    com.example.robertfirstapp.Images()

}