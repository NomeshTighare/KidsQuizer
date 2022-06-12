package com.ntech.quizer

data class QuestionStd3Evn(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd3Evn(): ArrayList<QuestionStd3Evn> {
    val questions = ArrayList<QuestionStd3Evn>()

    questions.add(
        QuestionStd3Evn(
            0,
            "Select the small letter from the options  Evnn std3",
            "D",
            "G",
            "U",
            "r",
            "r"
        )
    )
    questions.add(
        QuestionStd3Evn(
            1,
            "Select the Capital letter from the options. Evn std3",

            "y",
            "H",
            "d",
            "d",
            "H"
        )
    )

    questions.add(
        QuestionStd3Evn(
            2,
            "Spot the word which starts with a small letter. Evn std3",
            "Boy",
            "Girl",
            "mother",
            "Father",
            "mother"
        )
    )


    return questions
}