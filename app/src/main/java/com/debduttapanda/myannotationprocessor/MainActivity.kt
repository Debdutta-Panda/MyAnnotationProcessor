package com.debduttapanda.myannotationprocessor

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.debduttapanda.markannotation.Mark
import com.debduttapanda.myannotationprocessor.ui.theme.MyAnnotationProcessorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAnnotationProcessorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val context = LocalContext.current
                    Column {
                        MainContent(context)
                        LazyColumn(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            items(Markers.values()){
                                Text(it.name)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Mark
@Composable
private fun MainContent(context: Context) {
    Box(
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            Toast.makeText(context, "Hi", Toast.LENGTH_SHORT).show()
        }) {
            Text("Say Hi")
        }
    }
}

@Mark
@Composable
private fun MainContent1(context: Context) {
    Box(
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            Toast.makeText(context, "Hi", Toast.LENGTH_SHORT).show()
        }) {
            Text("Say Hi")
        }
    }
}
@Mark
@Composable
private fun MainContent2(context: Context) {
    Box(
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {
            Toast.makeText(context, "Hi", Toast.LENGTH_SHORT).show()
        }) {
            Text("Say Hi")
        }
    }
}