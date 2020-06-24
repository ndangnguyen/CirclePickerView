package com.ndn.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.ui.DayBinder
import com.kizitonwose.calendarview.ui.ViewContainer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_day_view.view.*
import org.threeten.bp.YearMonth
import org.threeten.bp.temporal.WeekFields
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCalendarView()
    }

    private fun setupCalendarView() {

//        val currentMonth = YearMonth.now()
//        val firstMonth = currentMonth.minusMonths(10)
//        val lastMonth = currentMonth.plusMonths(10)
//        val firstDayOfWeek = WeekFields.of(Locale.getDefault()).firstDayOfWeek
//        calendarView.setup(firstMonth, lastMonth, firstDayOfWeek)
//        calendarView.scrollToMonth(currentMonth)
//
//        calendarView.dayBinder = object : DayBinder<DayViewContainer> {
//            // Called only when a new container is needed.
//            override fun create(view: View): DayViewContainer {
//                return DayViewContainer(view)
//            }
//
//            // Called every time we need to reuse a container.
//            override fun bind(container: DayViewContainer, day: CalendarDay) {
////                if (day.owner == DayOwner.THIS_MONTH) {
////                } else {
////                    container.tvDayView.text = ""
////                }
//                container.tvDayView.text = day.date.dayOfMonth.toString()
//            }
//        }


    }
}

class DayViewContainer(view: View) : ViewContainer(view) {
    val tvDayView: AppCompatTextView = view.tvDayView
    //    val clRoot: ConstraintLayout = view.clRoot
//    val ivDot: AppCompatImageView = view.ivDot
//    val tvTimeDo: AppCompatTextView = view.tvTimeDo
    var isSelected = false
}

class MonthViewContainer(view: View): ViewContainer(view) {

}

