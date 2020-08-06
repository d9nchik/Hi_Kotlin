class Application(val name: String) {

    // write the run method here
    fun run(vararg strings: String){
        println(name)
        for (item in strings.iterator())
            println(item)
    }
}