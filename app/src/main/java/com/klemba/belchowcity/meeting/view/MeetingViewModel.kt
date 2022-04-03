package com.klemba.belchowcity.meeting.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.klemba.belchowcity.meeting.domain.MeetingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.SharingStarted.Companion.Lazily
import javax.inject.Inject

@HiltViewModel
class MeetingViewModel @Inject constructor(
    meetingRepository: MeetingRepository
) : ViewModel() {

    val meetingName: StateFlow<String> = flow { emit(meetingRepository.getMeeting()) }
        .stateIn(
            scope = viewModelScope,
            started = Lazily,
            initialValue = "Lolz"
        )
}
