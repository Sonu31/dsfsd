package com.sminapp.jetpacktest.ui.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sminapp.jetpacktest.R

@Preview(heightDp = 500)
@Composable
fun Previewitem(){
//Sonu
    LazyColumn(content ={
        items (getCatList()){item->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle )

        }
    } )
    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCatList().map { item->
          BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle )
        }





    }*/
//    BlogCategory(img = R.drawable.ic_launcher_foreground, title = "Android ", subtitle = "Android Jetpack Compose Lists" )
}
@Composable
fun BlogCategory(img:Int,title:String,subtitle:String){
    Card(  modifier = Modifier.padding(8.dp).background(Color.Blue)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground) , contentDescription = ""
             , modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            Column(modifier = Modifier.weight(.8f)) {
                Text(text = title, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.background(
                    Color.Blue))
                Text(text = subtitle,style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Thin
                  , fontSize = 12.sp
                )
                
            }

        }

    }

}
data class Category(val img:Int,val title:String,val subtitle:String)
fun getCatList():MutableList<Category>{
    var list = mutableListOf<Category>()
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Programing","This is Andoue kjfnskjd"))

return list

}
