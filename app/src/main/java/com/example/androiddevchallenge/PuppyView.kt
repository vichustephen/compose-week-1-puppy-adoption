package com.example.androiddevchallenge.ui.theme

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.androiddevchallenge.MainActivity
import com.example.androiddevchallenge.PuppyDetailsActivity
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Status
import com.example.androiddevchallenge.models.Puppy


@Composable
 fun PuppyListItem(puppy: Puppy,index:Int){
    val context = LocalContext.current;
    Row(modifier = Modifier
        .clickable(onClick = { val intent = Intent(context, PuppyDetailsActivity::class.java)
            intent.putExtra("Index",index)
            context.startActivity(intent)})
        .fillMaxWidth()) {
        Surface(modifier = Modifier.size(80.dp).padding(5.dp),
            shape = CircleShape,
            color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)) {
            Image(painter = painterResource(id = puppy.Image),
                contentDescription = null,
                contentScale = ContentScale.Crop)
        }

        Column(modifier = Modifier
            .padding(start = 8.dp)
            .align(Alignment.CenterVertically)) {
            Text(text = puppy.Name, fontWeight = FontWeight.Bold)
            Text(text = puppy.Breed, style = MaterialTheme.typography.body2)
            Text(text = puppy.Status.toString(), style = MaterialTheme.typography.body2,color =if(puppy.Status == Status.AVAILABLE) Color.Green else Color.Red)
        }
    }
}