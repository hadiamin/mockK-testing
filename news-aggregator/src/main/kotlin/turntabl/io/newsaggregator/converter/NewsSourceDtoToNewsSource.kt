package turntabl.io.newsaggregator.converter

import turntabl.io.newsaggregator.dto.NewsSourceDto
import turntabl.io.newsaggregator.model.NewsSource

class NewsSourceDtoToNewsSource: Converter<NewsSourceDto, NewsSource> {
    override fun convert(source: NewsSourceDto): NewsSource {
        return NewsSource(
            name = source.name,
            newsSourceUrl = "",
            newsItems = emptyList()
        )
    }
}