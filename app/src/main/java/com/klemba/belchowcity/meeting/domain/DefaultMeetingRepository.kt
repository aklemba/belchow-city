package com.klemba.belchowcity.meeting.domain

import com.klemba.belchowcity.meeting.data.MeetingFirebaseService
import javax.inject.Inject

class DefaultMeetingRepository @Inject constructor(
    private val meetingFirebaseService: MeetingFirebaseService
) : MeetingRepository {

    override suspend fun getMeeting() = meetingFirebaseService.getMeeting()
}