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
            "a,e,i,o,u are",
            "vowels",
            "numbers",
            "consonants",
            "none",
            "vowels"
        )
    )
    questions.add(
        QuestionStd2Evn(
            1,
            "we use a and an with",
            "single nouns",
            "plural nouns",
            "nouns",
            "both",
            "single nouns"
        )
    )

    questions.add(
        QuestionStd2Evn(
            2,
            "if a word beings with a consonant or a consonant sound, we use _____ before it?",
            "an",
            "a",
            "the",
            "this",
            "a"
        )
    )

    questions.add(
        QuestionStd2Evn(
            3,
            "if a words beings with a vowel or vowel sound, we use",
            "an",
            "a",
            "the",
            "this",
            "an"
        )
    )
    questions.add(
        QuestionStd2Evn(
            4,
            "we use ____ with nouns that are one of their kind",
            "a",
            "none of these",
            "the",
            "this",
            "a"
        )
    )
    questions.add(
        QuestionStd2Evn(
            5,
            "i am fond of _____ classical music",
            "a",
            "none of these",
            "the",
            "this",
            "the"
        )
    )
    questions.add(
        QuestionStd2Evn(
            6,
            "i met ____ boy in the store",
            "a",
            "the",
            "an",
            "none of these",
            "a",

            )
    )
    questions.add(
        QuestionStd2Evn(
            7,
            "____ boy i met was badly injured",
            "The",
            "An",
            "No artical",
            "a",
            "The"
        )
    )
    questions.add(
        QuestionStd2Evn(
            8,
            "She returned after ____ hour",
            "an",
            "this",
            "a",
            "the",
            "an"
        )
    )
    questions.add(
        QuestionStd2Evn(
            9,
            "it is ____ most expensive hotel in ____ town",
            "a, the",
            "the, a",
            "an, a",
            "a,a ",
            "a, the"
        )
    )
    questions.add(
        QuestionStd2Evn(
            10,
            "My room is on ____ second floor",
            "the",
            "a",
            "an",
            "these",
            "the"
        )
    )
    questions.add(
        QuestionStd2Evn(
            11,
            " ____ easy answer",
            "an",
            "a",
            "this",
            "is",
            "an"
        )
    )
    questions.add(
        QuestionStd2Evn(
            12,
            "____ omelette",
            "an",
            "a",
            "none",
            "is",
            "an"
        )
    )
    questions.add(
        QuestionStd2Evn(
            13,
            "____ uniform",
            "none",
            "an",
            "a",
            "is",
            "an",
        )
    )

    questions.add(
        QuestionStd2Evn(
            14,
            "____ useful thing",
            "a",
            "none",
            "an",
            "as",
            "an"
        )
    )



    return questions
}