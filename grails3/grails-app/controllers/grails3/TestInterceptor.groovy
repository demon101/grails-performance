package grails3


class TestInterceptor {

    TestInterceptor(){
        matchAll()
    }


    boolean before() {
        def a = System.currentTimeMillis()
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
