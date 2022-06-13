package com.ntech.quizer

data class QuestionStd4Science(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd4Science(): ArrayList<QuestionStd4Science> {
    val questions = ArrayList<QuestionStd4Science>()


    questions.add(
        QuestionStd4Science(
            0,
            "We need water to",
            "live",
            "play",
            "sleep",
            "eat",
            "live"
        )
    )
    questions.add(
        QuestionStd4Science(
            1,
            "water is ____",
            "matter",
            "plant",
            "light",
            "none of these",
            "matter"
        )
    )

    questions.add(
        QuestionStd4Science(
            2,
            "water is available in nature as ",
            "all of these",
            "liquid",
            "solid",
            "gas",
            "all of these"
        )
    )

    questions.add(
        QuestionStd4Science(
            3,
            "Most of the water on earth is in ____ form",
            "liquid",
            "solid",
            "gas",
            "none",
            "liquid"
        )
    )
    questions.add(
        QuestionStd4Science(
            4,
            "water in the liquid form has",
            "all of these",
            "can flow",
            "occupies space",
            "weight",
            "all of these"
        )
    )
    questions.add(
        QuestionStd4Science(
            5,
            "water takes the ____ of the container it is poured in",
            "shape",
            "size",
            "mater",
            "weight",
            "shape"
        )
    )
    questions.add(
        QuestionStd4Science(
            6,
            "substance that dissolve in water are called ____ substances",
            "soluble",
            "insoluble",
            "float",
            "none of these",
            "soluble",

            )
    )
    questions.add(
        QuestionStd4Science(
            7,
            "water is good",
            "food",
            "stone",
            "solvent",
            "soluble",
            "solvent"
        )
    )
    questions.add(
        QuestionStd4Science(
            8,
            "we can use water for",
            "all above",
            "making drinks",
            "cooking",
            "washing",
            "all above"
        )
    )
    questions.add(
        QuestionStd4Science(
            9,
            "A substance which is formed by mixing solute into solvent",
            "solution",
            "water",
            "sugar",
            "milk",
            "solution"
        )
    )
    questions.add(
        QuestionStd4Science(
            10,
            "sand is ____ in water",
            "insoluble",
            "both",
            "soluble",
            "solvent",
            "insoluble"
        )
    )
    questions.add(
        QuestionStd4Science(
            11,
            "substances that do not dissolve in water are called",
            "insoluble",
            "solvent",
            "solute",
            "soluble",
            "insoluble"
        )
    )
    questions.add(
        QuestionStd4Science(
            12,
            "wood ____ on the water",
            "floats",
            "sink",
            "both",
            "none of these",
            "floats"
        )
    )
    questions.add(
        QuestionStd4Science(
            13,
            "nail",
            "sinks",
            "both",
            "none of these",
            "floats",
            "sinks",
        )
    )

    questions.add(
        QuestionStd4Science(
            14,
            "cotton wool",
            "sinks",
            "both",
            "none of these",
            "floats",
            "floats"
        )
    )


    return questions
}