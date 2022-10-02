package com.example.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val padding = resources.getDimension(R.dimen.card_padding)
        setContent {
            PortfolioTheme {
                Box {
                    Background()
                    Column {
                        PersonalInfoCard(padding.dp)
                    }
                }
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Background()
//                }

            }
        }
    }
}

@Composable
fun Background() {
    val background = painterResource(R.drawable.background)
    Image(
        painter = background,
        contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun PersonalInfoCard(padding: Dp) {
    val me = painterResource(R.drawable.me)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = padding)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = me,
                contentDescription = null,
                modifier = Modifier.clip(CircleShape)
            )
            Text(stringResource(R.string.my_name))
            Text(stringResource(R.string.email))
            Text(stringResource(R.string.github_link))
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PortfolioTheme {
        Background()
    }
}
*/