package turntabl.io.newsaggregator.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForEntity
import org.springframework.web.util.UriComponentsBuilder
import turntabl.io.newsaggregator.converter.Converter
import turntabl.io.newsaggregator.converter.NewsItemDtoToNewsItem
import turntabl.io.newsaggregator.dto.NewsItemDto
import turntabl.io.newsaggregator.dto.NewsItemsList
import turntabl.io.newsaggregator.repository.NewsItemRepository
import java.io.IOException

@Component
class NewApiClient(@Autowired private val restTemplate: RestTemplate) {

    fun fetchNewsItem(): Collection<NewsItemDto> {
        val response = restTemplate.getForEntity<NewsItemsList>(urlTemplate, NewsItemsList::class)

        return response.body?.article
            ?: throw IOException("Could not fetch news items")
    }

    companion object {
        val urlTemplate: String = UriComponentsBuilder.fromHttpUrl("https://newsapi.org/v2/everything")
            .queryParam("access_key", "44862b9437014d2aaa2826a5b2fba1e2" )
            .queryParam("q", "tech", "ghana")
            .encode()
            .toUriString()
    }
}