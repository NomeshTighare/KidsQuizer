package com.ntech.quizer

data class Question(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(): ArrayList<Question> {
    val questions = ArrayList<Question>()

    questions.add(
        Question(
            0,
            "Select the small letter from the options",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        Question(
            1,
            "Select the Capital letter from the options.",

            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        Question(
            2,
            "Spot the word which starts with a small letter.",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )

    questions.add(
        Question(
            3,
            "Spot the word which starts with a capital letter.",
            "Computer",
            "mobile",
            "apple",
            "mango",
            "Computer"
        )
    )
    questions.add(
        Question(
            4,
            "Select the Capital letter from the options.",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )
    questions.add(
        Question(
            5,
            "Select the small letter from the options.",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )
    questions.add(
        Question(
            6,
            "Spot the word which starts with a capital letter.",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    return questions
}