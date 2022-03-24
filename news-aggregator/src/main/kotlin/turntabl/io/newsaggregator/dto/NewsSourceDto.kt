package turntabl.io.newsaggregator.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class NewsSourceDto( @JsonProperty("name") var name: String )
