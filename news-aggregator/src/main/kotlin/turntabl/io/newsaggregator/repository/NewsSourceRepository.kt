package turntabl.io.newsaggregator.repository

import org.springframework.data.repository.CrudRepository
import turntabl.io.newsaggregator.model.NewsSource

interface NewsSourceRepository : CrudRepository<NewsSource, Long> {
}