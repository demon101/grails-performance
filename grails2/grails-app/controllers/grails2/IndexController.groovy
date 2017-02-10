package grails2

class IndexController {

    def index(TestDomain testDomain) {
        [testDomain: testDomain]
    }
}
