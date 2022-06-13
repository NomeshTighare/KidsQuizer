package com.ntech.quizer

data class QuestionStd4Math(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd4Math(): ArrayList<QuestionStd4Math> {
    val questions = ArrayList<QuestionStd4Math>()


    questions.add(
        QuestionStd4Math(
            0,
            "How many hours are there in a day?",
            "24 hours",
            "32 hours",
            "20 hours",
            "12 hours",
            "24 hours"
        )
    )
    questions.add(
        QuestionStd4Math(
            1,
            "How many minutes are there in an hour?",
            "40 minutes",
            "20 minutes",
            "70 minutes",
            "60 minutes",
            "60 minutes"
        )
    )

    questions.add(
        QuestionStd4Math(
            2,
            "1 L is equal to how many grams?",
            "1000 ml",
            "750 ml",
            "500 ml",
            "250 ml",
            "1000 ml"
        )
    )

    questions.add(
        QuestionStd4Math(
            3,
            "The length of a field can be measured in Millimetres/Metres/Kilometres?",
            "Miligrams",
            "Metres",
            "Kiolometer",
            "Centimeter",
            "Metres"
        )
    )
    questions.add(
        QuestionStd4Math(
            4,
            "The distance between Mumbai and Hyderabad can be measured in Centimetres/ Metres/Kilometres?",
            "Miligrams",
            "Metres",
            "Kiolometer",
            "Centimeter",
            "kilometer"
        )
    )
    questions.add(
        QuestionStd4Math(
            5,
            "When a number is multiplied by zero, the answer you get is always __?",
            "Zero",
            "five",
            "one",
            "seven",
            "Zero"
        )
    )
    questions.add(
        QuestionStd4Math(
            6,
            "425 x 1= ___?",
            "425",
            "444",
            "542",
            "542",
            "425"
        )
    )
    questions.add(
        QuestionStd4Math(
            7,
            "555 x 10= ___?",
            "555",
            "5550",
            "5555",
            "55550",
            "5550"
        )
    )
    questions.add(
        QuestionStd4Math(
            8,
            "The largest 4 digit number is?",
            "5555",
            "4444",
            "1111",
            "9999",
            "9999"
        )
    )
    questions.add(
        QuestionStd4Math(
            9,
            "Who successfully built and flew the world’s first Aeroplane?",
            "The Wright Brothers",
            "Edison",
            "Hoffman",
            "Stevenson",
            "The Wright Brothers "
        )
    )
    questions.add(
        QuestionStd4Math(
            10,
            " 425 + 30 = _ + 425?",
            "55",
            "44",
            "31",
            "30",
            "30"
        )
    )
    questions.add(
        QuestionStd4Math(
            11,
            "425 + 0 = _?",
            "425",
            "434",
            "444",
            "333",
            "425"
        )
    )
    questions.add(
        QuestionStd4Math(
            12,
            "425 + 0 = _?",
            "425",
            "0",
            "42.5",
            "425.0",
            "0"
        )
    )
    questions.add(
        QuestionStd4Math(
            13,
            "1789 – __ = 1789?",
            "0",
            "1",
            "2",
            "3",
            "0"
        )
    )

    questions.add(
        QuestionStd4Math(
            14,
            "Eight o’clock in the evening is 8 am or 8 pm?",
            "6 PM",
            "8 PM",
            "8 AM",
            "6 AM",
            "8 PM"
        )
    )


    return questions
}