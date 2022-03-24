package turntabl.io.newsaggregator.client

import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.web.client.RestTemplate
import turntabl.io.newsaggregator.dto.NewsItemsList


@RestClientTest(NewApiClient::class)
@AutoConfigureMockMvc
internal class NewApiClientTest {

    @MockK
    lateinit var restTemplate: RestTemplate

    @InjectMockKs
    lateinit var newApiClient: NewApiClient

    private val news : NewsItemsList = mockk()

//    lateinit var mockRestServiceServer: MockRestServiceServer

//    lateinit var objectMapper: ObjectMapper

//    @Before("")
//    fun init() {
//        mockRestServiceServer = MockRestServiceServer.createServer(restTemplate)
//    }


    @Test
    private fun `should return a collection of new items`() {

        // given
        var newsItemsList = listOf(news)

        // when
        

        // then


    }

}