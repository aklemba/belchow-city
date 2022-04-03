package com.klemba.belchowcity.meeting.di

import com.klemba.belchowcity.meeting.domain.DefaultMeetingRepository
import com.klemba.belchowcity.meeting.domain.MeetingRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AnalyticsModule {

    @Binds
    abstract fun provideMeetingRepository(meetingRepository: DefaultMeetingRepository): MeetingRepository
}