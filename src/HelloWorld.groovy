class HelloWorld {

    static void main(String[] args) {
       Person person = new Person()
        person.setFirstName("Manni")
        person.setLastName("Singh")
        person.setAge(32)

        println(person.getFirstName())
        println person.getLastName()
        println person.getAge()
        println person.getFullName()


        Calculator calculator = new Calculator()
        assert calculator.add(3,7) == 10
        println calculator.add(3,7)

        assert calculator.sub(3,4) == -1
        println calculator.sub(3,4)

        assert calculator.mul(3,7) == 21
        println calculator.mul(3,7)

        assert calculator.div(3,2) == 1.5
        println calculator.div(3,2)

     for(i in 1..5) {
       print i
     }
    }
}
