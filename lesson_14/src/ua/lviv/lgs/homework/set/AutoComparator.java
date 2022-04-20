package ua.lviv.lgs.homework.set;

import java.util.Comparator;

public class AutoComparator implements Comparator<Car>{

	@Override
	public int compare(Car o, Car o1) {
		if(o.getModel().compareTo(o1.getModel()) > 0) {
			return 1;
		} else if(o.getModel().compareTo(o1.getModel())<0) {
			return -1;
		} else {
			if(o.getYearOfIssue() > o1.getYearOfIssue()) {
				return 1;
			}else if(o.getYearOfIssue() < o1.getYearOfIssue()){
				return -1;
			}
		}
		
		return 0;
	}

}
