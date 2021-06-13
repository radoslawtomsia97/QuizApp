package com.example.quizapp

object Constants{
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()


        val que1 = Question(
                1, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_argentina,
                "Argentyna", "Australia",
                "Armenia", "Austria", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_australia,
                "Angola", "Austria",
                "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_brazil,
                "Belarus", "Belize",
                "Brunei", "Brazylia", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_belgium,
                "Bahamy", "Belgia",
                "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
                5, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_fiji,
                "Gabon", "Francja",
                "Fiji", "Finlandia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_germany,
                "Niemcy", "Rosja",
                "Grecja", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_denmark,
                "Szwecja", "Egipt",
                "Dania", "Etiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_india,
                "Irandia", "Iran",
                "Węgry", "Indie", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
                9, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_new_zealand,
                "Australia", "Nowa Zelandia",
                "Tuvalu", "Ameryka", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "Do jakiego państwa należy ta flaga?",
                R.drawable.ic_flag_of_kuwait,
                "Kuwait", "Jordan",
                "Sudan", "Palestyna", 1
        )

        questionsList.add(que10)



        return questionsList
    }
    fun getQuestions2(): ArrayList<Question>{
        val questionZwierzeta = ArrayList<Question>()

        val ques1 = Question(
                1, "Co to za zwierze?",
                R.drawable.kobra,
                "Anakonda", "Pyton",
                "Boa dusiciel", "Kobra", 4
        )

        questionZwierzeta.add(ques1)

        val ques2 = Question(
                2, "Co to za zwierze?",
                R.drawable.makkaki,
                "makkaki", "Magota",
                "Szympans", "Goryl", 1
        )

        questionZwierzeta.add(ques2)

        val ques3 = Question(
                3, "Co to za zwierze?",
                R.drawable.owczarek_niemiecki,
                "Wilk", "Owczarek Niemiecki",
                "York", "Jamnik", 2
        )

        questionZwierzeta.add(ques3)

        val ques4 = Question(
                4, "Co to za zwierze?",
                R.drawable.leopard,
                "Lew", "Tygrys",
                "Leopard", "Gepard", 3
        )

        questionZwierzeta.add(ques4)

        val ques5 = Question(
                5, "Co to za zwierze?",
                R.drawable.niedzwiedz_brunatny,
                "Lew", "Tygrys",
                "Leopard", "Niedźwiedź brunatny", 4
        )

        questionZwierzeta.add(ques5)

        val ques6 = Question(
                6, "Co to za zwierze?",
                R.drawable.ara,
                "Kakadu", "Ara",
                "Bernarda", "Papużka Falista", 2
        )

        questionZwierzeta.add(ques6)

        val ques7 = Question(
                7, "Co to za zwierze?",
                R.drawable.tygrys,
                "Tygrys Bengalski", "Lew",
                "Tygrys Syberyjski", "Gepard", 1
        )

        questionZwierzeta.add(ques7)

        val ques8 = Question(
                8, "Co to za zwierze?",
                R.drawable.rekin_wielorybi,
                "Rekin wielorybi", "Żarłacz tygrysi",
                "Żarłacz biały", "rekin olbrzymi", 1
        )

        questionZwierzeta.add(ques8)

        val ques9 = Question(
                9, "Co to za zwierze?",
                R.drawable.pletwal,
                "Płetwal zwyczajny", "Wal szary",
                "Tygrys Syberyjski", "Płetwal błękitny", 4
        )

        questionZwierzeta.add(ques9)

        val ques10 = Question(
                10, "Co to za zwierze?",
                R.drawable.zyrafa,
                "żyrafa masajska", "żyrafa siatkowana",
                "żyrafa południowa", "żyrafa północna", 3
        )

        questionZwierzeta.add(ques10)

        return questionZwierzeta

    }

    fun getQuestions3(): ArrayList<Question>{
        val questionMarki = ArrayList<Question>()

        val quest1 = Question(
                1, "Do kogo należy ta marka?",
                R.drawable.alfa,
                "Włochy", "Chiny",
                "Wielka Brytania", "Kobra", 4
        )

        questionMarki.add(quest1)

        val quest2 = Question(
                2, "Do kogo należy ta marka?",
                R.drawable.aston,
                "Wielka Brytania", "USA",
                "Indie", "Francja", 1
        )

        questionMarki.add(quest2)

        val quest3 = Question(
                3, "Do kogo należy ta marka?",
                R.drawable.audi,
                "Japonia", "Niemcy",
                "Chiny", "Francja", 2
        )

        questionMarki.add(quest3)

        val quest4 = Question(
                4, "Do kogo należy ta marka?",
                R.drawable.bmw,
                "Korea Połudiowa", "Niemcy",
                "USA", "Indie", 2
        )

        questionMarki.add(quest4)

        val quest5 = Question(
                5, "Do kogo należy ta marka?",
                R.drawable.ferrari,
                "Hiszpania", "Włochy",
                "Japonia", "Francja", 2
        )

        questionMarki.add(quest5)

        val quest6 = Question(
                6, "Do kogo należy ta marka?",
                R.drawable.mercedes,
                "Japonia", "Włochy",
                "Niemcy", "Chiny", 3
        )

        questionMarki.add(quest6)

        val quest7 = Question(
                7, "Do kogo należy ta marka?",
                R.drawable.mini,
                "USA", "Korea Południowa",
                "Francja", "Niemcy", 4
        )

        questionMarki.add(quest7)

        val quest8 = Question(
                8, "Do kogo należy ta marka?",
                R.drawable.porsche,
                "Niemcy", "Włochy",
                "Chiny", "Indie", 1
        )

        questionMarki.add(quest8)

        val quest9 = Question(
                9, "Do kogo należy ta marka?",
                R.drawable.toyota,
                "Włochy", "Hiszpania",
                "Japonia", "Wielka Brytania", 3
        )

        questionMarki.add(quest9)

        val quest10 = Question(
                10, "Do kogo należy ta marka?",
                R.drawable.volvo,
                "Francja", "Chiny",
                "Niemcy", "USA", 2
        )

        questionMarki.add(quest10)

        return questionMarki

    }

    fun getQuestions4(): ArrayList<Question>{
        val questionloga = ArrayList<Question>()

        val ques1 = Question(
                1, "Czyjej firmy jest to logo?",
                R.drawable.nb,
                "New Balance", "Next Bike",
                "Netflix", "Nike", 1
        )

        questionloga.add(ques1)

        val ques2 = Question(
                2, "Czyjej firmy jest to logo?",
                R.drawable.rolex,
                "Aston Martin", "Rolex",
                "Givenchy", "Adidas", 2
        )

        questionloga.add(ques2)

        val ques3 = Question(
                3, "Czyjej firmy jest to logo?",
                R.drawable.twitter,
                "Chirper", "Facebook",
                "SpaceX", "Twitter", 4
        )

        questionloga.add(ques3)

        val ques4 = Question(
                4, "Czyjej firmy jest to logo?",
                R.drawable.quik,
                "Roxy", "Quiksilver",
                "Palm Angels", "Apple", 2
        )

        questionloga.add(ques4)

        val ques5 = Question(
                5, "Czyjej firmy jest to logo?",
                R.drawable.under,
                "Under Armour", "Louis Vuitton",
                "UPC", "Lars Versace", 1
        )

        questionloga.add(ques5)

        val ques6 = Question(
                6, "Czyjej firmy jest to logo?",
                R.drawable.nike,
                "Answear", "Adidas",
                "Nike", "Action Boy", 3
        )

        questionloga.add(ques6)

        val ques7 = Question(
                7, "Czyjej firmy jest to logo?",
                R.drawable.mac,
                "Starbucks", "Subway",
                "Pizza Hut", "McDonald's", 4
        )

        questionloga.add(ques7)

        val ques8 = Question(
                8, "Czyjej firmy jest to logo?",
                R.drawable.fb,
                "Twitter", "Facebook",
                "Instagram", "Nasza Klasa", 2
        )

        questionloga.add(ques8)

        val ques9 = Question(
                9, "Czyjej firmy jest to logo?",
                R.drawable.apple,
                "Apple", "Lenovo",
                "Asus", "A4Tech", 1
        )

        questionloga.add(ques9)

        val ques10 = Question(
                10, "Czyjej firmy jest to logo?",
                R.drawable.adidas,
                "4F", "Aldo",
                "Adidas", "House", 3
        )

        questionloga.add(ques10)

        return questionloga

    }
}