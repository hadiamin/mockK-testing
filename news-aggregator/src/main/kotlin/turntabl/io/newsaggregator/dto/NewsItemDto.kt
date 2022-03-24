package turntabl.io.newsaggregator.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class NewsItemDto (
    @JsonProperty("source")
    var source: NewsSourceDto,

    var author: String,

    var title: String,

    var description: String,

    var url: String,

    @JsonProperty("urlToImage")
    var imageUrl: String,

    var publishedAt: String,

    var content: String)
