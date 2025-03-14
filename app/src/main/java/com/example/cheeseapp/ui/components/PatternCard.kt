package com.example.cheeseapp.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.cheeseapp.R
import com.example.cheeseapp.data.CardData
import com.example.cheeseapp.data.InputText
import com.example.cheeseapp.data.LambdaField

@Composable
fun PatternCard(
    @StringRes cardsName: Int,
    cardData: CardData,
    modifier: Modifier = Modifier
){

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.medium_padding))
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.small_padding))

        ){
            Text(
                text = stringResource(cardsName),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = dimensionResource(R.dimen.small_padding))
            )
            val list = mutableListOf<MutableState<String>>()
            cardData.inputTexts.forEach {
                list.add(remember { it.userEnter })
            }

            cardData.lambdaFields.forEach{
                LambdaFieldComposable(
                    cardData.thread(list),
                    it,
                )
            }
            cardData.inputTexts.forEachIndexed { index, inputText ->
                InputTextComposable(
                    inputText = inputText,
                    isLast = index == cardData.inputTexts.lastIndex
                )
            }

        }
    }
}

//@Preview
//@Composable
//fun PatternCardPreview(){
//    var value by remember{ mutableStateOf("") }
//    val onUserEnter: (String) -> Unit = {newValue: String -> value = newValue}
//    val list: List<LambdaField> = listOf(
//        LambdaField(
//            R.string.minutes_15,
//            {newValue: List<String> ->
//                (newValue[0].toFloat() * 2 / 1000).toString()},
//            R.string.kg,
//
//            )
//    )
//    val parameterName = R.string.milk
//    val parameterDimen = R.string.liters
//
//    PatternCard(
//        parameter = value,
//        cardsName = R.string.salting_card,
//        cardOutlinedTexts = listOf(
//            InputText(
//                parameterDimen = R.string.milk,
//                parameterName = R.string.milk,
//                onKeyboardAction = {}
//            )
//        ),
//        cardFields = list,
//    )
//}