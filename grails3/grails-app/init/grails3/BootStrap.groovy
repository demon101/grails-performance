package grails3

class BootStrap {

    def init = { servletContext ->

        new TestDomain(testField: "Some test value").save(failOnError:true)
    }
    def destroy = {
    }
}
