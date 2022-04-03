package com.klemba.belchowcity.meeting.domain

interface MeetingRepository {

    /**
     * Gets the meeting name
     *
     * @return return flow instance that emits meeting name
     */
    suspend fun getMeeting(): String
}