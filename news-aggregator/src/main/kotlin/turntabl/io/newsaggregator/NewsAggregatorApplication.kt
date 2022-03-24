package turntabl.io.newsaggregator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableScheduling
class NewsAggregatorApplication {

	@Bean
	public fun restTemplate(builder: RestTemplateBuilder): RestTemplate =  builder.build()

}

fun main(args: Array<String>) {
	runApplication<NewsAggregatorApplication>(*args)
}
