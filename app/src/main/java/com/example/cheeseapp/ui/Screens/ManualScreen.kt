package com.example.cheeseapp.ui.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.DataSource
import com.example.cheeseapp.data.TitleDescription
import com.example.cheeseapp.ui.components.TitleDescriptionComposable
import com.example.cheeseapp.ui.theme.CheeseAppTheme

@Composable
fun ManualScreen(
    manual: List<TitleDescription>,
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier,
    ) {
        Card(
            modifier = Modifier
            .padding(bottom = dimensionResource(R.dimen.medium_padding))
        ) {
                Text(
                    text = stringResource(R.string.how_to_cook_monterei_jek),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
        }


        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.large_padding)),
            modifier = Modifier
        ) {
            items(manual){ titleDescription ->
                TitleDescriptionComposable(titleDescription)
            }
        }
    }
}

@Preview
@Composable
fun ManualScreenPreview(){
    CheeseAppTheme {
        ManualScreen(
            manual = DataSource.manual,
            modifier = Modifier
                .padding(dimensionResource(R.dimen.medium_padding))
                .fillMaxSize()
        )
    }
}