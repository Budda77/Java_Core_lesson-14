package ua.lviv.lgs.homework.commodity;

import java.util.Comparator;

public class CommodityLengthComparator implements Comparator<Commodity>{

	
	@Override
	public int compare(Commodity o, Commodity o1) {
		if(o.getName().compareTo(o1.getName()) > 0) {
			return 1;
		} else if(o.getName().compareTo(o1.getName())< 0) {
			return -1;
		} else {
			if(o.getLengthOfItem() > o1.getLengthOfItem()) {
				return 1;
			} else if(o.getLengthOfItem() < o1.getLengthOfItem()) {
				return -1;
			}		
		}
		
		return 0;
	}



}
