class BootStrap {

    def init = { servletContext ->
        new grails2.TestDomain(testField: "Some test value").save(failOnError:true)
    }
    def destroy = {
    }
}
