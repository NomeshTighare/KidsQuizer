package com.ntech.quizer

data class QuestionStd3Gkn(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd3Gkn(): ArrayList<QuestionStd3Gkn> {
    val questions = ArrayList<QuestionStd3Gkn>()

    questions.add(
        QuestionStd3Gkn(
            0,
            "Select the small letter from the options  Gkn std3",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd3Gkn(
            1,
            "Select the Capital letter from the options. std3",
            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd3Gkn(
            2,
            "Spot the word which starts with a small letter. Gkn std3",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}