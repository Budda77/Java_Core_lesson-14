package ua.lviv.lgs.homework.commodity;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o, Commodity o1) {
		if(o.getName().compareTo(o1.getName()) > 0) {
			return 1;
		} else if(o.getName().compareTo(o1.getName())< 0) {
			return -1;
		} else {
			if(o.getWidthOfItem() > o1.getWidthOfItem()) {
				return 1;
			} else if(o.getWidthOfItem() < o1.getWidthOfItem()) {
				return -1;
			}		
		}	
		return 0;
	}

}
