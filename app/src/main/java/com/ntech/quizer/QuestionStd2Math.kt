package com.ntech.quizer

data class QuestionStd2Math(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd2Math(): ArrayList<QuestionStd2Math> {
    val questions = ArrayList<QuestionStd2Math>()

    questions.add(
        QuestionStd2Math(
            0,
            "Select the small letter from the options math std2",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd2Math(
            1,
            "Select the Capital letter from the options. math std2",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd2Math(
            2,
            "Spot the word which starts with a small letter. math std2",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}