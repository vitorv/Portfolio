package com.example.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.*
import com.example.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cardPadding = resources.getDimension(R.dimen.card_padding)
        setContent {
            PortfolioTheme {
                Box {
                    Background()
                    Column {
                        PersonalInfoCard(cardPadding.dp)
                    }
                }
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
fun PersonalInfoCard(cardPadding: Dp) {
    val me = painterResource(R.drawable.me)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = cardPadding),
        elevation = 15.dp,
        border = BorderStroke(
            1.dp, Brush.verticalGradient(listOf(Color.Green, Color.Blue, Color.Magenta))
        )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(all = 15.dp)
        ) {
            Image(
                painter = me, contentDescription = null, modifier = Modifier.clip(CircleShape)
            )
            Text(
                stringResource(R.string.my_name),
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )
            Text(
                stringResource(R.string.email),
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Light,
                fontSize = 20.sp
            )
            Text(
                stringResource(R.string.github_link),
                modifier = Modifier.padding(4.dp),
                fontWeight = FontWeight.Light,
                fontSize = 20.sp
            )
            Divider(
                startIndent = 8.dp,
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                stringResource(R.string.education_header),
                modifier = Modifier.padding(4.dp),
                fontStyle = FontStyle.Italic
            )
            Row {
                Text(
                    stringResource(R.string.education_degree),
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    stringResource(R.string.education_grad_year),
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.Light
                )
            }
            Row {
                Text(
                    stringResource(R.string.education_school),
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    stringResource(R.string.education_location),
                    modifier = Modifier.padding(4.dp),
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

@Composable
fun WorkExperienceOne(cardPadding: Dp) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = cardPadding),
        elevation = 15.dp,
        border = BorderStroke(
            1.dp, Brush.verticalGradient(listOf(Color.Green, Color.Blue, Color.Magenta))
        )
    ) {
        Column {
            Text("Education")
            Text("BS in Computer Science 2015")
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