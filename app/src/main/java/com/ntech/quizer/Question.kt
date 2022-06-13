package com.ntech.quizer

data class Question(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(): ArrayList<Question> {
    val questions = ArrayList<Question>()

    questions.add(
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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
        Question(
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