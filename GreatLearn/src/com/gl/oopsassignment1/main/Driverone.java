package com.gl.oopsassignment1.main;

import com.gl.oopsassignment1.model.AdminDept;
import com.gl.oopsassignment1.model.HrDept;
import com.gl.oopsassignment1.model.TechDept;

public class Driverone {
	public static void main(String args[]) {
		AdminDept 	ad = new AdminDept();
		HrDept 		hr = new HrDept();
		TechDept 	td = new TechDept();
		// Admin Department
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		//HR Department
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		//Tech Department
		System.out.println("Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		System.out.println();
	}
}