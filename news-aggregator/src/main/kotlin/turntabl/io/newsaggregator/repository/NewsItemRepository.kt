package turntabl.io.newsaggregator.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import turntabl.io.newsaggregator.model.NewsItem

@Repository
interface NewsItemRepository : CrudRepository<NewsItem, Long> {
    fun save(newsItem: NewsItem): NewsItem
}