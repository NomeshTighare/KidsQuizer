package com.ntech.quizer

data class QuestionStd1Marathi(
    val id: Int,
    val text: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestionsStd1Marathi(): ArrayList<QuestionStd1Marathi> {
    val questions = ArrayList<QuestionStd1Marathi>()

    questions.add(
        QuestionStd1Marathi(
            0,
            "Who invented the Light Bulb?",
            "None of these",
            "Thomas More",
            "James Watt",
            "Thomas Alva Edison",
            "Thomas Alva Edison"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            1,
            "Which planet in our solar system is known as the Red Planet?",
            "Mercury",
            "Jupiter",
            "Mars",
            "Saturn",
            "H"
        )
    )

    questions.add(
        QuestionStd1Marathi(
            2,
            "What is the name of the biggest planet in our solar system?",
            "Mercury",
            "Jupiter",
            "Mars",
            "Saturn",
            "mother"
        )
    )

    questions.add(
        QuestionStd1Marathi(
            3,
            "Who invented the Telephone?",
            "Vint Cerf",
            "Charles Babbage",
            "Edison",
            "Alexander Graham Bell",
            "mother"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            4,
            "Who discovered Penicillin?",
            "Dresser",
            "Louis Pasteur",
            "Edward Jenner",
            "Alexander Fleming",
            "mother"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            5,
            "Which is the hottest planet in our solar system?",
            "Venus",
            "Jupiter",
            "Mars",
            "Saturn",
            "mother"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            6,
            "Which is the smallest planet in our solar system?",
            "Saturn",
            "Mercury",
            "Jupiter",
            "Mars",
            "mother"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            7,
            "Which planet in our solar system is known as the Blue Planet?",
            "Mars",
            "Saturn",
            "Mercury",
            "Jupiter",
            "mother"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            8,
            "Who invented the Printing Press?",
            "Mercury",
            "Jupiter",
            "Mars",
            "Saturn",
            "Johannes Gutenberg"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            9,
            "Who successfully built and flew the world???s first Aeroplane?",
            "The Wright Brothers",
            "Edison",
            "Hoffman",
            "Stevenson",
            "The Wright Brothers "
        )
    )
    questions.add(
        QuestionStd1Marathi(
            10,
            "What is the name of the largest moon of Saturn?",
            "Ganymede",
            "Titan",
            "Callisto",
            "Moon",
            "Titan"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            11,
            "Which planet in our Solar System takes the longest time to complete its revolution around the Sun?",
            "Neptune",
            "Earth",
            "Mars",
            "Jupiter",
            "Neptune"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            12,
            "Which planet in our Solar System has thousands of spectacular rings around it?",
            "Mercury",
            "Jupiter",
            "Mars",
            "Saturn",
            "Saturn"
        )
    )
    questions.add(
        QuestionStd1Marathi(
            13,
            "What is the name of the largest moon of Saturn?",
            "Ganymede",
            "Titan",
            "Callisto",
            "Moon",
            "Titan"
        )
    )

    questions.add(
        QuestionStd1Marathi(
            14,
            "Which is the smallest bird in the world?",
            "House sparrow",
            "Pigeon",
            "Parrot",
            "Humming bird",
            "Bee Hummingbirds"
        )
    )



    return questions
}