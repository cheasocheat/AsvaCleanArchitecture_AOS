package com.asvacode.asvaroom.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.asvacode.asvaroom.constant.AppConstant
import com.asvacode.asvaroom.data.entity.Student
import com.asvacode.asvaroom.data.entity.Subject
import com.asvacode.asvaroom.data.entity.User

/**
 * Created by cheasocheat on 3/18/18.
 */
@Database(
        entities = [
            User::class,
            Subject::class,
            Student::class
        ],
        version = AppConstant.DATABASE_VERSION
)
abstract class AppDatabase : RoomDatabase(){

}