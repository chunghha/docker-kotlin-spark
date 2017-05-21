package myspark

import mu.KotlinLogging
import org.slf4j.Logger
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

    return "Rock your World"
}

private fun logPath(req: Request) = LOGGER.info("Call to {}", req.pathInfo())
