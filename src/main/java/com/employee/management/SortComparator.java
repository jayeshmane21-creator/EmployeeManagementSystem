package com.employee.management;

import java.util.Comparator;

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return Double.compare(e1.getSalary(),e2.getSalary());
	}
}
class SortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}
public class SortComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return Integer.compare(e1.getId(), e2.getId());
	}
}



