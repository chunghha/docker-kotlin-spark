package myspark

import io.reactivex.Observable
import mu.KotlinLogging
import spark.Request
import spark.Spark.get

private val LOGGER = KotlinLogging.logger {}

fun main(args: Array<String>) {
    get("/") { req, res -> hello(req) }
    get("/hello") { req, res -> hello(req) }
    get("/world") { req, res -> world(req) }
}

fun hello(req: Request): String {
    logPath(req)

    return "Hello World"
}

fun world(req: Request): String {
    logPath(req)

    var w = ""
    getObservable().subscribe({ s -> w = s })

    return w
}

private fun getObservable(): Observable<String> {

    return Observable.just("Rock your World")
}

private fun logPath(req: Request) = LOGGER.info("Call to {}", req.pathInfo())
