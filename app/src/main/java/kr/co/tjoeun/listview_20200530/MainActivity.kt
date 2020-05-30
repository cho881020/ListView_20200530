package kr.co.tjoeun.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listview_20200530.datas.Student

class MainActivity : AppCompatActivity() {

    val students = ArrayList<Student>()

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

    }
}
