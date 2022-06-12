package com.ntech.quizer

data class QuestionStd2Gkn(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd2Gkn(): ArrayList<QuestionStd2Gkn> {
    val questions = ArrayList<QuestionStd2Gkn>()

    questions.add(
        QuestionStd2Gkn(
            0,
            "Select the small letter from the options  Gkn std2",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd2Gkn(
            1,
            "Select the Capital letter from the options. std2",

            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd2Gkn(
            2,
            "Spot the word which starts with a small letter. Gkn std2",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}