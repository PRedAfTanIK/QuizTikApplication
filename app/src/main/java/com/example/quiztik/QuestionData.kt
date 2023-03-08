package com.example.quiztik

data class QuestionData(
    val id: Int,
    val tag: String,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)

enum class States(val i: String){
    ANDHRA("ANDHRA PRADESH"),
    ARUNACHAL("ARUNACHAL PRADESH"),
    ASSAM("ASSAM"),
    BENGAL("WEST BENGAL"),
    BIHAR("BIHAR"),
    CHHATTISGARH("CHHATTISGARH"),
    GOA("GOA"),
    GUJRAT("GUJARAT"),
    HARYANA("HARYANA"),
    HIMACHAL("HIMACHAL"),
    JHARKHAND("JHARKHAND"),
    KARNATAKA("KARNATAKA"),
    KASHMIR("KASHMIR"),
    KERALA("KERALA"),
    MADHYA("MADHYA PRADESH"),
    MAHARASHTRA("MAHARASHTRA"),
    MANIPUR("MANIPUR"),
    MEGHALAYA("MEGHALAYA"),
    MIZORAM("MIZORAM"),
    NAGALAND("NAGALAND"),
    ODISHA("ODISHA"),
    PUNJAB("PUNJAB"),
    RAJASTHAN("RAJASTHAN"),
    SIKKIM("SIKKIM"),
    TAMILNADU("TAMIL NADU"),
    TELANGANA("TELANGANA"),
    TRIPURA("TRIPURA"),
    UT_ANDMAN("ANDMAN & NICOBAR ISLANDS"),
    UT_CHANDIGARH("CHANDIGARH"),
    UT_DADRA("DADRA AND NAGAR HAVELI"),
    UT_DAMAN_DIU("DAMAN & DIU"),
    UT_DELHI("DELHI"),
    UT_LADAKH("LADAKH"),
    UT_LAKSHYA("LAKSHADWEEP"),
    UT_PONDICHERRY("PUDUCHERRY"),
    UTTAR_PRADESH("UTTAR PRADESH"),
    UTTARAKHAND("UTTARAKHAND");
}

enum class QueLine(val i:String){
    STATEQ("Which is this State?"),
    UTQ("Which is this Union Territory?");
}