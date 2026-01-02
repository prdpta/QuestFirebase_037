package com.example.questfirebase_037

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questfirebase_037.ui.theme.QuestFirebase_037Theme
import com.example.questfirebase_037.view.controllNavigasi.DataSiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestFirebase_037Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DataSiswaApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}