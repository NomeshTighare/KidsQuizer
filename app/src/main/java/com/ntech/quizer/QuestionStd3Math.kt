package com.ntech.quizer

data class QuestionStd3Math(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd3Math(): ArrayList<QuestionStd3Math> {
    val questions = ArrayList<QuestionStd3Math>()

    questions.add(
        QuestionStd3Math(
            0,
            "Select the small letter from the options math std3",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd3Math(
            1,
            "Select the Capital letter from the options. math std3",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd3Math(
            2,
            "Spot the word which starts with a small letter. math std3S",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}