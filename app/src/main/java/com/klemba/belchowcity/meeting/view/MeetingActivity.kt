package com.klemba.belchowcity.meeting.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.klemba.belchowcity.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MeetingActivity : AppCompatActivity() {

    private val viewModel: MeetingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meeting_activity)
        observeViewModel()
    }

    private fun observeViewModel() {
        findViewById<TextView>(R.id.meetingName).text = viewModel.meetingName
    }
}