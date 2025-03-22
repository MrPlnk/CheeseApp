package com.example.cheeseapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.old.TitleDescription

@Composable
fun TitleDescriptionComposable(
    titleDescription: TitleDescription,
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.small_padding))){
        Text(
            text = titleDescription.title,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        HorizontalDivider(thickness = dimensionResource(R.dimen.thick_width))
        Text(
            text = "\t\t" + titleDescription.description,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Preview
@Composable
fun TitleDescriptionComposablePreview(){
    TitleDescriptionComposable(
        titleDescription = TitleDescription(
            "Сгороговорка",
            "Ехал Грека через реку, видит Грека в реке рак. Сунул Грека в реку руку, рак за руку Греку цап."
        ),
        modifier = Modifier

    )
}