package com.example.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
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
                    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                        PersonalInfoCard(cardPadding.dp)
                        WorkExperienceFour(cardPadding.dp)
                        WorkExperienceThree(cardPadding.dp)
                        WorkExperienceTwo(cardPadding.dp)
                        WorkExperienceOne(cardPadding.dp)
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
            Row {
                Text("Multimedia Games")
                Text("Summer 2013")
            }
            Divider(
                startIndent = 8.dp,
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                "I worked on the company's new platform with a team of artists, mathematicians, and a producer. I programmed " + "in JavaScript and used Eclipse and Webstorm for IDE's. For version control I used Perforce. I worked on coding a " + "game from the bottom up, starting off with a template of the game and working my way up to its final release " + "version. I gained real world experience with object-oriented programming and experience working on a team."
            )
        }
    }
}

@Composable
fun WorkExperienceTwo(cardPadding: Dp) {
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
            Row {
                Text("Amazon")
                Text("Summer 2014")
            }
            Divider(
                startIndent = 8.dp,
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                "I built an internal secure tomcat 7 website that queries Amazon’s Redshift database for confidential data records " + "that only my team and the finance team could access. I coded the web service in Javascript, HTML, CSS, and " + "JQuery, and used Git for version control. To communicate between the web server and database I used " + "PostgreSQL and parameterized my queries to prevent SQL injection attacks via prepared statements. Amazon, " + "being a large company, taught me to dive deep into technologies around me to help me accomplish tasks."
            )
        }
    }
}

@Composable
fun WorkExperienceThree(cardPadding: Dp) {
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
            Row {
                Text("Amazon")
                Text("Aug 2015 - Aug 2017")
            }
            Divider(
                startIndent = 8.dp,
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                "I worked on the FireTV, on the launcher team and the Alexa integration team. I worked in Android Studio to " + "implement features, unit test the features, and integrated metrics. I worked with UI designers to implement " + "pages and worked with other developers to integrate with internal Amazon API’s. I coded entirely in Java, unit " + "tested with Mockito and PowerMock, used Git for version control, and e-gerrit as the code review submission " + "system. I got comfortable with the Agile development lifecycle and JIRA to track tasks in the process."
            )
        }
    }
}

@Composable
fun WorkExperienceFour(cardPadding: Dp) {
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
            Row {
                Text("MNC Software")
                Text("Mar 2018 - current")
            }
            Divider(
                startIndent = 8.dp,
                thickness = 1.dp,
                color = Color.Gray,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                "I integrated the company’s main product, a monitoring and control software, into our clients’ device ecosystems. " + "This was accomplished via traveling to the sites or remotely accessing servers. I worked on many of AT&T’s " + "uplink/downlink systems before leading integrations, from conception to release, for the Canadian House of " + "Commons system and Nebraska’s Educational Telecommunications systems. I also mentored a growing " + "integration team, as I was the first member to be hired onto the new team. In May of 2022, I moved into a " + "software developer role to work on the back-end of their core product."
            )
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