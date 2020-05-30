package kr.co.tjoeun.listview_20200530.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.listview_20200530.R
import kr.co.tjoeun.listview_20200530.datas.Student

class StudentAdapter(context: Context, resId: Int, list:List<Student>) : ArrayAdapter<Student>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        return row
    }

}