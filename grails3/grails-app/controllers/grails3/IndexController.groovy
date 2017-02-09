package grails3

class IndexController {

    def index(TestDomain testDomain) {
        [testDomain: testDomain]
    }
}
