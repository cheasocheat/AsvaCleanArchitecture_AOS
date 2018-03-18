package com.asvacode.asvaroom.data.entity.base

import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by cheasocheat on 3/18/18.
 */
open class BaseEntity {
    @PrimaryKey
    var id : Int = 0

}