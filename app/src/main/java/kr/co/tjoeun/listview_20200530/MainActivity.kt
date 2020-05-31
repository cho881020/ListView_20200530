package kr.co.tjoeun.listview_20200530

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listview_20200530.adapters.StudentAdapter
import kr.co.tjoeun.listview_20200530.datas.Student

class MainActivity : AppCompatActivity() {

    val students = ArrayList<Student>()

    // onCreate 실행된 이후에 내용을 채워야함.
//    변수는 멤버변수로 만들어두면 차후에 편리함.
//    만드는건 지금 만들지만, 채우는건 나중에 하겠다 => lateinit
    lateinit var studentAdapter:StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        students.add(Student("조경진", 1988, true))
        students.add(Student("김광철", 1966, true))
        students.add(Student("김재환", 1993, true))
        students.add(Student("박수정", 1994, false))
        students.add(Student("신용성", 1988, true))
        students.add(Student("엄곤지", 1984, false))
        students.add(Student("이승원", 1978, true))
        students.add(Student("이현호", 1981, true))

        studentAdapter = StudentAdapter(this, R.layout.student_list_item, students)

        studentListView.adapter = studentAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->

//            몇번 줄이 눌렸는지 확인 - posision이 몇?
            Log.d("리스트뷰아이템클릭", "${position}번 줄 클릭")

//            position으로 배열(ArrayList)에서 학생정보 추출
            val clickedStudent = students.get(position)

//            빼낸 학생 정보를 이용해서 토스트로 출력
//            Toast.makeText(this, clickedStudent.name, Toast.LENGTH_SHORT).show()

            val myIntent = Intent(this, ViewStudentActivity::class.java)
            myIntent.putExtra("student", clickedStudent)
            startActivity(myIntent)


        }


    }
}
