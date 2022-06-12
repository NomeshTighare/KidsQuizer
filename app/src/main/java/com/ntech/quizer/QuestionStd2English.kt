package com.ntech.quizer

data class QuestionStd2English(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd2English(): ArrayList<QuestionStd2English> {
    val questions = ArrayList<QuestionStd2English>()

    questions.add(
        QuestionStd2English(
            0,
            "Select the small letter from the options english std2",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd2English(
            1,
            "Select the Capital letter from the options. english std2",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd2English(
            2,
            "Spot the word which starts with a small letter. english std2",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}