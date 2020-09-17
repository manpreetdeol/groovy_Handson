class Calculator {

    def add(def a, def b) {
        a + b
    }

    def sub(def a, def b) {
        a - b
    }

    float div(def a, def b) {
        if (b == 0) {
            throw new RuntimeException("Divide by Zero")
        }
            a / b
    }

    def mul(int a, int b) {
        a * b
    }
}
