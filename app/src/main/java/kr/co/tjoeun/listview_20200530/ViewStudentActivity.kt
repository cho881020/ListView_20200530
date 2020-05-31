package kr.co.tjoeun.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_student.*
import kr.co.tjoeun.listview_20200530.datas.Student

class ViewStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student)

        val student = intent.getSerializableExtra("student") as Student

        nameTxt.text = student.name
        ageTxt.text = "${student.getKoreanAge(2020)}세(${student.birthYear}년생)"

        if (student.isMale) {
            genderTxt.text = "남성"
        }
        else {
            genderTxt.text = "여성"
        }



    }
}
