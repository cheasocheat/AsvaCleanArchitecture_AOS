package com.asvacode.asvaroom.digraph.module

import android.arch.persistence.room.Room
import android.content.Context
import com.asvacode.asvaroom.constant.AppConstant
import com.asvacode.asvaroom.data.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by cheasocheat on 3/18/18.
 */
@Module
@Singleton
class AppDatabaseModule{

    @Provides
    fun provideAppDatabase(context : Context) : AppDatabase{
        return Room.databaseBuilder(context, AppDatabase::class.java, AppConstant.DATABASE_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
    }
}