package com.screen.skills.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.screen.skills.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen1(){
    Column {
        Box(
          modifier = Modifier
              .height(580.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.screen_1), contentDescription = "Screen1",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )
            Row(horizontalArrangement = Arrangement.spacedBy(270.dp)) {
                Row(modifier = Modifier.padding(top = 52.dp, start = 20.dp)) {
                    Box(
                        modifier = Modifier
                            .height(8.dp)
                            .width(25.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(Color.Black)


                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(Color(0xFFBDCACA))
                            .size(7.dp)
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    Box(
                        modifier = Modifier
                            .size(7.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFBDCACA)))
                }
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Skip",
                            color = Color.Gray,
                            fontSize = 15.sp, modifier = Modifier
                                .padding(top = 39.dp)
                        )
                    }

            }
        }
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(text = "Upgrade Your skills for \n the Future",
            fontSize = 35.sp,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    start = 20.dp
                    , end = 20.dp))
        
        Spacer(modifier = Modifier.padding(top = 30.dp))
        
        Text(text = "We will help you to unlock your full potential by \n" +
                "providing the tools you need to achieve your goals"
                    , fontSize = 17.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF5B6363),
            modifier = Modifier.padding(
                start = 19.dp,
                end = 19.dp))
        
        Spacer(modifier = Modifier.padding(top = 30.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 19.dp, end = 19.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor
                    = Color(0xFFB5FB66),
            contentColor = Color.Black
        ), shape = RoundedCornerShape(2.dp)
        ) {
        Text(text = "Next",
            fontSize = 20.sp,
            )
    }
    }
}

