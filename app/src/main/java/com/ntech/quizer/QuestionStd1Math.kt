package com.ntech.quizer

data class QuestionStd1Math(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd1Math(): ArrayList<QuestionStd1Math> {
    val questions = ArrayList<QuestionStd1Math>()

    questions.add(
        QuestionStd1Math(
            0,
            "Select the small letter from the options math std1",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd1Math(
            1,
            "Select the Capital letter from the options. math std1",

            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd1Math(
            2,
            "Spot the word which starts with a small letter. math std1",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}