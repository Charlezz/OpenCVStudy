package com.charlezz.opencvstudy.di

import dagger.Module

@Module
class AppModule {

//    @Provides
//    @Singleton
//    fun provideAppContext(app: App): Context {
//        return app
//    }
//
//    @Provides
//    @Singleton
//    fun provideApplication(app: App): Application {
//        return app
//    }
//
//    @Provides
//    @Singleton
//    fun provideAppDatabase(context: Context): AppDatabase {
//        return Room
//                .inMemoryDatabaseBuilder(context, AppDatabase::class.java) // temporary
////                .databaseBuilder(context, AppDatabase::class.java, AppConstants.DB_NAME) // permanent
//                .fallbackToDestructiveMigration()
//                .addCallback(object : RoomDatabase.Callback(){
//                    override fun onCreate(db: SupportSQLiteDatabase) {
//                        super.onCreate(db)
//                        for( index in 0 until 10000){
//                            val cv = ContentValues()
//                            cv.put("name", "Name$index")
//                            cv.put("birth", "$index")
//                            db.insert("person", SQLiteDatabase.CONFLICT_REPLACE,cv)
//                        }
//                    }
//                })
//                .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideApiHelper(): ApiHelper = Retrofit.Builder()
//            .baseUrl("https://jsonplaceholder.typicode.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(ApiHelper::class.java)
//
//    @Provides
//    @Singleton
//    fun providePersonDao(appDatabase: AppDatabase): PersonDao {
//        return appDatabase.dao()
//    }
//
//    @Provides
//    @Singleton
//    fun provideDataManager(personDao: PersonDao): DBHelper {
//        return DBHelperImpl(personDao)
//    }
//
//    @Provides
//    @Singleton
//    fun providePreferencesHelper(context:Context): PreferencesHelper {
//        return PreferencesHelperImpl(context, AppConstants.PREF_NAME)
//    }
//
//    @Provides
//    @Singleton
//    fun providePhotoHelper(): PhotoHelper {
//        return PhotoHelperImpl()
//    }
}