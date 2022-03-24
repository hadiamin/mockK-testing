package turntabl.io.newsaggregator.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.sun.istack.NotNull
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "news_items")
class NewsItem (
    @JsonIgnore
    @Id
    @Column(name = "news_items_id", length = 150)
    @GeneratedValue(strategy = GenerationType.AUTO)
    val newsItemsId: Long = 1,

    @Column(name = "title", length = 255)
    @NotNull
    var title: String,

    @Column(name = "link_url", length = 255)
    @NotNull
    var linkUrl: String,

    @Column(name = "media_url", nullable = true)
    var mediaUrl: String,

    @Column(name = "description", nullable = true)
    var description: String,

    @Column(name = "date", length = 255)
    @NotNull
    var date: LocalDate,

)