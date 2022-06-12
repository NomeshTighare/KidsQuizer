package com.ntech.quizer

data class QuestionStd2Evn(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd2Evn(): ArrayList<QuestionStd2Evn> {
    val questions = ArrayList<QuestionStd2Evn>()

    questions.add(
        QuestionStd2Evn(
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
        QuestionStd2Evn(
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
        QuestionStd2Evn(
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