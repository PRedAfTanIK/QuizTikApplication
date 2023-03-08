package com.example.quiztik

object Constants {

    const val USER_NAME: String = "Username"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "Correct answers"

    fun getQuestions():ArrayList<QuestionData>{
        val questionList = ArrayList<QuestionData>()

        val que1 = QuestionData(
            1,
            States.MAHARASHTRA.i,
            QueLine.STATEQ.i,
            R.drawable.maharashtra,
            States.TAMILNADU.i, States.MAHARASHTRA.i,
            States.RAJASTHAN.i, States.MADHYA.i,
            2
        )

        val que2 = QuestionData(
            2,
            States.MADHYA.i,
            QueLine.STATEQ.i,
            R.drawable.madhya_pradesh,
            States.KARNATAKA.i, States.UTTAR_PRADESH.i,
            States.MADHYA.i, States.CHHATTISGARH.i,
            3
        )

        val que3 = QuestionData(
            3,
            States.UT_LADAKH.i,
            QueLine.UTQ.i,
            R.drawable.ut_ladakh,
            States.UT_LADAKH.i, States.UT_LAKSHYA.i,
            States.UT_CHANDIGARH.i, States.UT_DELHI.i,
            1
        )

        val que4 = QuestionData(
            4,
            States.HIMACHAL.i,
            QueLine.STATEQ.i,
            R.drawable.himachal,
            States.KARNATAKA.i, States.HIMACHAL.i,
            States.GUJRAT.i, States.ARUNACHAL.i,
            2
        )

        val que5 = QuestionData(
            5,
            States.PUNJAB.i,
            QueLine.STATEQ.i,
            R.drawable.punjab,
            States.HARYANA.i, States.ODISHA.i,
            States.PUNJAB.i, States.UTTARAKHAND.i,
            3
        )

        val que6 = QuestionData(
            6,
            States.HARYANA.i,
            QueLine.STATEQ.i,
            R.drawable.haryana,
            States.HARYANA.i, States.PUNJAB.i,
            States.MANIPUR.i, States.KERALA.i,
            1
        )

        val que7 = QuestionData(
            7,
            States.UTTARAKHAND.i,
            QueLine.STATEQ.i,
            R.drawable.uttarakhand,
            States.HIMACHAL.i, States.UTTAR_PRADESH.i,
            States.UTTARAKHAND.i, States.JHARKHAND.i,
            3
        )

        val que8 = QuestionData(
            8,
            States.ANDHRA.i,
            QueLine.STATEQ.i,
            R.drawable.andhra,
            States.KARNATAKA.i, States.TELANGANA.i,
            States.ANDHRA.i, States.TAMILNADU.i,
            3
            )

        val que9 = QuestionData(
            9,
            States.ARUNACHAL.i,
            QueLine.STATEQ.i,
            R.drawable.arunachal,
            States.ARUNACHAL.i, States.ASSAM.i,
            States.SIKKIM.i, States.HIMACHAL.i,
            1
        )

        val que10 = QuestionData(
            10,
            States.ASSAM.i,
            QueLine.STATEQ.i,
            R.drawable.assam,
            States.ARUNACHAL.i, States.ASSAM.i,
            States.MANIPUR.i, States.MIZORAM.i,
            2
        )

        val que11 = QuestionData(
            11,
            States.BENGAL.i,
            QueLine.STATEQ.i,
            R.drawable.bengal,
            States.ODISHA.i, States.ANDHRA.i,
            States.BIHAR.i, States.BENGAL.i,
            4
        )

        val que12 = QuestionData(
            12,
            States.BIHAR.i,
            QueLine.STATEQ.i,
            R.drawable.bihar,
            States.BIHAR.i, States.JHARKHAND.i,
            States.BENGAL.i, States.ODISHA.i,
            1
        )

        val que13 = QuestionData(
            13,
            States.CHHATTISGARH.i,
            QueLine.STATEQ.i,
            R.drawable.chhattisgarh,
            States.MADHYA.i, States.ODISHA.i,
            States.CHHATTISGARH.i, States.MAHARASHTRA.i,
            3
        )

        val que14 = QuestionData(
            14,
            States.GOA.i,
            QueLine.STATEQ.i,
            R.drawable.goa,
            States.SIKKIM.i, States.GOA.i,
            States.KERALA.i, States.MANIPUR.i,
            2
        )

        val que15 = QuestionData(
            15,
            States.GUJRAT.i,
            QueLine.STATEQ.i,
            R.drawable.gujrat,
            States.GUJRAT.i, States.RAJASTHAN.i,
            States.MAHARASHTRA.i, States.KARNATAKA.i,
            1
        )

        val que16 = QuestionData(
            16,
            States.JHARKHAND.i,
            QueLine.STATEQ.i,
            R.drawable.jharkhand,
            States.BIHAR.i, States.JHARKHAND.i,
            States.ODISHA.i, States.UTTARAKHAND.i,
            2
        )

        val que17 = QuestionData(
            17,
            States.KARNATAKA.i,
            QueLine.STATEQ.i,
            R.drawable.karnataka,
            States.KARNATAKA.i, States.MAHARASHTRA.i,
            States.ANDHRA.i, States.TAMILNADU.i,
            1
        )

        val que18 = QuestionData(
            18,
            States.KASHMIR.i,
            QueLine.UTQ.i,
            R.drawable.kashmir,
            States.HIMACHAL.i, States.PUNJAB.i,
            States.UT_LADAKH.i, States.KASHMIR.i,
            4
        )

        val que19 = QuestionData(
            19,
            States.KERALA.i,
            QueLine.STATEQ.i,
            R.drawable.kerala,
            States.KARNATAKA.i, States.GOA.i,
            States.KERALA.i, States.TAMILNADU.i,
            3
        )

        val que20 = QuestionData(
            20,
            States.MANIPUR.i,
            QueLine.STATEQ.i,
            R.drawable.manipur,
            States.MANIPUR.i, States.NAGALAND.i,
            States.MEGHALAYA.i, States.TRIPURA.i,
            1
        )

        val que21 = QuestionData(
            21,
            States.MEGHALAYA.i,
            QueLine.STATEQ.i,
            R.drawable.meghalay,
            States.MANIPUR.i, States.NAGALAND.i,
            States.MEGHALAYA.i, States.TRIPURA.i,
            3
        )

        val que22 = QuestionData(
            22,
            States.MIZORAM.i,
            QueLine.STATEQ.i,
            R.drawable.mizoram,
            States.MEGHALAYA.i, States.MIZORAM.i,
            States.TRIPURA.i, States.SIKKIM.i,
            2
        )

        val que23 = QuestionData(
            23,
            States.NAGALAND.i,
            QueLine.STATEQ.i,
            R.drawable.nagaland,
            States.MANIPUR.i, States.NAGALAND.i,
            States.MEGHALAYA.i, States.TRIPURA.i,
            2
        )

        val que24 = QuestionData(
            24,
            States.ODISHA.i,
            QueLine.STATEQ.i,
            R.drawable.odissa,
            States.CHHATTISGARH.i, States.UT_PONDICHERRY.i,
            States.TELANGANA.i, States.ODISHA.i,
            4
        )

        val que25 = QuestionData(
            25,
            States.RAJASTHAN.i,
            QueLine.STATEQ.i,
            R.drawable.rajasthan,
            States.MADHYA.i, States.UTTAR_PRADESH.i,
            States.MAHARASHTRA.i, States.RAJASTHAN.i,
            4
        )

        val que26 = QuestionData(
            26,
            States.SIKKIM.i,
            QueLine.STATEQ.i,
            R.drawable.sikkim,
            States.GOA.i, States.SIKKIM.i,
            States.TRIPURA.i, States.MANIPUR.i,
            2
        )

        val que27 = QuestionData(
            27,
            States.TAMILNADU.i,
            QueLine.STATEQ.i,
            R.drawable.tamilnadu,
            States.TAMILNADU.i, States.KERALA.i,
            States.KARNATAKA.i, States.ANDHRA.i,
            1
        )

        val que28 = QuestionData(
            28,
            States.TELANGANA.i,
            QueLine.STATEQ.i,
            R.drawable.telangana,
            States.ANDHRA.i, States.JHARKHAND.i,
            States.TELANGANA.i, States.CHHATTISGARH.i,
            3
        )

        val que29 = QuestionData(
            29,
            States.TRIPURA.i,
            QueLine.STATEQ.i,
            R.drawable.tripura,
            States.MANIPUR.i, States.NAGALAND.i,
            States.MIZORAM.i, States.TRIPURA.i,
            4
        )

        val que30 = QuestionData(
            30,
            States.UT_ANDMAN.i,
            QueLine.UTQ.i,
            R.drawable.ut_andamanislands,
            States.UT_LAKSHYA.i, States.NAGALAND.i,
            States.UT_ANDMAN.i, States.UT_PONDICHERRY.i,
            3
        )

        val que31 = QuestionData(
            31,
            States.UT_CHANDIGARH.i,
            QueLine.UTQ.i,
            R.drawable.ut_chandigarh,
            States.UT_CHANDIGARH.i, States.HARYANA.i,
            States.UT_DELHI.i, States.UT_LADAKH.i,
            1
        )

        val que32 = QuestionData(
            32,
            States.UT_DADRA.i,
            QueLine.UTQ.i,
            R.drawable.ut_dadra,
            States.UT_DAMAN_DIU.i, States.UT_DADRA.i,
            States.UT_PONDICHERRY.i, States.UT_LAKSHYA.i,
            2
        )

        val que33 = QuestionData(
            33,
            States.UT_DAMAN_DIU.i,
            QueLine.UTQ.i,
            R.drawable.ut_damananddiu,
            States.UT_DAMAN_DIU.i, States.ARUNACHAL.i,
            States.UT_DADRA.i, States.UT_LAKSHYA.i,
            1
        )

        val que34 = QuestionData(
            34,
            States.UT_DELHI.i,
            QueLine.UTQ.i,
            R.drawable.ut_delhi,
            States.UT_PONDICHERRY.i, States.UT_DELHI.i,
            States.UT_CHANDIGARH.i, States.HARYANA.i,
            2
        )

        val que35 = QuestionData(
            35,
            States.UT_LAKSHYA.i,
            QueLine.UTQ.i,
            R.drawable.ut_lakshya,
            States.UT_ANDMAN.i, States.UT_DAMAN_DIU.i,
            States.UT_LAKSHYA.i, States.UT_PONDICHERRY.i,
            3
        )

        val que36 = QuestionData(
            36,
            States.UT_PONDICHERRY.i,
            QueLine.UTQ.i,
            R.drawable.ut_pondicherry,
            States.UT_LAKSHYA.i, States.UT_PONDICHERRY.i,
            States.UT_DAMAN_DIU.i, States.UT_ANDMAN.i,
            2
        )

        val que37 = QuestionData(
            37,
            States.UTTAR_PRADESH.i,
            QueLine.STATEQ.i,
            R.drawable.uttar_pradesh,
            States.UTTAR_PRADESH.i, States.UTTARAKHAND.i,
            States.RAJASTHAN.i, States.BENGAL.i,
            1
        )

        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que26)
        questionList.add(que11)
        questionList.add(que28)
        questionList.add(que14)
        questionList.add(que33)
        questionList.add(que22)
        questionList.add(que6)
        questionList.add(que23)
        questionList.add(que9)
        questionList.add(que18)
        questionList.add(que16)
        questionList.add(que7)
        questionList.add(que32)
        questionList.add(que25)
        questionList.add(que5)
        questionList.add(que10)
        questionList.add(que30)
        questionList.add(que24)
        questionList.add(que15)
        questionList.add(que3)
        questionList.add(que31)
        questionList.add(que29)
        questionList.add(que35)
        questionList.add(que17)
        questionList.add(que37)
        questionList.add(que8)
        questionList.add(que19)
        questionList.add(que4)
        questionList.add(que21)
        questionList.add(que13)
        questionList.add(que20)
        questionList.add(que27)
        questionList.add(que36)
        questionList.add(que12)
        questionList.add(que34)

        return questionList
    }
}