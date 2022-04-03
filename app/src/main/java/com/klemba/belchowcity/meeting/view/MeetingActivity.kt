package com.klemba.belchowcity.meeting.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.klemba.belchowcity.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.observeOn
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MeetingActivity : AppCompatActivity() {

    private val viewModel: MeetingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.meeting_activity)
        observeViewModel()
    }

    private fun observeViewModel() = lifecycleScope.launch {
        viewModel.meetingName.collect { meetingName ->
            findViewById<TextView>(R.id.meetingName).text = meetingName
        }
    }
}