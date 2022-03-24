package turntabl.io.newsaggregator.converter

import org.springframework.stereotype.Component
import turntabl.io.newsaggregator.dto.NewsItemDto
import turntabl.io.newsaggregator.model.NewsItem
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

@Component
class NewsItemDtoToNewsItem: Converter<NewsItemDto, NewsItem> {
    override fun convert(source: NewsItemDto): NewsItem {
        return NewsItem(
            title = source.title,
            linkUrl = source.url,
            mediaUrl = source.imageUrl,
            description = source.description,
            date = LocalDate.parse(source.publishedAt),
        )
    }
}