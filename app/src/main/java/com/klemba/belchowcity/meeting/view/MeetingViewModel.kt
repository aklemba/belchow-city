package com.klemba.belchowcity.meeting.view

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MeetingViewModel @Inject constructor( ) : ViewModel() {

    val meetingName: String = "Skwerek"
}