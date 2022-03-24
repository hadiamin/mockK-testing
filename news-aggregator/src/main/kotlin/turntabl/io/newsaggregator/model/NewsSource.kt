package turntabl.io.newsaggregator.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "news_sources")
class NewsSource(
    @Id
    @Column(name = "source_id", length = 150)
    @GeneratedValue(strategy = GenerationType.AUTO)
    val sourceId: Long = -1,

    @Column(name = "name", length = 30)
    var name: String? = null,

    @Column(name = "news_source_url", length = 30)
    var newsSourceUrl: String?,

    @OneToMany(mappedBy = "newsSource", fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.ALL))
    var newsItems: List<NewsItem> = arrayListOf()
)
