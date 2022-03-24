package turntabl.io.newsaggregator.service

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import turntabl.io.newsaggregator.client.NewApiClient
import turntabl.io.newsaggregator.converter.NewsItemDtoToNewsItem
import turntabl.io.newsaggregator.converter.NewsSourceDtoToNewsSource
import turntabl.io.newsaggregator.repository.NewsItemRepository

@Service
class NewItemsPollingService(
    private val newApiClient: NewApiClient,
    private val newsItemDtoToNewsItem: NewsItemDtoToNewsItem,
    private val newsItemRepository: NewsItemRepository
) {

    @Scheduled(fixedDelay = 500000)
    private fun cronJob(): Unit {
        this.newApiClient.fetchNewsItem()
            .map { newsItemDto -> newsItemDtoToNewsItem.convert(newsItemDto) }
            .forEach { newsItemRepository.save(it) }
    }
}