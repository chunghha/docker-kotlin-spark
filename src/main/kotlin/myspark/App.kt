package myspark

import spark.Spark.*

fun main(args: Array<String>) {
    get("/") { req, res -> hello() }
    get("/hello") { req, res -> hello() }
    get("/world") { req, res -> world() }
}

fun hello(): String {
    return "Hello World"
}

fun world(): String {
    return "Rock your World"
}
