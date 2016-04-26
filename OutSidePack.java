package Assignments;

import classesexample.Student;

public class OutSidePack {

	public static void main(String[] args) {
		Student studMaha = new Student();
		studMaha.studName = "Maha";
		studMaha.studId = 23;
		studMaha.studGrade = "Fifth";

		System.out.println(studMaha.studName);
	}

}
