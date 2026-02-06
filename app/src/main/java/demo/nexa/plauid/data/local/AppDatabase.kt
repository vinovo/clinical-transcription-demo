package demo.nexa.plauid.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import demo.nexa.plauid.data.local.dao.RecordingNoteDao
import demo.nexa.plauid.data.local.entity.RecordingNoteEntity

/**
 * Room database for the Plauid app.
 */
@Database(
    entities = [RecordingNoteEntity::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    
    abstract fun recordingNoteDao(): RecordingNoteDao
    
    companion object {
        private const val DATABASE_NAME = "plauid_db"
        
        @Volatile
        private var INSTANCE: AppDatabase? = null
        
        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }
        }
        
        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DATABASE_NAME
            )
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}
