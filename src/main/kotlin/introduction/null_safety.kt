package introduction

fun main() {
    var neverNull: String = "This can't be null"

    //neverNull = null

    var nullable: String?

    nullable = null
    println(nullable)

    var inferredNonNull = "The compiler assumes non-null"

    //inferredNonNull = null
    println(inferredNonNull)

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
    //strLength(nullable)

    println(describeString("just a string"))
    println(describeString(""))
}

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.isNotEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}

