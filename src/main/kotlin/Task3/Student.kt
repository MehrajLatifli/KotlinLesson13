package Task3

data class Student(var name:String?=null, var surname:String?=null, var age: Int?=null, var point:Double?=null) {


    fun ageGreaterThan(students: ArrayList<Student>): ArrayList<Student> {

        return students.filter { it.age!! > 15 }.toCollection(ArrayList())
    }

    fun pointGreaterThan(students: ArrayList<Student>): ArrayList<Student> {

        return students.filter { it.point!! > 60 }.toCollection(ArrayList())
    }
}