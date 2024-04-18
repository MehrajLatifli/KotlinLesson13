package Task3

import java.util.*
import kotlin.collections.ArrayList


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val student = Student()
    var studentArraylist_1 = ArrayList<Student>()
    var studentArraylist_2 = ArrayList<Student>()
    var studentArraylist_3 = ArrayList<Student>()

    for (i in 1..5) {

        print("Enter name: ")
        val name = scanner.next()

        print("Enter surname: ")
        val surname = scanner.next()

        print("Enter age: ")
        val age = scanner.nextInt()

        print("Enter point: ")
        val point = scanner.nextDouble()

        print("\n")

        studentArraylist_1.add(Student(name, surname,age,point))
    }

    println("--------- \nStudentArraylist: \n")

    for ((index, item) in studentArraylist_1.withIndex()) {

        println("${index + 1}) $item")
    }

    println("--------- \nageGreaterThan: \n")

    studentArraylist_2.addAll(student.ageGreaterThan(studentArraylist_1))

    for ((index, item) in studentArraylist_2.withIndex()) {

        println("${index + 1}) $item")
    }


    println("--------- \npointGreaterThan: \n")

    studentArraylist_3.addAll(student.pointGreaterThan(studentArraylist_1))

    for ((index, item) in studentArraylist_3.withIndex()) {

        println("${index + 1}) $item")
    }
}