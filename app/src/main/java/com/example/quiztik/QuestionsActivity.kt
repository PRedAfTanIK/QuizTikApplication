package com.example.quiztik

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionData>? = null
    private var mSelectedOptionPosition: Int = 0

    private var mUserName: String? = null
    private var mCorrectAnswers: Int = 0

    private var progrssBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var tvImage: ImageView? = null
    private var optionOne: TextView? = null
    private var optionTwo: TextView? = null
    private var optionThree: TextView? = null
    private var optionFour: TextView? = null
    private var submitButt: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progrssBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        tvImage = findViewById(R.id.tv_image)

        optionOne = findViewById(R.id.option_one)
        optionTwo = findViewById(R.id.option_two)
        optionThree = findViewById(R.id.option_three)
        optionFour = findViewById(R.id.option_four)
        submitButt = findViewById(R.id.submitButt)

        optionOne?.setOnClickListener(this)
        optionTwo?.setOnClickListener(this)
        optionThree?.setOnClickListener(this)
        optionFour?.setOnClickListener(this)

        submitButt?.setOnClickListener(this)

        mQuestionsList = Constants.getQuestions()

        setQuestion()
    }

    private fun setQuestion() {
        defaultOptionsView()
        val question: QuestionData = mQuestionsList!![mCurrentPosition - 1]
        tvImage?.setImageResource(question.image)
        progrssBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${mQuestionsList!!.size}"
        tvQuestion?.text = question.question
        optionOne?.text = question.optionOne
        optionTwo?.text = question.optionTwo
        optionThree?.text = question.optionThree
        optionFour?.text = question.optionFour

        if(mCurrentPosition == mQuestionsList!!.size){
            submitButt!!.text = "FINISH"
        }else{
            submitButt!!.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        optionOne?.let {
            options.add(0, it)
        }

        optionTwo?.let {
            options.add(1, it)
        }

        optionThree?.let {
            options.add(2, it)
        }

        optionFour?.let {
            options.add(3, it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8090"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
            R.drawable.default_option_border_bg)
        }

    }

    private fun selectedOptionView(tv: TextView, optionNum: Int){
        defaultOptionsView()

        mSelectedOptionPosition = optionNum
        tv.setTextColor(Color.parseColor("#333333"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
        R.drawable.selected_option_bg)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.option_one -> {
                optionOne?.let {
                    selectedOptionView(it, 1)
                }
            }

            R.id.option_two -> {
                optionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }

            R.id.option_three -> {
                optionThree?.let {
                    selectedOptionView(it, 3)
                }
            }

            R.id.option_four -> {
                optionFour?.let {
                    selectedOptionView(it, 4)
                }
            }

            R.id.submitButt -> {
                if (mSelectedOptionPosition == 0){
                    mCurrentPosition++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }
                        else -> {
                            //Toast.makeText(this,"THE END",Toast.LENGTH_SHORT).show()
                            val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList?.size)
                            startActivity(intent)
                            finish()
                        }
                    }

                }else{
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        submitButt?.text = "FINISH"
                    }else{
                        submitButt?.text = "GO TO NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                optionOne?.background = ContextCompat.getDrawable(this,drawableView)
            }

            2 -> {
                optionTwo?.background = ContextCompat.getDrawable(this,drawableView)
            }

            3 -> {
                optionThree?.background = ContextCompat.getDrawable(this,drawableView)
            }

            4 -> {
                optionFour?.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
}