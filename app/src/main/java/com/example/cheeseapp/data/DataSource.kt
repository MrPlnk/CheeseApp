package com.example.cheeseapp.data

import com.example.cheeseapp.R

object DataSource {
    val pressingFields: List<LambdaField> = listOf(
        LambdaField(
            R.string.minutes_15,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 2f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg,
        ),
        LambdaField(
            R.string.minutes_30,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 3f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg
        ),
        LambdaField(
            R.string.minutes_120,
        {
            newValue: String ->
            val intermediateResult = newValue.toFloatOrNull() ?: 0f
            val result = intermediateResult * 5f / 1000f
            val resultString = result.toString()
            resultString
        },
        R.string.kg
        ),
        LambdaField(
            R.string.hours_10,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 8f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.kg
        )
    )

    val saltingFields: List<LambdaField> = listOf(
        LambdaField(
            R.string.salt,
            {
                newValue: String ->
                val intermediateResult = newValue.toFloatOrNull() ?: 0f
                val result = intermediateResult * 30f / 1000f
                val resultString = result.toString()
                resultString
            },
            R.string.gr,
        )
    )

    val manual: List<TitleDescription> = listOf(
        TitleDescription(
            "Шаг 1",
            "Нагрейте молоко на водяной бане до 32°С.  Добавьте хлорид кальция и перемешайте.",
            ),
        TitleDescription(
            "Шаг 2",
            "Добавьте закваску. Посыпьте ее на поверхность, дайте постоять 3 минуты и впитать влагу, затем плавно перемешайте движениями вверх-вниз, распределяя по всему объему молока. Оставьте закваску активизироваться в молоке на 30-45 минут.",
            ),
        TitleDescription(
            "Шаг 3",
            "Перемешайте молоко и влейте разведенный фермент. Плавно перемешайте движениями вверх-вниз, распределяя по всему объему молока.",
            ),
        TitleDescription(
            "Шаг 4",
            "Накройте кастрюлю крышкой и оставьте на 50-55 минут для свертывания молока. [опционально] Для точного определения необходимого времени свертывания и получения сгустка нужной консистенции определите точку флокуляции и рассчитайте время свертывания по формуле K = F * M (мультипликатор = 3.5, F - время флокуляции в минутах). После проведения расчета накройте кастрюлю крышкой и оставьте сгусток в покое на оставшееся число минут.",
            ),
        TitleDescription(
            "Шаг 5",
            "Проведите тест на чистое отделение. Если сгусток недостаточно плотный, оставьте еще на 10-15 минут.",
            ),
        TitleDescription(
            "Шаг 6",
            "Когда чистое отделение достигнуто, нарежьте сгусток на кубики со стороной 0.6 см. Не помешивайте. Оставьте на 45 минут, накрыв крышкой.",
            ),
        TitleDescription(
            "Шаг 7",
            "В течение следующих 30 минут медленно нагрейте сгусток до 37°С, часто помешивая. Кубики при этом должны уменьшаться в размерах.",
            ),
        TitleDescription(
            "Шаг 8",
            "Выключите нагрев и поддерживайте температуру 37°С еще 30 минут, продолжая помешивание.",
            ),
        TitleDescription(
            "Шаг 9",
            "Оставьте сгусток на 5 минут осесть на дно кастрюли.",
            ),
        TitleDescription(
            "Шаг 10",
            "Вылейте примерно половину сыворотки, оставив достаточное количество, чтобы покрывало поверхность сгустка.",
            ),
        TitleDescription(
            "Шаг 11",
            "Поддерживайте температуру 37°С следующие 30 минут, время от времени помешивая сгусток, чтобы не слипался.",
            ),
        TitleDescription(
            "Шаг 12",
            "Переложите сгусток в выстланный марлей дуршлаг. Поместите дуршлаг в раковину. Посолите сырный сгусток морской солью и аккуратно перемешайте. Если вы хотите добавить что-то в сыр, например, кусочки сушеного перца халапеньо, самое время это сделать. Оставьте сгусток в дуршлаге на несколько минут, чтобы стекла сыворотка.",
            ),
        TitleDescription(
            "Шаг 13",
            "Выстелите марлей форму для пресса и переложите в нее сгусток. Следите, чтобы марля делала как можно меньше складок, формируя идеально гладкую поверхность сыра.",
            ),
        TitleDescription(
            "Шаг 14",
            "Поставьте под пресс 2.25 кг на 15 минут.",
            ),
        TitleDescription(
            "Шаг 15",
            "Переверните сыр и перезаверните его в новую марлю и поставьте под груз 5-8 кг  на 12 часов (или на ночь).",
            ),
        TitleDescription(
            "Шаг 16",
            "Выньте сыр из-под пресса и сушите на воздухе 2-5 дней, пока корочка не станет абсолютно сухой. Переворачивайте сыр 2-3 раза в сутки для равномерности просушки. При выделении остаточной сыворотки протирайте сыр бумажным полотенцем.",
            ),
        TitleDescription(
            "Шаг 17",
            "Покройте сыр воском (или другим покрытием) и выдерживайте при температуре 12-15°С в течение как минимум 30 дней (если использовалось сырое молоко, то срок увеличивается до 60 дней). Чем дольше зреет сыр, тем насыщеннее и интереснее у него становится вкус. Обратите внимание, созревание дольше 60 дней допускается только при использовании животного сычужного фермента.",
            ),
        TitleDescription(
            "Шаг 18",
            "Традиционно сыр покрывается черным воском, но это не принципиально.",
        )
    )
}