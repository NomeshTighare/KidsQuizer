package com.ntech.quizer

data class QuestionStd3English(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd3English(): ArrayList<QuestionStd3English> {
    val questions = ArrayList<QuestionStd3English>()

    questions.add(
        QuestionStd3English(
            0,
            "Select the small letter from the options english std3",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd3English(
            1,
            "Select the Capital letter from the options. english std3",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd3English(
            2,
            "Spot the word which starts with a small letter. english std3",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}