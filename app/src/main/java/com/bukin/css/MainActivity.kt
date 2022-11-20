package com.bukin.css

import android.os.Bundle
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bukin.css.ui.theme.CSSTheme
import androidx.compose.material.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CSSTheme {
                StartScreen()
            }
        }
    }
}

@Preview
@Composable
fun StartScreen() {
    Card(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
        ) {
            Text(text = "Currency")
            Button(onClick = { /*TODO*/ }) {

            }
        }
        LazyColumn(modifier = Modifier.fillMaxWidth()) {

        }

    }
}
