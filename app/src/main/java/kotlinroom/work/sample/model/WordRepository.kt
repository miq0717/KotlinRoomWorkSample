package kotlinroom.work.sample.model

import androidx.lifecycle.LiveData

/*Created by MiQ0717 on 18-Jan-2020.*/
class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetziedWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

    suspend fun deleteAll() {
        wordDao.deleteAll()
    }
}