package turntabl.io.newsaggregator.converter

interface Converter<A, B> {
    fun convert(source: A): B
}