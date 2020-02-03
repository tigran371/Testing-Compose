package com.example.testing_compose.composables

import androidx.compose.Composable
import androidx.ui.core.Opacity
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import com.example.testing_compose.models.MenuActivityTitleModel
import com.example.testing_compose.models.MenuCategoryTitleModel

//MenuActivityTitleComponent
@Composable
fun MenuActivityTitleComponent(menuActivityTitleModel: MenuActivityTitleModel) {

    MaterialTheme {
        Surface {
            Column {
                Center {
                    Text(
                        text = menuActivityTitleModel.title,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        ),
                        modifier = Spacing(bottom = 18.dp, top = 16.dp, left = 10.dp, right = 10.dp)
                    )
                }
                Opacity(opacity = 0.3f) {
                    Divider(color = Color.Gray, height = 2.dp)
                }
            }
        }
    }

}